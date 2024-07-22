package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class CallLogImpl implements CallLog {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected CallLogImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getCallId(long var1);

   @Nullable
   public synchronized String getCallId() {
      return this.getCallId(this.nativePtr);
   }

   private native ConferenceInfo getConferenceInfo(long var1);

   @Nullable
   public synchronized ConferenceInfo getConferenceInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConferenceInfo() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.getConferenceInfo(this.nativePtr);
   }

   private native int getDir(long var1);

   public synchronized Call.Dir getDir() {
      return Call.Dir.fromInt(this.getDir(this.nativePtr));
   }

   private native int getDuration(long var1);

   public synchronized int getDuration() {
      return this.getDuration(this.nativePtr);
   }

   private native ErrorInfo getErrorInfo(long var1);

   @Nullable
   public synchronized ErrorInfo getErrorInfo() {
      return this.getErrorInfo(this.nativePtr);
   }

   private native Address getFromAddress(long var1);

   @NonNull
   public synchronized Address getFromAddress() {
      return this.getFromAddress(this.nativePtr);
   }

   private native Address getLocalAddress(long var1);

   @NonNull
   public synchronized Address getLocalAddress() {
      return this.getLocalAddress(this.nativePtr);
   }

   private native float getQuality(long var1);

   public synchronized float getQuality() {
      return this.getQuality(this.nativePtr);
   }

   private native String getRefKey(long var1);

   @Nullable
   public synchronized String getRefKey() {
      return this.getRefKey(this.nativePtr);
   }

   private native void setRefKey(long var1, String var3);

   public synchronized void setRefKey(@Nullable String refkey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRefKey() on it, clone it first.");
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

      this.setRefKey(this.nativePtr, refkey);
   }

   private native Address getRemoteAddress(long var1);

   @NonNull
   public synchronized Address getRemoteAddress() {
      return this.getRemoteAddress(this.nativePtr);
   }

   private native void setRemoteAddress(long var1, Address var3);

   public synchronized void setRemoteAddress(@NonNull Address address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRemoteAddress() on it, clone it first.");
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

      this.setRemoteAddress(this.nativePtr, address);
   }

   private native long getStartDate(long var1);

   public synchronized long getStartDate() {
      return this.getStartDate(this.nativePtr);
   }

   private native int getStatus(long var1);

   public synchronized Call.Status getStatus() {
      return Call.Status.fromInt(this.getStatus(this.nativePtr));
   }

   private native Address getToAddress(long var1);

   @NonNull
   public synchronized Address getToAddress() {
      return this.getToAddress(this.nativePtr);
   }

   private native boolean isVideoEnabled(long var1);

   public synchronized boolean isVideoEnabled() {
      return this.isVideoEnabled(this.nativePtr);
   }

   private native String toStr(long var1);

   @NonNull
   public synchronized String toStr() {
      return this.toStr(this.nativePtr);
   }

   private native boolean wasConference(long var1);

   public synchronized boolean wasConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call wasConference() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.wasConference(this.nativePtr);
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
