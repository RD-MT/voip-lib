package org.linphone.core;

import androidx.annotation.NonNull;
import org.linphone.mediastream.Log;

class BufferImpl implements Buffer {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected BufferImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native byte[] getContent(long var1);

   @NonNull
   public synchronized byte[] getContent() {
      return this.getContent(this.nativePtr);
   }

   private native boolean isEmpty(long var1);

   public synchronized boolean isEmpty() {
      return this.isEmpty(this.nativePtr);
   }

   private native int getSize(long var1);

   public synchronized int getSize() {
      return this.getSize(this.nativePtr);
   }

   private native void setSize(long var1, int var3);

   public synchronized void setSize(int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSize() on it, clone it first.");
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

      this.setSize(this.nativePtr, size);
   }

   private native String getStringContent(long var1);

   @NonNull
   public synchronized String getStringContent() {
      return this.getStringContent(this.nativePtr);
   }

   private native void setStringContent(long var1, String var3);

   public synchronized void setStringContent(@NonNull String content) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStringContent() on it, clone it first.");
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

      this.setStringContent(this.nativePtr, content);
   }

   private native void setContent(long var1, byte[] var3, int var4);

   public synchronized void setContent(@NonNull byte[] content, int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContent() on it, clone it first.");
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

      this.setContent(this.nativePtr, content, size);
   }

   private native Buffer newFromData(long var1, byte[] var3, int var4);

   @NonNull
   public synchronized Buffer newFromData(@NonNull byte[] data, int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newFromData() on it, clone it first.");
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

      return this.newFromData(this.nativePtr, data, size);
   }

   private native Buffer newFromString(long var1, String var3);

   @NonNull
   public synchronized Buffer newFromString(@NonNull String data) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newFromString() on it, clone it first.");
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

      return this.newFromString(this.nativePtr, data);
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
