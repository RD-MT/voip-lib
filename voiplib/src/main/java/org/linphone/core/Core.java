package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Core {
   org.linphone.mediastream.Factory getMediastreamerFactory();

   AccountCreatorBackend getAccountCreatorBackend();

   void setAccountCreatorBackend(AccountCreatorBackend var1);

   @Nullable
   String getAccountCreatorUrl();

   void setAccountCreatorUrl(@Nullable String var1);

   @NonNull
   Account[] getAccountList();

   @NonNull
   String getAdaptiveRateAlgorithm();

   void setAdaptiveRateAlgorithm(@NonNull String var1);

   boolean isAdaptiveRateControlEnabled();

   void setAdaptiveRateControlEnabled(boolean var1);

   boolean isAudioAdaptiveJittcompEnabled();

   void setAudioAdaptiveJittcompEnabled(boolean var1);

   @NonNull
   AudioDevice[] getAudioDevices();

   int getAudioDscp();

   void setAudioDscp(int var1);

   int getAudioJittcomp();

   void setAudioJittcomp(int var1);

   @Nullable
   String getAudioMulticastAddr();

   int setAudioMulticastAddr(@Nullable String var1);

   boolean isAudioMulticastEnabled();

   void setAudioMulticastEnabled(boolean var1);

   int getAudioMulticastTtl();

   int setAudioMulticastTtl(int var1);

   @NonNull
   PayloadType[] getAudioPayloadTypes();

   void setAudioPayloadTypes(@Nullable PayloadType[] var1);

   int getAudioPort();

   void setAudioPort(int var1);

   @NonNull
   Range getAudioPortsRange();

   @NonNull
   AuthInfo[] getAuthInfoList();

   boolean isAutoDownloadIcalendarsEnabled();

   void setAutoDownloadIcalendarsEnabled(boolean var1);

   boolean isAutoDownloadVoiceRecordingsEnabled();

   void setAutoDownloadVoiceRecordingsEnabled(boolean var1);

   int getAutoIterateBackgroundSchedule();

   void setAutoIterateBackgroundSchedule(int var1);

   boolean isAutoIterateEnabled();

   void setAutoIterateEnabled(boolean var1);

   int getAutoIterateForegroundSchedule();

   void setAutoIterateForegroundSchedule(int var1);

   boolean isAutoSendRingingEnabled();

   void setAutoSendRingingEnabled(boolean var1);

   boolean isAutomaticHttpProxyDetectionEnabled();

   void setAutomaticHttpProxyDetectionEnabled(boolean var1);

   AVPFMode getAvpfMode();

   void setAvpfMode(AVPFMode var1);

   int getAvpfRrInterval();

   void setAvpfRrInterval(int var1);

   @NonNull
   CallLog[] getCallLogs();

   /** @deprecated */
   @Deprecated
   @Nullable
   String getCallLogsDatabasePath();

   /** @deprecated */
   @Deprecated
   void setCallLogsDatabasePath(@Nullable String var1);

   boolean isCallToneIndicationsEnabled();

   void setCallToneIndicationsEnabled(boolean var1);

   boolean isCallkitEnabled();

   void setCallkitEnabled(boolean var1);

   @NonNull
   Call[] getCalls();

   int getCallsNb();

   int getCameraSensorRotation();

   boolean isCapabilityNegociationEnabled();

   void setCapabilityNegociationEnabled(boolean var1);

   boolean isCapabilityNegotiationReinviteEnabled();

   void setCapabilityNegotiationReinviteEnabled(boolean var1);

   @Nullable
   String getCaptureDevice();

   int setCaptureDevice(@Nullable String var1);

   boolean isChatEnabled();

   boolean getChatMessagesAggregationEnabled();

   void setChatMessagesAggregationEnabled(boolean var1);

   @NonNull
   ChatRoom[] getChatRooms();

   @Nullable
   Conference getConference();

   boolean isConferenceIcsInMessageBodyEnabled();

   void setConferenceIcsInMessageBodyEnabled(boolean var1);

   @NonNull
   ConferenceInfo[] getConferenceInformationList();

   float getConferenceLocalInputVolume();

   ConferenceParticipantListType getConferenceParticipantListType();

   void setConferenceParticipantListType(ConferenceParticipantListType var1);

   boolean isConferenceServerEnabled();

   void setConferenceServerEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   int getConferenceSize();

   @NonNull
   Config getConfig();

   ConsolidatedPresence getConsolidatedPresence();

   void setConsolidatedPresence(ConsolidatedPresence var1);

   @Nullable
   Call getCurrentCall();

   @Nullable
   Address getCurrentCallRemoteAddress();

   @NonNull
   VideoDefinition getCurrentPreviewVideoDefinition();

   @Nullable
   Account getDefaultAccount();

   void setDefaultAccount(@Nullable Account var1);

   ConferenceLayout getDefaultConferenceLayout();

   void setDefaultConferenceLayout(ConferenceLayout var1);

   long getDefaultEphemeralLifetime();

   void setDefaultEphemeralLifetime(long var1);

   @Nullable
   FriendList getDefaultFriendList();

   @Nullable
   AudioDevice getDefaultInputAudioDevice();

   void setDefaultInputAudioDevice(@Nullable AudioDevice var1);

   @Nullable
   AudioDevice getDefaultOutputAudioDevice();

   void setDefaultOutputAudioDevice(@Nullable AudioDevice var1);

   @Nullable
   ProxyConfig getDefaultProxyConfig();

   void setDefaultProxyConfig(@Nullable ProxyConfig var1);

   @NonNull
   String getDefaultVideoDisplayFilter();

   int getDelayedTimeout();

   void setDelayedTimeout(int var1);

   int getDeviceRotation();

   void setDeviceRotation(int var1);

   @NonNull
   DigestAuthenticationPolicy getDigestAuthenticationPolicy();

   void setDigestAuthenticationPolicy(@NonNull DigestAuthenticationPolicy var1);

   boolean getDisableRecordOnMute();

   void setDisableRecordOnMute(boolean var1);

   boolean isDnsSearchEnabled();

   void setDnsSearchEnabled(boolean var1);

   void setDnsServers(@Nullable String[] var1);

   void setDnsServersApp(@Nullable String[] var1);

   boolean getDnsSetByApp();

   boolean isDnsSrvEnabled();

   void setDnsSrvEnabled(boolean var1);

   int getDownloadBandwidth();

   void setDownloadBandwidth(int var1);

   int getDownloadPtime();

   void setDownloadPtime(int var1);

   int getEchoCancellationCalibration();

   boolean isEchoCancellationEnabled();

   void setEchoCancellationEnabled(boolean var1);

   @Nullable
   String getEchoCancellerFilterName();

   void setEchoCancellerFilterName(@Nullable String var1);

   boolean isEchoLimiterEnabled();

   void setEchoLimiterEnabled(boolean var1);

   void setEnableSipUpdate(int var1);

   void setExpectedBandwidth(int var1);

   @NonNull
   AudioDevice[] getExtendedAudioDevices();

   @Nullable
   String getFileTransferServer();

   void setFileTransferServer(@Nullable String var1);

   boolean isForcedIceRelayEnabled();

   void setForcedIceRelayEnabled(boolean var1);

   boolean isFriendListSubscriptionEnabled();

   void setFriendListSubscriptionEnabled(boolean var1);

   @Nullable
   String getFriendsDatabasePath();

   void setFriendsDatabasePath(@Nullable String var1);

   @NonNull
   FriendList[] getFriendsLists();

   @NonNull
   ConferenceInfo[] getFutureConferenceInformationList();

   boolean isGenericComfortNoiseEnabled();

   void setGenericComfortNoiseEnabled(boolean var1);

   @NonNull
   GlobalState getGlobalState();

   boolean getGuessHostname();

   void setGuessHostname(boolean var1);

   @Nullable
   String getHttpProxyHost();

   void setHttpProxyHost(@Nullable String var1);

   int getHttpProxyPort();

   void setHttpProxyPort(int var1);

   @NonNull
   String getIdentity();

   @Nullable
   ImNotifPolicy getImNotifPolicy();

   int getInCallTimeout();

   void setInCallTimeout(int var1);

   int getIncTimeout();

   void setIncTimeout(int var1);

   @Nullable
   AudioDevice getInputAudioDevice();

   void setInputAudioDevice(@Nullable AudioDevice var1);

   boolean isIpv6Enabled();

   void setIpv6Enabled(boolean var1);

   boolean isEchoCancellerCalibrationRequired();

   boolean isInBackground();

   /** @deprecated */
   @Deprecated
   boolean isInConference();

   boolean isIncomingInvitePending();

   boolean isMediaEncryptionMandatory();

   boolean isNetworkReachable();

   boolean isPushNotificationAvailable();

   boolean isSenderNameHiddenInForwardMessage();

   boolean isVerifyServerCertificates();

   boolean isVerifyServerCn();

   boolean isKeepAliveEnabled();

   void setKeepAliveEnabled(boolean var1);

   @Nullable
   CallLog getLastOutgoingCallLog();

   @NonNull
   Ldap[] getLdapList();

   boolean isLimeX3DhEnabled();

   void setLimeX3DhEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getLimeX3DhServerUrl();

   /** @deprecated */
   @Deprecated
   void setLimeX3DhServerUrl(@Nullable String var1);

   @NonNull
   String[] getLinphoneSpecsList();

   void setLinphoneSpecsList(@Nullable String[] var1);

   boolean isLocalPermissionEnabled();

   @Nullable
   String getLogCollectionUploadServerUrl();

   void setLogCollectionUploadServerUrl(@Nullable String var1);

   int getMaxCalls();

   void setMaxCalls(int var1);

   int getMaxSizeForAutoDownloadIncomingFiles();

   void setMaxSizeForAutoDownloadIncomingFiles(int var1);

   @Nullable
   String getMediaDevice();

   int setMediaDevice(@Nullable String var1);

   MediaEncryption getMediaEncryption();

   int setMediaEncryption(MediaEncryption var1);

   void setMediaEncryptionMandatory(boolean var1);

   void setMediaNetworkReachable(boolean var1);

   MediaResourceMode getMediaResourceMode();

   void setMediaResourceMode(MediaResourceMode var1);

   boolean isMicEnabled();

   void setMicEnabled(boolean var1);

   float getMicGainDb();

   void setMicGainDb(float var1);

   int getMissedCallsCount();

   int getMtu();

   void setMtu(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getNatAddress();

   /** @deprecated */
   @Deprecated
   void setNatAddress(@Nullable String var1);

   @Nullable
   NatPolicy getNatPolicy();

   void setNatPolicy(@Nullable NatPolicy var1);

   @Nullable
   Object getNativePreviewWindowId();

   void setNativePreviewWindowId(@Nullable Object var1);

   boolean isNativeRingingEnabled();

   void setNativeRingingEnabled(boolean var1);

   @Nullable
   Object getNativeVideoWindowId();

   void setNativeVideoWindowId(@Nullable Object var1);

   void setNetworkReachable(boolean var1);

   int getNortpTimeout();

   void setNortpTimeout(int var1);

   @Nullable
   AudioDevice getOutputAudioDevice();

   void setOutputAudioDevice(@Nullable AudioDevice var1);

   @Nullable
   String getPlayFile();

   void setPlayFile(@Nullable String var1);

   @Nullable
   String getPlaybackDevice();

   int setPlaybackDevice(@Nullable String var1);

   float getPlaybackGainDb();

   void setPlaybackGainDb(float var1);

   float getPreferredFramerate();

   void setPreferredFramerate(float var1);

   @NonNull
   VideoDefinition getPreferredVideoDefinition();

   void setPreferredVideoDefinition(@NonNull VideoDefinition var1);

   void setPreferredVideoDefinitionByName(@NonNull String var1);

   @Nullable
   PresenceModel getPresenceModel();

   void setPresenceModel(@Nullable PresenceModel var1);

   @Nullable
   VideoDefinition getPreviewVideoDefinition();

   void setPreviewVideoDefinition(@Nullable VideoDefinition var1);

   void setPreviewVideoDefinitionByName(@NonNull String var1);

   @NonNull
   String getPrimaryContact();

   int setPrimaryContact(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   Address getPrimaryContactParsed();

   @Nullable
   String getProvisioningUri();

   int setProvisioningUri(@Nullable String var1);

   @NonNull
   ProxyConfig[] getProxyConfigList();

   int getPushIncomingCallTimeout();

   void setPushIncomingCallTimeout(int var1);

   @Nullable
   PushNotificationConfig getPushNotificationConfig();

   boolean isPushNotificationEnabled();

   void setPushNotificationEnabled(boolean var1);

   boolean isQrcodeVideoPreviewEnabled();

   void setQrcodeVideoPreviewEnabled(boolean var1);

   boolean isRealtimeTextEnabled();

   boolean isRecordAwareEnabled();

   void setRecordAwareEnabled(boolean var1);

   @Nullable
   String getRecordFile();

   void setRecordFile(@Nullable String var1);

   @Nullable
   String getRemoteRingbackTone();

   void setRemoteRingbackTone(@Nullable String var1);

   boolean isRetransmissionOnNackEnabled();

   void setRetransmissionOnNackEnabled(boolean var1);

   @Nullable
   String getRing();

   void setRing(@Nullable String var1);

   boolean getRingDuringIncomingEarlyMedia();

   void setRingDuringIncomingEarlyMedia(boolean var1);

   @Nullable
   String getRingback();

   void setRingback(@Nullable String var1);

   @Nullable
   String getRingerDevice();

   int setRingerDevice(@Nullable String var1);

   @Nullable
   String getRootCa();

   void setRootCa(@Nullable String var1);

   void setRootCaData(@Nullable String var1);

   boolean isRtpBundleEnabled();

   void setRtpBundleEnabled(boolean var1);

   boolean isSdp200AckEnabled();

   void setSdp200AckEnabled(boolean var1);

   boolean isSelfViewEnabled();

   void setSelfViewEnabled(boolean var1);

   void setSenderNameHiddenInForwardMessageEnabled(boolean var1);

   boolean isSessionExpiresEnabled();

   void setSessionExpiresEnabled(boolean var1);

   int getSessionExpiresMinValue();

   void setSessionExpiresMinValue(int var1);

   SessionExpiresRefresher getSessionExpiresRefresherValue();

   void setSessionExpiresRefresherValue(SessionExpiresRefresher var1);

   int getSessionExpiresValue();

   void setSessionExpiresValue(int var1);

   int getSipDscp();

   void setSipDscp(int var1);

   void setSipNetworkReachable(boolean var1);

   int getSipTransportTimeout();

   void setSipTransportTimeout(int var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   String[] getSoundDevicesList();

   @NonNull
   String getSrtpCryptoSuites();

   void setSrtpCryptoSuites(@NonNull String var1);

   @Nullable
   String getStaticPicture();

   int setStaticPicture(@Nullable String var1);

   float getStaticPictureFps();

   int setStaticPictureFps(float var1);

   @Nullable
   String getStunServer();

   void setStunServer(@Nullable String var1);

   @NonNull
   String[] getSupportedFileFormatsList();

   void setSupportedTag(String var1);

   SupportLevel getTag100RelSupportLevel();

   void setTag100RelSupportLevel(SupportLevel var1);

   void setTcapLineMergingEnabled(boolean var1);

   boolean isTcapLinesMergingEnabled();

   @NonNull
   PayloadType[] getTextPayloadTypes();

   void setTextPayloadTypes(@Nullable PayloadType[] var1);

   int getTextPort();

   void setTextPort(int var1);

   @NonNull
   Range getTextPortsRange();

   @Nullable
   String getTlsCert();

   void setTlsCert(@Nullable String var1);

   @Nullable
   String getTlsCertPath();

   void setTlsCertPath(@Nullable String var1);

   @Nullable
   String getTlsKey();

   void setTlsKey(@Nullable String var1);

   @Nullable
   String getTlsKeyPath();

   void setTlsKeyPath(@Nullable String var1);

   @NonNull
   Transports getTransports();

   int setTransports(@NonNull Transports var1);

   @NonNull
   Transports getTransportsUsed();

   @Nullable
   Tunnel getTunnel();

   int getUnreadChatMessageCount();

   int getUnreadChatMessageCountFromActiveLocals();

   int getUploadBandwidth();

   void setUploadBandwidth(int var1);

   int getUploadPtime();

   void setUploadPtime(int var1);

   @Nullable
   String getUpnpExternalIpaddress();

   UpnpState getUpnpState();

   boolean getUseFiles();

   void setUseFiles(boolean var1);

   boolean getUseInfoForDtmf();

   void setUseInfoForDtmf(boolean var1);

   boolean getUseRfc2833ForDtmf();

   void setUseRfc2833ForDtmf(boolean var1);

   @NonNull
   String getUserAgent();

   @Nullable
   String getUserCertificatesPath();

   void setUserCertificatesPath(@Nullable String var1);

   boolean isVibrationOnIncomingCallEnabled();

   void setVibrationOnIncomingCallEnabled(boolean var1);

   @NonNull
   VideoActivationPolicy getVideoActivationPolicy();

   void setVideoActivationPolicy(@NonNull VideoActivationPolicy var1);

   boolean isVideoAdaptiveJittcompEnabled();

   void setVideoAdaptiveJittcompEnabled(boolean var1);

   boolean isVideoCaptureEnabled();

   void setVideoCaptureEnabled(boolean var1);

   @Nullable
   String getVideoDevice();

   int setVideoDevice(@Nullable String var1);

   @NonNull
   String[] getVideoDevicesList();

   boolean isVideoDisplayEnabled();

   void setVideoDisplayEnabled(boolean var1);

   @Nullable
   String getVideoDisplayFilter();

   void setVideoDisplayFilter(@Nullable String var1);

   int getVideoDscp();

   void setVideoDscp(int var1);

   boolean isVideoEnabled();

   int getVideoJittcomp();

   void setVideoJittcomp(int var1);

   @Nullable
   String getVideoMulticastAddr();

   int setVideoMulticastAddr(@Nullable String var1);

   boolean isVideoMulticastEnabled();

   void setVideoMulticastEnabled(boolean var1);

   int getVideoMulticastTtl();

   int setVideoMulticastTtl(int var1);

   @NonNull
   PayloadType[] getVideoPayloadTypes();

   void setVideoPayloadTypes(@Nullable PayloadType[] var1);

   int getVideoPort();

   void setVideoPort(int var1);

   @NonNull
   Range getVideoPortsRange();

   @Nullable
   String getVideoPreset();

   void setVideoPreset(@Nullable String var1);

   boolean isVideoPreviewEnabled();

   void setVideoPreviewEnabled(boolean var1);

   void setVideoSourceReuseEnabled(boolean var1);

   boolean isWifiOnlyEnabled();

   void setWifiOnlyEnabled(boolean var1);

   boolean isZeroRtpPortForStreamInactiveEnabled();

   void setZeroRtpPortForStreamInactiveEnabled(boolean var1);

   @NonNull
   ZrtpKeyAgreement[] getZrtpAvailableKeyAgreementList();

   boolean isZrtpGoClearEnabled();

   void setZrtpGoClearEnabled(boolean var1);

   @NonNull
   ZrtpKeyAgreement[] getZrtpKeyAgreementList();

   void setZrtpKeyAgreementSuites(@Nullable ZrtpKeyAgreement[] var1);

   @Nullable
   String getZrtpSecretsFile();

   void setZrtpSecretsFile(@Nullable String var1);

   void activateAudioSession(boolean var1);

   int addAccount(@NonNull Account var1);

   int addAllToConference();

   void addAuthInfo(@NonNull AuthInfo var1);

   void addContentTypeSupport(@NonNull String var1);

   void addFriendList(@NonNull FriendList var1);

   void addLdap(@NonNull Ldap var1);

   void addLinphoneSpec(@NonNull String var1);

   int addProxyConfig(@NonNull ProxyConfig var1);

   void addSupportedTag(@NonNull String var1);

   int addToConference(@NonNull Call var1);

   /** @deprecated */
   @Deprecated
   void audioRouteChanged();

   ChatRoomEphemeralMode chatRoomGetDefaultEphemeralMode();

   void chatRoomSetDefaultEphemeralMode(ChatRoomEphemeralMode var1);

   void checkForUpdate(@NonNull String var1);

   void clearAccounts();

   void clearAllAuthInfo();

   void clearCallLogs();

   void clearLdaps();

   void clearProxyConfig();

   int configSync();

   void configureAudioSession();

   @NonNull
   Account createAccount(@NonNull AccountParams var1);

   @NonNull
   AccountCreator createAccountCreator(@Nullable String var1);

   @NonNull
   AccountParams createAccountParams();

   @Nullable
   Address createAddress(@Nullable String var1);

   @NonNull
   CallLog createCallLog(@NonNull Address var1, @NonNull Address var2, Call.Dir var3, int var4, long var5, long var7, Call.Status var9, boolean var10, float var11);

   @Nullable
   CallParams createCallParams(@Nullable Call var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createChatRoom(@NonNull String var1, @NonNull Address[] var2);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createChatRoom(@NonNull ChatRoomParams var1, String var2, @NonNull Address[] var3);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createChatRoom(@NonNull Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createChatRoom(@NonNull ChatRoomParams var1, @NonNull Address var2, @NonNull Address var3);

   @Nullable
   ChatRoom createChatRoom(@NonNull ChatRoomParams var1, @Nullable Address var2, @NonNull Address[] var3);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createChatRoom(@NonNull ChatRoomParams var1, @NonNull Address var2, @NonNull String var3, @NonNull Address[] var4);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createClientGroupChatRoom(@NonNull String var1, boolean var2);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom createClientGroupChatRoom(@NonNull String var1, boolean var2, boolean var3);

   @NonNull
   ConferenceParams createConferenceParams(@Nullable Conference var1);

   @NonNull
   ConferenceScheduler createConferenceScheduler();

   @Nullable
   Conference createConferenceWithParams(@NonNull ConferenceParams var1);

   @NonNull
   Config createConfig(@Nullable String var1);

   @NonNull
   Content createContent();

   @NonNull
   ChatRoomParams createDefaultChatRoomParams();

   @NonNull
   Friend createFriend();

   @NonNull
   FriendList createFriendList();

   @Nullable
   Friend createFriendWithAddress(@NonNull String var1);

   @NonNull
   InfoMessage createInfoMessage();

   @NonNull
   Ldap createLdap();

   @NonNull
   LdapParams createLdapParams();

   @NonNull
   Ldap createLdapWithParams(@NonNull LdapParams var1);

   @Nullable
   Player createLocalPlayer(@Nullable String var1, @Nullable String var2, @Nullable Object var3);

   @NonNull
   MagicSearch createMagicSearch();

   @NonNull
   NatPolicy createNatPolicy();

   @Nullable
   Object createNativePreviewWindowId();

   @Nullable
   Object createNativeVideoWindowId();

   @NonNull
   Event createNotify(@NonNull Address var1, @NonNull String var2);

   @NonNull
   Event createOneShotPublish(@NonNull Address var1, @NonNull String var2);

   @NonNull
   PresenceActivity createPresenceActivity(PresenceActivity.Type var1, @Nullable String var2);

   @NonNull
   PresenceModel createPresenceModel();

   @NonNull
   PresenceModel createPresenceModelWithActivity(PresenceActivity.Type var1, @Nullable String var2);

   @NonNull
   PresenceModel createPresenceModelWithActivityAndNote(PresenceActivity.Type var1, @Nullable String var2, @NonNull String var3, @Nullable String var4);

   @NonNull
   PresenceNote createPresenceNote(@NonNull String var1, @Nullable String var2);

   @NonNull
   PresencePerson createPresencePerson(@NonNull String var1);

   @NonNull
   PresenceService createPresenceService(@NonNull String var1, PresenceBasicStatus var2, @NonNull String var3);

   @Nullable
   Address createPrimaryContactParsed();

   @NonNull
   ProxyConfig createProxyConfig();

   @NonNull
   Event createPublish(@NonNull Address var1, @NonNull String var2, int var3);

   @NonNull
   Recorder createRecorder(@NonNull RecorderParams var1);

   @NonNull
   RecorderParams createRecorderParams();

   @NonNull
   Event createSubscribe(@NonNull Address var1, @NonNull ProxyConfig var2, @NonNull String var3, int var4);

   @NonNull
   Event createSubscribe(@NonNull Address var1, @NonNull String var2, int var3);

   @NonNull
   XmlRpcSession createXmlRpcSession(@NonNull String var1);

   void deleteChatRoom(@NonNull ChatRoom var1);

   void deleteConferenceInformation(@NonNull ConferenceInfo var1);

   void didRegisterForRemotePush(@Nullable Object var1);

   void didRegisterForRemotePushWithStringifiedToken(@Nullable String var1);

   void disableChat(Reason var1);

   void enableChat();

   /** @deprecated */
   @Deprecated
   void enableLime(LimeState var1);

   /** @deprecated */
   @Deprecated
   void ensureRegistered();

   void enterBackground();

   /** @deprecated */
   @Deprecated
   int enterConference();

   void enterForeground();

   boolean fileFormatSupported(@NonNull String var1);

   @Nullable
   AuthInfo findAuthInfo(@Nullable String var1, @NonNull String var2, @Nullable String var3);

   /** @deprecated */
   @Deprecated
   @Nullable
   Call findCallFromUri(@NonNull String var1);

   @Nullable
   CallLog findCallLog(@NonNull String var1, @NonNull int var2);

   @Nullable
   CallLog findCallLogFromCallId(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom findChatRoom(@NonNull Address var1, @NonNull Address var2);

   @Nullable
   ConferenceInfo findConferenceInformationFromUri(@NonNull Address var1);

   @NonNull
   Address[] findContactsByChar(@NonNull String var1, boolean var2);

   @Nullable
   Friend findFriend(@NonNull Address var1);

   @Nullable
   Friend findFriendByPhoneNumber(@NonNull String var1);

   @NonNull
   Friend[] findFriends(@NonNull Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom findOneToOneChatRoom(@NonNull Address var1, @NonNull Address var2, boolean var3);

   @Nullable
   Account getAccountByIdkey(@Nullable String var1);

   @Nullable
   Call getCallByCallid(String var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   Call getCallByRemoteAddress(@NonNull String var1);

   @Nullable
   Call getCallByRemoteAddress2(@NonNull Address var1);

   @NonNull
   CallLog[] getCallHistory(@NonNull Address var1, @NonNull Address var2);

   /** @deprecated */
   @Deprecated
   @NonNull
   CallLog[] getCallHistoryForAddress(@NonNull Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom getChatRoom(@NonNull Address var1, @NonNull Address var2);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom getChatRoom(@NonNull Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ChatRoom getChatRoomFromUri(@NonNull String var1);

   @NonNull
   ConferenceInfo[] getConferenceInformationListAfterTime(long var1);

   @Nullable
   Friend getFriendByRefKey(@NonNull String var1);

   @Nullable
   FriendList getFriendListByName(@NonNull String var1);

   @Nullable
   PayloadType getPayloadType(@NonNull String var1, int var2, int var3);

   @Nullable
   ProxyConfig getProxyConfigByIdkey(String var1);

   int getUnreadChatMessageCountFromLocal(@NonNull Address var1);

   ZrtpPeerStatus getZrtpStatus(@NonNull String var1);

   boolean hasBuiltinEchoCanceller();

   boolean hasCrappyOpengl();

   boolean inCall();

   /** @deprecated */
   @Deprecated
   @Nullable
   Address interpretUrl(@NonNull String var1);

   @Nullable
   Address interpretUrl(@NonNull String var1, boolean var2);

   @Nullable
   Call invite(@NonNull String var1);

   @Nullable
   Call inviteAddress(@NonNull Address var1);

   @Nullable
   Call inviteAddressWithParams(@NonNull Address var1, @NonNull CallParams var2, @Nullable String var3, @Nullable Content var4);

   @Nullable
   Call inviteAddressWithParams(@NonNull Address var1, @NonNull CallParams var2);

   @Nullable
   Call inviteWithParams(@NonNull String var1, @NonNull CallParams var2);

   boolean isContentTypeSupported(@NonNull String var1);

   boolean isMediaEncryptionSupported(MediaEncryption var1);

   boolean isMediaFilterSupported(@NonNull String var1);

   void iterate();

   boolean ldapAvailable();

   /** @deprecated */
   @Deprecated
   int leaveConference();

   /** @deprecated */
   @Deprecated
   boolean limeAvailable();

   /** @deprecated */
   @Deprecated
   LimeState limeEnabled();

   boolean limeX3DhAvailable();

   void loadConfigFromXml(@NonNull String var1);

   boolean mediaEncryptionSupported(MediaEncryption var1);

   void migrateLogsFromRcToDb();

   int migrateToMultiTransport();

   void notifyAllFriends(@NonNull PresenceModel var1);

   void notifyNotifyPresenceReceived(@NonNull Friend var1);

   void notifyNotifyPresenceReceivedForUriOrTel(@NonNull Friend var1, @NonNull String var2, @NonNull PresenceModel var3);

   int pauseAllCalls();

   void playDtmf(char var1, int var2);

   int playLocal(@NonNull String var1);

   int preemptSoundResources();

   void previewOglRender();

   void processPushNotification(@Nullable String var1);

   @Nullable
   Event publish(@NonNull Address var1, @NonNull String var2, int var3, @NonNull Content var4);

   int realtimeTextGetKeepaliveInterval();

   void realtimeTextSetKeepaliveInterval(int var1);

   void refreshRegisters();

   void rejectSubscriber(@NonNull Friend var1);

   void reloadMsPlugins(@Nullable String var1);

   void reloadSoundDevices();

   void reloadVideoDevices();

   void removeAccount(@NonNull Account var1);

   void removeAuthInfo(@NonNull AuthInfo var1);

   void removeCallLog(@NonNull CallLog var1);

   void removeContentTypeSupport(@NonNull String var1);

   void removeFriendList(@NonNull FriendList var1);

   int removeFromConference(@NonNull Call var1);

   void removeLdap(@NonNull Ldap var1);

   void removeLinphoneSpec(@NonNull String var1);

   void removeProxyConfig(@NonNull ProxyConfig var1);

   void removeSupportedTag(@NonNull String var1);

   void resetEchoCancellationCalibration();

   void resetMissedCallsCount();

   @Nullable
   ChatRoom searchChatRoom(@Nullable ChatRoomParams var1, @Nullable Address var2, @Nullable Address var3, @Nullable Address[] var4);

   @Nullable
   Conference searchConference(@NonNull Address var1);

   @Nullable
   Conference searchConference(@Nullable ConferenceParams var1, @Nullable Address var2, @Nullable Address var3, @Nullable Address[] var4);

   void setAudioPortRange(int var1, int var2);

   void setQrcodeDecodeRect(int var1, int var2, int var3, int var4);

   void setTextPortRange(int var1, int var2);

   void setTone(ToneID var1, @Nullable String var2);

   void setUserAgent(@Nullable String var1, @Nullable String var2);

   void setVideoPortRange(int var1, int var2);

   /** @deprecated */
   @Deprecated
   boolean soundDeviceCanCapture(@NonNull String var1);

   /** @deprecated */
   @Deprecated
   boolean soundDeviceCanPlayback(@NonNull String var1);

   boolean soundResourcesLocked();

   int start();

   /** @deprecated */
   @Deprecated
   int startConferenceRecording(@NonNull String var1);

   int startEchoCancellerCalibration();

   int startEchoTester(int var1);

   void stop();

   void stopAsync();

   /** @deprecated */
   @Deprecated
   int stopConferenceRecording();

   void stopDtmf();

   int stopEchoTester();

   void stopRinging();

   @NonNull
   Event subscribe(@NonNull Address var1, @NonNull String var2, int var3, @Nullable Content var4);

   int takePreviewSnapshot(@NonNull String var1);

   int terminateAllCalls();

   int terminateConference();

   void uploadLogCollection();

   void usePreviewWindow(boolean var1);

   void verifyServerCertificates(boolean var1);

   void verifyServerCn(boolean var1);

   boolean videoSupported();

   @NonNull
   String compressLogCollection();

   void enableLogCollection(LogCollectionState var1);

   @NonNull
   int getLogCollectionMaxFileSize();

   @NonNull
   String getLogCollectionPath();

   @NonNull
   String getLogCollectionPrefix();

   boolean getPostQuantumAvailable();

   @NonNull
   String getVersion();

   LogCollectionState logCollectionEnabled();

   void resetLogCollection();

   void serializeLogs();

   void setLogCollectionMaxFileSize(int var1);

   void setLogCollectionPath(@NonNull String var1);

   void setLogCollectionPrefix(@NonNull String var1);

   boolean tunnelAvailable();

   boolean upnpAvailable();

   boolean vcardSupported();

   void addListener(CoreListener var1);

   void removeListener(CoreListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum LogCollectionUploadState {
      InProgress(0),
      Delivered(1),
      NotDelivered(2);

      protected final int mValue;

      private LogCollectionUploadState(int value) {
         this.mValue = value;
      }

      public static Core.LogCollectionUploadState fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return InProgress;
         case 1:
            return Delivered;
         case 2:
            return NotDelivered;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for LogCollectionUploadState");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}
