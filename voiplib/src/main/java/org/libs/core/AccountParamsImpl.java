package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class AccountParamsImpl implements AccountParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AccountParamsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Address getAudioVideoConferenceFactoryAddress(long var1);

   @Nullable
   public synchronized Address getAudioVideoConferenceFactoryAddress() {
      return this.getAudioVideoConferenceFactoryAddress(this.nativePtr);
   }

   private native void setAudioVideoConferenceFactoryAddress(long var1, Address var3);

   public synchronized void setAudioVideoConferenceFactoryAddress(@Nullable Address address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioVideoConferenceFactoryAddress() on it, clone it first.");
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

      this.setAudioVideoConferenceFactoryAddress(this.nativePtr, address);
   }

   private native int getAvpfMode(long var1);

   public synchronized AVPFMode getAvpfMode() {
      return AVPFMode.fromInt(this.getAvpfMode(this.nativePtr));
   }

   private native void setAvpfMode(long var1, int var3);

   public synchronized void setAvpfMode(AVPFMode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvpfMode() on it, clone it first.");
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

      this.setAvpfMode(this.nativePtr, mode.toInt());
   }

   private native int getAvpfRrInterval(long var1);

   public synchronized int getAvpfRrInterval() {
      return this.getAvpfRrInterval(this.nativePtr);
   }

   private native void setAvpfRrInterval(long var1, int var3);

   public synchronized void setAvpfRrInterval(int interval) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvpfRrInterval() on it, clone it first.");
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

      this.setAvpfRrInterval(this.nativePtr, interval);
   }

   private native String getConferenceFactoryUri(long var1);

   @Nullable
   public synchronized String getConferenceFactoryUri() {
      return this.getConferenceFactoryUri(this.nativePtr);
   }

   private native void setConferenceFactoryUri(long var1, String var3);

   public synchronized void setConferenceFactoryUri(@Nullable String uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceFactoryUri() on it, clone it first.");
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

      this.setConferenceFactoryUri(this.nativePtr, uri);
   }

   private native String getContactParameters(long var1);

   @Nullable
   public synchronized String getContactParameters() {
      return this.getContactParameters(this.nativePtr);
   }

   private native void setContactParameters(long var1, String var3);

   public synchronized void setContactParameters(@Nullable String contactParams) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContactParameters() on it, clone it first.");
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

      this.setContactParameters(this.nativePtr, contactParams);
   }

   private native String getContactUriParameters(long var1);

   @Nullable
   public synchronized String getContactUriParameters() {
      return this.getContactUriParameters(this.nativePtr);
   }

   private native void setContactUriParameters(long var1, String var3);

   public synchronized void setContactUriParameters(@Nullable String contactUriParams) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContactUriParameters() on it, clone it first.");
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

      this.setContactUriParameters(this.nativePtr, contactUriParams);
   }

   private native boolean isCpimInBasicChatRoomEnabled(long var1);

   public synchronized boolean isCpimInBasicChatRoomEnabled() {
      return this.isCpimInBasicChatRoomEnabled(this.nativePtr);
   }

   private native void setCpimInBasicChatRoomEnabled(long var1, boolean var3);

   public synchronized void setCpimInBasicChatRoomEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCpimInBasicChatRoomEnabled() on it, clone it first.");
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

      this.setCpimInBasicChatRoomEnabled(this.nativePtr, enable);
   }

   private native Address getCustomContact(long var1);

   @Nullable
   public synchronized Address getCustomContact() {
      return this.getCustomContact(this.nativePtr);
   }

   private native void setCustomContact(long var1, Address var3);

   public synchronized void setCustomContact(@Nullable Address contact) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCustomContact() on it, clone it first.");
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

      this.setCustomContact(this.nativePtr, contact);
   }

   private native boolean isDialEscapePlusEnabled(long var1);

   public synchronized boolean isDialEscapePlusEnabled() {
      return this.isDialEscapePlusEnabled(this.nativePtr);
   }

   private native void setDialEscapePlusEnabled(long var1, boolean var3);

   public synchronized void setDialEscapePlusEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDialEscapePlusEnabled() on it, clone it first.");
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

      this.setDialEscapePlusEnabled(this.nativePtr, enable);
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      return this.getDomain(this.nativePtr);
   }

   private native int getExpires(long var1);

   public synchronized int getExpires() {
      return this.getExpires(this.nativePtr);
   }

   private native void setExpires(long var1, int var3);

   public synchronized void setExpires(int expires) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setExpires() on it, clone it first.");
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

      this.setExpires(this.nativePtr, expires);
   }

   private native String getIdentity(long var1);

   @Nullable
   public synchronized String getIdentity() {
      return this.getIdentity(this.nativePtr);
   }

   private native Address getIdentityAddress(long var1);

   @Nullable
   public synchronized Address getIdentityAddress() {
      return this.getIdentityAddress(this.nativePtr);
   }

   private native int setIdentityAddress(long var1, Address var3);

   public synchronized int setIdentityAddress(@Nullable Address identity) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIdentityAddress() on it, clone it first.");
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

      return this.setIdentityAddress(this.nativePtr, identity);
   }

   private native String getIdkey(long var1);

   @Nullable
   public synchronized String getIdkey() {
      return this.getIdkey(this.nativePtr);
   }

   private native void setIdkey(long var1, String var3);

   public synchronized void setIdkey(@Nullable String idkey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIdkey() on it, clone it first.");
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

      this.setIdkey(this.nativePtr, idkey);
   }

   private native String getInternationalPrefix(long var1);

   @Nullable
   public synchronized String getInternationalPrefix() {
      return this.getInternationalPrefix(this.nativePtr);
   }

   private native void setInternationalPrefix(long var1, String var3);

   public synchronized void setInternationalPrefix(@Nullable String prefix) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInternationalPrefix() on it, clone it first.");
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

      this.setInternationalPrefix(this.nativePtr, prefix);
   }

   private native boolean isPushNotificationAvailable(long var1);

   public synchronized boolean isPushNotificationAvailable() {
      return this.isPushNotificationAvailable(this.nativePtr);
   }

   private native String getLimeServerUrl(long var1);

   @Nullable
   public synchronized String getLimeServerUrl() {
      return this.getLimeServerUrl(this.nativePtr);
   }

   private native void setLimeServerUrl(long var1, String var3);

   public synchronized void setLimeServerUrl(@Nullable String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLimeServerUrl() on it, clone it first.");
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

      this.setLimeServerUrl(this.nativePtr, url);
   }

   private native NatPolicy getNatPolicy(long var1);

   @Nullable
   public synchronized NatPolicy getNatPolicy() {
      return this.getNatPolicy(this.nativePtr);
   }

   private native void setNatPolicy(long var1, NatPolicy var3);

   public synchronized void setNatPolicy(@Nullable NatPolicy policy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNatPolicy() on it, clone it first.");
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

      this.setNatPolicy(this.nativePtr, policy);
   }

   private native boolean isOutboundProxyEnabled(long var1);

   public synchronized boolean isOutboundProxyEnabled() {
      return this.isOutboundProxyEnabled(this.nativePtr);
   }

   private native void setOutboundProxyEnabled(long var1, boolean var3);

   public synchronized void setOutboundProxyEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOutboundProxyEnabled() on it, clone it first.");
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

      this.setOutboundProxyEnabled(this.nativePtr, enable);
   }

   private native int getPrivacy(long var1);

   public synchronized int getPrivacy() {
      return this.getPrivacy(this.nativePtr);
   }

   private native void setPrivacy(long var1, int var3);

   public synchronized void setPrivacy(int privacy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPrivacy() on it, clone it first.");
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

      this.setPrivacy(this.nativePtr, privacy);
   }

   private native boolean isPublishEnabled(long var1);

   public synchronized boolean isPublishEnabled() {
      return this.isPublishEnabled(this.nativePtr);
   }

   private native void setPublishEnabled(long var1, boolean var3);

   public synchronized void setPublishEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPublishEnabled() on it, clone it first.");
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

      this.setPublishEnabled(this.nativePtr, enable);
   }

   private native int getPublishExpires(long var1);

   public synchronized int getPublishExpires() {
      return this.getPublishExpires(this.nativePtr);
   }

   private native void setPublishExpires(long var1, int var3);

   public synchronized void setPublishExpires(int expires) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPublishExpires() on it, clone it first.");
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

      this.setPublishExpires(this.nativePtr, expires);
   }

   private native boolean getPushNotificationAllowed(long var1);

   public synchronized boolean getPushNotificationAllowed() {
      return this.getPushNotificationAllowed(this.nativePtr);
   }

   private native void setPushNotificationAllowed(long var1, boolean var3);

   public synchronized void setPushNotificationAllowed(boolean allow) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPushNotificationAllowed() on it, clone it first.");
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

      this.setPushNotificationAllowed(this.nativePtr, allow);
   }

   private native PushNotificationConfig getPushNotificationConfig(long var1);

   @NonNull
   public synchronized PushNotificationConfig getPushNotificationConfig() {
      return this.getPushNotificationConfig(this.nativePtr);
   }

   private native void setPushNotificationConfig(long var1, PushNotificationConfig var3);

   public synchronized void setPushNotificationConfig(@NonNull PushNotificationConfig config) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPushNotificationConfig() on it, clone it first.");
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

      this.setPushNotificationConfig(this.nativePtr, config);
   }

   private native String getQualityReportingCollector(long var1);

   @Nullable
   public synchronized String getQualityReportingCollector() {
      return this.getQualityReportingCollector(this.nativePtr);
   }

   private native void setQualityReportingCollector(long var1, String var3);

   public synchronized void setQualityReportingCollector(@Nullable String collector) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingCollector() on it, clone it first.");
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

      this.setQualityReportingCollector(this.nativePtr, collector);
   }

   private native boolean isQualityReportingEnabled(long var1);

   public synchronized boolean isQualityReportingEnabled() {
      return this.isQualityReportingEnabled(this.nativePtr);
   }

   private native void setQualityReportingEnabled(long var1, boolean var3);

   public synchronized void setQualityReportingEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingEnabled() on it, clone it first.");
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

      this.setQualityReportingEnabled(this.nativePtr, enable);
   }

   private native int getQualityReportingInterval(long var1);

   public synchronized int getQualityReportingInterval() {
      return this.getQualityReportingInterval(this.nativePtr);
   }

   private native void setQualityReportingInterval(long var1, int var3);

   public synchronized void setQualityReportingInterval(int interval) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setQualityReportingInterval() on it, clone it first.");
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

      this.setQualityReportingInterval(this.nativePtr, interval);
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

   private native String getRefKey(long var1);

   @Nullable
   public synchronized String getRefKey() {
      return this.getRefKey(this.nativePtr);
   }

   private native void setRefKey(long var1, String var3);

   public synchronized void setRefKey(@Nullable String refkey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRefKey() on it, clone it first.");
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

      this.setRefKey(this.nativePtr, refkey);
   }

   private native boolean isRegisterEnabled(long var1);

   public synchronized boolean isRegisterEnabled() {
      return this.isRegisterEnabled(this.nativePtr);
   }

   private native void setRegisterEnabled(long var1, boolean var3);

   public synchronized void setRegisterEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRegisterEnabled() on it, clone it first.");
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

      this.setRegisterEnabled(this.nativePtr, enable);
   }

   private native boolean getRemotePushNotificationAllowed(long var1);

   public synchronized boolean getRemotePushNotificationAllowed() {
      return this.getRemotePushNotificationAllowed(this.nativePtr);
   }

   private native void setRemotePushNotificationAllowed(long var1, boolean var3);

   public synchronized void setRemotePushNotificationAllowed(boolean allow) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRemotePushNotificationAllowed() on it, clone it first.");
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

      this.setRemotePushNotificationAllowed(this.nativePtr, allow);
   }

   private native Address[] getRoutesAddresses(long var1);

   @NonNull
   public synchronized Address[] getRoutesAddresses() {
      return this.getRoutesAddresses(this.nativePtr);
   }

   private native int setRoutesAddresses(long var1, Address[] var3);

   public synchronized int setRoutesAddresses(@Nullable Address[] routes) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRoutesAddresses() on it, clone it first.");
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

      return this.setRoutesAddresses(this.nativePtr, routes);
   }

   private native boolean isRtpBundleAssumptionEnabled(long var1);

   public synchronized boolean isRtpBundleAssumptionEnabled() {
      return this.isRtpBundleAssumptionEnabled(this.nativePtr);
   }

   private native void setRtpBundleAssumptionEnabled(long var1, boolean var3);

   public synchronized void setRtpBundleAssumptionEnabled(boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRtpBundleAssumptionEnabled() on it, clone it first.");
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

      this.setRtpBundleAssumptionEnabled(this.nativePtr, value);
   }

   private native boolean isRtpBundleEnabled(long var1);

   public synchronized boolean isRtpBundleEnabled() {
      return this.isRtpBundleEnabled(this.nativePtr);
   }

   private native void setRtpBundleEnabled(long var1, boolean var3);

   public synchronized void setRtpBundleEnabled(boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRtpBundleEnabled() on it, clone it first.");
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

      this.setRtpBundleEnabled(this.nativePtr, value);
   }

   private native String getServerAddr(long var1);

   @Nullable
   public synchronized String getServerAddr() {
      return this.getServerAddr(this.nativePtr);
   }

   private native int setServerAddr(long var1, String var3);

   public synchronized int setServerAddr(@Nullable String serverAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setServerAddr() on it, clone it first.");
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

      return this.setServerAddr(this.nativePtr, serverAddress);
   }

   private native Address getServerAddress(long var1);

   @Nullable
   public synchronized Address getServerAddress() {
      return this.getServerAddress(this.nativePtr);
   }

   private native int setServerAddress(long var1, Address var3);

   public synchronized int setServerAddress(@Nullable Address serverAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setServerAddress() on it, clone it first.");
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

      return this.setServerAddress(this.nativePtr, serverAddress);
   }

   private native int getTransport(long var1);

   public synchronized TransportType getTransport() {
      return TransportType.fromInt(this.getTransport(this.nativePtr));
   }

   private native void setTransport(long var1, int var3);

   public synchronized void setTransport(TransportType transport) {
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

      this.setTransport(this.nativePtr, transport.toInt());
   }

   private native boolean getUseInternationalPrefixForCallsAndChats(long var1);

   public synchronized boolean getUseInternationalPrefixForCallsAndChats() {
      return this.getUseInternationalPrefixForCallsAndChats(this.nativePtr);
   }

   private native void setUseInternationalPrefixForCallsAndChats(long var1, boolean var3);

   public synchronized void setUseInternationalPrefixForCallsAndChats(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUseInternationalPrefixForCallsAndChats() on it, clone it first.");
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

      this.setUseInternationalPrefixForCallsAndChats(this.nativePtr, enable);
   }

   private native void addCustomParam(long var1, String var3, String var4);

   public synchronized void addCustomParam(@NonNull String key, @NonNull String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomParam() on it, clone it first.");
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

      this.addCustomParam(this.nativePtr, key, value);
   }

   private native AccountParams clone(long var1);

   @NonNull
   public synchronized AccountParams clone() {
      return this.clone(this.nativePtr);
   }

   private native String getCustomParam(long var1, String var3);

   @NonNull
   public synchronized String getCustomParam(@NonNull String key) {
      return this.getCustomParam(this.nativePtr, key);
   }

   private native AccountParams newWithConfig(long var1, Core var3, int var4);

   @NonNull
   public synchronized AccountParams newWithConfig(@NonNull Core lc, int index) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithConfig() on it, clone it first.");
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

      return this.newWithConfig(this.nativePtr, lc, index);
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
