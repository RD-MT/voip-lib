package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class PayloadTypeImpl implements PayloadType {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PayloadTypeImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getChannels(long var1);

   public synchronized int getChannels() {
      return this.getChannels(this.nativePtr);
   }

   private native int getClockRate(long var1);

   public synchronized int getClockRate() {
      return this.getClockRate(this.nativePtr);
   }

   private native String getDescription(long var1);

   @NonNull
   public synchronized String getDescription() {
      return this.getDescription(this.nativePtr);
   }

   private native String getEncoderDescription(long var1);

   @Nullable
   public synchronized String getEncoderDescription() {
      return this.getEncoderDescription(this.nativePtr);
   }

   private native boolean isUsable(long var1);

   public synchronized boolean isUsable() {
      return this.isUsable(this.nativePtr);
   }

   private native boolean isVbr(long var1);

   public synchronized boolean isVbr() {
      return this.isVbr(this.nativePtr);
   }

   private native String getMimeType(long var1);

   @NonNull
   public synchronized String getMimeType() {
      return this.getMimeType(this.nativePtr);
   }

   private native int getNormalBitrate(long var1);

   public synchronized int getNormalBitrate() {
      return this.getNormalBitrate(this.nativePtr);
   }

   private native void setNormalBitrate(long var1, int var3);

   public synchronized void setNormalBitrate(int bitrate) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNormalBitrate() on it, clone it first.");
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

      this.setNormalBitrate(this.nativePtr, bitrate);
   }

   private native int getNumber(long var1);

   public synchronized int getNumber() {
      return this.getNumber(this.nativePtr);
   }

   private native void setNumber(long var1, int var3);

   public synchronized void setNumber(int number) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNumber() on it, clone it first.");
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

      this.setNumber(this.nativePtr, number);
   }

   private native String getRecvFmtp(long var1);

   @Nullable
   public synchronized String getRecvFmtp() {
      return this.getRecvFmtp(this.nativePtr);
   }

   private native void setRecvFmtp(long var1, String var3);

   public synchronized void setRecvFmtp(@Nullable String recvFmtp) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecvFmtp() on it, clone it first.");
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

      this.setRecvFmtp(this.nativePtr, recvFmtp);
   }

   private native String getSendFmtp(long var1);

   @Nullable
   public synchronized String getSendFmtp() {
      return this.getSendFmtp(this.nativePtr);
   }

   private native void setSendFmtp(long var1, String var3);

   public synchronized void setSendFmtp(@Nullable String sendFmtp) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSendFmtp() on it, clone it first.");
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

      this.setSendFmtp(this.nativePtr, sendFmtp);
   }

   private native int getType(long var1);

   public synchronized int getType() {
      return this.getType(this.nativePtr);
   }

   private native PayloadType clone(long var1);

   @NonNull
   public synchronized PayloadType clone() {
      return this.clone(this.nativePtr);
   }

   private native int enable(long var1, boolean var3);

   public synchronized int enable(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enable() on it, clone it first.");
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

      return this.enable(this.nativePtr, enabled);
   }

   private native boolean enabled(long var1);

   public synchronized boolean enabled() {
      return this.enabled(this.nativePtr);
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
