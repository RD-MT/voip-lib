package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CoreListenerStub implements CoreListener {
   public void onCallStatsUpdated(@NonNull Core core, @NonNull Call call, @NonNull CallStats callStats) {
   }

   public void onQrcodeFound(@NonNull Core core, @Nullable String result) {
   }

   public void onBuddyInfoUpdated(@NonNull Core core, @NonNull Friend linphoneFriend) {
   }

   public void onNotifyPresenceReceived(@NonNull Core core, @NonNull Friend linphoneFriend) {
   }

   public void onLogCollectionUploadProgressIndication(@NonNull Core core, int offset, int total) {
   }

   public void onIsComposingReceived(@NonNull Core core, @NonNull ChatRoom chatRoom) {
   }

   public void onGlobalStateChanged(@NonNull Core core, GlobalState state, @NonNull String message) {
   }

   public void onAudioDeviceChanged(@NonNull Core core, @NonNull AudioDevice audioDevice) {
   }

   public void onCallLogUpdated(@NonNull Core core, @NonNull CallLog callLog) {
   }

   public void onDtmfReceived(@NonNull Core core, @NonNull Call call, int dtmf) {
   }

   public void onCallReceiveMasterKeyChanged(@NonNull Core core, @NonNull Call call, @Nullable String masterKey) {
   }

   public void onCallIdUpdated(@NonNull Core core, @NonNull String previousCallId, @NonNull String currentCallId) {
   }

   public void onAccountRegistrationStateChanged(@NonNull Core core, @NonNull Account account, RegistrationState state, @NonNull String message) {
   }

   public void onMessageSent(@NonNull Core core, @NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onAuthenticationRequested(@NonNull Core core, @NonNull AuthInfo authInfo, @NonNull AuthMethod method) {
   }

   public void onPublishStateChanged(@NonNull Core core, @NonNull Event linphoneEvent, PublishState state) {
   }

   public void onNetworkReachable(@NonNull Core core, boolean reachable) {
   }

   public void onAudioDevicesListUpdated(@NonNull Core core) {
   }

   public void onCallStateChanged(@NonNull Core core, @NonNull Call call, Call.State state, @NonNull String message) {
   }

   public void onChatRoomSubjectChanged(@NonNull Core core, @NonNull ChatRoom chatRoom) {
   }

   public void onFriendListCreated(@NonNull Core core, @NonNull FriendList friendList) {
   }

   public void onConferenceStateChanged(@NonNull Core core, @NonNull Conference conference, Conference.State state) {
   }

   public void onCallCreated(@NonNull Core core, @NonNull Call call) {
   }

   public void onVersionUpdateCheckResultReceived(@NonNull Core core, @NonNull VersionUpdateCheckResult result, String version, @Nullable String url) {
   }

   public void onPushNotificationReceived(@NonNull Core core, @Nullable String payload) {
   }

   public void onInfoReceived(@NonNull Core core, @NonNull Call call, @NonNull InfoMessage message) {
   }

   public void onConferenceInfoReceived(@NonNull Core core, @NonNull ConferenceInfo conferenceInfo) {
   }

   public void onEcCalibrationResult(@NonNull Core core, EcCalibratorStatus status, int delayMs) {
   }

   public void onMessageReceivedUnableDecrypt(@NonNull Core core, @NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onCallEncryptionChanged(@NonNull Core core, @NonNull Call call, boolean mediaEncryptionEnabled, @Nullable String authenticationToken) {
   }

   public void onNewSubscriptionRequested(@NonNull Core core, @NonNull Friend linphoneFriend, @NonNull String url) {
   }

   public void onCallSendMasterKeyChanged(@NonNull Core core, @NonNull Call call, @Nullable String masterKey) {
   }

   public void onChatRoomRead(@NonNull Core core, @NonNull ChatRoom chatRoom) {
   }

   public void onLastCallEnded(@NonNull Core core) {
   }

   public void onMessagesReceived(@NonNull Core core, @NonNull ChatRoom chatRoom, @NonNull ChatMessage[] messages) {
   }

   public void onMessageReceived(@NonNull Core core, @NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onReferReceived(@NonNull Core core, @NonNull String referTo) {
   }

   public void onChatRoomStateChanged(@NonNull Core core, @NonNull ChatRoom chatRoom, ChatRoom.State state) {
   }

   public void onNotifyPresenceReceivedForUriOrTel(@NonNull Core core, @NonNull Friend linphoneFriend, @NonNull String uriOrTel, @NonNull PresenceModel presenceModel) {
   }

   public void onFirstCallStarted(@NonNull Core core) {
   }

   public void onEcCalibrationAudioUninit(@NonNull Core core) {
   }

   public void onEcCalibrationAudioInit(@NonNull Core core) {
   }

   public void onImeeUserRegistration(@NonNull Core core, boolean status, @NonNull String userId, @NonNull String info) {
   }

   public void onChatRoomSessionStateChanged(@NonNull Core core, @NonNull ChatRoom chatRoom, Call.State state, @NonNull String message) {
   }

   public void onNotifySent(@NonNull Core core, @NonNull Event linphoneEvent, @NonNull Content body) {
   }

   public void onRegistrationStateChanged(@NonNull Core core, @NonNull ProxyConfig proxyConfig, RegistrationState state, @NonNull String message) {
   }

   public void onSubscriptionStateChanged(@NonNull Core core, @NonNull Event linphoneEvent, SubscriptionState state) {
   }

   public void onChatRoomEphemeralMessageDeleted(@NonNull Core core, @NonNull ChatRoom chatRoom) {
   }

   public void onSubscribeReceived(@NonNull Core core, @NonNull Event linphoneEvent, @NonNull String subscribeEvent, @Nullable Content body) {
   }

   public void onConfiguringStatus(@NonNull Core core, ConfiguringState status, @Nullable String message) {
   }

   public void onNotifyReceived(@NonNull Core core, @NonNull Event linphoneEvent, @NonNull String notifiedEvent, @NonNull Content body) {
   }

   public void onFriendListRemoved(@NonNull Core core, @NonNull FriendList friendList) {
   }

   public void onPreviewDisplayErrorOccurred(@NonNull Core core, int errorCode) {
   }

   public void onLogCollectionUploadStateChanged(@NonNull Core core, Core.LogCollectionUploadState state, @NonNull String info) {
   }

   public void onTransferStateChanged(@NonNull Core core, @NonNull Call transfered, Call.State callState) {
   }

   public void onCallGoclearAckSent(@NonNull Core core, @NonNull Call call) {
   }
}
