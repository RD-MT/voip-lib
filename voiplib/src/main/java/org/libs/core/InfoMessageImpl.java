package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class InfoMessageImpl implements InfoMessage {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected InfoMessageImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Content getContent(long var1);

   @Nullable
   public synchronized Content getContent() {
      return this.getContent(this.nativePtr);
   }

   private native void setContent(long var1, Content var3);

   public synchronized void setContent(@Nullable Content content) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContent() on it, clone it first.");
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

      this.setContent(this.nativePtr, content);
   }

   private native void addHeader(long var1, String var3, String var4);

   public synchronized void addHeader(@NonNull String name, @Nullable String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addHeader() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      this.addHeader(this.nativePtr, name, value);
   }

   private native String getHeader(long var1, String var3);

   @Nullable
   public synchronized String getHeader(@NonNull String name) {
      return this.getHeader(this.nativePtr, name);
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
