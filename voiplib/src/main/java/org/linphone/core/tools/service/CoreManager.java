package org.linphone.core.tools.service;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.view.Display;

import androidx.annotation.RequiresApi;

import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.linphone.core.BuildConfig;
import org.linphone.core.Call;
import org.linphone.core.Core;
import org.linphone.core.CoreListenerStub;
import org.linphone.core.GlobalState;
import org.linphone.core.tools.Log;
import org.linphone.core.tools.PushNotificationUtils;
import org.linphone.core.tools.audio.AudioHelper;
import org.linphone.core.tools.audio.BluetoothHelper;
import org.linphone.core.tools.compatibility.DeviceUtils;
import org.linphone.core.tools.receiver.ShutdownReceiver;
import org.linphone.mediastream.Version;

public class CoreManager {
   private static CoreManager sInstance;
   private static final int AUTO_ITERATE_TIMER_CORE_START_OR_PUSH_RECEIVED = 20;
   private static final int AUTO_ITERATE_TIMER_RESET_AFTER = 20000;
   protected Context mContext;
   protected Core mCore;
   private Class mServiceClass;
   private Timer mTimer;
   private Timer mForcedIterateTimer;
   private Runnable mIterateRunnable;
   private int mIterateSchedule;
   private ActivityLifecycleCallbacks mActivityCallbacks;
   private CoreListenerStub mListener;
   private AudioHelper mAudioHelper;
   private BluetoothHelper mBluetoothHelper;
   private ShutdownReceiver mShutdownReceiver;
   private Handler mHandler;
   private DisplayManager mDisplayManager;
   private DisplayListener mDisplayListener;
   private boolean mServiceRunningInForeground;

   public static boolean isReady() {
      return sInstance != null;
   }

   public static CoreManager instance() {
      if (isReady()) {
         return sInstance;
      } else {
         Log.i("[Core Manager] Trying to access instance that doesn't exists!");
         throw new RuntimeException("CoreManager not instantiated yet");
      }
   }

   private native void updatePushNotificationInformation(long var1, String var3, String var4);

   private native void stopCore(long var1);

   private native void leaveConference(long var1);

   private native void pauseAllCalls(long var1);

   private native void reloadSoundDevices(long var1);

   private native void enterBackground(long var1);

   private native void enterForeground(long var1);

   private native void processPushNotification(long var1, String var3, String var4, boolean var5);

   private native void healNetworkConnections(long var1);

   @RequiresApi(api = Build.VERSION_CODES.R)
   public CoreManager(Object context, Core core) {
      this.mContext = ((Context)context).getApplicationContext();
      this.mCore = core;
      sInstance = this;
      this.mServiceRunningInForeground = false;
      this.mTimer = null;
      this.mForcedIterateTimer = null;
      this.dumpDeviceInformation();
      this.dumpLinphoneInformation();
      DeviceUtils.logPreviousCrashesIfAny(this.mContext);
      this.mActivityCallbacks = new ActivityMonitor();
      ((Application)this.mContext).registerActivityLifecycleCallbacks(this.mActivityCallbacks);
      PushNotificationUtils.init(this.mContext);
      if (!PushNotificationUtils.isAvailable(this.mContext)) {
         Log.w("[Core Manager] Push notifications aren't available (see push utils log)");
      }

      if (this.isAndroidXMediaAvailable()) {
         this.mAudioHelper = new AudioHelper(this.mContext);
      } else {
         Log.w("[Core Manager] Do you have a dependency on androidx.media:media:1.2.0 or newer?");
      }

      this.mBluetoothHelper = new BluetoothHelper(this.mContext);
      this.mDisplayListener = new DisplayListener() {
         public void onDisplayAdded(int displayId) {
            Log.d("[Core Manager] Display added: ", displayId);
         }

         public void onDisplayChanged(int displayId) {
            Log.d("[Core Manager] Display changed: ", displayId);
            CoreManager.this.updateOrientation(displayId);
         }

         public void onDisplayRemoved(int displayId) {
            Log.d("[Core Manager] Display removed: ", displayId);
         }
      };
      this.mDisplayManager = (DisplayManager)this.mContext.getSystemService(Context.DISPLAY_SERVICE);
      this.mHandler = new Handler(Looper.getMainLooper());
      this.mDisplayManager.registerDisplayListener(this.mDisplayListener, this.mHandler);
      this.updateOrientation(0);
      IntentFilter shutdownIntentFilter = new IntentFilter("android.intent.action.ACTION_SHUTDOWN");
      shutdownIntentFilter.setPriority(999);
      this.mShutdownReceiver = new ShutdownReceiver();
      Log.i("[Core Manager] Registering shutdown receiver");
      this.mContext.registerReceiver(this.mShutdownReceiver, shutdownIntentFilter);
      this.mServiceClass = this.getServiceClass();
      if (this.mServiceClass == null) {
         this.mServiceClass = CoreService.class;
      }

      Log.i("[Core Manager] Ready");
   }

   public void destroy() {
      Log.i("[Core Manager] Destroying");
      if (this.mActivityCallbacks != null) {
         ((Application)this.mContext).unregisterActivityLifecycleCallbacks(this.mActivityCallbacks);
         this.mActivityCallbacks = null;
      }

      if (this.mBluetoothHelper != null) {
         this.mBluetoothHelper.destroy(this.mContext);
         this.mBluetoothHelper = null;
      }

      if (this.mShutdownReceiver != null) {
         Log.i("[Core Manager] Unregistering shutdown receiver");
         this.mContext.unregisterReceiver(this.mShutdownReceiver);
         this.mShutdownReceiver = null;
      }

      if (this.mAudioHelper != null) {
         this.mAudioHelper.destroy(this.mContext);
         this.mAudioHelper = null;
      }

      if (this.mDisplayManager != null && this.mDisplayListener != null) {
         this.mDisplayManager.unregisterDisplayListener(this.mDisplayListener);
         this.mDisplayListener = null;
         this.mDisplayManager = null;
      }

      this.mServiceClass = null;
      this.mContext = null;
      sInstance = null;
      Log.i("[Core Manager] Destroyed");
   }

   public Core getCore() {
      return this.mCore;
   }

   public void processPushNotification(String callId, String payload, boolean isCoreStarting) {
      if (this.mCore.isAutoIterateEnabled() && this.mCore.isInBackground()) {
         Log.i("[Core Manager] Push notification received, scheduling core.iterate() every 20ms");
         this.startAutoIterate(20);
         this.createTimerToResetAutoIterateSchedule();
      }

      Log.i("[Core Manager] Notifying Core a push with Call-ID [" + callId + "] has been received");
      this.processPushNotification(this.mCore.getNativePointer(), callId, payload, isCoreStarting);
   }

   public void healNetwork() {
      if (this.mCore != null) {
         this.healNetworkConnections(this.mCore.getNativePointer());
      }

   }

   public void onLinphoneCoreStart() {
      Log.i("[Core Manager] Starting");
      if (!this.isAndroidXMediaAvailable() && this.mCore.isNativeRingingEnabled()) {
         Log.i("[Core Manager] Native ringing was enabled but condition isn't met (androidx.media:media dependency), disabling it.");
         this.mCore.setNativeRingingEnabled(false);
      }

      if (this.mCore.isAutoIterateEnabled()) {
         Log.i("[Core Manager] Core is starting, scheduling core.iterate() every 20ms");
         this.startAutoIterate(20);
         this.createTimerToResetAutoIterateSchedule();
      } else {
         Log.w("[Core Manager] Auto core.iterate() isn't enabled, ensure you do it in your application!");
      }

      this.mListener = new CoreListenerStub() {
         public void onFirstCallStarted(Core core) {
            Log.i("[Core Manager] First call started");
            if (!CoreManager.this.isServiceRunning()) {
               Log.w("[Core Manager] Service isn't running, let's start it");

               try {
                  CoreManager.this.startService();
               } catch (IllegalStateException var3) {
                  Log.w("[Core Manager] Failed to start service: ", var3);
               }
            } else {
               Log.i("[Core Manager] Service appears to be running, everything is fine");
            }

         }

         public void onLastCallEnded(Core core) {
            Log.i("[Core Manager] Last call ended");
            if (CoreManager.this.mAudioHelper != null) {
               if (core.isNativeRingingEnabled()) {
                  CoreManager.this.mAudioHelper.stopRinging();
               } else {
                  CoreManager.this.mAudioHelper.releaseRingingAudioFocus();
               }

               CoreManager.this.mAudioHelper.releaseCallAudioFocus();
            }
         }

         public void onCallStateChanged(Core core, Call call, Call.State state, String message) {
            if (CoreManager.this.mAudioHelper != null) {
               if (call.getState() != state) {
                  if (state != Call.State.IncomingReceived || call.getState() != Call.State.IncomingEarlyMedia) {
                     Log.w("[Core Manager] Call state changed callback state variable doesn't match current call state, skipping");
                     return;
                  }

                  Log.w("[Core Manager] It seems call was accepted with early-media during the incoming received call state changed, continuing anyway");
               }

               if (state == Call.State.IncomingReceived && core.getCallsNb() == 1) {
                  if (core.isNativeRingingEnabled()) {
                     Log.i("[Core Manager] Incoming call received, no other call, start ringing");
                     CoreManager.this.mAudioHelper.startRinging(CoreManager.this.mContext, core.getRing(), call.getRemoteAddress());
                  } else {
                     Log.i("[Core Manager] Incoming call received, no other call, acquire ringing audio focus");
                     CoreManager.this.mAudioHelper.requestRingingAudioFocus();
                  }
               } else if (state == Call.State.IncomingEarlyMedia && core.getCallsNb() == 1) {
                  if (core.getRingDuringIncomingEarlyMedia()) {
                     Log.i("[Core Manager] Incoming call is early media and ringing is allowed");
                  } else if (core.isNativeRingingEnabled()) {
                     Log.w("[Core Manager] Incoming call is early media and ringing is disabled, stop ringing");
                     CoreManager.this.mAudioHelper.stopRinging();
                  } else {
                     Log.i("[Core Manager] Incoming call is early media and ringing is disabled, keep ringing audio focus as sound card will be using RING stream");
                  }
               } else if (state == Call.State.Connected) {
                  if (call.getDir() == Call.Dir.Incoming && core.isNativeRingingEnabled()) {
                     Log.i("[Core Manager] Stop incoming call ringing");
                     CoreManager.this.mAudioHelper.stopRinging();
                  } else {
                     Log.i("[Core Manager] Stop incoming call ringing audio focus");
                     CoreManager.this.mAudioHelper.releaseRingingAudioFocus();
                  }
               } else if (state == Call.State.OutgoingInit && core.getCallsNb() == 1) {
                  Log.i("[Core Manager] Outgoing call in progress, no other call, acquire ringing audio focus for ringback");
                  CoreManager.this.mAudioHelper.requestRingingAudioFocus();
               } else if (state == Call.State.StreamsRunning) {
                  Log.i("[Core Manager] Call active, ensure audio focus granted");
                  CoreManager.this.mAudioHelper.requestCallAudioFocus(false);
               } else if (state == Call.State.Resuming) {
                  Log.i("[Core Manager] Call resuming, ensure audio focus granted");
                  CoreManager.this.mAudioHelper.requestCallAudioFocus(false);
               }

            }
         }
      };
      this.mCore.addListener(this.mListener);
      Log.i("[Core Manager] Started");
      SharedPreferences sharedPref = this.mContext.getSharedPreferences("push_notification_storage", 0);
      String callId = sharedPref.getString("call-id", "");
      String payload = sharedPref.getString("payload", "");
      if (!callId.isEmpty()) {
         Log.i("[Core Manager] Push notification information retrieved from storage, Call-ID is [" + callId + "]");
         this.processPushNotification(callId, payload, true);
         Editor editor = sharedPref.edit();
         editor.putString("call-id", "");
         editor.putString("payload", "");
         editor.apply();
         Log.i("[Core Manager] Push information cleared from storage");
      }

   }

   public void stop() {
      Log.i("[Core Manager] Stopping");
      this.stopCore(this.mCore.getNativePointer());
   }

   public void onLinphoneCoreStop() {
      Log.i("[Core Manager] Core stopped");
      if (this.isServiceRunning()) {
         Log.i("[Core Manager] Stopping service ", this.mServiceClass.getName());
         this.mContext.stopService((new Intent()).setClass(this.mContext, this.mServiceClass));
      }

      this.mCore.removeListener(this.mListener);
      this.stopAutoIterate();
      this.stopTimerToResetAutoIterateSchedule();
      this.mCore = null;
   }

   public void startAutoIterate() {
      if (this.mCore != null) {
         if (this.mCore.isAutoIterateEnabled()) {
            if (this.mTimer != null) {
               Log.w("[Core Manager] core.iterate() scheduling is already active");
               return;
            }

            if (this.mCore.isInBackground()) {
               Log.i("[Core Manager] Start core.iterate() scheduling with background timer");
               this.startAutoIterate(this.mCore.getAutoIterateBackgroundSchedule());
            } else {
               Log.i("[Core Manager] Start core.iterate() scheduling with foreground timer");
               this.startAutoIterate(this.mCore.getAutoIterateForegroundSchedule());
            }
         }

      }
   }

   private void stopTimerToResetAutoIterateSchedule() {
      if (this.mForcedIterateTimer != null) {
         this.mForcedIterateTimer.cancel();
         this.mForcedIterateTimer.purge();
         this.mForcedIterateTimer = null;
      }

   }

   private void createTimerToResetAutoIterateSchedule() {
      this.stopTimerToResetAutoIterateSchedule();
      TimerTask lTask = new TimerTask() {
         public void run() {
            AndroidDispatcher.dispatchOnUIThread(new Runnable() {
               public void run() {
                  Log.i("[Core Manager] Resetting core.iterate() schedule depending on background/foreground state");
                  CoreManager.this.stopAutoIterate();
                  CoreManager.this.startAutoIterate();
               }
            });
         }
      };
      this.mForcedIterateTimer = new Timer("Linphone core.iterate() reset scheduler");
      this.mForcedIterateTimer.schedule(lTask, 20000L);
      Log.i("[Core Manager] Iterate scheduler will be reset in 20 seconds");
   }

   private void startAutoIterate(int schedule) {
      if (this.mTimer != null && schedule == this.mIterateSchedule) {
         Log.i("[Core Manager] core.iterate() is already scheduled every " + schedule + " ms");
      } else {
         this.stopAutoIterate();
         this.mIterateSchedule = schedule;
         this.mIterateRunnable = new Runnable() {
            public void run() {
               if (CoreManager.this.mCore != null) {
                  CoreManager.this.mCore.iterate();
               }

            }
         };
         TimerTask lTask = new TimerTask() {
            public void run() {
               AndroidDispatcher.dispatchOnUIThread(CoreManager.this.mIterateRunnable);
            }
         };
         this.mTimer = new Timer("Linphone core.iterate() scheduler");
         this.mTimer.schedule(lTask, 0L, (long)this.mIterateSchedule);
         Log.i("[Core Manager] Call to core.iterate() scheduled every " + this.mIterateSchedule + " ms");
      }
   }

   public void stopAutoIterate() {
      if (this.mTimer != null) {
         Log.i("[Core Manager] Stopping scheduling of core.iterate() every " + this.mIterateSchedule + " ms");
         this.mTimer.cancel();
         this.mTimer.purge();
         this.mTimer = null;
         Log.i("[Core Manager] core.iterate() scheduler stopped");
      } else {
         Log.w("[Core Manager] core.iterate() scheduling wasn't started or already stopped");
      }

   }

   public void startAudioForEchoTestOrCalibration() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.startAudioForEchoTestOrCalibration();
      }
   }

   public void stopAudioForEchoTestOrCalibration() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.stopAudioForEchoTestOrCalibration();
      }
   }

   public void routeAudioToSpeaker() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.routeAudioToSpeaker();
      }
   }

   public void restorePreviousAudioRoute() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.restorePreviousAudioRoute();
      }
   }

   public void onAudioFocusLost() {
      if (this.mCore != null) {
         boolean pauseCallsWhenAudioFocusIsLost = this.mCore.getConfig().getBool("audio", "android_pause_calls_when_audio_focus_lost", true);
         if (pauseCallsWhenAudioFocusIsLost) {
            if (this.mCore.isInConference()) {
               Log.i("[Core Manager] App has lost audio focus, leaving conference");
               this.leaveConference(this.mCore.getNativePointer());
            } else {
               Log.i("[Core Manager] App has lost audio focus, pausing all calls");
               this.pauseAllCalls(this.mCore.getNativePointer());
            }

            this.mAudioHelper.releaseCallAudioFocus();
         } else {
            Log.w("[Core Manager] Audio focus lost but keeping calls running");
         }
      }

   }

   public void onBluetoothAdapterTurnedOn() {
      if (DeviceUtils.isBluetoothConnectPermissionGranted(this.mContext)) {
         this.onBluetoothHeadsetStateChanged();
      } else {
         Log.w("[Core Manager] Bluetooth Connect permission isn't granted, waiting longer before reloading sound devices to increase chances to get bluetooth device");
         this.onBluetoothHeadsetStateChanged(5000);
      }

   }

   public void onBluetoothHeadsetStateChanged() {
      this.onBluetoothHeadsetStateChanged(500);
   }

   private void onBluetoothHeadsetStateChanged(int delay) {
      GlobalState globalState = this.mCore.getGlobalState();
      if (globalState != GlobalState.On && globalState != GlobalState.Ready) {
         Log.w("[Core Manager] Bluetooth headset state changed but current global state is ", globalState.name(), ", skipping...");
      } else {
         Log.i("[Core Manager] Bluetooth headset state changed, waiting for " + delay + " ms before reloading sound devices");
         this.mHandler.postDelayed(new Runnable() {
            public void run() {
               Log.i("[Core Manager] Reloading sound devices");
               if (CoreManager.this.mCore != null) {
                  CoreManager.this.reloadSoundDevices(CoreManager.this.mCore.getNativePointer());
               }

            }
         }, (long)delay);
      }

   }

   public void onHeadsetStateChanged() {
      GlobalState globalState = this.mCore.getGlobalState();
      if (globalState != GlobalState.On && globalState != GlobalState.Ready) {
         Log.w("[Core Manager] Headset state changed but current global state is ", globalState.name(), ", skipping...");
      } else {
         Log.i("[Core Manager] Headset state changed, waiting for 500ms before reloading sound devices");
         this.mHandler.postDelayed(new Runnable() {
            public void run() {
               Log.i("[Core Manager] Reloading sound devices");
               if (CoreManager.this.mCore != null) {
                  CoreManager.this.reloadSoundDevices(CoreManager.this.mCore.getNativePointer());
               }

            }
         }, 500L);
      }

   }

   public void onBackgroundMode() {
      Log.i("[Core Manager] App has entered background mode");
      if (this.mCore != null) {
         this.enterBackground(this.mCore.getNativePointer());
         if (this.mCore.isAutoIterateEnabled()) {
            this.stopTimerToResetAutoIterateSchedule();
            Log.i("[Core Manager] Restarting core.iterate() schedule with background timer");
            this.startAutoIterate(this.mCore.getAutoIterateBackgroundSchedule());
         }
      }

   }

   public void onForegroundMode() {
      Log.i("[Core Manager] App has left background mode");
      if (this.mCore != null) {
         this.enterForeground(this.mCore.getNativePointer());
         if (this.mCore.isAutoIterateEnabled()) {
            this.stopTimerToResetAutoIterateSchedule();
            Log.i("[Core Manager] Restarting core.iterate() schedule with foreground timer");
            this.startAutoIterate(this.mCore.getAutoIterateForegroundSchedule());
         }
      }

   }

   public void setPushToken(String token) {
      int resId = this.mContext.getResources().getIdentifier("gcm_defaultSenderId", "string", this.mContext.getPackageName());
      String appId = this.mContext.getString(resId);
      Log.i("[Core Manager] Push notification app id is [", appId, "] and token is [", token, "]");
      if (this.mCore != null) {
         this.updatePushNotificationInformation(this.mCore.getNativePointer(), appId, token);
      }

   }

   public void setAudioManagerInCommunicationMode() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.setAudioManagerInCommunicationMode();
      }

   }

   public void setAudioManagerInNormalMode() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.setAudioManagerInNormalMode();
      }

   }

   public void stopRinging() {
      if (this.mAudioHelper != null) {
         this.mAudioHelper.stopRinging();
      }

   }

   private Class getServiceClass() {
      try {
         PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 4);
         ServiceInfo[] services = packageInfo.services;
         ServiceInfo[] var3 = services;
         int var4 = services.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            ServiceInfo service = var3[var5];
            String serviceName = service.name;

            try {
               Class serviceClass = Class.forName(serviceName);
               if (CoreService.class.isAssignableFrom(serviceClass)) {
                  Log.i("[Core Manager] Found a service that herits from org.libs.core.tools.service.CoreService: ", serviceName);
                  return serviceClass;
               }
            } catch (Exception var9) {
               Log.i("[Core Manager] Exception trying to get Class from name [", serviceName, "]: ", var9);
            } catch (Error var10) {
               Log.i("[Core Manager] Error trying to get Class from name [", serviceName, "]: ", var10);
            }
         }
      } catch (Exception var11) {
         Log.i("[Core Manager] Exception thrown while trying to find available Services: ", var11);
         return null;
      }

      Log.w("[Core Manager] Failed to find a valid Service, continuing without it...");
      return null;
   }

   private void startService() {
      Log.i("[Core Manager] Starting service ", this.mServiceClass.getName());
      this.mContext.startService((new Intent()).setClass(this.mContext, this.mServiceClass));
   }

   private boolean isServiceRunning() {
      ActivityManager manager = (ActivityManager)this.mContext.getSystemService(Context.ACTIVITY_SERVICE);
      Iterator var2 = manager.getRunningServices(Integer.MAX_VALUE).iterator();

      RunningServiceInfo service;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         service = (RunningServiceInfo)var2.next();
      } while(!this.mServiceClass.getName().equals(service.service.getClassName()));

      return true;
   }

   public void setServiceRunningAsForeground(boolean foreground) {
      this.mServiceRunningInForeground = foreground;
      if (this.mServiceRunningInForeground) {
         Log.i("[Core Manager] CoreService is now running in foreground");
      } else {
         Log.i("[Core Manager] CoreService is no longer running in foreground");
      }

   }

   public boolean isServiceRunningAsForeground() {
      return this.mServiceRunningInForeground;
   }

   private boolean isAndroidXMediaAvailable() {
      boolean available = false;

      try {
         Class audioAttributesCompat = Class.forName("androidx.media.AudioAttributesCompat");
         Class audioFocusRequestCompat = Class.forName("androidx.media.AudioFocusRequestCompat");
         Class audioManagerCompat = Class.forName("androidx.media.AudioManagerCompat");
         available = true;
      } catch (ClassNotFoundException var5) {
         Log.w("[Core Manager] Couldn't find class: ", var5);
      } catch (Exception var6) {
         Log.w("[Core Manager] Exception: " + var6);
      }

      return available;
   }

   private void dumpDeviceInformation() {
      Log.i("==== Phone information dump ====");
      Log.i("DEVICE=" + Build.DEVICE);
      Log.i("MODEL=" + Build.MODEL);
      Log.i("MANUFACTURER=" + Build.MANUFACTURER);
      Log.i("ANDROID SDK=" + VERSION.SDK_INT);
      Log.i("PERFORMANCE CLASS=" + DeviceUtils.getPerformanceClass());
      StringBuilder sb = new StringBuilder();
      sb.append("ABIs=");
      Iterator var2 = Version.getCpuAbis().iterator();

      while(var2.hasNext()) {
         String abi = (String)var2.next();
         sb.append(abi).append(", ");
      }

      Log.i(sb.substring(0, sb.length() - 2));
      Log.i("=========================================");
   }

   private void dumpLinphoneInformation() {
      Log.i("==== MiFone SDK information dump ====");
      Log.i("VERSION=", ""); //
      Log.i("BRANCH=", ""); //
      StringBuilder sb = new StringBuilder();
      sb.append("PLUGINS=");
      String[] var2 = BuildConfig.PLUGINS_ARRAY;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String plugin = var2[var4];
         sb.append(plugin).append(", ");
      }

      Log.i(sb.substring(0, sb.length() - 2));
      Log.i("PACKAGE=", "org.libs.core");
      Log.i("BUILD TYPE=", "release");
      Log.i("=========================================");
   }

   private void updateOrientation(int displayId) {
      if (this.mCore == null) {
         Log.i("[Core Manager] Core is null, don't notify device rotation");
      } else {
         Display display = this.mDisplayManager.getDisplay(displayId);
         if (display == null) {
            Log.i("[Core Manager] Failed to get display from id: ", displayId);
         } else {
            int degrees = 270;
            int orientation = display.getRotation();
            if (orientation == 0) {
               degrees = 0;
            } else if (orientation == 1) {
               degrees = 270;
            } else if (orientation == 2) {
               degrees = 180;
            } else if (orientation == 3) {
               degrees = 90;
            }

            Log.i("[Core Manager] Device orientation is ", Integer.valueOf(degrees), " (raw value is ", orientation, ")");
            int rotation = (360 - degrees) % 360;
            this.mCore.setDeviceRotation(rotation);
         }
      }
   }
}
