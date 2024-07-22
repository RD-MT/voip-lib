package org.libs.core;

import org.libs.mediastream.Log;

class DigestAuthenticationPolicyImpl implements DigestAuthenticationPolicy {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected DigestAuthenticationPolicyImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean getAllowMd55(long var1);

   public synchronized boolean getAllowMd5() {
      return this.getAllowMd55(this.nativePtr);
   }

   private native void setAllowMd55(long var1, boolean var3);

   public synchronized void setAllowMd5(boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAllowMd5() on it, clone it first.");
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

      this.setAllowMd55(this.nativePtr, value);
   }

   private native boolean getAllowNoQop(long var1);

   public synchronized boolean getAllowNoQop() {
      return this.getAllowNoQop(this.nativePtr);
   }

   private native void setAllowNoQop(long var1, boolean var3);

   public synchronized void setAllowNoQop(boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAllowNoQop() on it, clone it first.");
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

      this.setAllowNoQop(this.nativePtr, value);
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
