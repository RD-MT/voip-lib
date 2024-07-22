package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class RecorderParamsImpl implements RecorderParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected RecorderParamsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native AudioDevice getAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getAudioDevice() {
      return this.getAudioDevice(this.nativePtr);
   }

   private native void setAudioDevice(long var1, AudioDevice var3);

   public synchronized void setAudioDevice(@Nullable AudioDevice device) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioDevice() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setAudioDevice(this.nativePtr, device);
   }

   private native int getFileFormat(long var1);

   public synchronized RecorderFileFormat getFileFormat() {
      return RecorderFileFormat.fromInt(this.getFileFormat(this.nativePtr));
   }

   private native void setFileFormat(long var1, int var3);

   public synchronized void setFileFormat(RecorderFileFormat format) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFileFormat() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setFileFormat(this.nativePtr, format.toInt());
   }

   private native String getVideoCodec(long var1);

   @Nullable
   public synchronized String getVideoCodec() {
      return this.getVideoCodec(this.nativePtr);
   }

   private native void setVideoCodec(long var1, String var3);

   public synchronized void setVideoCodec(@Nullable String videoCodec) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoCodec() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setVideoCodec(this.nativePtr, videoCodec);
   }

   private native String getWebcamName(long var1);

   @Nullable
   public synchronized String getWebcamName() {
      return this.getWebcamName(this.nativePtr);
   }

   private native void setWebcamName(long var1, String var3);

   public synchronized void setWebcamName(@Nullable String webcamName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setWebcamName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setWebcamName(this.nativePtr, webcamName);
   }

   private native Object getWindowId(long var1);

   @Nullable
   public synchronized Object getWindowId() {
      return this.getWindowId(this.nativePtr);
   }

   private native void setWindowId(long var1, Object var3);

   public synchronized void setWindowId(@Nullable Object windowId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setWindowId() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setWindowId(this.nativePtr, windowId);
   }

   private native RecorderParams clone(long var1);

   @NonNull
   public synchronized RecorderParams clone() {
      return this.clone(this.nativePtr);
   }

   private native boolean unref(long var1, boolean var3);

   protected void finalize() throws Throwable {
      if (this.nativePtr != 0L) {
         boolean destroyed = this.unref(this.nativePtr, this._isConst);
         if (destroyed) {
            this.nativePtr = 0L;
         }
      }

      super.finalize();
   }

   public void setUserData(Object data) {
      this.userData = data;
   }

   public Object getUserData() {
      return this.userData;
   }

   public String toString() {
      return "Java object [" + super.toString() + "], native pointer [" + String.format("0x%08x", this.nativePtr) + "]";
   }
}
