package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CallListener {
   void onInfoMessageReceived(@NonNull Call var1, @NonNull InfoMessage var2);

   void onRemoteRecording(@NonNull Call var1, boolean var2);

   void onReceiveMasterKeyChanged(@NonNull Call var1, String var2);

   void onStatsUpdated(@NonNull Call var1, @NonNull CallStats var2);

   void onEncryptionChanged(@NonNull Call var1, boolean var2, @Nullable String var3);

   void onSendMasterKeyChanged(@NonNull Call var1, String var2);

   void onCameraNotWorking(@NonNull Call var1, @NonNull String var2);

   void onAckProcessing(@NonNull Call var1, @NonNull Headers var2, boolean var3);

   void onSnapshotTaken(@NonNull Call var1, @NonNull String var2);

   void onDtmfReceived(@NonNull Call var1, int var2);

   void onAudioDeviceChanged(@NonNull Call var1, @NonNull AudioDevice var2);

   void onGoclearAckSent(@NonNull Call var1);

   void onNextVideoFrameDecoded(@NonNull Call var1);

   void onVideoDisplayErrorOccurred(@NonNull Call var1, int var2);

   void onTmmbrReceived(@NonNull Call var1, int var2, int var3);

   void onStateChanged(@NonNull Call var1, Call.State var2, @NonNull String var3);

   void onTransferStateChanged(@NonNull Call var1, Call.State var2);
}
