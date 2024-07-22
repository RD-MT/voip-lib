package org.libs.core;

import org.libs.mediastream.Log;

class RangeImpl implements Range {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected RangeImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getMax(long var1);

   public synchronized int getMax() {
      return this.getMax(this.nativePtr);
   }

   private native void setMax(long var1, int var3);

   public synchronized void setMax(int max) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMax() on it, clone it first.");
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

      this.setMax(this.nativePtr, max);
   }

   private native int getMin(long var1);

   public synchronized int getMin() {
      return this.getMin(this.nativePtr);
   }

   private native void setMin(long var1, int var3);

   public synchronized void setMin(int min) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMin() on it, clone it first.");
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

      this.setMin(this.nativePtr, min);
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
