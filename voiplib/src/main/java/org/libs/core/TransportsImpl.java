package org.libs.core;

import org.libs.mediastream.Log;

class TransportsImpl implements Transports {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected TransportsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getDtlsPort(long var1);

   public synchronized int getDtlsPort() {
      return this.getDtlsPort(this.nativePtr);
   }

   private native void setDtlsPort(long var1, int var3);

   public synchronized void setDtlsPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDtlsPort() on it, clone it first.");
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

      this.setDtlsPort(this.nativePtr, port);
   }

   private native int getTcpPort(long var1);

   public synchronized int getTcpPort() {
      return this.getTcpPort(this.nativePtr);
   }

   private native void setTcpPort(long var1, int var3);

   public synchronized void setTcpPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTcpPort() on it, clone it first.");
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

      this.setTcpPort(this.nativePtr, port);
   }

   private native int getTlsPort(long var1);

   public synchronized int getTlsPort() {
      return this.getTlsPort(this.nativePtr);
   }

   private native void setTlsPort(long var1, int var3);

   public synchronized void setTlsPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsPort() on it, clone it first.");
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

      this.setTlsPort(this.nativePtr, port);
   }

   private native int getUdpPort(long var1);

   public synchronized int getUdpPort() {
      return this.getUdpPort(this.nativePtr);
   }

   private native void setUdpPort(long var1, int var3);

   public synchronized void setUdpPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUdpPort() on it, clone it first.");
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

      this.setUdpPort(this.nativePtr, port);
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
