package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class PresenceActivityImpl implements PresenceActivity {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PresenceActivityImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getDescription(long var1);

   @Nullable
   public synchronized String getDescription() {
      return this.getDescription(this.nativePtr);
   }

   private native int setDescription(long var1, String var3);

   public synchronized int setDescription(@Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDescription() on it, clone it first.");
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

      return this.setDescription(this.nativePtr, description);
   }

   private native int getType(long var1);

   public synchronized PresenceActivity.Type getType() {
      return PresenceActivity.Type.fromInt(this.getType(this.nativePtr));
   }

   private native int setType(long var1, int var3);

   public synchronized int setType(PresenceActivity.Type acttype) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setType() on it, clone it first.");
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

      return this.setType(this.nativePtr, acttype.toInt());
   }

   private native String toString(long var1);

   @NonNull
   public synchronized String toString() {
      return this.toString(this.nativePtr);
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
}
