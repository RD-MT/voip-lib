package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AccountParams {
   @Nullable
   Address getAudioVideoConferenceFactoryAddress();

   void setAudioVideoConferenceFactoryAddress(@Nullable Address var1);

   AVPFMode getAvpfMode();

   void setAvpfMode(AVPFMode var1);

   int getAvpfRrInterval();

   void setAvpfRrInterval(int var1);

   @Nullable
   String getConferenceFactoryUri();

   void setConferenceFactoryUri(@Nullable String var1);

   @Nullable
   String getContactParameters();

   void setContactParameters(@Nullable String var1);

   @Nullable
   String getContactUriParameters();

   void setContactUriParameters(@Nullable String var1);

   boolean isCpimInBasicChatRoomEnabled();

   void setCpimInBasicChatRoomEnabled(boolean var1);

   @Nullable
   Address getCustomContact();

   void setCustomContact(@Nullable Address var1);

   boolean isDialEscapePlusEnabled();

   void setDialEscapePlusEnabled(boolean var1);

   @Nullable
   String getDomain();

   int getExpires();

   void setExpires(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getIdentity();

   @Nullable
   Address getIdentityAddress();

   int setIdentityAddress(@Nullable Address var1);

   @Nullable
   String getIdkey();

   void setIdkey(@Nullable String var1);

   @Nullable
   String getInternationalPrefix();

   void setInternationalPrefix(@Nullable String var1);

   boolean isPushNotificationAvailable();

   @Nullable
   String getLimeServerUrl();

   void setLimeServerUrl(@Nullable String var1);

   @Nullable
   NatPolicy getNatPolicy();

   void setNatPolicy(@Nullable NatPolicy var1);

   boolean isOutboundProxyEnabled();

   void setOutboundProxyEnabled(boolean var1);

   int getPrivacy();

   void setPrivacy(int var1);

   boolean isPublishEnabled();

   void setPublishEnabled(boolean var1);

   int getPublishExpires();

   void setPublishExpires(int var1);

   boolean getPushNotificationAllowed();

   void setPushNotificationAllowed(boolean var1);

   @NonNull
   PushNotificationConfig getPushNotificationConfig();

   void setPushNotificationConfig(@NonNull PushNotificationConfig var1);

   @Nullable
   String getQualityReportingCollector();

   void setQualityReportingCollector(@Nullable String var1);

   boolean isQualityReportingEnabled();

   void setQualityReportingEnabled(boolean var1);

   int getQualityReportingInterval();

   void setQualityReportingInterval(int var1);

   @Nullable
   String getRealm();

   void setRealm(@Nullable String var1);

   @Nullable
   String getRefKey();

   void setRefKey(@Nullable String var1);

   boolean isRegisterEnabled();

   void setRegisterEnabled(boolean var1);

   boolean getRemotePushNotificationAllowed();

   void setRemotePushNotificationAllowed(boolean var1);

   @NonNull
   Address[] getRoutesAddresses();

   int setRoutesAddresses(@Nullable Address[] var1);

   boolean isRtpBundleAssumptionEnabled();

   void setRtpBundleAssumptionEnabled(boolean var1);

   boolean isRtpBundleEnabled();

   void setRtpBundleEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getServerAddr();

   /** @deprecated */
   @Deprecated
   int setServerAddr(@Nullable String var1);

   @Nullable
   Address getServerAddress();

   int setServerAddress(@Nullable Address var1);

   TransportType getTransport();

   void setTransport(TransportType var1);

   boolean getUseInternationalPrefixForCallsAndChats();

   void setUseInternationalPrefixForCallsAndChats(boolean var1);

   void addCustomParam(@NonNull String var1, @NonNull String var2);

   @NonNull
   AccountParams clone();

   @NonNull
   String getCustomParam(@NonNull String var1);

   @NonNull
   AccountParams newWithConfig(@NonNull Core var1, int var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
