package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class TunnelImpl implements Tunnel {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected TunnelImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean getActivated(long var1);

   public synchronized boolean getActivated() {
      return this.getActivated(this.nativePtr);
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDomain() on it, clone it first.");
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

      return this.getDomain(this.nativePtr);
   }

   private native void setDomain(long var1, String var3);

   public synchronized void setDomain(@Nullable String domain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDomain() on it, clone it first.");
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

      this.setDomain(this.nativePtr, domain);
   }

   private native boolean isDualModeEnabled(long var1);

   public synchronized boolean isDualModeEnabled() {
      return this.isDualModeEnabled(this.nativePtr);
   }

   private native void setDualModeEnabled(long var1, boolean var3);

   public synchronized void setDualModeEnabled(boolean dualModeEnabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDualModeEnabled() on it, clone it first.");
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

      this.setDualModeEnabled(this.nativePtr, dualModeEnabled);
   }

   private native int getMode(long var1);

   public synchronized Tunnel.Mode getMode() {
      return Tunnel.Mode.fromInt(this.getMode(this.nativePtr));
   }

   private native void setMode(long var1, int var3);

   public synchronized void setMode(Tunnel.Mode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMode() on it, clone it first.");
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

      this.setMode(this.nativePtr, mode.toInt());
   }

   private native TunnelConfig[] getServers(long var1);

   @NonNull
   public synchronized TunnelConfig[] getServers() {
      return this.getServers(this.nativePtr);
   }

   private native boolean isSipEnabled(long var1);

   public synchronized boolean isSipEnabled() {
      return this.isSipEnabled(this.nativePtr);
   }

   private native void setSipEnabled(long var1, boolean var3);

   public synchronized void setSipEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipEnabled() on it, clone it first.");
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

      this.setSipEnabled(this.nativePtr, enable);
   }

   private native String getUsername(long var1);

   @Nullable
   public synchronized String getUsername() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUsername() on it, clone it first.");
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

      return this.getUsername(this.nativePtr);
   }

   private native void setUsername(long var1, String var3);

   public synchronized void setUsername(@Nullable String username) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUsername() on it, clone it first.");
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

      this.setUsername(this.nativePtr, username);
   }

   private native void addServer(long var1, TunnelConfig var3);

   public synchronized void addServer(@NonNull TunnelConfig tunnelConfig) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addServer() on it, clone it first.");
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

      this.addServer(this.nativePtr, tunnelConfig);
   }

   private native void cleanServers(long var1);

   public synchronized void cleanServers() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call cleanServers() on it, clone it first.");
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

      this.cleanServers(this.nativePtr);
   }

   private native boolean connected(long var1);

   public synchronized boolean connected() {
      return this.connected(this.nativePtr);
   }

   private native void reconnect(long var1);

   public synchronized void reconnect() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reconnect() on it, clone it first.");
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

      this.reconnect(this.nativePtr);
   }

   private native void removeServer(long var1, TunnelConfig var3);

   public synchronized void removeServer(@NonNull TunnelConfig tunnelConfig) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeServer() on it, clone it first.");
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

      this.removeServer(this.nativePtr, tunnelConfig);
   }

   private native void setHttpProxy(long var1, String var3, int var4, String var5, String var6);

   public synchronized void setHttpProxy(@NonNull String host, int port, @Nullable String username, @Nullable String passwd) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHttpProxy() on it, clone it first.");
         } catch (CoreException var10) {
            Log.e(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.e(st);
            }
         }
      }

      this.setHttpProxy(this.nativePtr, host, port, username, passwd);
   }

   private native void setHttpProxyAuthInfo(long var1, String var3, String var4);

   public synchronized void setHttpProxyAuthInfo(@Nullable String username, @Nullable String passwd) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHttpProxyAuthInfo() on it, clone it first.");
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

      this.setHttpProxyAuthInfo(this.nativePtr, username, passwd);
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
