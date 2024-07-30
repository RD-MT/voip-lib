package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CoreListener {
   void onCallStatsUpdated(@NonNull Core var1, @NonNull Call var2, @NonNull CallStats var3);

   void onQrcodeFound(@NonNull Core var1, @Nullable String var2);

   void onBuddyInfoUpdated(@NonNull Core var1, @NonNull Friend var2);

   void onNotifyPresenceReceived(@NonNull Core var1, @NonNull Friend var2);

   void onLogCollectionUploadProgressIndication(@NonNull Core var1, int var2, int var3);

   void onIsComposingReceived(@NonNull Core var1, @NonNull ChatRoom var2);

   void onGlobalStateChanged(@NonNull Core var1, GlobalState var2, @NonNull String var3);

   void onAudioDeviceChanged(@NonNull Core var1, @NonNull AudioDevice var2);

   void onCallLogUpdated(@NonNull Core var1, @NonNull CallLog var2);

   void onDtmfReceived(@NonNull Core var1, @NonNull Call var2, int var3);

   void onCallReceiveMasterKeyChanged(@NonNull Core var1, @NonNull Call var2, @Nullable String var3);

   void onCallIdUpdated(@NonNull Core var1, @NonNull String var2, @NonNull String var3);

   void onAccountRegistrationStateChanged(@NonNull Core var1, @NonNull Account var2, RegistrationState var3, @NonNull String var4);

   void onMessageSent(@NonNull Core var1, @NonNull ChatRoom var2, @NonNull ChatMessage var3);

   void onAuthenticationRequested(@NonNull Core var1, @NonNull AuthInfo var2, @NonNull AuthMethod var3);

   void onPublishStateChanged(@NonNull Core var1, @NonNull Event var2, PublishState var3);

   void onNetworkReachable(@NonNull Core var1, boolean var2);

   void onAudioDevicesListUpdated(@NonNull Core var1);

   void onCallStateChanged(@NonNull Core var1, @NonNull Call var2, Call.State var3, @NonNull String var4);

   void onChatRoomSubjectChanged(@NonNull Core var1, @NonNull ChatRoom var2);

   void onFriendListCreated(@NonNull Core var1, @NonNull FriendList var2);

   void onConferenceStateChanged(@NonNull Core var1, @NonNull Conference var2, Conference.State var3);

   void onCallCreated(@NonNull Core var1, @NonNull Call var2);

   void onVersionUpdateCheckResultReceived(@NonNull Core var1, @NonNull VersionUpdateCheckResult var2, String var3, @Nullable String var4);

   void onPushNotificationReceived(@NonNull Core var1, @Nullable String var2);

   void onInfoReceived(@NonNull Core var1, @NonNull Call var2, @NonNull InfoMessage var3);

   void onConferenceInfoReceived(@NonNull Core var1, @NonNull ConferenceInfo var2);

   void onEcCalibrationResult(@NonNull Core var1, EcCalibratorStatus var2, int var3);

   void onMessageReceivedUnableDecrypt(@NonNull Core var1, @NonNull ChatRoom var2, @NonNull ChatMessage var3);

   void onCallEncryptionChanged(@NonNull Core var1, @NonNull Call var2, boolean var3, @Nullable String var4);

   void onNewSubscriptionRequested(@NonNull Core var1, @NonNull Friend var2, @NonNull String var3);

   void onCallSendMasterKeyChanged(@NonNull Core var1, @NonNull Call var2, @Nullable String var3);

   void onChatRoomRead(@NonNull Core var1, @NonNull ChatRoom var2);

   void onLastCallEnded(@NonNull Core var1);

   void onMessagesReceived(@NonNull Core var1, @NonNull ChatRoom var2, @NonNull ChatMessage[] var3);

   void onMessageReceived(@NonNull Core var1, @NonNull ChatRoom var2, @NonNull ChatMessage var3);

   void onReferReceived(@NonNull Core var1, @NonNull String var2);

   void onChatRoomStateChanged(@NonNull Core var1, @NonNull ChatRoom var2, ChatRoom.State var3);

   void onNotifyPresenceReceivedForUriOrTel(@NonNull Core var1, @NonNull Friend var2, @NonNull String var3, @NonNull PresenceModel var4);

   void onFirstCallStarted(@NonNull Core var1);

   void onEcCalibrationAudioUninit(@NonNull Core var1);

   void onEcCalibrationAudioInit(@NonNull Core var1);

   void onImeeUserRegistration(@NonNull Core var1, boolean var2, @NonNull String var3, @NonNull String var4);

   void onChatRoomSessionStateChanged(@NonNull Core var1, @NonNull ChatRoom var2, Call.State var3, @NonNull String var4);

   void onNotifySent(@NonNull Core var1, @NonNull Event var2, @NonNull Content var3);

   /** @deprecated */
   void onRegistrationStateChanged(@NonNull Core var1, @NonNull ProxyConfig var2, RegistrationState var3, @NonNull String var4);

   void onSubscriptionStateChanged(@NonNull Core var1, @NonNull Event var2, SubscriptionState var3);

   void onChatRoomEphemeralMessageDeleted(@NonNull Core var1, @NonNull ChatRoom var2);

   void onSubscribeReceived(@NonNull Core var1, @NonNull Event var2, @NonNull String var3, @Nullable Content var4);

   void onConfiguringStatus(@NonNull Core var1, ConfiguringState var2, @Nullable String var3);

   void onNotifyReceived(@NonNull Core var1, @NonNull Event var2, @NonNull String var3, @NonNull Content var4);

   void onFriendListRemoved(@NonNull Core var1, @NonNull FriendList var2);

   void onPreviewDisplayErrorOccurred(@NonNull Core var1, int var2);

   void onLogCollectionUploadStateChanged(@NonNull Core var1, Core.LogCollectionUploadState var2, @NonNull String var3);

   void onTransferStateChanged(@NonNull Core var1, @NonNull Call var2, Call.State var3);

   void onCallGoclearAckSent(@NonNull Core var1, @NonNull Call var2);
}
