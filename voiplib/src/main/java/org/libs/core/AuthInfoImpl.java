package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class AuthInfoImpl implements AuthInfo {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AuthInfoImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getAlgorithm(long var1);

   @Nullable
   public synchronized String getAlgorithm() {
      return this.getAlgorithm(this.nativePtr);
   }

   private native void setAlgorithm(long var1, String var3);

   public synchronized void setAlgorithm(@Nullable String algorithm) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAlgorithm() on it, clone it first.");
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

      this.setAlgorithm(this.nativePtr, algorithm);
   }

   private native String[] getAvailableAlgorithms(long var1);

   @NonNull
   public synchronized String[] getAvailableAlgorithms() {
      return this.getAvailableAlgorithms(this.nativePtr);
   }

   private native void setAvailableAlgorithms(long var1, String[] var3);

   public synchronized void setAvailableAlgorithms(@Nullable String[] algorithms) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvailableAlgorithms() on it, clone it first.");
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

      this.setAvailableAlgorithms(this.nativePtr, algorithms);
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
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

   private native String getHa11(long var1);

   @Nullable
   public synchronized String getHa1() {
      return this.getHa11(this.nativePtr);
   }

   private native void setHa11(long var1, String var3);

   public synchronized void setHa1(@Nullable String ha1) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHa1() on it, clone it first.");
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

      this.setHa11(this.nativePtr, ha1);
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

   private native String getRealm(long var1);

   @Nullable
   public synchronized String getRealm() {
      return this.getRealm(this.nativePtr);
   }

   private native void setRealm(long var1, String var3);

   public synchronized void setRealm(@Nullable String realm) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRealm() on it, clone it first.");
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

      this.setRealm(this.nativePtr, realm);
   }

   private native String getTlsCert(long var1);

   @Nullable
   public synchronized String getTlsCert() {
      return this.getTlsCert(this.nativePtr);
   }

   private native void setTlsCert(long var1, String var3);

   public synchronized void setTlsCert(@Nullable String tlsCert) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsCert() on it, clone it first.");
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

      this.setTlsCert(this.nativePtr, tlsCert);
   }

   private native String getTlsCertPath(long var1);

   @Nullable
   public synchronized String getTlsCertPath() {
      return this.getTlsCertPath(this.nativePtr);
   }

   private native void setTlsCertPath(long var1, String var3);

   public synchronized void setTlsCertPath(@Nullable String tlsCertPath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsCertPath() on it, clone it first.");
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

      this.setTlsCertPath(this.nativePtr, tlsCertPath);
   }

   private native String getTlsKey(long var1);

   @Nullable
   public synchronized String getTlsKey() {
      return this.getTlsKey(this.nativePtr);
   }

   private native void setTlsKey(long var1, String var3);

   public synchronized void setTlsKey(@Nullable String tlsKey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsKey() on it, clone it first.");
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

      this.setTlsKey(this.nativePtr, tlsKey);
   }

   private native String getTlsKeyPath(long var1);

   @Nullable
   public synchronized String getTlsKeyPath() {
      return this.getTlsKeyPath(this.nativePtr);
   }

   private native void setTlsKeyPath(long var1, String var3);

   public synchronized void setTlsKeyPath(@Nullable String tlsKeyPath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsKeyPath() on it, clone it first.");
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

      this.setTlsKeyPath(this.nativePtr, tlsKeyPath);
   }

   private native String getUserid(long var1);

   @Nullable
   public synchronized String getUserid() {
      return this.getUserid(this.nativePtr);
   }

   private native void setUserid(long var1, String var3);

   public synchronized void setUserid(@Nullable String userId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUserid() on it, clone it first.");
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

      this.setUserid(this.nativePtr, userId);
   }

   private native String getUsername(long var1);

   @Nullable
   public synchronized String getUsername() {
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

   private native void addAvailableAlgorithm(long var1, String var3);

   public synchronized void addAvailableAlgorithm(@Nullable String algorithm) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addAvailableAlgorithm() on it, clone it first.");
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

      this.addAvailableAlgorithm(this.nativePtr, algorithm);
   }

   private native void clearAvailableAlgorithms(long var1);

   public synchronized void clearAvailableAlgorithms() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearAvailableAlgorithms() on it, clone it first.");
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

      this.clearAvailableAlgorithms(this.nativePtr);
   }

   private native AuthInfo clone(long var1);

   @NonNull
   public synchronized AuthInfo clone() {
      return this.clone(this.nativePtr);
   }

   private native boolean isEqualButAlgorithms(long var1, AuthInfo var3);

   public synchronized boolean isEqualButAlgorithms(@Nullable AuthInfo authInfo2) {
      return this.isEqualButAlgorithms(this.nativePtr, authInfo2);
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
