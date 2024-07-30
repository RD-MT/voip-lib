package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CallListenerStub implements CallListener {
   public void onInfoMessageReceived(@NonNull Call call, @NonNull InfoMessage message) {
   }

   public void onRemoteRecording(@NonNull Call call, boolean recording) {
   }

   public void onReceiveMasterKeyChanged(@NonNull Call call, String receiveMasterKey) {
   }

   public void onStatsUpdated(@NonNull Call call, @NonNull CallStats stats) {
   }

   public void onEncryptionChanged(@NonNull Call call, boolean on, @Nullable String authenticationToken) {
   }

   public void onSendMasterKeyChanged(@NonNull Call call, String sendMasterKey) {
   }

   public void onCameraNotWorking(@NonNull Call call, @NonNull String cameraName) {
   }

   public void onAckProcessing(@NonNull Call call, @NonNull Headers ack, boolean isReceived) {
   }

   public void onSnapshotTaken(@NonNull Call call, @NonNull String filePath) {
   }

   public void onDtmfReceived(@NonNull Call call, int dtmf) {
   }

   public void onAudioDeviceChanged(@NonNull Call call, @NonNull AudioDevice audioDevice) {
   }

   public void onGoclearAckSent(@NonNull Call call) {
   }

   public void onNextVideoFrameDecoded(@NonNull Call call) {
   }

   public void onVideoDisplayErrorOccurred(@NonNull Call call, int errorCode) {
   }

   public void onTmmbrReceived(@NonNull Call call, int streamIndex, int tmmbr) {
   }

   public void onStateChanged(@NonNull Call call, Call.State state, @NonNull String message) {
   }

   public void onTransferStateChanged(@NonNull Call call, Call.State state) {
   }
}
