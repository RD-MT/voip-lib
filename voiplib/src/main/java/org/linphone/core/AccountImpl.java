package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class AccountImpl implements Account {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AccountImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean isAvpfEnabled(long var1);

   public synchronized boolean isAvpfEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAvpfEnabled() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.isAvpfEnabled(this.nativePtr);
   }

   private native Address getContactAddress(long var1);

   @Nullable
   public synchronized Address getContactAddress() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactAddress() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getContactAddress(this.nativePtr);
   }

   private native void setContactAddress(long var1, Address var3);

   public synchronized void setContactAddress(@Nullable Address addr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContactAddress() on it, clone it first.");
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

      this.setContactAddress(this.nativePtr, addr);
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCore() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getCore(this.nativePtr);
   }

   private native Account getDependency(long var1);

   @Nullable
   public synchronized Account getDependency() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDependency() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getDependency(this.nativePtr);
   }

   private native void setDependency(long var1, Account var3);

   public synchronized void setDependency(@Nullable Account dependsOn) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDependency() on it, clone it first.");
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

      this.setDependency(this.nativePtr, dependsOn);
   }

   private native int getError(long var1);

   public synchronized Reason getError() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getError() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return Reason.fromInt(this.getError(this.nativePtr));
   }

   private native ErrorInfo getErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo getErrorInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getErrorInfo() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getErrorInfo(this.nativePtr);
   }

   private native AccountParams getParams(long var1);

   @NonNull
   public synchronized AccountParams getParams() {
      return this.getParams(this.nativePtr);
   }

   private native int setParams(long var1, AccountParams var3);

   public synchronized int setParams(@NonNull AccountParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParams() on it, clone it first.");
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

      return this.setParams(this.nativePtr, params);
   }

   private native int getState(long var1);

   public synchronized RegistrationState getState() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getState() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return RegistrationState.fromInt(this.getState(this.nativePtr));
   }

   private native int getTransport(long var1);

   public synchronized TransportType getTransport() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getTransport() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return TransportType.fromInt(this.getTransport(this.nativePtr));
   }

   private native int getUnreadChatMessageCount(long var1);

   public synchronized int getUnreadChatMessageCount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUnreadChatMessageCount() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getUnreadChatMessageCount(this.nativePtr);
   }

   private native void addCustomParam(long var1, String var3, String var4);

   public synchronized void addCustomParam(@NonNull String key, @NonNull String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomParam() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.addCustomParam(this.nativePtr, key, value);
   }

   private native Account clone(long var1);

   @NonNull
   public synchronized Account clone() {
      return this.clone(this.nativePtr);
   }

   private native AuthInfo findAuthInfo(long var1);

   @Nullable
   public synchronized AuthInfo findAuthInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findAuthInfo() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.findAuthInfo(this.nativePtr);
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String headerName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCustomHeader() on it, clone it first.");
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

      return this.getCustomHeader(this.nativePtr, headerName);
   }

   private native String getCustomParam(long var1, String var3);

   @NonNull
   public synchronized String getCustomParam(@NonNull String key) {
      return this.getCustomParam(this.nativePtr, key);
   }

   private native boolean isPhoneNumber(long var1, String var3);

   public synchronized boolean isPhoneNumber(@NonNull String username) {
      return this.isPhoneNumber(this.nativePtr, username);
   }

   private native String normalizePhoneNumber(long var1, String var3);

   @Nullable
   public synchronized String normalizePhoneNumber(@NonNull String username) {
      return this.normalizePhoneNumber(this.nativePtr, username);
   }

   private native Address normalizeSipUri(long var1, String var3);

   @Nullable
   public synchronized Address normalizeSipUri(@NonNull String username) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call normalizeSipUri() on it, clone it first.");
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

      return this.normalizeSipUri(this.nativePtr, username);
   }

   private native void pauseRegister(long var1);

   public synchronized void pauseRegister() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call pauseRegister() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.pauseRegister(this.nativePtr);
   }

   private native void refreshRegister(long var1);

   public synchronized void refreshRegister() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call refreshRegister() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.refreshRegister(this.nativePtr);
   }

   private native void setCustomHeader(long var1, String var3, String var4);

   public synchronized void setCustomHeader(@NonNull String headerName, @Nullable String headerValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCustomHeader() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.setCustomHeader(this.nativePtr, headerName, headerValue);
   }

   private native Account newWithConfig(long var1, Core var3, AccountParams var4, ProxyConfig var5);

   @NonNull
   public synchronized Account newWithConfig(@Nullable Core lc, @NonNull AccountParams params, @Nullable ProxyConfig config) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithConfig() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      return this.newWithConfig(this.nativePtr, lc, params, config);
   }

   private native void addListener(long var1, AccountListener var3);

   public synchronized void addListener(AccountListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, AccountListener var3);

   public synchronized void removeListener(AccountListener listener) {
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
