package org.linphone.core.tools.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.NotificationCompat.Builder;
import org.linphone.core.Address;
import org.linphone.core.Call;
import org.linphone.core.Core;
import org.linphone.core.CoreListenerStub;
import org.linphone.core.Factory;
import org.linphone.core.tools.Log;
import org.linphone.core.tools.compatibility.DeviceUtils;
import org.linphone.mediastream.Version;

public class CoreService extends Service {
   protected static final int SERVICE_NOTIF_ID = 1;
   protected static final String SERVICE_NOTIFICATION_CHANNEL_ID = "org_linphone_core_service_notification_channel";
   protected static final String SERVICE_NOTIFICATION_CHANNEL_NAME = "Linphone Core Service";
   protected static final String SERVICE_NOTIFICATION_CHANNEL_DESC = "Used to keep the call(s) alive";
   protected static final String SERVICE_NOTIFICATION_TITLE = "Linphone Core Service";
   protected static final String SERVICE_NOTIFICATION_CONTENT = "Used to keep the call(s) alive";
   protected boolean mIsInForegroundMode = false;
   protected Notification mServiceNotification = null;
   private CoreListenerStub mListener;
   private Vibrator mVibrator;
   private boolean mIsVibrating;
   private AudioManager mAudioManager;
   private boolean mIsListenerAdded = false;

   public void onCreate() {
      super.onCreate();
      Factory.instance();
      if (Version.sdkAboveOrEqual(26)) {
         this.createServiceNotificationChannel();
      }

      this.mVibrator = (Vibrator)this.getSystemService(Context.VIBRATOR_SERVICE);
      this.mAudioManager = (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
      this.mListener = new CoreListenerStub() {
         public void onFirstCallStarted(Core core) {
            Log.i("[Core Service] First call started");
            if (!CoreService.this.mIsInForegroundMode) {
               CoreService.this.startForeground();
            }

            Call call = core.getCurrentCall();
            if (call != null) {
               if (call.getDir() == Call.Dir.Incoming && core.isVibrationOnIncomingCallEnabled()) {
                  CoreService.this.vibrate(call.getRemoteAddress());
               }
            } else {
               Log.w("[Core Service] Couldn't find current call...");
            }

         }

         public void onCallStateChanged(Core core, Call call, Call.State state, String message) {
            if ((state == Call.State.End || state == Call.State.Error || state == Call.State.Connected) && CoreService.this.mIsVibrating) {
               Log.i("[Core Service] Stopping vibrator");
               CoreService.this.mVibrator.cancel();
               CoreService.this.mIsVibrating = false;
            }

         }

         public void onLastCallEnded(Core core) {
            Log.i("[Core Service] Last call ended");
            if (CoreService.this.mIsInForegroundMode) {
               CoreService.this.stopForeground();
            }

         }
      };
      this.addCoreListener();
      Log.i("[Core Service] Created");
   }

   public int onStartCommand(Intent intent, int flags, int startId) {
      super.onStartCommand(intent, flags, startId);
      Log.i("[Core Service] Started");
      if (!this.mIsListenerAdded) {
         this.addCoreListener();
      }

      return Service.START_STICKY_COMPATIBILITY;
   }

   public void onTaskRemoved(Intent rootIntent) {
      Log.i("[Core Service] Task removed");
      super.onTaskRemoved(rootIntent);
   }

   public synchronized void onDestroy() {
      Log.i("[Core Service] Stopping");
      if (CoreManager.isReady()) {
         Core core = CoreManager.instance().getCore();
         if (core != null) {
            Log.i("[Core Service] Core Manager found, removing our listener");
            core.removeListener(this.mListener);
         }

         CoreManager.instance().setServiceRunningAsForeground(false);
      }

      super.onDestroy();
   }

   public IBinder onBind(Intent intent) {
      return null;
   }

   private void addCoreListener() {
      Log.i("[Core Service] Trying to add the Service's CoreListener to the Core...");
      if (CoreManager.isReady()) {
         Core core = CoreManager.instance().getCore();
         if (core != null) {
            Log.i("[Core Service] Core Manager found, adding our listener");
            core.addListener(this.mListener);
            this.mIsListenerAdded = true;
            Log.i("[Core Service] CoreListener succesfully added to the Core");
            if (core.getCallsNb() > 0) {
               Log.w("[Core Service] Core listener added while at least one call active !");
               this.startForeground();
               Call call = core.getCurrentCall();
               if (call != null) {
                  if (call.getDir() == Call.Dir.Incoming && call.getState() == Call.State.IncomingReceived && core.isVibrationOnIncomingCallEnabled()) {
                     this.vibrate(call.getRemoteAddress());
                  }
               } else {
                  Log.w("[Core Service] Couldn't find current call...");
               }
            }
         } else {
            Log.i("[Core Service] CoreManager instance found but Core is null!");
         }
      } else {
         Log.w("[Core Service] CoreManager isn't ready yet...");
      }

   }

   @RequiresApi(
      api = 26
   )
   public void createServiceNotificationChannel() {
      Log.i("[Core Service] Android >= 8.0 detected, creating notification channel");
      NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
      NotificationChannel channel = new NotificationChannel("org_linphone_core_service_notification_channel", "Linphone Core Service", NotificationManager.IMPORTANCE_LOW);
      channel.setDescription("Used to keep the call(s) alive");
      channel.enableVibration(false);
      channel.enableLights(false);
      channel.setShowBadge(false);
      notificationManager.createNotificationChannel(channel);
   }

   public void createServiceNotification() {
      this.mServiceNotification = (new Builder(this, "org_linphone_core_service_notification_channel")).setContentTitle("Linphone Core Service").setContentText("Used to keep the call(s) alive").setSmallIcon(this.getApplicationInfo().icon).setAutoCancel(false).setCategory("service").setVisibility(NotificationCompat.VISIBILITY_PRIVATE).setWhen(System.currentTimeMillis()).setShowWhen(true).setOngoing(true).build();
   }

   public void showForegroundServiceNotification() {
      if (this.mServiceNotification == null) {
         this.createServiceNotification();
      }

      DeviceUtils.startCallForegroundService(this, 1, this.mServiceNotification);
   }

   public void hideForegroundServiceNotification() {
      this.stopForeground(true);
   }

   void startForeground() {
      Log.i("[Core Service] Starting service as foreground");
      this.showForegroundServiceNotification();
      this.mIsInForegroundMode = true;
      if (CoreManager.isReady()) {
         CoreManager.instance().setServiceRunningAsForeground(this.mIsInForegroundMode);
      }

   }

   void stopForeground() {
      if (!this.mIsInForegroundMode) {
         Log.w("[Core Service] Service isn't in foreground mode, nothing to do");
      } else {
         Log.i("[Core Service] Stopping service as foreground");
         this.hideForegroundServiceNotification();
         this.mIsInForegroundMode = false;
         if (CoreManager.isReady()) {
            CoreManager.instance().setServiceRunningAsForeground(this.mIsInForegroundMode);
         }

      }
   }

   private void vibrate(Address caller) {
      if (this.mVibrator != null && this.mVibrator.hasVibrator()) {
         if (this.mAudioManager.getRingerMode() == 0) {
            if (DeviceUtils.checkIfDoNotDisturbAllowsExceptionForFavoriteContacts(this)) {
               boolean isContactFavorite = DeviceUtils.checkIfIsFavoriteContact(this, caller);
               if (isContactFavorite) {
                  Log.i("[Core Service] Ringer mode is set to silent unless for favorite contact, which seems to be the case here, so starting vibrator");
                  DeviceUtils.vibrate(this.mVibrator);
                  this.mIsVibrating = true;
               } else {
                  Log.i("[Core Service] Do not vibrate as ringer mode is set to silent and calling username / SIP address isn't part of a favorite contact");
               }
            } else {
               Log.i("[Core Service] Do not vibrate as ringer mode is set to silent");
            }
         } else {
            Log.i("[Core Service] Starting vibrator");
            DeviceUtils.vibrate(this.mVibrator);
            this.mIsVibrating = true;
         }
      } else {
         Log.i("[Core Service] Device doesn't have a vibrator");
      }

   }
}
