package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class HeadersImpl implements Headers {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected HeadersImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native void add(long var1, String var3, String var4);

   public synchronized void add(@NonNull String name, @Nullable String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call add() on it, clone it first.");
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

      this.add(this.nativePtr, name, value);
   }

   private native String getValue(long var1, String var3);

   @Nullable
   public synchronized String getValue(String headerName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getValue() on it, clone it first.");
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

      return this.getValue(this.nativePtr, headerName);
   }

   private native void remove(long var1, String var3);

   public synchronized void remove(@NonNull String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call remove() on it, clone it first.");
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

      this.remove(this.nativePtr, name);
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
