package org.libs.mediastream;

public class Factory {
   public static final int DEVICE_HAS_BUILTIN_AEC = 1;
   public static final int DEVICE_HAS_BUILTIN_AEC_CRAPPY = 2;
   public static final int DEVICE_USE_ANDROID_MIC = 4;
   public static final int DEVICE_HAS_BUILTIN_OPENSLES_AEC = 8;
   public static final int DEVICE_HAS_CRAPPY_ANDROID_FASTTRACK = 16;
   public static final int DEVICE_HAS_CRAPPY_ANDROID_FASTRECORD = 32;
   public static final int DEVICE_HAS_UNSTANDARD_LIBMEDIA = 64;
   public static final int DEVICE_HAS_CRAPPY_OPENGL = 128;
   public static final int DEVICE_HAS_CRAPPY_OPENSLES = 256;
   public static final int DEVICE_USE_ANDROID_CAMCORDER = 512;
   public static final int DEVICE_MCH264ENC_NO_PIX_FMT_CONV = 1024;
   public static final int DEVICE_MCH265_LIMIT_DEQUEUE_OF_OUTPUT_BUFFERS = 2048;
   public static final int DEVICE_HAS_CRAPPY_AAUDIO = 4096;
   private long mNativePtr;

   private Factory(long nativePtr) {
      this.mNativePtr = nativePtr;
   }

   private native void enableFilterFromName(long var1, String var3, boolean var4);

   public void enableFilterFromName(String name, boolean enabled) {
      this.enableFilterFromName(this.mNativePtr, name, enabled);
   }

   private native boolean filterFromNameEnabled(long var1, String var3);

   public boolean filterFromNameEnabled(String name) {
      return this.filterFromNameEnabled(this.mNativePtr, name);
   }

   private native void setDeviceInfo(long var1, String var3, String var4, String var5, int var6, int var7, int var8);

   public void setDeviceInfo(String manufacturer, String model, String platform, int flags, int delay, int recommended_rate) {
      this.setDeviceInfo(this.mNativePtr, manufacturer, model, platform, flags, delay, recommended_rate);
   }

   private native int getDeviceFlags(long var1);

   public int getDeviceFlags() {
      return this.getDeviceFlags(this.mNativePtr);
   }

   private native String getEncoderText(long var1, String var3);

   public String getEncoderText(String mime) {
      return this.getEncoderText(this.mNativePtr, mime);
   }

   private native String getDecoderText(long var1, String var3);

   public String getDecoderText(String mime) {
      return this.getDecoderText(this.mNativePtr, mime);
   }
}
