package org.libs.core;

import androidx.annotation.NonNull;

public class ChatRoomListenerStub implements ChatRoomListener {
   public void onConferenceLeft(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onIsComposingReceived(@NonNull ChatRoom chatRoom, @NonNull Address remoteAddress, boolean isComposing) {
   }

   public void onParticipantDeviceAdded(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onChatMessageShouldBeStored(@NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onSubjectChanged(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onChatMessagesReceived(@NonNull ChatRoom chatRoom, @NonNull EventLog[] eventLogs) {
   }

   public void onMessagesReceived(@NonNull ChatRoom chatRoom, @NonNull ChatMessage[] chatMessages) {
   }

   public void onChatMessageReceived(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onMessageReceived(@NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onParticipantRemoved(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onParticipantDeviceRemoved(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onUndecryptableMessageReceived(@NonNull ChatRoom chatRoom, @NonNull ChatMessage message) {
   }

   public void onParticipantAdminStatusChanged(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onEphemeralMessageTimerStarted(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onChatMessageSent(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onChatMessageParticipantImdnStateChanged(@NonNull ChatRoom chatRoom, @NonNull ChatMessage message, @NonNull ParticipantImdnState state) {
   }

   public void onConferenceAddressGeneration(@NonNull ChatRoom chatRoom) {
   }

   public void onChatMessageSending(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onSecurityEvent(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onNewEvent(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onConferenceJoined(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onParticipantRegistrationSubscriptionRequested(@NonNull ChatRoom chatRoom, @NonNull Address participantAddress) {
   }

   public void onParticipantDeviceStateChanged(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog, ParticipantDeviceState state) {
   }

   public void onParticipantDeviceMediaAvailabilityChanged(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onParticipantAdded(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onNewEvents(@NonNull ChatRoom chatRoom, @NonNull EventLog[] eventLogs) {
   }

   public void onEphemeralMessageDeleted(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onEphemeralEvent(@NonNull ChatRoom chatRoom, @NonNull EventLog eventLog) {
   }

   public void onStateChanged(@NonNull ChatRoom chatRoom, ChatRoom.State newState) {
   }

   public void onParticipantRegistrationUnsubscriptionRequested(@NonNull ChatRoom chatRoom, @NonNull Address participantAddress) {
   }
}
