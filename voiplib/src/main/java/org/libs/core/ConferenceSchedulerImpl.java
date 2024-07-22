package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ConferenceSchedulerImpl implements ConferenceScheduler {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ConferenceSchedulerImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Account getAccount(long var1);

   @Nullable
   public synchronized Account getAccount() {
      return this.getAccount(this.nativePtr);
   }

   private native void setAccount(long var1, Account var3);

   public synchronized void setAccount(@Nullable Account account) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAccount() on it, clone it first.");
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

      this.setAccount(this.nativePtr, account);
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native ConferenceInfo getInfo(long var1);

   @Nullable
   public synchronized ConferenceInfo getInfo() {
      return this.getInfo(this.nativePtr);
   }

   private native void setInfo(long var1, ConferenceInfo var3);

   public synchronized void setInfo(@Nullable ConferenceInfo conferenceInfo) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInfo() on it, clone it first.");
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

      this.setInfo(this.nativePtr, conferenceInfo);
   }

   private native void cancelConference(long var1, ConferenceInfo var3);

   public synchronized void cancelConference(@Nullable ConferenceInfo conferenceInfo) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call cancelConference() on it, clone it first.");
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

      this.cancelConference(this.nativePtr, conferenceInfo);
   }

   private native void sendInvitations(long var1, ChatRoomParams var3);

   public synchronized void sendInvitations(@NonNull ChatRoomParams chatRoomParams) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call sendInvitations() on it, clone it first.");
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

      this.sendInvitations(this.nativePtr, chatRoomParams);
   }

   private native void addListener(long var1, ConferenceSchedulerListener var3);

   public synchronized void addListener(ConferenceSchedulerListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, ConferenceSchedulerListener var3);

   public synchronized void removeListener(ConferenceSchedulerListener listener) {
      this.removeListener(this.nativePtr, listener);
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
