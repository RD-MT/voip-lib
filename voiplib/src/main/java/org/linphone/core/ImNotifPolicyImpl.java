package org.linphone.core;

import org.linphone.mediastream.Log;

class ImNotifPolicyImpl implements ImNotifPolicy {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ImNotifPolicyImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean getRecvImdnDelivered(long var1);

   public synchronized boolean getRecvImdnDelivered() {
      return this.getRecvImdnDelivered(this.nativePtr);
   }

   private native void setRecvImdnDelivered(long var1, boolean var3);

   public synchronized void setRecvImdnDelivered(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecvImdnDelivered() on it, clone it first.");
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

      this.setRecvImdnDelivered(this.nativePtr, enable);
   }

   private native boolean getRecvImdnDeliveryError(long var1);

   public synchronized boolean getRecvImdnDeliveryError() {
      return this.getRecvImdnDeliveryError(this.nativePtr);
   }

   private native void setRecvImdnDeliveryError(long var1, boolean var3);

   public synchronized void setRecvImdnDeliveryError(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecvImdnDeliveryError() on it, clone it first.");
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

      this.setRecvImdnDeliveryError(this.nativePtr, enable);
   }

   private native boolean getRecvImdnDisplayed(long var1);

   public synchronized boolean getRecvImdnDisplayed() {
      return this.getRecvImdnDisplayed(this.nativePtr);
   }

   private native void setRecvImdnDisplayed(long var1, boolean var3);

   public synchronized void setRecvImdnDisplayed(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecvImdnDisplayed() on it, clone it first.");
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

      this.setRecvImdnDisplayed(this.nativePtr, enable);
   }

   private native boolean getRecvIsComposing(long var1);

   public synchronized boolean getRecvIsComposing() {
      return this.getRecvIsComposing(this.nativePtr);
   }

   private native void setRecvIsComposing(long var1, boolean var3);

   public synchronized void setRecvIsComposing(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecvIsComposing() on it, clone it first.");
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

      this.setRecvIsComposing(this.nativePtr, enable);
   }

   private native boolean getSendImdnDelivered(long var1);

   public synchronized boolean getSendImdnDelivered() {
      return this.getSendImdnDelivered(this.nativePtr);
   }

   private native void setSendImdnDelivered(long var1, boolean var3);

   public synchronized void setSendImdnDelivered(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSendImdnDelivered() on it, clone it first.");
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

      this.setSendImdnDelivered(this.nativePtr, enable);
   }

   private native boolean getSendImdnDeliveryError(long var1);

   public synchronized boolean getSendImdnDeliveryError() {
      return this.getSendImdnDeliveryError(this.nativePtr);
   }

   private native void setSendImdnDeliveryError(long var1, boolean var3);

   public synchronized void setSendImdnDeliveryError(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSendImdnDeliveryError() on it, clone it first.");
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

      this.setSendImdnDeliveryError(this.nativePtr, enable);
   }

   private native boolean getSendImdnDisplayed(long var1);

   public synchronized boolean getSendImdnDisplayed() {
      return this.getSendImdnDisplayed(this.nativePtr);
   }

   private native void setSendImdnDisplayed(long var1, boolean var3);

   public synchronized void setSendImdnDisplayed(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSendImdnDisplayed() on it, clone it first.");
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

      this.setSendImdnDisplayed(this.nativePtr, enable);
   }

   private native boolean getSendIsComposing(long var1);

   public synchronized boolean getSendIsComposing() {
      return this.getSendIsComposing(this.nativePtr);
   }

   private native void setSendIsComposing(long var1, boolean var3);

   public synchronized void setSendIsComposing(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSendIsComposing() on it, clone it first.");
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

      this.setSendIsComposing(this.nativePtr, enable);
   }

   private native void clear(long var1);

   public synchronized void clear() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clear() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.clear(this.nativePtr);
   }

   private native void enableAll(long var1);

   public synchronized void enableAll() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enableAll() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.enableAll(this.nativePtr);
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
