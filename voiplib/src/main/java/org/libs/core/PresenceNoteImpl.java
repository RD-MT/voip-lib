package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class PresenceNoteImpl implements PresenceNote {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PresenceNoteImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getContent(long var1);

   @NonNull
   public synchronized String getContent() {
      return this.getContent(this.nativePtr);
   }

   private native int setContent(long var1, String var3);

   public synchronized int setContent(@NonNull String content) {
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

      return this.setContent(this.nativePtr, content);
   }

   private native String getLang(long var1);

   @Nullable
   public synchronized String getLang() {
      return this.getLang(this.nativePtr);
   }

   private native int setLang(long var1, String var3);

   public synchronized int setLang(@Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLang() on it, clone it first.");
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

      return this.setLang(this.nativePtr, lang);
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
