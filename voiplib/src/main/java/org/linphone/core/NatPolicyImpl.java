package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class NatPolicyImpl implements NatPolicy {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected NatPolicyImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this.core = this.getCore();
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native boolean isIceEnabled(long var1);

   public synchronized boolean isIceEnabled() {
      synchronized(this.core) {
         return this.isIceEnabled(this.nativePtr);
      }
   }

   private native void setIceEnabled(long var1, boolean var3);

   public synchronized void setIceEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setIceEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setIceEnabled(this.nativePtr, enable);
      }
   }

   private native String getNatV4Address(long var1);

   @Nullable
   public synchronized String getNatV4Address() {
      synchronized(this.core) {
         return this.getNatV4Address(this.nativePtr);
      }
   }

   private native void setNatV4Address(long var1, String var3);

   public synchronized void setNatV4Address(@Nullable String v4Address) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setNatV4Address() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setNatV4Address(this.nativePtr, v4Address);
      }
   }

   private native String getNatV6Address(long var1);

   @Nullable
   public synchronized String getNatV6Address() {
      synchronized(this.core) {
         return this.getNatV6Address(this.nativePtr);
      }
   }

   private native void setNatV6Address(long var1, String var3);

   public synchronized void setNatV6Address(@Nullable String v4Address) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setNatV6Address() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setNatV6Address(this.nativePtr, v4Address);
      }
   }

   private native boolean isStunEnabled(long var1);

   public synchronized boolean isStunEnabled() {
      synchronized(this.core) {
         return this.isStunEnabled(this.nativePtr);
      }
   }

   private native void setStunEnabled(long var1, boolean var3);

   public synchronized void setStunEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setStunEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setStunEnabled(this.nativePtr, enable);
      }
   }

   private native String getStunServer(long var1);

   @Nullable
   public synchronized String getStunServer() {
      synchronized(this.core) {
         return this.getStunServer(this.nativePtr);
      }
   }

   private native void setStunServer(long var1, String var3);

   public synchronized void setStunServer(@Nullable String stunServer) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setStunServer() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setStunServer(this.nativePtr, stunServer);
      }
   }

   private native String getStunServerUsername(long var1);

   @Nullable
   public synchronized String getStunServerUsername() {
      synchronized(this.core) {
         return this.getStunServerUsername(this.nativePtr);
      }
   }

   private native void setStunServerUsername(long var1, String var3);

   public synchronized void setStunServerUsername(@Nullable String username) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setStunServerUsername() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setStunServerUsername(this.nativePtr, username);
      }
   }

   private native boolean isTcpTurnTransportEnabled(long var1);

   public synchronized boolean isTcpTurnTransportEnabled() {
      synchronized(this.core) {
         return this.isTcpTurnTransportEnabled(this.nativePtr);
      }
   }

   private native void setTcpTurnTransportEnabled(long var1, boolean var3);

   public synchronized void setTcpTurnTransportEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setTcpTurnTransportEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setTcpTurnTransportEnabled(this.nativePtr, enable);
      }
   }

   private native boolean isTlsTurnTransportEnabled(long var1);

   public synchronized boolean isTlsTurnTransportEnabled() {
      synchronized(this.core) {
         return this.isTlsTurnTransportEnabled(this.nativePtr);
      }
   }

   private native void setTlsTurnTransportEnabled(long var1, boolean var3);

   public synchronized void setTlsTurnTransportEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setTlsTurnTransportEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setTlsTurnTransportEnabled(this.nativePtr, enable);
      }
   }

   private native boolean isTurnEnabled(long var1);

   public synchronized boolean isTurnEnabled() {
      synchronized(this.core) {
         return this.isTurnEnabled(this.nativePtr);
      }
   }

   private native void setTurnEnabled(long var1, boolean var3);

   public synchronized void setTurnEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setTurnEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setTurnEnabled(this.nativePtr, enable);
      }
   }

   private native boolean isUdpTurnTransportEnabled(long var1);

   public synchronized boolean isUdpTurnTransportEnabled() {
      synchronized(this.core) {
         return this.isUdpTurnTransportEnabled(this.nativePtr);
      }
   }

   private native void setUdpTurnTransportEnabled(long var1, boolean var3);

   public synchronized void setUdpTurnTransportEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setUdpTurnTransportEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setUdpTurnTransportEnabled(this.nativePtr, enable);
      }
   }

   private native boolean isUpnpEnabled(long var1);

   public synchronized boolean isUpnpEnabled() {
      synchronized(this.core) {
         return this.isUpnpEnabled(this.nativePtr);
      }
   }

   private native void setUpnpEnabled(long var1, boolean var3);

   public synchronized void setUpnpEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setUpnpEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setUpnpEnabled(this.nativePtr, enable);
      }
   }

   private native void clear(long var1);

   public synchronized void clear() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call clear() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.clear(this.nativePtr);
      }
   }

   private native NatPolicy clone(long var1);

   @NonNull
   public synchronized NatPolicy clone() {
      synchronized(this.core) {
         return this.clone(this.nativePtr);
      }
   }

   private native void resolveStunServer(long var1);

   public synchronized void resolveStunServer() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call resolveStunServer() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.resolveStunServer(this.nativePtr);
      }
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
