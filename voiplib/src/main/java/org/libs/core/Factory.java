package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class Factory {
   static Factory _Factory;

   public static final synchronized Factory instance() {
      try {
         if (_Factory == null) {
            _Factory = new FactoryImpl();
         }
      } catch (Exception var1) {
         System.err.println("Cannot instanciate factory");
      }

      return _Factory;
   }

   public abstract LoggingService getLoggingService();

   /** @deprecated */
   public abstract void setDebugMode(boolean var1, String var2);

   public abstract void setLoggerDomain(String var1);

   public abstract void enableLogcatLogs(boolean var1);

   public abstract Core getCore(long var1);

   public abstract void setCacheDir(@Nullable String var1);

   public abstract void setConfigDir(@Nullable String var1);

   public abstract void setDataDir(@Nullable String var1);

   @Nullable
   public abstract String getDataResourcesDir();

   public abstract void setDataResourcesDir(@Nullable String var1);

   @NonNull
   public abstract DialPlan[] getDialPlans();

   public abstract void setDownloadDir(@Nullable String var1);

   @Nullable
   public abstract String getImageResourcesDir();

   public abstract void setImageResourcesDir(@Nullable String var1);

   public abstract boolean isCacheDirSet();

   public abstract boolean isConfigDirSet();

   public abstract boolean isDataDirSet();

   public abstract boolean isDatabaseStorageAvailable();

   public abstract boolean isDownloadDirSet();

   public abstract boolean isImdnAvailable();

   public abstract boolean isQrcodeAvailable();

   public abstract void setLogCollectionPath(@Nullable String var1);

   @Nullable
   public abstract String getMspluginsDir();

   public abstract void setMspluginsDir(@Nullable String var1);

   @NonNull
   public abstract VideoDefinition[] getRecommendedVideoDefinitions();

   @Nullable
   public abstract String getRingResourcesDir();

   public abstract void setRingResourcesDir(@Nullable String var1);

   @Nullable
   public abstract String getSoundResourcesDir();

   public abstract void setSoundResourcesDir(@Nullable String var1);

   @NonNull
   public abstract VideoDefinition[] getSupportedVideoDefinitions();

   @Nullable
   public abstract String getTopResourcesDir();

   public abstract void setTopResourcesDir(@Nullable String var1);

   @Nullable
   public abstract String computeHa1ForAlgorithm(@NonNull String var1, @NonNull String var2, @NonNull String var3, @NonNull String var4);

   @Nullable
   public abstract Address createAddress(@NonNull String var1);

   @NonNull
   public abstract AuthInfo createAuthInfo(@NonNull String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5, @Nullable String var6);

   @NonNull
   public abstract AuthInfo createAuthInfo(@NonNull String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5, @Nullable String var6, @Nullable String var7);

   @NonNull
   public abstract Buffer createBuffer();

   @NonNull
   public abstract Buffer createBufferFromData(@NonNull byte[] var1, int var2);

   @NonNull
   public abstract Buffer createBufferFromString(@NonNull String var1);

   @NonNull
   public abstract ConferenceInfo createConferenceInfo();

   @Nullable
   public abstract ConferenceInfo createConferenceInfoFromIcalendarContent(@NonNull Content var1);

   @NonNull
   public abstract Config createConfig(@Nullable String var1);

   @NonNull
   public abstract Config createConfigFromString(@NonNull String var1);

   @NonNull
   public abstract Config createConfigWithFactory(@Nullable String var1, @Nullable String var2);

   @NonNull
   public abstract Content createContent();

   @NonNull
   public abstract Content createContentFromFile(@NonNull String var1);

   @NonNull
   public abstract Core createCore(@Nullable String var1, @Nullable String var2, @Nullable Object var3);

   @NonNull
   public abstract Core createCoreWithConfig(@NonNull Config var1, @Nullable Object var2);

   @NonNull
   public abstract DigestAuthenticationPolicy createDigestAuthenticationPolicy();

   @NonNull
   public abstract ErrorInfo createErrorInfo();

   @NonNull
   public abstract FriendPhoneNumber createFriendPhoneNumber(@NonNull String var1, @Nullable String var2);

   @NonNull
   public abstract ParticipantDeviceIdentity createParticipantDeviceIdentity(@NonNull Address var1, @Nullable String var2);

   @Nullable
   public abstract Content createQrcode(@NonNull String var1, int var2, int var3, int var4);

   @NonNull
   public abstract Range createRange();

   @NonNull
   public abstract Transports createTransports();

   @NonNull
   public abstract TunnelConfig createTunnelConfig();

   @NonNull
   public abstract Vcard createVcard();

   @NonNull
   public abstract VideoActivationPolicy createVideoActivationPolicy();

   @NonNull
   public abstract VideoDefinition createVideoDefinition(int var1, int var2);

   @NonNull
   public abstract VideoDefinition createVideoDefinitionFromName(@NonNull String var1);

   @NonNull
   public abstract VideoSourceDescriptor createVideoSourceDescriptor();

   public abstract void enableLogCollection(LogCollectionState var1);

   @Nullable
   public abstract String getCacheDir(@Nullable Object var1);

   @Nullable
   public abstract String getConfigDir(@Nullable Object var1);

   @Nullable
   public abstract String getDataDir(@Nullable Object var1);

   @Nullable
   public abstract String getDownloadDir(@Nullable Object var1);

   public abstract boolean isChatroomBackendAvailable(ChatRoomBackend var1);

   public abstract void setVfsEncryption(int var1, @Nullable byte[] var2, int var3);

   public abstract int writeQrcodeFile(@NonNull String var1, @NonNull String var2, int var3, int var4, int var5);

   public abstract void setUserData(Object var1);

   public abstract Object getUserData();

   public abstract long getNativePointer();
}
