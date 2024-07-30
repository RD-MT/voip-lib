package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class FriendPhoneNumberImpl implements FriendPhoneNumber {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected FriendPhoneNumberImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getLabel(long var1);

   @Nullable
   public synchronized String getLabel() {
      return this.getLabel(this.nativePtr);
   }

   private native void setLabel(long var1, String var3);

   public synchronized void setLabel(@Nullable String label) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLabel() on it, clone it first.");
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

      this.setLabel(this.nativePtr, label);
   }

   private native String getPhoneNumber(long var1);

   @NonNull
   public synchronized String getPhoneNumber() {
      return this.getPhoneNumber(this.nativePtr);
   }

   private native void setPhoneNumber(long var1, String var3);

   public synchronized void setPhoneNumber(@NonNull String number) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPhoneNumber() on it, clone it first.");
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

      this.setPhoneNumber(this.nativePtr, number);
   }

   private native FriendPhoneNumber clone(long var1);

   @NonNull
   public synchronized FriendPhoneNumber clone() {
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
