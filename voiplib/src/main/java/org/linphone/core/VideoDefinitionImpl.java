package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class VideoDefinitionImpl implements VideoDefinition {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected VideoDefinitionImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getHeight(long var1);

   public synchronized int getHeight() {
      return this.getHeight(this.nativePtr);
   }

   private native void setHeight(long var1, int var3);

   public synchronized void setHeight(int height) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHeight() on it, clone it first.");
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

      this.setHeight(this.nativePtr, height);
   }

   private native boolean isUndefined(long var1);

   public synchronized boolean isUndefined() {
      return this.isUndefined(this.nativePtr);
   }

   private native String getName(long var1);

   @Nullable
   public synchronized String getName() {
      return this.getName(this.nativePtr);
   }

   private native void setName(long var1, String var3);

   public synchronized void setName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setName() on it, clone it first.");
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

      this.setName(this.nativePtr, name);
   }

   private native int getWidth(long var1);

   public synchronized int getWidth() {
      return this.getWidth(this.nativePtr);
   }

   private native void setWidth(long var1, int var3);

   public synchronized void setWidth(int width) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setWidth() on it, clone it first.");
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

      this.setWidth(this.nativePtr, width);
   }

   private native VideoDefinition clone(long var1);

   @NonNull
   public synchronized VideoDefinition clone() {
      return this.clone(this.nativePtr);
   }

   private native boolean equals(long var1, VideoDefinition var3);

   public synchronized boolean equals(@NonNull VideoDefinition videoDefinition2) {
      return this.equals(this.nativePtr, videoDefinition2);
   }

   private native void setDefinition(long var1, int var3, int var4);

   public synchronized void setDefinition(int width, int height) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefinition() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.setDefinition(this.nativePtr, width, height);
   }

   private native boolean strictEquals(long var1, VideoDefinition var3);

   public synchronized boolean strictEquals(@NonNull VideoDefinition videoDefinition2) {
      return this.strictEquals(this.nativePtr, videoDefinition2);
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
