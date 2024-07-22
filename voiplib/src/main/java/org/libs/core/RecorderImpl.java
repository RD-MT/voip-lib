package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class RecorderImpl implements Recorder {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected RecorderImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native float getCaptureVolume(long var1);

   public synchronized float getCaptureVolume() {
      return this.getCaptureVolume(this.nativePtr);
   }

   private native int getDuration(long var1);

   public synchronized int getDuration() {
      return this.getDuration(this.nativePtr);
   }

   private native String getFile(long var1);

   @Nullable
   public synchronized String getFile() {
      return this.getFile(this.nativePtr);
   }

   private native RecorderParams getParams(long var1);

   @NonNull
   public synchronized RecorderParams getParams() {
      return this.getParams(this.nativePtr);
   }

   private native void setParams(long var1, RecorderParams var3);

   public synchronized void setParams(@NonNull RecorderParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParams() on it, clone it first.");
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

      this.setParams(this.nativePtr, params);
   }

   private native int getState(long var1);

   public synchronized RecorderState getState() {
      return RecorderState.fromInt(this.getState(this.nativePtr));
   }

   private native void close(long var1);

   public synchronized void close() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call close() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      this.close(this.nativePtr);
   }

   private native Content createContent(long var1);

   @Nullable
   public synchronized Content createContent() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createContent() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.createContent(this.nativePtr);
   }

   private native int open(long var1, String var3);

   public synchronized int open(@NonNull String file) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call open() on it, clone it first.");
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

      return this.open(this.nativePtr, file);
   }

   private native int pause(long var1);

   public synchronized int pause() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call pause() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.pause(this.nativePtr);
   }

   private native int start(long var1);

   public synchronized int start() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call start() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.start(this.nativePtr);
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
