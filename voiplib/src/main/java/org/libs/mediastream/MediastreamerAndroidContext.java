package org.libs.mediastream;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Build.VERSION;
import java.io.File;
import java.util.Iterator;

public class MediastreamerAndroidContext {
   private static final int DEVICE_CHOICE = 0;
   private static Context mContext;
   private static int mDeviceFavoriteSampleRate = 44100;
   private static int mDeviceFavoriteBufferSize = 256;
   private static boolean mDisableAudioRouteChanges = false;
   private static MediastreamerAndroidContext instance;

   private MediastreamerAndroidContext() {
   }

   private static MediastreamerAndroidContext getInstance() {
      if (instance == null) {
         instance = new MediastreamerAndroidContext();
      }

      return instance;
   }

   public static Context getContext() {
      return mContext;
   }

   public static int getDeviceFavoriteSampleRate() {
      return mDeviceFavoriteSampleRate;
   }

   public static int getDeviceFavoriteBufferSize() {
      return mDeviceFavoriteBufferSize;
   }

   public static String getNativeLibrariesDirectory() {
      String nativeLibDir = getContext().getApplicationInfo().nativeLibraryDir;
      File directory = new File(nativeLibDir);
      File[] nativeLibs = directory.listFiles();
      if (nativeLibs == null || nativeLibs.length == 0) {
         Log.w("Native library directory is empty, using path to native libs for app bundle mode");
         nativeLibDir = nativeLibDir.substring(0, nativeLibDir.indexOf("/lib"));
         nativeLibDir = nativeLibDir + "/split_config." + Build.SUPPORTED_ABIS[0].replace("-", "_") + ".apk!/lib/" + Build.SUPPORTED_ABIS[0];
      }

      return nativeLibDir;
   }

   @TargetApi(19)
   public static void setContext(Object c) {
      if (c != null) {
         mContext = (Context)c;
         boolean hasLowLatencyFeature = mContext.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
         boolean hasProFeature = mContext.getPackageManager().hasSystemFeature("android.hardware.audio.pro");
         Log.i("[Device] hasLowLatencyFeature: " + hasLowLatencyFeature + ", hasProFeature: " + hasProFeature);
         int bufferSizes = 256;
         int sampleRates = '걄';
         MediastreamerAndroidContext mac = getInstance();
          {
            AudioManager audiomanager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE);
            String bufferProperty = audiomanager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            int bufferSize = parseInt(bufferProperty, bufferSizes);
            String sampleRateProperty = audiomanager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            int sampleRate = parseInt(sampleRateProperty, sampleRates);
            Log.i("[Device] Output frames per buffer: " + bufferSize + ", output sample rate: " + sampleRate + ".");
            mDeviceFavoriteSampleRate = sampleRate;
            mDeviceFavoriteBufferSize = bufferSize;
          }

      }
   }

   public static AudioDeviceInfo[] getAudioDevices(String device_dir) {
      int flag = -1;
      byte var3 = -1;
      switch(device_dir.hashCode()) {
      case -1005512447:
         if (device_dir.equals("output")) {
            var3 = 0;
         }
         break;
      case 96673:
         if (device_dir.equals("all")) {
            var3 = 2;
         }
         break;
      case 100358090:
         if (device_dir.equals("input")) {
            var3 = 1;
         }
      }

      switch(var3) {
      case 0:
         flag = 2;
         break;
      case 1:
         flag = 1;
         break;
      case 2:
         flag = 3;
         break;
      default:
         Log.e("Unknown device direction - Provided is " + device_dir + " Valid values are output input all");
      }

      AudioManager audiomanager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      @SuppressLint("WrongConstant") AudioDeviceInfo[] devices = audiomanager.getDevices(flag);
      AudioDeviceInfo[] var4 = devices;
      int var5 = devices.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         AudioDeviceInfo device = var4[var6];
         int type = device.getType();
         String stringType = getHumanReadableAudioDeviceType(type);
         Log.i("[Audio Manager] Found device: name [" + device.getProductName() + "], ID [" + device.getId() + "], type [" + stringType + " (" + type + ")], isSource [" + device.isSource() + "], isSink [" + device.isSink() + "]");
      }

      return devices;
   }

   public static boolean getSpeakerphoneAlwaysOn(Factory factory) {
      return (factory.getDeviceFlags() & 512) != 0;
   }

   private static int parseInt(String value, int defaultValue) {
      int returnedValue = defaultValue;

      try {
         returnedValue = Integer.parseInt(value);
      } catch (NumberFormatException var4) {
         Log.e("Can't parse " + value + " to integer ; using default value " + defaultValue);
      }

      return returnedValue;
   }

   private native int enableFilterFromNameImpl(String var1, boolean var2);

   private native boolean filterFromNameEnabledImpl(String var1);

   /** @deprecated */
   public static void enableFilterFromName(String name, boolean enable) throws MediastreamException {
      if (getInstance().enableFilterFromNameImpl(name, enable) != 0) {
         throw new MediastreamException("Cannot " + (enable ? "enable" : "disable") + " filter  name [" + name + "]");
      }
   }

   /** @deprecated */
   public static boolean filterFromNameEnabled(String name) {
      return getInstance().filterFromNameEnabledImpl(name);
   }

   public static synchronized boolean isAudioRouteChangesDisabled() {
      return mDisableAudioRouteChanges;
   }

   public static synchronized void disableAudioRouteChanges(boolean disable) {
      if (disable) {
         Log.i("[Audio Manager] Disabling audio route changes in sound cards");
      } else {
         Log.i("[Audio Manager] Enabling audio route changes in sound cards");
      }

      mDisableAudioRouteChanges = disable;
   }

   public static synchronized void enableSpeaker() {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      if (audioManager.isBluetoothScoOn()) {
         stopBluetooth();
      }

      Log.i("[Audio Manager] Turning on speakerphone");
      audioManager.setSpeakerphoneOn(true);
   }

   public static synchronized void enableEarpiece() {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      if (audioManager.isBluetoothScoOn()) {
         stopBluetooth();
      }

      Log.i("[Audio Manager] Turning off speakerphone");
      audioManager.setSpeakerphoneOn(false);
   }

   public static synchronized void startBluetooth() {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      if (audioManager.isBluetoothScoOn()) {
         Log.i("[Audio Manager] Bluetooth SCO is already started");
      } else {
         Log.i("[Audio Manager] Starting bluetooth SCO");
         audioManager.setBluetoothScoOn(true);
         audioManager.startBluetoothSco();
      }

   }

   public static synchronized void stopBluetooth() {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      if (!audioManager.isBluetoothScoOn()) {
         Log.i("[Audio Manager] Bluetooth SCO is not started");
      } else {
         Log.i("[Audio Manager] Stopping bluetooth SCO");
         audioManager.stopBluetoothSco();
         audioManager.setBluetoothScoOn(false);
      }

   }

   public static synchronized void hackVolume() {
      Log.i("[Audio Manager] Lower & raise audio volume to workaround no sound issue until volume has changed...");
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      boolean isVolumeFixed = audioManager.isVolumeFixed();
      if (isVolumeFixed) {
         Log.w("[Audio Manager] Device's volume is fixed, workaround will probably fail!");
      }

      int maxVolume = audioManager.getStreamMaxVolume(0);
      int currentVolume = audioManager.getStreamVolume(0);
      Log.i("[Audio Manager] Max volume for voice call stream is " + maxVolume + ", current volume is " + currentVolume);
      int timeInMills = 50;
      if (maxVolume == currentVolume) {
         try {
            audioManager.adjustSuggestedStreamVolume(-1, 0, 0);
            SystemClock.sleep((long)timeInMills);
            audioManager.adjustSuggestedStreamVolume(1, 0, 0);
         } catch (SecurityException var7) {
            Log.e("[Audio Manager] Security exception during adjustSuggestedStreamVolume: ", var7);
         }

         audioManager.adjustStreamVolume(0, -1, 0);
         SystemClock.sleep((long)timeInMills);
         audioManager.adjustStreamVolume(0, 1, 0);
      } else {
         try {
            audioManager.adjustSuggestedStreamVolume(1, 0, 0);
            SystemClock.sleep((long)timeInMills);
            audioManager.adjustSuggestedStreamVolume(-1, 0, 0);
         } catch (SecurityException var6) {
            Log.e("[Audio Manager] Security exception during adjustSuggestedStreamVolume: ", var6);
         }

         audioManager.adjustStreamVolume(0, 1, 0);
         SystemClock.sleep((long)timeInMills);
         audioManager.adjustStreamVolume(0, -1, 0);
      }

   }

   public static synchronized boolean isRecordAudioPermissionGranted() {
      boolean granted = mContext.checkSelfPermission("android.permission.RECORD_AUDIO") == PackageManager.PERMISSION_GRANTED;
      if (!granted) {
         Log.w("[Audio Manager] RECORD_AUDIO permission is not granted!");
      }

      return granted;
   }

   @TargetApi(31)
   public static synchronized boolean setCommunicationDevice(int id) {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      Iterator var2 = audioManager.getAvailableCommunicationDevices().iterator();

      AudioDeviceInfo audioDeviceInfo;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         audioDeviceInfo = (AudioDeviceInfo)var2.next();
      } while(audioDeviceInfo.getId() != id);

      Log.i("[Audio Manager] Found available communication device matching ID [" + id + "]: " + audioDeviceInfo);
      return audioManager.setCommunicationDevice(audioDeviceInfo);
   }

   @TargetApi(31)
   public static synchronized void clearCommunicationDevice() {
      AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
      audioManager.clearCommunicationDevice();
      Log.i("[Audio Manager] Cleared communication device");
   }

   private static String getHumanReadableAudioDeviceType(int type) {
      if (type == 19) {
         return "Auxiliary line";
      } else if (type == 8) {
         return "Bluetooth A2DP";
      } else if (type == 7) {
         return "Bluetooth SCO";
      } else if (type == 1) {
         return "Built-in earpiece";
      } else if (type == 15) {
         return "Built-in microphone";
      } else if (type == 2) {
         return "Built-in speaker";
      } else if (type == 24) {
         return "Built-in speaker (safe)";
      } else if (type == 21) {
         return "Type agnostic bus";
      } else if (type == 13) {
         return "Dock";
      } else if (type == 14) {
         return "FM";
      } else if (type == 16) {
         return "FM tuner";
      } else if (type == 9) {
         return "HDMI";
      } else if (type == 10) {
         return "HDMI Audio Return Channel";
      } else if (type == 23) {
         return "Hearing aid";
      } else if (type == 20) {
         return "IP";
      } else if (type == 5) {
         return "Analog";
      } else if (type == 6) {
         return "Digital";
      } else if (type == 18) {
         return "Telephony";
      } else if (type == 17) {
         return "TV tuner";
      } else if (type == 0) {
         return "Unknown";
      } else if (type == 12) {
         return "USB accessory";
      } else if (type == 11) {
         return "USB";
      } else if (type == 22) {
         return "USB headset";
      } else if (type == 4) {
         return "Headphones";
      } else if (type == 3) {
         return "Headset";
      } else if (type == 25) {
         return "Remote Submix";
      } else if (type == 26) {
         return "BLE Headset";
      } else if (type == 27) {
         return "BLE Speaker";
      } else if (type == 29) {
         return "HDMI Enhanced Audio Return Channel";
      } else {
         return type == 30 ? "BLE Broadcast" : "UNEXPECTED";
      }
   }
}
