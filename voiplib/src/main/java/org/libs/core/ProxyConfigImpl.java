package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ProxyConfigImpl implements ProxyConfig {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected ProxyConfigImpl(long ptr, boolean isConst) {
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

   private native boolean isAvpfEnabled(long var1);

   public synchronized boolean isAvpfEnabled() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isAvpfEnabled() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.isAvpfEnabled(this.nativePtr);
      }
   }

   private native int getAvpfMode(long var1);

   public synchronized AVPFMode getAvpfMode() {
      synchronized(this.core) {
         return AVPFMode.fromInt(this.getAvpfMode(this.nativePtr));
      }
   }

   private native void setAvpfMode(long var1, int var3);

   public synchronized void setAvpfMode(AVPFMode mode) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setAvpfMode() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setAvpfMode(this.nativePtr, mode.toInt());
      }
   }

   private native int getAvpfRrInterval(long var1);

   public synchronized int getAvpfRrInterval() {
      synchronized(this.core) {
         return this.getAvpfRrInterval(this.nativePtr);
      }
   }

   private native void setAvpfRrInterval(long var1, int var3);

   public synchronized void setAvpfRrInterval(int interval) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setAvpfRrInterval() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setAvpfRrInterval(this.nativePtr, interval);
      }
   }

   private native String getConferenceFactoryUri(long var1);

   @Nullable
   public synchronized String getConferenceFactoryUri() {
      synchronized(this.core) {
         return this.getConferenceFactoryUri(this.nativePtr);
      }
   }

   private native void setConferenceFactoryUri(long var1, String var3);

   public synchronized void setConferenceFactoryUri(@Nullable String uri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setConferenceFactoryUri() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setConferenceFactoryUri(this.nativePtr, uri);
      }
   }

   private native Address getContact(long var1);

   @Nullable
   public synchronized Address getContact() {
      synchronized(this.core) {
         return this.getContact(this.nativePtr);
      }
   }

   private native String getContactParameters(long var1);

   @Nullable
   public synchronized String getContactParameters() {
      synchronized(this.core) {
         return this.getContactParameters(this.nativePtr);
      }
   }

   private native void setContactParameters(long var1, String var3);

   public synchronized void setContactParameters(@Nullable String contactParams) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setContactParameters() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setContactParameters(this.nativePtr, contactParams);
      }
   }

   private native String getContactUriParameters(long var1);

   @Nullable
   public synchronized String getContactUriParameters() {
      synchronized(this.core) {
         return this.getContactUriParameters(this.nativePtr);
      }
   }

   private native void setContactUriParameters(long var1, String var3);

   public synchronized void setContactUriParameters(@Nullable String contactUriParams) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setContactUriParameters() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setContactUriParameters(this.nativePtr, contactUriParams);
      }
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native ProxyConfig getDependency(long var1);

   @Nullable
   public synchronized ProxyConfig getDependency() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getDependency() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.getDependency(this.nativePtr);
      }
   }

   private native void setDependency(long var1, ProxyConfig var3);

   public synchronized void setDependency(@Nullable ProxyConfig dependsOn) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setDependency() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setDependency(this.nativePtr, dependsOn);
      }
   }

   private native boolean getDialEscapePlus(long var1);

   public synchronized boolean getDialEscapePlus() {
      synchronized(this.core) {
         return this.getDialEscapePlus(this.nativePtr);
      }
   }

   private native void setDialEscapePlus(long var1, boolean var3);

   public synchronized void setDialEscapePlus(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setDialEscapePlus() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setDialEscapePlus(this.nativePtr, enable);
      }
   }

   private native String getDialPrefix(long var1);

   @Nullable
   public synchronized String getDialPrefix() {
      synchronized(this.core) {
         return this.getDialPrefix(this.nativePtr);
      }
   }

   private native void setDialPrefix(long var1, String var3);

   public synchronized void setDialPrefix(@Nullable String prefix) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setDialPrefix() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setDialPrefix(this.nativePtr, prefix);
      }
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      synchronized(this.core) {
         return this.getDomain(this.nativePtr);
      }
   }

   private native int getError(long var1);

   public synchronized Reason getError() {
      synchronized(this.core) {
         return Reason.fromInt(this.getError(this.nativePtr));
      }
   }

   private native ErrorInfo getErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo getErrorInfo() {
      synchronized(this.core) {
         return this.getErrorInfo(this.nativePtr);
      }
   }

   private native int getExpires(long var1);

   public synchronized int getExpires() {
      synchronized(this.core) {
         return this.getExpires(this.nativePtr);
      }
   }

   private native void setExpires(long var1, int var3);

   public synchronized void setExpires(int expires) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setExpires() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setExpires(this.nativePtr, expires);
      }
   }

   private native Address getIdentityAddress(long var1);

   @Nullable
   public synchronized Address getIdentityAddress() {
      synchronized(this.core) {
         return this.getIdentityAddress(this.nativePtr);
      }
   }

   private native int setIdentityAddress(long var1, Address var3);

   public synchronized int setIdentityAddress(@Nullable Address identity) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setIdentityAddress() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.setIdentityAddress(this.nativePtr, identity);
      }
   }

   private native String getIdkey(long var1);

   @Nullable
   public synchronized String getIdkey() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getIdkey() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.getIdkey(this.nativePtr);
      }
   }

   private native void setIdkey(long var1, String var3);

   public synchronized void setIdkey(@Nullable String idkey) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setIdkey() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setIdkey(this.nativePtr, idkey);
      }
   }

   private native boolean isPushNotificationAllowed(long var1);

   public synchronized boolean isPushNotificationAllowed() {
      synchronized(this.core) {
         return this.isPushNotificationAllowed(this.nativePtr);
      }
   }

   private native boolean isPushNotificationAvailable(long var1);

   public synchronized boolean isPushNotificationAvailable() {
      synchronized(this.core) {
         return this.isPushNotificationAvailable(this.nativePtr);
      }
   }

   private native boolean isRemotePushNotificationAllowed(long var1);

   public synchronized boolean isRemotePushNotificationAllowed() {
      synchronized(this.core) {
         return this.isRemotePushNotificationAllowed(this.nativePtr);
      }
   }

   private native NatPolicy getNatPolicy(long var1);

   @Nullable
   public synchronized NatPolicy getNatPolicy() {
      synchronized(this.core) {
         return this.getNatPolicy(this.nativePtr);
      }
   }

   private native void setNatPolicy(long var1, NatPolicy var3);

   public synchronized void setNatPolicy(@Nullable NatPolicy policy) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setNatPolicy() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setNatPolicy(this.nativePtr, policy);
      }
   }

   private native int getPrivacy(long var1);

   public synchronized int getPrivacy() {
      synchronized(this.core) {
         return this.getPrivacy(this.nativePtr);
      }
   }

   private native void setPrivacy(long var1, int var3);

   public synchronized void setPrivacy(int privacy) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPrivacy() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setPrivacy(this.nativePtr, privacy);
      }
   }

   private native boolean isPublishEnabled(long var1);

   public synchronized boolean isPublishEnabled() {
      synchronized(this.core) {
         return this.isPublishEnabled(this.nativePtr);
      }
   }

   private native void setPublishEnabled(long var1, boolean var3);

   public synchronized void setPublishEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPublishEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setPublishEnabled(this.nativePtr, enable);
      }
   }

   private native int getPublishExpires(long var1);

   public synchronized int getPublishExpires() {
      synchronized(this.core) {
         return this.getPublishExpires(this.nativePtr);
      }
   }

   private native void setPublishExpires(long var1, int var3);

   public synchronized void setPublishExpires(int expires) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPublishExpires() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setPublishExpires(this.nativePtr, expires);
      }
   }

   private native void setPushNotificationAllowed(long var1, boolean var3);

   public synchronized void setPushNotificationAllowed(boolean allow) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPushNotificationAllowed() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setPushNotificationAllowed(this.nativePtr, allow);
      }
   }

   private native PushNotificationConfig getPushNotificationConfig(long var1);

   @NonNull
   public synchronized PushNotificationConfig getPushNotificationConfig() {
      synchronized(this.core) {
         return this.getPushNotificationConfig(this.nativePtr);
      }
   }

   private native void setPushNotificationConfig(long var1, PushNotificationConfig var3);

   public synchronized void setPushNotificationConfig(@NonNull PushNotificationConfig pushCfg) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPushNotificationConfig() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setPushNotificationConfig(this.nativePtr, pushCfg);
      }
   }

   private native String getQualityReportingCollector(long var1);

   @Nullable
   public synchronized String getQualityReportingCollector() {
      synchronized(this.core) {
         return this.getQualityReportingCollector(this.nativePtr);
      }
   }

   private native void setQualityReportingCollector(long var1, String var3);

   public synchronized void setQualityReportingCollector(@Nullable String collector) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingCollector() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setQualityReportingCollector(this.nativePtr, collector);
      }
   }

   private native boolean isQualityReportingEnabled(long var1);

   public synchronized boolean isQualityReportingEnabled() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isQualityReportingEnabled() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.isQualityReportingEnabled(this.nativePtr);
      }
   }

   private native void setQualityReportingEnabled(long var1, boolean var3);

   public synchronized void setQualityReportingEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setQualityReportingEnabled(this.nativePtr, enable);
      }
   }

   private native int getQualityReportingInterval(long var1);

   public synchronized int getQualityReportingInterval() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getQualityReportingInterval() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.getQualityReportingInterval(this.nativePtr);
      }
   }

   private native void setQualityReportingInterval(long var1, int var3);

   public synchronized void setQualityReportingInterval(int interval) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingInterval() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setQualityReportingInterval(this.nativePtr, interval);
      }
   }

   private native String getRealm(long var1);

   @Nullable
   public synchronized String getRealm() {
      synchronized(this.core) {
         return this.getRealm(this.nativePtr);
      }
   }

   private native void setRealm(long var1, String var3);

   public synchronized void setRealm(@Nullable String realm) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRealm() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setRealm(this.nativePtr, realm);
      }
   }

   private native String getRefKey(long var1);

   @Nullable
   public synchronized String getRefKey() {
      synchronized(this.core) {
         return this.getRefKey(this.nativePtr);
      }
   }

   private native void setRefKey(long var1, String var3);

   public synchronized void setRefKey(@Nullable String refkey) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRefKey() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setRefKey(this.nativePtr, refkey);
      }
   }

   private native boolean isRegisterEnabled(long var1);

   public synchronized boolean isRegisterEnabled() {
      synchronized(this.core) {
         return this.isRegisterEnabled(this.nativePtr);
      }
   }

   private native void setRegisterEnabled(long var1, boolean var3);

   public synchronized void setRegisterEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRegisterEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setRegisterEnabled(this.nativePtr, enable);
      }
   }

   private native void setRemotePushNotificationAllowed(long var1, boolean var3);

   public synchronized void setRemotePushNotificationAllowed(boolean allow) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRemotePushNotificationAllowed() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.setRemotePushNotificationAllowed(this.nativePtr, allow);
      }
   }

   private native int setRoute(long var1, String var3);

   public synchronized int setRoute(@Nullable String route) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRoute() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.setRoute(this.nativePtr, route);
      }
   }

   private native String[] getRoutes(long var1);

   @NonNull
   public synchronized String[] getRoutes() {
      synchronized(this.core) {
         return this.getRoutes(this.nativePtr);
      }
   }

   private native int setRoutes(long var1, String[] var3);

   public synchronized int setRoutes(@Nullable String[] routes) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRoutes() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.setRoutes(this.nativePtr, routes);
      }
   }

   private native String getServerAddr(long var1);

   @Nullable
   public synchronized String getServerAddr() {
      synchronized(this.core) {
         return this.getServerAddr(this.nativePtr);
      }
   }

   private native int setServerAddr(long var1, String var3);

   public synchronized int setServerAddr(@Nullable String serverAddress) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setServerAddr() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.setServerAddr(this.nativePtr, serverAddress);
      }
   }

   private native int getState(long var1);

   public synchronized RegistrationState getState() {
      synchronized(this.core) {
         return RegistrationState.fromInt(this.getState(this.nativePtr));
      }
   }

   private native String getTransport(long var1);

   @NonNull
   public synchronized String getTransport() {
      synchronized(this.core) {
         return this.getTransport(this.nativePtr);
      }
   }

   private native int getUnreadChatMessageCount(long var1);

   public synchronized int getUnreadChatMessageCount() {
      synchronized(this.core) {
         return this.getUnreadChatMessageCount(this.nativePtr);
      }
   }

   private native int done(long var1);

   public synchronized int done() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call done() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.done(this.nativePtr);
      }
   }

   private native void edit(long var1);

   public synchronized void edit() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call edit() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         this.edit(this.nativePtr);
      }
   }

   private native AuthInfo findAuthInfo(long var1);

   @Nullable
   public synchronized AuthInfo findAuthInfo() {
      synchronized(this.core) {
         return this.findAuthInfo(this.nativePtr);
      }
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String headerName) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getCustomHeader() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.getCustomHeader(this.nativePtr, headerName);
      }
   }

   private native String normalizePhoneNumber(long var1, String var3);

   @Nullable
   public synchronized String normalizePhoneNumber(@NonNull String username) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call normalizePhoneNumber() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.normalizePhoneNumber(this.nativePtr, username);
      }
   }

   private native Address normalizeSipUri(long var1, String var3);

   @Nullable
   public synchronized Address normalizeSipUri(@NonNull String username) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call normalizeSipUri() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.normalizeSipUri(this.nativePtr, username);
      }
   }

   private native void pauseRegister(long var1);

   public synchronized void pauseRegister() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call pauseRegister() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         this.pauseRegister(this.nativePtr);
      }
   }

   private native void refreshRegister(long var1);

   public synchronized void refreshRegister() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call refreshRegister() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         this.refreshRegister(this.nativePtr);
      }
   }

   private native void setCustomHeader(long var1, String var3, String var4);

   public synchronized void setCustomHeader(@NonNull String headerName, @Nullable String headerValue) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setCustomHeader() on it, clone it first.");
            } catch (CoreException var10) {
               Log.e(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.e(st);
               }
            }
         }

         this.setCustomHeader(this.nativePtr, headerName, headerValue);
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
