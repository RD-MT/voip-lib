package org.libs.core.tools;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.view.Surface;
import android.view.TextureView;
import android.view.WindowManager;
import android.view.TextureView.SurfaceTextureListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.libs.core.tools.compatibility.DeviceUtils;
import org.libs.core.tools.network.NetworkManager;
import org.libs.core.tools.network.NetworkManagerAbove21;
import org.libs.core.tools.network.NetworkManagerAbove23;
import org.libs.core.tools.network.NetworkManagerAbove24;
import org.libs.core.tools.network.NetworkManagerAbove26;
import org.libs.core.tools.network.NetworkManagerInterface;
import org.libs.core.tools.receiver.DozeReceiver;
import org.libs.core.tools.receiver.InteractivityReceiver;
import org.libs.core.tools.service.CoreManager;
import org.libs.core.tools.service.PushService;
import org.libs.mediastream.MediastreamerAndroidContext;
import org.libs.mediastream.video.capture.CaptureTextureView;

public class AndroidPlatformHelper {
   private long mNativePtr;
   private Context mContext;
   private WifiLock mWifiLock;
   private MulticastLock mMcastLock;
   private ConnectivityManager mConnectivityManager;
   private int mLastNetworkType = -1;
   private PowerManager mPowerManager;
   private WakeLock mWakeLock;
   private Resources mResources;
   private TextureView mPreviewTextureView;
   private TextureView mVideoTextureView;
   private Map<Long, TextureView> mParticipantTextureView;
   private BroadcastReceiver mDozeReceiver;
   private boolean mWifiOnly;
   private boolean mUsingHttpProxy;
   private NetworkManagerInterface mNetworkManager;
   private Handler mMainHandler;
   private boolean mMonitoringEnabled;
   private InteractivityReceiver mInteractivityReceiver;
   private String[] mDnsServers;
   private boolean mPushServiceStarted;
   private static int mTempCountWifi = 0;
   private static int mTempCountMCast = 0;
   private static int mTempCountCPU = 0;

   private native void setNativePreviewWindowId(long var1, Object var3);

   private native void setNativeVideoWindowId(long var1, Object var3);

   private native void setParticipantDeviceNativeVideoWindowId(long var1, long var3, Object var5);

   private native void setNetworkReachable(long var1, boolean var3);

   private native void setHttpProxy(long var1, String var3, int var4);

   private native boolean isInBackground(long var1);

   private native void enableKeepAlive(long var1, boolean var3);

   private native boolean useSystemHttpProxy(long var1);

   @SuppressLint("InvalidWakeLockTag")
   public AndroidPlatformHelper(long nativePtr, Object ctx_obj, boolean wifiOnly) {
      this.mNativePtr = nativePtr;
      this.mContext = ((Context)ctx_obj).getApplicationContext();
      this.mWifiOnly = wifiOnly;
      this.mDnsServers = null;
      this.mResources = this.mContext.getResources();
      this.mMainHandler = new Handler(this.mContext.getMainLooper());
      MediastreamerAndroidContext.setContext(this.mContext);
      Log.i("[Platform Helper] Created, wifi only mode is " + (this.mWifiOnly ? "enabled" : "disabled"));
      WifiManager wifiMgr = (WifiManager)this.mContext.getSystemService(Context.WIFI_SERVICE);
      this.mPowerManager = (PowerManager)this.mContext.getSystemService(Context.POWER_SERVICE);
      this.mConnectivityManager = (ConnectivityManager)this.mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
      this.mWakeLock = this.mPowerManager.newWakeLock(1, "AndroidPlatformHelper");
      this.mWakeLock.setReferenceCounted(true);
      this.mMcastLock = wifiMgr.createMulticastLock("AndroidPlatformHelper");
      this.mMcastLock.setReferenceCounted(true);
      this.mWifiLock = wifiMgr.createWifiLock(3, "AndroidPlatformHelper");
      this.mWifiLock.setReferenceCounted(true);

      try {
         this.copyAssetsFromPackage();
      } catch (IOException var8) {
         Log.e("[Platform Helper] failed to install some resources.");
      }

      if (DeviceUtils.isAppUserRestricted(this.mContext)) {
         Log.w("[Platform Helper] Device has been restricted by user (Android 9+), push notifications won't work !");
      }

      int bucket = DeviceUtils.getAppStandbyBucket(this.mContext);
      if (bucket > 0) {
         Log.w("[Platform Helper] Device is in bucket " + DeviceUtils.getAppStandbyBucketNameFromValue(bucket));
      }

      NetworkManagerInterface nm = this.createNetworkManager();
      nm.updateDnsServers();
   }

   public synchronized void onLinphoneCoreStart(boolean monitoringEnabled) {
      Log.i("[Platform Helper] onLinphoneCoreStart, network monitoring is " + monitoringEnabled);
      this.mMonitoringEnabled = monitoringEnabled;
      this.startNetworkMonitoring();
   }

   public synchronized void onLinphoneCoreStop() {
      Log.i("[Platform Helper] onLinphoneCoreStop, network monitoring is " + this.mMonitoringEnabled);
      this.setVideoPreviewView((Object)null);
      this.setVideoRenderingView((Object)null);

      while(this.mWakeLock.isHeld()) {
         this.mWakeLock.release();
      }

      while(this.mWifiLock.isHeld()) {
         this.mWifiLock.release();
      }

      while(this.mMcastLock.isHeld()) {
         this.mMcastLock.release();
      }

      this.mNativePtr = 0L;
      this.mMainHandler.removeCallbacksAndMessages((Object)null);
      this.stopNetworkMonitoring();
   }

   public synchronized void onWifiOnlyEnabled(boolean enabled) {
      this.mWifiOnly = enabled;
      Log.i("[Platform Helper] Wifi only mode is now " + (this.mWifiOnly ? "enabled" : "disabled"));
      if (this.mNetworkManager != null) {
         this.mNetworkManager.setWifiOnly(this.mWifiOnly);
      }

      this.updateNetworkReachability();
   }

   public synchronized Object getPowerManager() {
      return this.mPowerManager;
   }

   public synchronized String[] getDnsServers() {
      String dnsList = "";
      String[] var2 = this.mDnsServers;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String dns = var2[var4];
         dnsList = dnsList + dns;
         dnsList = dnsList + ", ";
      }

      Log.i("[Platform Helper] getDnsServers() returning " + dnsList);
      return this.mDnsServers;
   }

   public static String getDataPath(Context context) {
      return context.getFilesDir().getAbsolutePath() + "/";
   }

   public static String getConfigPath(Context context) {
      return context.getFilesDir().getAbsolutePath() + "/";
   }

   public String getCachePath() {
      return this.mContext.getCacheDir().getAbsolutePath() + "/";
   }

   public static String getDownloadPath(Context context) {
      String path = null;
      if (Environment.getExternalStorageState().equals("mounted")) {
         Log.i("[Platform Helper] External storage is mounted, using download directory");
         path = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
      }

      if (path == null) {
         Log.w("[Platform Helper] Couldn't get external storage path, using internal");
         path = context.getFilesDir().getAbsolutePath();
      }

      Log.i("[Platform Helper] Download directory is " + path + "/");
      return path + "/";
   }

   public String getNativeLibraryDir() {
      ApplicationInfo info = this.mContext.getApplicationInfo();
      return info.nativeLibraryDir;
   }

   public synchronized void acquireWifiLock() {
      ++mTempCountWifi;
      Log.d("[Platform Helper] acquireWifiLock(). count = " + mTempCountWifi);
      if (!this.mWifiLock.isHeld()) {
         this.mWifiLock.acquire();
      }

   }

   public synchronized void releaseWifiLock() {
      --mTempCountWifi;
      Log.d("[Platform Helper] releaseWifiLock(). count = " + mTempCountWifi);
      if (this.mWifiLock.isHeld()) {
         this.mWifiLock.release();
      }

   }

   public synchronized void acquireMcastLock() {
      ++mTempCountMCast;
      Log.d("[Platform Helper] acquireMcastLock(). count = " + mTempCountMCast);
      if (!this.mMcastLock.isHeld()) {
         this.mMcastLock.acquire();
      }

   }

   public synchronized void releaseMcastLock() {
      --mTempCountMCast;
      Log.d("[Platform Helper] releaseMcastLock(). count = " + mTempCountMCast);
      if (this.mMcastLock.isHeld()) {
         this.mMcastLock.release();
      }

   }

   public synchronized void acquireCpuLock() {
      ++mTempCountCPU;
      Log.d("[Platform Helper] acquireCpuLock(). count = " + mTempCountCPU);
      if (!this.mWakeLock.isHeld()) {
         this.mWakeLock.acquire();
      }

   }

   public synchronized void releaseCpuLock() {
      --mTempCountCPU;
      Log.d("[Platform Helper] releaseCpuLock(). count = " + mTempCountCPU);
      if (this.mWakeLock.isHeld()) {
         this.mWakeLock.release();
      }

   }

   private int getResourceIdentifierFromName(String name) {
      int resId = this.mResources.getIdentifier(name, "raw", this.mContext.getPackageName());
      if (resId == 0) {
         Log.d("[Platform Helper] App doesn't seem to embed resource " + name + " in it's res/raw/ directory, use linphone's instead");
         resId = this.mResources.getIdentifier(name, "raw", "org.linphone");
         if (resId == 0) {
            Log.d("[Platform Helper] App doesn't seem to embed resource " + name + " in it's res/raw/ directory. Make sure this file is either brought as an asset or a resource");
         }
      }

      return resId;
   }

   private void copyAssetsFromPackage() throws IOException {
      Log.i("[Platform Helper] Starting copy from assets to application files directory");
      copyAssetsFromPackage(this.mContext, "org.libs.core", ".");
      Log.i("[Platform Helper] Copy from assets done");
      if (this.getResourceIdentifierFromName("cpim_grammar") != 0) {
         this.copyLegacyAssets();
      }

   }

   private void copyLegacyAssets() throws IOException {
      Log.i("[Platform Helper] Starting to copy legacy assets");
      String basePath = this.mContext.getFilesDir().getAbsolutePath();
      String mLinphoneRootCaFile = basePath + "/share/linphone/rootca.pem";
      String mRingSoundFile = basePath + "/share/sounds/linphone/rings/notes_of_the_optimistic.mkv";
      String mRingbackSoundFile = basePath + "/share/sounds/linphone/ringback.wav";
      String mPauseSoundFile = basePath + "/share/sounds/linphone/rings/dont_wait_too_long.mkv";
      String mErrorToneFile = basePath + "/share/sounds/linphone/incoming_chat.wav";
      String mGrammarCpimFile = basePath + "/share/belr/grammars/cpim_grammar";
      String mGrammarIcsFile = basePath + "/share/belr/grammars/ics_grammar";
      String mGrammarIdentityFile = basePath + "/share/belr/grammars/identity_grammar";
      String mGrammarVcardFile = basePath + "/share/belr/grammars/vcard_grammar";
      this.copyEvenIfExists(this.getResourceIdentifierFromName("cpim_grammar"), mGrammarCpimFile);
      this.copyEvenIfExists(this.getResourceIdentifierFromName("ics_grammar"), mGrammarIcsFile);
      this.copyEvenIfExists(this.getResourceIdentifierFromName("identity_grammar"), mGrammarIdentityFile);
      this.copyEvenIfExists(this.getResourceIdentifierFromName("vcard_grammar"), mGrammarVcardFile);
      this.copyEvenIfExists(this.getResourceIdentifierFromName("rootca"), mLinphoneRootCaFile);
      this.copyIfNotExist(this.getResourceIdentifierFromName("notes_of_the_optimistic"), mRingSoundFile);
      this.copyIfNotExist(this.getResourceIdentifierFromName("ringback"), mRingbackSoundFile);
      this.copyIfNotExist(this.getResourceIdentifierFromName("hold"), mPauseSoundFile);
      this.copyIfNotExist(this.getResourceIdentifierFromName("incoming_chat"), mErrorToneFile);
      Log.i("[Platform Helper] Copy from legacy resources done");
   }

   public void copyEvenIfExists(int ressourceId, String target) throws IOException {
      File lFileToCopy = new File(target);
      this.copyFromPackage(ressourceId, lFileToCopy);
   }

   public void copyIfNotExist(int ressourceId, String target) throws IOException {
      File lFileToCopy = new File(target);
      if (!lFileToCopy.exists()) {
         this.copyFromPackage(ressourceId, lFileToCopy);
      }

   }

   public void copyFromPackage(int ressourceId, File target) throws IOException {
      if (ressourceId == 0) {
         Log.i("[Platform Helper] Resource identifier null for target [" + target.getName() + "]");
      } else {
         if (!target.getParentFile().exists()) {
            target.getParentFile().mkdirs();
         }

         InputStream lInputStream = this.mResources.openRawResource(ressourceId);
         FileOutputStream lOutputStream = new FileOutputStream(target);
         byte[] buff = new byte[8048];

         int readByte;
         while((readByte = lInputStream.read(buff)) != -1) {
            lOutputStream.write(buff, 0, readByte);
         }

         lOutputStream.flush();
         lOutputStream.close();
         lInputStream.close();
      }
   }

   public static void copyAssetsFromPackage(Context ctx, String fromPath, String toPath) throws IOException {
      File asset = new File(ctx.getFilesDir().getPath() + "/" + toPath);
      asset.mkdir();
      String[] var4 = ctx.getAssets().list(fromPath);
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String f = var4[var6];
         String current_name = fromPath + "/" + f;
         String current_dest = toPath + "/" + f;
         File file = new File(ctx.getFilesDir().getPath() + "/" + current_dest);

         InputStream lInputStream;
         try {
            if (file.exists() && (f.endsWith(".wav") || f.endsWith(".mkv"))) {
               Log.i("[Platform Helper] Resource " + f + " already installed, skipping...");
               continue;
            }

            lInputStream = ctx.getAssets().open(current_name);
         } catch (IOException var15) {
            copyAssetsFromPackage(ctx, current_name, current_dest);
            continue;
         }

         Log.i("[Platform Helper] Installing Resource " + f);
         FileOutputStream lOutputStream = new FileOutputStream(file);
         byte[] buff = new byte[8048];

         int readByte;
         while((readByte = lInputStream.read(buff)) != -1) {
            lOutputStream.write(buff, 0, readByte);
         }

         lOutputStream.flush();
         lOutputStream.close();
         lInputStream.close();
      }

   }

   public synchronized void setVideoPreviewView(Object view) {
      if (this.mPreviewTextureView != null) {
         Log.w("[Platform Helper] Found an existing preview TextureView, let's destroy it first");
         this.mPreviewTextureView.setSurfaceTextureListener((SurfaceTextureListener)null);
         this.mPreviewTextureView = null;
      }

      if (view == null) {
         Log.i("[Platform Helper] Preview window surface set to null");
         this.setNativePreviewWindowId(this.mNativePtr, (Object)null);
      } else if (view instanceof Surface) {
         Log.i("[Platform Helper] Preview window surface is a Surface");
         Surface surface = (Surface)view;
         this.setNativePreviewWindowId(this.mNativePtr, surface);
      } else if (view instanceof SurfaceTexture) {
         Log.i("[Platform Helper] Preview window surface is a SurfaceTexture");
         SurfaceTexture surface = (SurfaceTexture)view;
         this.setNativePreviewWindowId(this.mNativePtr, surface);
      } else if (!(view instanceof TextureView)) {
         throw new RuntimeException("[Platform Helper] Preview window id is not an instance of TextureView, Surface or SurfaceTexture. Please update your UI layer so that the preview video view is one of the above types (or an instance of it) or enable compatibility mode by setting displaytype=MSAndroidOpenGLDisplay in the [video] section your linphonerc factory configuration file so you can keep using your existing application code for managing video views.");
      } else {
         this.mPreviewTextureView = (TextureView)view;
         this.mPreviewTextureView.setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Preview window surface texture [" + surface + "] is available for texture view [" + AndroidPlatformHelper.this.mPreviewTextureView + "]");
               AndroidPlatformHelper.this.rotateVideoPreview();
               AndroidPlatformHelper.this.setNativePreviewWindowId(AndroidPlatformHelper.this.mNativePtr, AndroidPlatformHelper.this.mPreviewTextureView);
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Preview surface texture [" + surface + "] size changed: " + width + "x" + height);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
               Log.i("[Platform Helper] Preview surface texture [" + surface + "] destroyed");
               if (AndroidPlatformHelper.this.mNativePtr != 0L && AndroidPlatformHelper.this.mPreviewTextureView != null && surface.equals(AndroidPlatformHelper.this.mPreviewTextureView.getSurfaceTexture())) {
                  Log.i("[Platform Helper] Current preview surface texture is no longer available");
                  AndroidPlatformHelper.this.mPreviewTextureView = null;
                  AndroidPlatformHelper.this.setNativePreviewWindowId(AndroidPlatformHelper.this.mNativePtr, (Object)null);
               }

               if (!DeviceUtils.isSurfaceTextureReleased(surface)) {
                  Log.i("[Platform Helper] Releasing preview window surface texture [" + surface + "]");
                  surface.release();
               }

               return true;
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
               Log.d("[Platform Helper] Preview surface texture [" + surface + "] has been updated");
            }
         });
         if (this.mPreviewTextureView.isAvailable()) {
            Log.i("[Platform Helper] Preview window surface is directly available for texture view [" + this.mPreviewTextureView + "]");
            this.rotateVideoPreview();
            this.setNativePreviewWindowId(this.mNativePtr, this.mPreviewTextureView);
         }

      }
   }

   public synchronized void setVideoRenderingView(Object view) {
      if (this.mVideoTextureView != null) {
         Log.w("[Platform Helper] Found an existing video TextureView [", this.mVideoTextureView, "], let's destroy it first");
         this.mVideoTextureView.setSurfaceTextureListener((SurfaceTextureListener)null);
         this.mVideoTextureView = null;
      }

      if (view == null) {
         Log.i("[Platform Helper] Video window surface set to null");
         this.setNativeVideoWindowId(this.mNativePtr, (Object)null);
      } else if (view instanceof Surface) {
         Log.i("[Platform Helper] Video window surface is a Surface");
         Surface surface = (Surface)view;
         this.setNativeVideoWindowId(this.mNativePtr, surface);
      } else if (view instanceof SurfaceTexture) {
         Log.i("[Platform Helper] Video window surface is a SurfaceTexture");
         SurfaceTexture surface = (SurfaceTexture)view;
         this.setNativeVideoWindowId(this.mNativePtr, surface);
      } else if (!(view instanceof TextureView)) {
         throw new RuntimeException("[Platform Helper] Rendering window id is not an instance of TextureView, Surface or SurfaceTexture. Please update your UI layer so that the video rendering view is an object of any above types (or an instance of it) or enable compatibility mode by setting displaytype=MSAndroidOpenGLDisplay in the [video] section your linphonerc factory configuration file so you can keep using your existing application code for managing video views.");
      } else {
         this.mVideoTextureView = (TextureView)view;
         this.mVideoTextureView.setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Rendering window surface texture [" + surface + "] is available for texture view [" + AndroidPlatformHelper.this.mVideoTextureView + "]");
               AndroidPlatformHelper.this.setNativeVideoWindowId(AndroidPlatformHelper.this.mNativePtr, AndroidPlatformHelper.this.mVideoTextureView);
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Surface texture [" + surface + "] size changed: " + width + "x" + height);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
               Log.i("[Platform Helper] Rendering surface texture [" + surface + "] destroyed");
               if (AndroidPlatformHelper.this.mNativePtr != 0L && AndroidPlatformHelper.this.mVideoTextureView != null && surface.equals(AndroidPlatformHelper.this.mVideoTextureView.getSurfaceTexture())) {
                  Log.i("[Platform Helper] Current rendering surface texture is no longer available");
                  AndroidPlatformHelper.this.mVideoTextureView = null;
                  AndroidPlatformHelper.this.setNativeVideoWindowId(AndroidPlatformHelper.this.mNativePtr, (Object)null);
               }

               if (!DeviceUtils.isSurfaceTextureReleased(surface)) {
                  Log.i("[Platform Helper] Releasing window surface texture [" + surface + "]");
                  surface.release();
               }

               return true;
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
               Log.d("[Platform Helper] Surface texture [" + surface + "] has been updated");
            }
         });
         if (this.mVideoTextureView.isAvailable()) {
            Log.i("[Platform Helper] Rendering window surface is directly available for texture view [" + this.mVideoTextureView + "]");
            this.setNativeVideoWindowId(this.mNativePtr, this.mVideoTextureView);
         }

      }
   }

   public synchronized void setParticipantDeviceVideoRenderingView(final long participantDevice, Object view) {
      if (this.mParticipantTextureView == null) {
         this.mParticipantTextureView = new HashMap();
      }

      if (this.mParticipantTextureView.containsKey(participantDevice)) {
         Log.w("[Platform Helper] Found an existing TextureView for participant device, let's destroy it first");
         ((TextureView)this.mParticipantTextureView.get(participantDevice)).setSurfaceTextureListener((SurfaceTextureListener)null);
         this.mParticipantTextureView.remove(participantDevice);
      }

      if (view == null) {
         Log.i("[Platform Helper] Participant device video window surface set to null");
         this.setParticipantDeviceNativeVideoWindowId(this.mNativePtr, participantDevice, (Object)null);
      } else if (view instanceof Surface) {
         Log.i("[Platform Helper] Participant device video window surface is a Surface");
         Surface surface = (Surface)view;
         this.setParticipantDeviceNativeVideoWindowId(this.mNativePtr, participantDevice, surface);
      } else if (view instanceof SurfaceTexture) {
         Log.i("[Platform Helper] Participant device video window surface is a SurfaceTexture");
         SurfaceTexture surface = (SurfaceTexture)view;
         this.setParticipantDeviceNativeVideoWindowId(this.mNativePtr, participantDevice, surface);
      } else if (!(view instanceof TextureView)) {
         throw new RuntimeException("[Platform Helper] Rendering window id is not an instance of TextureView, Surface or SurfaceTexture. Please update your UI layer so that the video rendering view is an object of any above types (or an instance of it) or enable compatibility mode by setting displaytype=MSAndroidOpenGLDisplay in the [video] section your linphonerc factory configuration file so you can keep using your existing application code for managing video views.");
      } else {
         this.mParticipantTextureView.put(participantDevice, (TextureView)view);
         ((TextureView)this.mParticipantTextureView.get(participantDevice)).setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Rendering window surface texture [" + surface + "] is available for texture view [" + AndroidPlatformHelper.this.mParticipantTextureView.get(participantDevice) + "]");
               AndroidPlatformHelper.this.setParticipantDeviceNativeVideoWindowId(AndroidPlatformHelper.this.mNativePtr, participantDevice, AndroidPlatformHelper.this.mParticipantTextureView.get(participantDevice));
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
               Log.i("[Platform Helper] Surface texture [" + surface + "] size changed: " + width + "x" + height);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
               Log.w("[Platform Helper] TextureView [" + surface + "] for participant device has been destroyed");
               AndroidPlatformHelper.this.mParticipantTextureView.remove(participantDevice);
               AndroidPlatformHelper.this.setParticipantDeviceNativeVideoWindowId(AndroidPlatformHelper.this.mNativePtr, participantDevice, (Object)null);
               return true;
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
               Log.d("[Platform Helper] Surface texture [" + surface + "] has been updated");
            }
         });
         if (((TextureView)this.mParticipantTextureView.get(participantDevice)).isAvailable()) {
            Log.i("[Platform Helper] Rendering participant device window surface is directly available for texture view [" + this.mParticipantTextureView.get(participantDevice) + "]");
            this.setParticipantDeviceNativeVideoWindowId(this.mNativePtr, participantDevice, this.mParticipantTextureView.get(participantDevice));
         } else {
            Log.i("[Platform Helper] Rendering participant device window surface is not available !");
         }

      }
   }

   public synchronized void rotateVideoPreview() {
      if (this.mPreviewTextureView != null && this.mPreviewTextureView instanceof CaptureTextureView) {
         Log.i("[Platform Helper] Found CaptureTextureView, rotating...");
         WindowManager windowManager = (WindowManager)this.mContext.getSystemService(Context.WINDOW_SERVICE);
         int rotation = windowManager.getDefaultDisplay().getRotation() * 90;
         ((CaptureTextureView)this.mPreviewTextureView).rotateToMatchDisplayOrientation(rotation);
      } else if (this.mPreviewTextureView != null) {
         Log.w("[Platform Helper] It seems you are using a TextureView instead of our CaptureTextureView, we strongly advise you to use ours to benefit from correct rotation & ratio");
      }

   }

   public synchronized void resizeVideoPreview(int width, int height) {
      if (this.mPreviewTextureView != null && this.mPreviewTextureView instanceof CaptureTextureView) {
         Log.i("[Platform Helper] Found CaptureTextureView, setting video capture size to " + width + "x" + height);
         ((CaptureTextureView)this.mPreviewTextureView).setAspectRatio(width, height);
      } else if (this.mPreviewTextureView != null) {
         Log.w("[Platform Helper] It seems you are using a TextureView instead of our CaptureTextureView, we strongly advise you to use ours to benefit from correct rotation & ratio");
      }

   }

   public synchronized Handler getHandler() {
      return this.mMainHandler;
   }

   public synchronized boolean isInBackground() {
      if (CoreManager.isReady() && CoreManager.instance().isServiceRunningAsForeground()) {
         Log.i("[Platform Helper] CoreService seems to be running as foreground, consider app is in foreground");
         return false;
      } else {
         return this.isInBackground(this.mNativePtr);
      }
   }

   private String networkTypeToString(int type) {
      switch(type) {
      case 0:
         return "MOBILE";
      case 1:
         return "WIFI";
      case 7:
         return "BLUETOOTH";
      case 9:
         return "ETHERNET";
      case 17:
         return "VPN";
      default:
         return String.valueOf(type);
      }
   }

   public synchronized void updateDnsServers(ArrayList<String> dnsServers) {
      if (dnsServers != null && !dnsServers.isEmpty()) {
         this.mDnsServers = new String[dnsServers.size()];
         dnsServers.toArray(this.mDnsServers);
         Log.i("[Platform Helper] DNS servers list updated");
      }

   }

   public synchronized boolean isActiveNetworkWifiOnlyCompliant() {
      if (this.mNetworkManager == null) {
         Log.w("[Platform Helper] Network Manager is null, assuming network isn't WiFi only compliant");
         return false;
      } else {
         NetworkInfo networkInfo = this.mNetworkManager.getActiveNetworkInfo();
         if (networkInfo != null) {
            Log.i("[Platform Helper] Active network type is " + networkInfo.getTypeName());
            if (networkInfo.getType() == 1 || networkInfo.getType() == 9) {
               return true;
            }
         } else {
            Log.w("[Platform Helper] Active network info is null, assuming network isn't WiFi only compliant");
         }

         return false;
      }
   }

   public synchronized void updateNetworkReachability() {
      if (this.mNativePtr == 0L) {
         Log.w("[Platform Helper] Native pointer has been reset, stopping there");
      } else if (this.mNetworkManager == null) {
         Log.w("[Platform Helper] Network Manager is null, stopping there");
      } else {
         boolean connected = this.mNetworkManager.isCurrentlyConnected(this.mContext);
         if (!connected) {
            Log.i("[Platform Helper] No connectivity: setting network unreachable");
            this.setNetworkReachable(this.mNativePtr, false);
         } else {
            int currentNetworkType;
            if (this.mNetworkManager.hasHttpProxy(this.mContext)) {
               if (this.useSystemHttpProxy(this.mNativePtr)) {
                  String host = this.mNetworkManager.getProxyHost(this.mContext);
                  currentNetworkType = this.mNetworkManager.getProxyPort(this.mContext);
                  this.setHttpProxy(this.mNativePtr, host, currentNetworkType);
                  if (!this.mUsingHttpProxy) {
                     Log.i("[Platform Helper] Proxy wasn't set before, disabling network reachability first");
                     this.setNetworkReachable(this.mNativePtr, false);
                  }

                  this.mUsingHttpProxy = true;
               } else {
                  Log.w("[Platform Helper] Proxy available but forbidden by linphone core [sip] use_system_http_proxy setting");
               }
            } else {
               this.setHttpProxy(this.mNativePtr, "", 0);
               if (this.mUsingHttpProxy) {
                  Log.i("[Platform Helper] Proxy was set before, disabling network reachability first");
                  this.setNetworkReachable(this.mNativePtr, false);
               }

               this.mUsingHttpProxy = false;
            }

            NetworkInfo networkInfo = this.mNetworkManager.getActiveNetworkInfo();
            if (networkInfo == null) {
               Log.e("[Platform Helper] getActiveNetworkInfo() returned null !");
               this.setNetworkReachable(this.mNativePtr, false);
            } else {
               Log.i("[Platform Helper] Active network type is " + networkInfo.getTypeName() + ", state " + networkInfo.getState() + " / " + networkInfo.getDetailedState());
               if (networkInfo.getState() == State.DISCONNECTED && networkInfo.getDetailedState() == DetailedState.BLOCKED) {
                  Log.w("[Platform Helper] Active network is in bad state...");
               }

               this.mNetworkManager.updateDnsServers();
               currentNetworkType = networkInfo.getType();
               if (this.mLastNetworkType != -1 && this.mLastNetworkType != currentNetworkType) {
                  Log.i("[Platform Helper] Network type has changed (last one was " + this.networkTypeToString(this.mLastNetworkType) + "), disabling network reachability first");
                  this.setNetworkReachable(this.mNativePtr, false);
               }

               this.mLastNetworkType = currentNetworkType;
               Log.i("[Platform Helper] Network reachability enabled");
               this.setNetworkReachable(this.mNativePtr, true);
            }
         }
      }
   }

   private NetworkManagerInterface createNetworkManager() {
      NetworkManagerInterface networkManager = null;
      if (VERSION.SDK_INT < 21) {
         networkManager = new NetworkManager(this, this.mConnectivityManager, this.mWifiOnly);
      } else if (VERSION.SDK_INT < 23) {
         networkManager = new NetworkManagerAbove21(this, this.mConnectivityManager, this.mWifiOnly);
      } else if (VERSION.SDK_INT < 24) {
         networkManager = new NetworkManagerAbove23(this, this.mConnectivityManager, this.mWifiOnly);
      } else if (VERSION.SDK_INT < 26) {
         networkManager = new NetworkManagerAbove24(this, this.mConnectivityManager, this.mWifiOnly);
      } else {
         networkManager = new NetworkManagerAbove26(this, this.mConnectivityManager, this.mWifiOnly);
      }

      return (NetworkManagerInterface)networkManager;
   }

   private synchronized void startNetworkMonitoring() {
      if (this.mMonitoringEnabled) {
         this.mNetworkManager = this.createNetworkManager();
         Log.i("[Platform Helper] Registering network callbacks");
         this.mNetworkManager.registerNetworkCallbacks(this.mContext);
         IntentFilter interactivityIntentFilter;
         if (VERSION.SDK_INT >= 23) {
            interactivityIntentFilter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            this.mDozeReceiver = new DozeReceiver();
            Log.i("[Platform Helper] Registering doze receiver");
            this.mContext.registerReceiver(this.mDozeReceiver, interactivityIntentFilter);
         }

         this.mInteractivityReceiver = new InteractivityReceiver();
         interactivityIntentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
         interactivityIntentFilter.addAction("android.intent.action.SCREEN_OFF");
         Log.i("[Platform Helper] Registering interactivity receiver");
         this.mContext.registerReceiver(this.mInteractivityReceiver, interactivityIntentFilter);
         this.updateNetworkReachability();
      }
   }

   private synchronized void stopNetworkMonitoring() {
      if (this.mInteractivityReceiver != null) {
         Log.i("[Platform Helper] Unregistering interactivity receiver");
         this.mContext.unregisterReceiver(this.mInteractivityReceiver);
         this.mInteractivityReceiver = null;
      }

      if (this.mNetworkManager != null && this.mConnectivityManager != null) {
         Log.i("[Platform Helper] Unregistering network callbacks");
         this.mNetworkManager.unregisterNetworkCallbacks(this.mContext);
         this.mNetworkManager = null;
      }

      if (this.mDozeReceiver != null) {
         Log.i("[Platform Helper] Unregistering doze receiver");
         this.mContext.unregisterReceiver(this.mDozeReceiver);
         this.mDozeReceiver = null;
      }

      this.mMonitoringEnabled = false;
   }

   public synchronized void disableAudioRouteChanges(boolean disable) {
      if (disable) {
         Log.i("[Platform Helper] Disabling audio route changes in mediastreamer2");
      } else {
         Log.i("[Platform Helper] Enabling audio route changes in mediastreamer2");
      }

      MediastreamerAndroidContext.disableAudioRouteChanges(disable);
   }

   public synchronized void startPushService() {
      boolean connected = this.mNetworkManager.isCurrentlyConnected(this.mContext);
      if (!connected) {
         Log.i("[Platform Helper] Push has been received but network seems unreachable, starting foreground push service");
         Intent i = new Intent(this.mContext, PushService.class);
         DeviceUtils.startForegroundService(this.mContext, i);
         this.mPushServiceStarted = true;
      }

   }

   public synchronized void stopPushService() {
      if (this.mPushServiceStarted) {
         Log.i("[Platform Helper] Foreground push service is no longer required");
         Intent i = new Intent(this.mContext, PushService.class);
         this.mContext.stopService(i);
         this.mPushServiceStarted = false;
      }

   }
}
