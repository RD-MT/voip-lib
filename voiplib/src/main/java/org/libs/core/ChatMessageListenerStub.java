package org.libs.core;

import androidx.annotation.NonNull;

public class ChatMessageListenerStub implements ChatMessageListener {
   public void onFileTransferSendChunk(@NonNull ChatMessage message, @NonNull Content content, int offset, int size, @NonNull Buffer buffer) {
   }

   public void onEphemeralMessageTimerStarted(@NonNull ChatMessage message) {
   }

   public void onFileTransferProgressIndication(@NonNull ChatMessage message, @NonNull Content content, int offset, int total) {
   }

   public void onEphemeralMessageDeleted(@NonNull ChatMessage message) {
   }

   public void onMsgStateChanged(@NonNull ChatMessage message, ChatMessage.State state) {
   }

   public Buffer onFileTransferSend(@NonNull ChatMessage message, @NonNull Content content, int offset, int size) {
      return null;
   }

   public void onParticipantImdnStateChanged(@NonNull ChatMessage message, @NonNull ParticipantImdnState state) {
   }

   public void onFileTransferRecv(@NonNull ChatMessage message, @NonNull Content content, @NonNull Buffer buffer) {
   }
}
