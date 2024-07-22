package org.libs.core;

import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ChatRoomParamsImpl implements ChatRoomParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ChatRoomParamsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getBackend(long var1);

   public synchronized ChatRoomBackend getBackend() {
      return ChatRoomBackend.fromInt(this.getBackend(this.nativePtr));
   }

   private native void setBackend(long var1, int var3);

   public synchronized void setBackend(ChatRoomBackend backend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBackend() on it, clone it first.");
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

      this.setBackend(this.nativePtr, backend.toInt());
   }

   private native int getEncryptionBackend(long var1);

   public synchronized ChatRoomEncryptionBackend getEncryptionBackend() {
      return ChatRoomEncryptionBackend.fromInt(this.getEncryptionBackend(this.nativePtr));
   }

   private native void setEncryptionBackend(long var1, int var3);

   public synchronized void setEncryptionBackend(ChatRoomEncryptionBackend backend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEncryptionBackend() on it, clone it first.");
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

      this.setEncryptionBackend(this.nativePtr, backend.toInt());
   }

   private native boolean isEncryptionEnabled(long var1);

   public synchronized boolean isEncryptionEnabled() {
      return this.isEncryptionEnabled(this.nativePtr);
   }

   private native void setEncryptionEnabled(long var1, boolean var3);

   public synchronized void setEncryptionEnabled(boolean encrypted) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEncryptionEnabled() on it, clone it first.");
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

      this.setEncryptionEnabled(this.nativePtr, encrypted);
   }

   private native long getEphemeralLifetime(long var1);

   public synchronized long getEphemeralLifetime() {
      return this.getEphemeralLifetime(this.nativePtr);
   }

   private native void setEphemeralLifetime(long var1, long var3);

   public synchronized void setEphemeralLifetime(long time) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEphemeralLifetime() on it, clone it first.");
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

      this.setEphemeralLifetime(this.nativePtr, time);
   }

   private native int getEphemeralMode(long var1);

   public synchronized ChatRoomEphemeralMode getEphemeralMode() {
      return ChatRoomEphemeralMode.fromInt(this.getEphemeralMode(this.nativePtr));
   }

   private native void setEphemeralMode(long var1, int var3);

   public synchronized void setEphemeralMode(ChatRoomEphemeralMode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEphemeralMode() on it, clone it first.");
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

      this.setEphemeralMode(this.nativePtr, mode.toInt());
   }

   private native boolean isGroupEnabled(long var1);

   public synchronized boolean isGroupEnabled() {
      return this.isGroupEnabled(this.nativePtr);
   }

   private native void setGroupEnabled(long var1, boolean var3);

   public synchronized void setGroupEnabled(boolean group) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setGroupEnabled() on it, clone it first.");
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

      this.setGroupEnabled(this.nativePtr, group);
   }

   private native boolean isValid(long var1);

   public synchronized boolean isValid() {
      return this.isValid(this.nativePtr);
   }

   private native boolean isRttEnabled(long var1);

   public synchronized boolean isRttEnabled() {
      return this.isRttEnabled(this.nativePtr);
   }

   private native void setRttEnabled(long var1, boolean var3);

   public synchronized void setRttEnabled(boolean rtt) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRttEnabled() on it, clone it first.");
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

      this.setRttEnabled(this.nativePtr, rtt);
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
