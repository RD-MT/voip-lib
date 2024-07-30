package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class VideoSourceDescriptorImpl implements VideoSourceDescriptor {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected VideoSourceDescriptorImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Call getCall(long var1);

   @Nullable
   public synchronized Call getCall() {
      return this.getCall(this.nativePtr);
   }

   private native void setCall(long var1, Call var3);

   public synchronized void setCall(@Nullable Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCall() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setCall(this.nativePtr, call);
   }

   private native String getCameraId(long var1);

   @Nullable
   public synchronized String getCameraId() {
      return this.getCameraId(this.nativePtr);
   }

   private native void setCameraId(long var1, String var3);

   public synchronized void setCameraId(@Nullable String cameraId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCameraId() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setCameraId(this.nativePtr, cameraId);
   }

   private native String getImage(long var1);

   @Nullable
   public synchronized String getImage() {
      return this.getImage(this.nativePtr);
   }

   private native void setImage(long var1, String var3);

   public synchronized void setImage(@Nullable String imagePath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setImage() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setImage(this.nativePtr, imagePath);
   }

   private native int getType(long var1);

   public synchronized VideoSourceType getType() {
      return VideoSourceType.fromInt(this.getType(this.nativePtr));
   }

   private native VideoSourceDescriptor clone(long var1);

   @NonNull
   public synchronized VideoSourceDescriptor clone() {
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
