package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/** @deprecated */
public interface ProxyConfig {
   /** @deprecated */
   @Deprecated
   boolean isAvpfEnabled();

   /** @deprecated */
   @Deprecated
   AVPFMode getAvpfMode();

   /** @deprecated */
   @Deprecated
   void setAvpfMode(AVPFMode var1);

   /** @deprecated */
   @Deprecated
   int getAvpfRrInterval();

   /** @deprecated */
   @Deprecated
   void setAvpfRrInterval(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getConferenceFactoryUri();

   /** @deprecated */
   @Deprecated
   void setConferenceFactoryUri(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   Address getContact();

   /** @deprecated */
   @Deprecated
   @Nullable
   String getContactParameters();

   /** @deprecated */
   @Deprecated
   void setContactParameters(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getContactUriParameters();

   /** @deprecated */
   @Deprecated
   void setContactUriParameters(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   Core getCore();

   /** @deprecated */
   @Deprecated
   @Nullable
   ProxyConfig getDependency();

   /** @deprecated */
   @Deprecated
   void setDependency(@Nullable ProxyConfig var1);

   /** @deprecated */
   @Deprecated
   boolean getDialEscapePlus();

   /** @deprecated */
   @Deprecated
   void setDialEscapePlus(boolean var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getDialPrefix();

   /** @deprecated */
   @Deprecated
   void setDialPrefix(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getDomain();

   /** @deprecated */
   @Deprecated
   Reason getError();

   /** @deprecated */
   @Deprecated
   @NonNull
   ErrorInfo getErrorInfo();

   /** @deprecated */
   @Deprecated
   int getExpires();

   /** @deprecated */
   @Deprecated
   void setExpires(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   Address getIdentityAddress();

   /** @deprecated */
   @Deprecated
   int setIdentityAddress(@Nullable Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getIdkey();

   /** @deprecated */
   @Deprecated
   void setIdkey(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   boolean isPushNotificationAllowed();

   /** @deprecated */
   @Deprecated
   boolean isPushNotificationAvailable();

   /** @deprecated */
   @Deprecated
   boolean isRemotePushNotificationAllowed();

   /** @deprecated */
   @Deprecated
   @Nullable
   NatPolicy getNatPolicy();

   /** @deprecated */
   @Deprecated
   void setNatPolicy(@Nullable NatPolicy var1);

   /** @deprecated */
   @Deprecated
   int getPrivacy();

   /** @deprecated */
   @Deprecated
   void setPrivacy(int var1);

   /** @deprecated */
   @Deprecated
   boolean isPublishEnabled();

   /** @deprecated */
   @Deprecated
   void setPublishEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   int getPublishExpires();

   /** @deprecated */
   @Deprecated
   void setPublishExpires(int var1);

   /** @deprecated */
   @Deprecated
   void setPushNotificationAllowed(boolean var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   PushNotificationConfig getPushNotificationConfig();

   /** @deprecated */
   @Deprecated
   void setPushNotificationConfig(@NonNull PushNotificationConfig var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getQualityReportingCollector();

   /** @deprecated */
   @Deprecated
   void setQualityReportingCollector(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   boolean isQualityReportingEnabled();

   /** @deprecated */
   @Deprecated
   void setQualityReportingEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   int getQualityReportingInterval();

   /** @deprecated */
   @Deprecated
   void setQualityReportingInterval(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getRealm();

   /** @deprecated */
   @Deprecated
   void setRealm(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getRefKey();

   /** @deprecated */
   @Deprecated
   void setRefKey(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   boolean isRegisterEnabled();

   /** @deprecated */
   @Deprecated
   void setRegisterEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   void setRemotePushNotificationAllowed(boolean var1);

   /** @deprecated */
   @Deprecated
   int setRoute(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   String[] getRoutes();

   /** @deprecated */
   @Deprecated
   int setRoutes(@Nullable String[] var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getServerAddr();

   /** @deprecated */
   @Deprecated
   int setServerAddr(@Nullable String var1);

   /** @deprecated */
   @Deprecated
   RegistrationState getState();

   /** @deprecated */
   @Deprecated
   @NonNull
   String getTransport();

   /** @deprecated */
   @Deprecated
   int getUnreadChatMessageCount();

   /** @deprecated */
   @Deprecated
   int done();

   /** @deprecated */
   @Deprecated
   void edit();

   /** @deprecated */
   @Deprecated
   @Nullable
   AuthInfo findAuthInfo();

   /** @deprecated */
   @Deprecated
   @Nullable
   String getCustomHeader(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String normalizePhoneNumber(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   Address normalizeSipUri(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   void pauseRegister();

   /** @deprecated */
   @Deprecated
   void refreshRegister();

   /** @deprecated */
   @Deprecated
   void setCustomHeader(@NonNull String var1, @Nullable String var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
