package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class AddressImpl implements Address {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AddressImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getDisplayName(long var1);

   @Nullable
   public synchronized String getDisplayName() {
      return this.getDisplayName(this.nativePtr);
   }

   private native int setDisplayName(long var1, String var3);

   public synchronized int setDisplayName(@Nullable String displayName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDisplayName() on it, clone it first.");
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

      return this.setDisplayName(this.nativePtr, displayName);
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      return this.getDomain(this.nativePtr);
   }

   private native int setDomain(long var1, String var3);

   public synchronized int setDomain(@Nullable String domain) {
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

      return this.setDomain(this.nativePtr, domain);
   }

   private native boolean isSip(long var1);

   public synchronized boolean isSip() {
      return this.isSip(this.nativePtr);
   }

   private native boolean isValid(long var1);

   @Nullable
   public synchronized boolean isValid() {
      return this.isValid(this.nativePtr);
   }

   private native String getMethodParam(long var1);

   @Nullable
   public synchronized String getMethodParam() {
      return this.getMethodParam(this.nativePtr);
   }

   private native void setMethodParam(long var1, String var3);

   public synchronized void setMethodParam(@Nullable String methodParam) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMethodParam() on it, clone it first.");
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

      this.setMethodParam(this.nativePtr, methodParam);
   }

   private native String getPassword(long var1);

   @Nullable
   public synchronized String getPassword() {
      return this.getPassword(this.nativePtr);
   }

   private native void setPassword(long var1, String var3);

   public synchronized void setPassword(@Nullable String password) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPassword() on it, clone it first.");
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

      this.setPassword(this.nativePtr, password);
   }

   private native int getPort(long var1);

   public synchronized int getPort() {
      return this.getPort(this.nativePtr);
   }

   private native int setPort(long var1, int var3);

   public synchronized int setPort(int port) {
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

      return this.setPort(this.nativePtr, port);
   }

   private native String getScheme(long var1);

   @Nullable
   public synchronized String getScheme() {
      return this.getScheme(this.nativePtr);
   }

   private native boolean getSecure(long var1);

   public synchronized boolean getSecure() {
      return this.getSecure(this.nativePtr);
   }

   private native void setSecure(long var1, boolean var3);

   public synchronized void setSecure(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSecure() on it, clone it first.");
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

      this.setSecure(this.nativePtr, enabled);
   }

   private native int getTransport(long var1);

   public synchronized TransportType getTransport() {
      return TransportType.fromInt(this.getTransport(this.nativePtr));
   }

   private native int setTransport(long var1, int var3);

   public synchronized int setTransport(TransportType transport) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTransport() on it, clone it first.");
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

      return this.setTransport(this.nativePtr, transport.toInt());
   }

   private native void setUriParams(long var1, String var3);

   public synchronized void setUriParams(String params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUriParams() on it, clone it first.");
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

      this.setUriParams(this.nativePtr, params);
   }

   private native String getUsername(long var1);

   @Nullable
   public synchronized String getUsername() {
      return this.getUsername(this.nativePtr);
   }

   private native int setUsername(long var1, String var3);

   public synchronized int setUsername(@Nullable String username) {
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

      return this.setUsername(this.nativePtr, username);
   }

   private native String asString(long var1);

   @NonNull
   public synchronized String asString() {
      return this.asString(this.nativePtr);
   }

   private native String asStringUriOnly(long var1);

   @NonNull
   public synchronized String asStringUriOnly() {
      return this.asStringUriOnly(this.nativePtr);
   }

   private native void clean(long var1);

   public synchronized void clean() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clean() on it, clone it first.");
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

      this.clean(this.nativePtr);
   }

   private native Address clone(long var1);

   @NonNull
   public synchronized Address clone() {
      return this.clone(this.nativePtr);
   }

   private native boolean equal(long var1, Address var3);

   public synchronized boolean equal(@NonNull Address address2) {
      return this.equal(this.nativePtr, address2);
   }

   private native String getHeader(long var1, String var3);

   @Nullable
   public synchronized String getHeader(@NonNull String headerName) {
      return this.getHeader(this.nativePtr, headerName);
   }

   private native String getParam(long var1, String var3);

   @Nullable
   public synchronized String getParam(@NonNull String paramName) {
      return this.getParam(this.nativePtr, paramName);
   }

   private native String getUriParam(long var1, String var3);

   @Nullable
   public synchronized String getUriParam(@NonNull String uriParamName) {
      return this.getUriParam(this.nativePtr, uriParamName);
   }

   private native boolean hasParam(long var1, String var3);

   public synchronized boolean hasParam(@NonNull String paramName) {
      return this.hasParam(this.nativePtr, paramName);
   }

   private native boolean hasUriParam(long var1, String var3);

   public synchronized boolean hasUriParam(@NonNull String uriParamName) {
      return this.hasUriParam(this.nativePtr, uriParamName);
   }

   private native void removeUriParam(long var1, String var3);

   public synchronized void removeUriParam(@NonNull String uriParamName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeUriParam() on it, clone it first.");
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

      this.removeUriParam(this.nativePtr, uriParamName);
   }

   private native void setHeader(long var1, String var3, String var4);

   public synchronized void setHeader(@NonNull String headerName, @Nullable String headerValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHeader() on it, clone it first.");
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

      this.setHeader(this.nativePtr, headerName, headerValue);
   }

   private native void setParam(long var1, String var3, String var4);

   public synchronized void setParam(@NonNull String paramName, @Nullable String paramValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParam() on it, clone it first.");
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

      this.setParam(this.nativePtr, paramName, paramValue);
   }

   private native void setUriParam(long var1, String var3, String var4);

   public synchronized void setUriParam(@NonNull String uriParamName, @Nullable String uriParamValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUriParam() on it, clone it first.");
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

      this.setUriParam(this.nativePtr, uriParamName, uriParamValue);
   }

   private native boolean weakEqual(long var1, Address var3);

   public synchronized boolean weakEqual(@NonNull Address address2) {
      return this.weakEqual(this.nativePtr, address2);
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
