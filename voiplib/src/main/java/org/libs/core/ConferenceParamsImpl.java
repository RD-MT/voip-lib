package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ConferenceParamsImpl implements ConferenceParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ConferenceParamsImpl(long ptr, boolean isConst) {
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

   private native boolean isAudioEnabled(long var1);

   public synchronized boolean isAudioEnabled() {
      return this.isAudioEnabled(this.nativePtr);
   }

   private native void setAudioEnabled(long var1, boolean var3);

   public synchronized void setAudioEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioEnabled() on it, clone it first.");
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

      this.setAudioEnabled(this.nativePtr, enable);
   }

   private native boolean isChatEnabled(long var1);

   public synchronized boolean isChatEnabled() {
      return this.isChatEnabled(this.nativePtr);
   }

   private native void setChatEnabled(long var1, boolean var3);

   public synchronized void setChatEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setChatEnabled() on it, clone it first.");
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

      this.setChatEnabled(this.nativePtr, enable);
   }

   private native Address getConferenceFactoryAddress(long var1);

   @Nullable
   public synchronized Address getConferenceFactoryAddress() {
      return this.getConferenceFactoryAddress(this.nativePtr);
   }

   private native void setConferenceFactoryAddress(long var1, Address var3);

   public synchronized void setConferenceFactoryAddress(@Nullable Address address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceFactoryAddress() on it, clone it first.");
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

      this.setConferenceFactoryAddress(this.nativePtr, address);
   }

   private native String getDescription(long var1);

   @Nullable
   public synchronized String getDescription() {
      return this.getDescription(this.nativePtr);
   }

   private native void setDescription(long var1, String var3);

   public synchronized void setDescription(@Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDescription() on it, clone it first.");
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

      this.setDescription(this.nativePtr, description);
   }

   private native long getEndTime(long var1);

   public synchronized long getEndTime() {
      return this.getEndTime(this.nativePtr);
   }

   private native void setEndTime(long var1, long var3);

   public synchronized void setEndTime(long end) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEndTime() on it, clone it first.");
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

      this.setEndTime(this.nativePtr, end);
   }

   private native boolean isLocalParticipantEnabled(long var1);

   public synchronized boolean isLocalParticipantEnabled() {
      return this.isLocalParticipantEnabled(this.nativePtr);
   }

   private native void setLocalParticipantEnabled(long var1, boolean var3);

   public synchronized void setLocalParticipantEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLocalParticipantEnabled() on it, clone it first.");
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

      this.setLocalParticipantEnabled(this.nativePtr, enable);
   }

   private native boolean isOneParticipantConferenceEnabled(long var1);

   public synchronized boolean isOneParticipantConferenceEnabled() {
      return this.isOneParticipantConferenceEnabled(this.nativePtr);
   }

   private native void setOneParticipantConferenceEnabled(long var1, boolean var3);

   public synchronized void setOneParticipantConferenceEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOneParticipantConferenceEnabled() on it, clone it first.");
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

      this.setOneParticipantConferenceEnabled(this.nativePtr, enable);
   }

   private native int getParticipantListType(long var1);

   public synchronized ConferenceParticipantListType getParticipantListType() {
      return ConferenceParticipantListType.fromInt(this.getParticipantListType(this.nativePtr));
   }

   private native void setParticipantListType(long var1, int var3);

   public synchronized void setParticipantListType(ConferenceParticipantListType type) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParticipantListType() on it, clone it first.");
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

      this.setParticipantListType(this.nativePtr, type.toInt());
   }

   private native ProxyConfig getProxyCfg(long var1);

   @Nullable
   public synchronized ProxyConfig getProxyCfg() {
      return this.getProxyCfg(this.nativePtr);
   }

   private native long getStartTime(long var1);

   public synchronized long getStartTime() {
      return this.getStartTime(this.nativePtr);
   }

   private native void setStartTime(long var1, long var3);

   public synchronized void setStartTime(long start) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStartTime() on it, clone it first.");
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

      this.setStartTime(this.nativePtr, start);
   }

   private native String getSubject(long var1);

   @Nullable
   public synchronized String getSubject() {
      return this.getSubject(this.nativePtr);
   }

   private native void setSubject(long var1, String var3);

   public synchronized void setSubject(@Nullable String subject) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSubject() on it, clone it first.");
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

      this.setSubject(this.nativePtr, subject);
   }

   private native boolean isVideoEnabled(long var1);

   public synchronized boolean isVideoEnabled() {
      return this.isVideoEnabled(this.nativePtr);
   }

   private native void setVideoEnabled(long var1, boolean var3);

   public synchronized void setVideoEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoEnabled() on it, clone it first.");
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

      this.setVideoEnabled(this.nativePtr, enable);
   }

   private native ConferenceParams clone(long var1);

   @NonNull
   public synchronized ConferenceParams clone() {
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
