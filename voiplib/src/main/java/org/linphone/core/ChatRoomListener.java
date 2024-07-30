package org.linphone.core;

import androidx.annotation.NonNull;

public interface ChatRoomListener {
   void onConferenceLeft(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onIsComposingReceived(@NonNull ChatRoom var1, @NonNull Address var2, boolean var3);

   void onParticipantDeviceAdded(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onChatMessageShouldBeStored(@NonNull ChatRoom var1, @NonNull ChatMessage var2);

   void onSubjectChanged(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onChatMessagesReceived(@NonNull ChatRoom var1, @NonNull EventLog[] var2);

   void onMessagesReceived(@NonNull ChatRoom var1, @NonNull ChatMessage[] var2);

   void onChatMessageReceived(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onMessageReceived(@NonNull ChatRoom var1, @NonNull ChatMessage var2);

   void onParticipantRemoved(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onParticipantDeviceRemoved(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onUndecryptableMessageReceived(@NonNull ChatRoom var1, @NonNull ChatMessage var2);

   void onParticipantAdminStatusChanged(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onEphemeralMessageTimerStarted(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onChatMessageSent(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onChatMessageParticipantImdnStateChanged(@NonNull ChatRoom var1, @NonNull ChatMessage var2, @NonNull ParticipantImdnState var3);

   void onConferenceAddressGeneration(@NonNull ChatRoom var1);

   void onChatMessageSending(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onSecurityEvent(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onNewEvent(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onConferenceJoined(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onParticipantRegistrationSubscriptionRequested(@NonNull ChatRoom var1, @NonNull Address var2);

   void onParticipantDeviceStateChanged(@NonNull ChatRoom var1, @NonNull EventLog var2, ParticipantDeviceState var3);

   void onParticipantDeviceMediaAvailabilityChanged(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onParticipantAdded(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onNewEvents(@NonNull ChatRoom var1, @NonNull EventLog[] var2);

   void onEphemeralMessageDeleted(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onEphemeralEvent(@NonNull ChatRoom var1, @NonNull EventLog var2);

   void onStateChanged(@NonNull ChatRoom var1, ChatRoom.State var2);

   void onParticipantRegistrationUnsubscriptionRequested(@NonNull ChatRoom var1, @NonNull Address var2);
}
