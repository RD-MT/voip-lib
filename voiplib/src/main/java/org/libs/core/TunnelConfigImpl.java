package org.libs.core;

import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class TunnelConfigImpl implements TunnelConfig {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected TunnelConfigImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getDelay(long var1);

   public synchronized int getDelay() {
      return this.getDelay(this.nativePtr);
   }

   private native void setDelay(long var1, int var3);

   public synchronized void setDelay(int delay) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDelay() on it, clone it first.");
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

      this.setDelay(this.nativePtr, delay);
   }

   private native String getHost(long var1);

   @Nullable
   public synchronized String getHost() {
      return this.getHost(this.nativePtr);
   }

   private native void setHost(long var1, String var3);

   public synchronized void setHost(@Nullable String host) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHost() on it, clone it first.");
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

      this.setHost(this.nativePtr, host);
   }

   private native String getHost22(long var1);

   @Nullable
   public synchronized String getHost2() {
      return this.getHost22(this.nativePtr);
   }

   private native void setHost22(long var1, String var3);

   public synchronized void setHost2(@Nullable String host) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHost2() on it, clone it first.");
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

      this.setHost22(this.nativePtr, host);
   }

   private native int getPort(long var1);

   public synchronized int getPort() {
      return this.getPort(this.nativePtr);
   }

   private native void setPort(long var1, int var3);

   public synchronized void setPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPort() on it, clone it first.");
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

      this.setPort(this.nativePtr, port);
   }

   private native int getPort22(long var1);

   public synchronized int getPort2() {
      return this.getPort22(this.nativePtr);
   }

   private native void setPort22(long var1, int var3);

   public synchronized void setPort2(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPort2() on it, clone it first.");
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

      this.setPort22(this.nativePtr, port);
   }

   private native int getRemoteUdpMirrorPort(long var1);

   public synchronized int getRemoteUdpMirrorPort() {
      return this.getRemoteUdpMirrorPort(this.nativePtr);
   }

   private native void setRemoteUdpMirrorPort(long var1, int var3);

   public synchronized void setRemoteUdpMirrorPort(int remoteUdpMirrorPort) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRemoteUdpMirrorPort() on it, clone it first.");
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

      this.setRemoteUdpMirrorPort(this.nativePtr, remoteUdpMirrorPort);
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
