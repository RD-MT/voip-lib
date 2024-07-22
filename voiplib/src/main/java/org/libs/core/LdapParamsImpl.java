package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class LdapParamsImpl implements LdapParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected LdapParamsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getAuthMethod(long var1);

   public synchronized LdapAuthMethod getAuthMethod() {
      return LdapAuthMethod.fromInt(this.getAuthMethod(this.nativePtr));
   }

   private native void setAuthMethod(long var1, int var3);

   public synchronized void setAuthMethod(LdapAuthMethod authMethod) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAuthMethod() on it, clone it first.");
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

      this.setAuthMethod(this.nativePtr, authMethod.toInt());
   }

   private native String getBaseObject(long var1);

   @NonNull
   public synchronized String getBaseObject() {
      return this.getBaseObject(this.nativePtr);
   }

   private native void setBaseObject(long var1, String var3);

   public synchronized void setBaseObject(@NonNull String baseObject) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBaseObject() on it, clone it first.");
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

      this.setBaseObject(this.nativePtr, baseObject);
   }

   private native String getBindDn(long var1);

   @Nullable
   public synchronized String getBindDn() {
      return this.getBindDn(this.nativePtr);
   }

   private native void setBindDn(long var1, String var3);

   public synchronized void setBindDn(@Nullable String bindDn) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBindDn() on it, clone it first.");
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

      this.setBindDn(this.nativePtr, bindDn);
   }

   private native int getDebugLevel(long var1);

   public synchronized LdapDebugLevel getDebugLevel() {
      return LdapDebugLevel.fromInt(this.getDebugLevel(this.nativePtr));
   }

   private native void setDebugLevel(long var1, int var3);

   public synchronized void setDebugLevel(LdapDebugLevel level) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDebugLevel() on it, clone it first.");
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

      this.setDebugLevel(this.nativePtr, level.toInt());
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

   private native boolean getEnabled(long var1);

   public synchronized boolean getEnabled() {
      return this.getEnabled(this.nativePtr);
   }

   private native void setEnabled(long var1, boolean var3);

   public synchronized void setEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEnabled() on it, clone it first.");
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

      this.setEnabled(this.nativePtr, enable);
   }

   private native String getFilter(long var1);

   @Nullable
   public synchronized String getFilter() {
      return this.getFilter(this.nativePtr);
   }

   private native void setFilter(long var1, String var3);

   public synchronized void setFilter(@Nullable String filter) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFilter() on it, clone it first.");
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

      this.setFilter(this.nativePtr, filter);
   }

   private native int getMaxResults(long var1);

   public synchronized int getMaxResults() {
      return this.getMaxResults(this.nativePtr);
   }

   private native void setMaxResults(long var1, int var3);

   public synchronized void setMaxResults(int maxResults) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMaxResults() on it, clone it first.");
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

      this.setMaxResults(this.nativePtr, maxResults);
   }

   private native int getMinChars(long var1);

   public synchronized int getMinChars() {
      return this.getMinChars(this.nativePtr);
   }

   private native void setMinChars(long var1, int var3);

   public synchronized void setMinChars(int minChars) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMinChars() on it, clone it first.");
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

      this.setMinChars(this.nativePtr, minChars);
   }

   private native String getNameAttribute(long var1);

   @Nullable
   public synchronized String getNameAttribute() {
      return this.getNameAttribute(this.nativePtr);
   }

   private native void setNameAttribute(long var1, String var3);

   public synchronized void setNameAttribute(@Nullable String nameAttribute) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNameAttribute() on it, clone it first.");
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

      this.setNameAttribute(this.nativePtr, nameAttribute);
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

   private native boolean isSalEnabled(long var1);

   public synchronized boolean isSalEnabled() {
      return this.isSalEnabled(this.nativePtr);
   }

   private native void setSalEnabled(long var1, boolean var3);

   public synchronized void setSalEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSalEnabled() on it, clone it first.");
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

      this.setSalEnabled(this.nativePtr, enable);
   }

   private native String getServer(long var1);

   @NonNull
   public synchronized String getServer() {
      return this.getServer(this.nativePtr);
   }

   private native void setServer(long var1, String var3);

   public synchronized void setServer(@NonNull String server) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setServer() on it, clone it first.");
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

      this.setServer(this.nativePtr, server);
   }

   private native int getServerCertificatesVerificationMode(long var1);

   public synchronized LdapCertVerificationMode getServerCertificatesVerificationMode() {
      return LdapCertVerificationMode.fromInt(this.getServerCertificatesVerificationMode(this.nativePtr));
   }

   private native void setServerCertificatesVerificationMode(long var1, int var3);

   public synchronized void setServerCertificatesVerificationMode(LdapCertVerificationMode verifyServerCertificates) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setServerCertificatesVerificationMode() on it, clone it first.");
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

      this.setServerCertificatesVerificationMode(this.nativePtr, verifyServerCertificates.toInt());
   }

   private native String getSipAttribute(long var1);

   @Nullable
   public synchronized String getSipAttribute() {
      return this.getSipAttribute(this.nativePtr);
   }

   private native void setSipAttribute(long var1, String var3);

   public synchronized void setSipAttribute(@Nullable String sipAttribute) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipAttribute() on it, clone it first.");
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

      this.setSipAttribute(this.nativePtr, sipAttribute);
   }

   private native String getSipDomain(long var1);

   @Nullable
   public synchronized String getSipDomain() {
      return this.getSipDomain(this.nativePtr);
   }

   private native void setSipDomain(long var1, String var3);

   public synchronized void setSipDomain(@Nullable String sipDomain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipDomain() on it, clone it first.");
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

      this.setSipDomain(this.nativePtr, sipDomain);
   }

   private native int getTimeout(long var1);

   public synchronized int getTimeout() {
      return this.getTimeout(this.nativePtr);
   }

   private native void setTimeout(long var1, int var3);

   public synchronized void setTimeout(int timeout) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTimeout() on it, clone it first.");
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

      this.setTimeout(this.nativePtr, timeout);
   }

   private native boolean isTlsEnabled(long var1);

   public synchronized boolean isTlsEnabled() {
      return this.isTlsEnabled(this.nativePtr);
   }

   private native void setTlsEnabled(long var1, boolean var3);

   public synchronized void setTlsEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsEnabled() on it, clone it first.");
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

      this.setTlsEnabled(this.nativePtr, enable);
   }

   private native int check(long var1);

   public synchronized int check() {
      return this.check(this.nativePtr);
   }

   private native LdapParams clone(long var1);

   @NonNull
   public synchronized LdapParams clone() {
      return this.clone(this.nativePtr);
   }

   private native String getCustomValue(long var1, String var3);

   @Nullable
   public synchronized String getCustomValue(@NonNull String key) {
      return this.getCustomValue(this.nativePtr, key);
   }

   private native void setCustomValue(long var1, String var3, String var4);

   public synchronized void setCustomValue(@NonNull String key, @Nullable String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCustomValue() on it, clone it first.");
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

      this.setCustomValue(this.nativePtr, key, value);
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
