package org.linphone.core;

import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ErrorInfoImpl implements ErrorInfo {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ErrorInfoImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getPhrase(long var1);

   @Nullable
   public synchronized String getPhrase() {
      return this.getPhrase(this.nativePtr);
   }

   private native void setPhrase(long var1, String var3);

   public synchronized void setPhrase(@Nullable String phrase) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPhrase() on it, clone it first.");
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

      this.setPhrase(this.nativePtr, phrase);
   }

   private native String getProtocol(long var1);

   @Nullable
   public synchronized String getProtocol() {
      return this.getProtocol(this.nativePtr);
   }

   private native void setProtocol(long var1, String var3);

   public synchronized void setProtocol(@Nullable String protocol) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProtocol() on it, clone it first.");
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

      this.setProtocol(this.nativePtr, protocol);
   }

   private native int getProtocolCode(long var1);

   public synchronized int getProtocolCode() {
      return this.getProtocolCode(this.nativePtr);
   }

   private native void setProtocolCode(long var1, int var3);

   public synchronized void setProtocolCode(int code) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProtocolCode() on it, clone it first.");
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

      this.setProtocolCode(this.nativePtr, code);
   }

   private native int getReason(long var1);

   public synchronized Reason getReason() {
      return Reason.fromInt(this.getReason(this.nativePtr));
   }

   private native void setReason(long var1, int var3);

   public synchronized void setReason(Reason reason) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setReason() on it, clone it first.");
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

      this.setReason(this.nativePtr, reason.toInt());
   }

   private native int getRetryAfter(long var1);

   public synchronized int getRetryAfter() {
      return this.getRetryAfter(this.nativePtr);
   }

   private native void setRetryAfter(long var1, int var3);

   public synchronized void setRetryAfter(int retryAfter) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRetryAfter() on it, clone it first.");
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

      this.setRetryAfter(this.nativePtr, retryAfter);
   }

   private native ErrorInfo getSubErrorInfo(long var1);

   @Nullable
   public synchronized ErrorInfo getSubErrorInfo() {
      return this.getSubErrorInfo(this.nativePtr);
   }

   private native void setSubErrorInfo(long var1, ErrorInfo var3);

   public synchronized void setSubErrorInfo(@Nullable ErrorInfo appendedErrorInfo) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSubErrorInfo() on it, clone it first.");
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

      this.setSubErrorInfo(this.nativePtr, appendedErrorInfo);
   }

   private native String getWarnings(long var1);

   @Nullable
   public synchronized String getWarnings() {
      return this.getWarnings(this.nativePtr);
   }

   private native void setWarnings(long var1, String var3);

   public synchronized void setWarnings(@Nullable String warnings) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setWarnings() on it, clone it first.");
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

      this.setWarnings(this.nativePtr, warnings);
   }

   private native void set(long var1, String var3, int var4, int var5, String var6, String var7);

   public synchronized void set(@Nullable String protocol, Reason reason, int code, @Nullable String status, @Nullable String warning) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call set() on it, clone it first.");
         } catch (CoreException var11) {
            Log.i(var11);
            StackTraceElement[] var7 = var11.getStackTrace();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               StackTraceElement st = var7[var9];
               Log.i(st);
            }
         }
      }

      this.set(this.nativePtr, protocol, reason.toInt(), code, status, warning);
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
