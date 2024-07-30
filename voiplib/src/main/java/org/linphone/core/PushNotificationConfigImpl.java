package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class PushNotificationConfigImpl implements PushNotificationConfig {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PushNotificationConfigImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getBundleIdentifier(long var1);

   @Nullable
   public synchronized String getBundleIdentifier() {
      return this.getBundleIdentifier(this.nativePtr);
   }

   private native void setBundleIdentifier(long var1, String var3);

   public synchronized void setBundleIdentifier(@Nullable String bundleIdentifier) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBundleIdentifier() on it, clone it first.");
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

      this.setBundleIdentifier(this.nativePtr, bundleIdentifier);
   }

   private native String getCallSnd(long var1);

   @NonNull
   public synchronized String getCallSnd() {
      return this.getCallSnd(this.nativePtr);
   }

   private native void setCallSnd(long var1, String var3);

   public synchronized void setCallSnd(@NonNull String callSnd) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCallSnd() on it, clone it first.");
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

      this.setCallSnd(this.nativePtr, callSnd);
   }

   private native String getCallStr(long var1);

   @NonNull
   public synchronized String getCallStr() {
      return this.getCallStr(this.nativePtr);
   }

   private native void setCallStr(long var1, String var3);

   public synchronized void setCallStr(@NonNull String callStr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCallStr() on it, clone it first.");
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

      this.setCallStr(this.nativePtr, callStr);
   }

   private native String getGroupChatStr(long var1);

   @NonNull
   public synchronized String getGroupChatStr() {
      return this.getGroupChatStr(this.nativePtr);
   }

   private native void setGroupChatStr(long var1, String var3);

   public synchronized void setGroupChatStr(@NonNull String groupChatStr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setGroupChatStr() on it, clone it first.");
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

      this.setGroupChatStr(this.nativePtr, groupChatStr);
   }

   private native String getMsgSnd(long var1);

   @NonNull
   public synchronized String getMsgSnd() {
      return this.getMsgSnd(this.nativePtr);
   }

   private native void setMsgSnd(long var1, String var3);

   public synchronized void setMsgSnd(@NonNull String msgSnd) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMsgSnd() on it, clone it first.");
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

      this.setMsgSnd(this.nativePtr, msgSnd);
   }

   private native String getMsgStr(long var1);

   @NonNull
   public synchronized String getMsgStr() {
      return this.getMsgStr(this.nativePtr);
   }

   private native void setMsgStr(long var1, String var3);

   public synchronized void setMsgStr(@NonNull String msgStr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMsgStr() on it, clone it first.");
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

      this.setMsgStr(this.nativePtr, msgStr);
   }

   private native String getParam(long var1);

   @Nullable
   public synchronized String getParam() {
      return this.getParam(this.nativePtr);
   }

   private native void setParam(long var1, String var3);

   public synchronized void setParam(@Nullable String param) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParam() on it, clone it first.");
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

      this.setParam(this.nativePtr, param);
   }

   private native String getPrid(long var1);

   @Nullable
   public synchronized String getPrid() {
      return this.getPrid(this.nativePtr);
   }

   private native void setPrid(long var1, String var3);

   public synchronized void setPrid(@Nullable String prid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPrid() on it, clone it first.");
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

      this.setPrid(this.nativePtr, prid);
   }

   private native String getProvider(long var1);

   @Nullable
   public synchronized String getProvider() {
      return this.getProvider(this.nativePtr);
   }

   private native void setProvider(long var1, String var3);

   public synchronized void setProvider(@Nullable String provider) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProvider() on it, clone it first.");
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

      this.setProvider(this.nativePtr, provider);
   }

   private native String getRemoteToken(long var1);

   @Nullable
   public synchronized String getRemoteToken() {
      return this.getRemoteToken(this.nativePtr);
   }

   private native void setRemoteToken(long var1, String var3);

   public synchronized void setRemoteToken(@Nullable String remoteToken) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRemoteToken() on it, clone it first.");
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

      this.setRemoteToken(this.nativePtr, remoteToken);
   }

   private native String getTeamId(long var1);

   @Nullable
   public synchronized String getTeamId() {
      return this.getTeamId(this.nativePtr);
   }

   private native void setTeamId(long var1, String var3);

   public synchronized void setTeamId(@Nullable String teamId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTeamId() on it, clone it first.");
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

      this.setTeamId(this.nativePtr, teamId);
   }

   private native String getVoipToken(long var1);

   @Nullable
   public synchronized String getVoipToken() {
      return this.getVoipToken(this.nativePtr);
   }

   private native void setVoipToken(long var1, String var3);

   public synchronized void setVoipToken(@Nullable String voipToken) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVoipToken() on it, clone it first.");
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

      this.setVoipToken(this.nativePtr, voipToken);
   }

   private native PushNotificationConfig clone(long var1);

   @NonNull
   public synchronized PushNotificationConfig clone() {
      return this.clone(this.nativePtr);
   }

   private native boolean isEqual(long var1, PushNotificationConfig var3);

   @NonNull
   public synchronized boolean isEqual(@NonNull PushNotificationConfig otherConfig) {
      return this.isEqual(this.nativePtr, otherConfig);
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
