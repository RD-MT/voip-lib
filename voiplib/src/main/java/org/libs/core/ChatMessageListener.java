package org.libs.core;

import androidx.annotation.NonNull;

public interface ChatMessageListener {
   void onFileTransferSendChunk(@NonNull ChatMessage var1, @NonNull Content var2, int var3, int var4, @NonNull Buffer var5);

   void onEphemeralMessageTimerStarted(@NonNull ChatMessage var1);

   void onFileTransferProgressIndication(@NonNull ChatMessage var1, @NonNull Content var2, int var3, int var4);

   void onEphemeralMessageDeleted(@NonNull ChatMessage var1);

   void onMsgStateChanged(@NonNull ChatMessage var1, ChatMessage.State var2);

   /** @deprecated */
   Buffer onFileTransferSend(@NonNull ChatMessage var1, @NonNull Content var2, int var3, int var4);

   void onParticipantImdnStateChanged(@NonNull ChatMessage var1, @NonNull ParticipantImdnState var2);

   void onFileTransferRecv(@NonNull ChatMessage var1, @NonNull Content var2, @NonNull Buffer var3);
}
