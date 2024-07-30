package org.linphone.core;

import org.linphone.mediastream.Log;

class VideoActivationPolicyImpl implements VideoActivationPolicy {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected VideoActivationPolicyImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean getAutomaticallyAccept(long var1);

   public synchronized boolean getAutomaticallyAccept() {
      return this.getAutomaticallyAccept(this.nativePtr);
   }

   private native void setAutomaticallyAccept(long var1, boolean var3);

   public synchronized void setAutomaticallyAccept(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutomaticallyAccept() on it, clone it first.");
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

      this.setAutomaticallyAccept(this.nativePtr, enable);
   }

   private native boolean getAutomaticallyInitiate(long var1);

   public synchronized boolean getAutomaticallyInitiate() {
      return this.getAutomaticallyInitiate(this.nativePtr);
   }

   private native void setAutomaticallyInitiate(long var1, boolean var3);

   public synchronized void setAutomaticallyInitiate(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutomaticallyInitiate() on it, clone it first.");
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

      this.setAutomaticallyInitiate(this.nativePtr, enable);
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
