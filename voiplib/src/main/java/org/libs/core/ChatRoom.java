package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ChatRoom {
   @Nullable
   Call getCall();

   int getCapabilities();

   int getChar();

   @NonNull
   Address[] getComposingAddresses();

   @Nullable
   Address getConferenceAddress();

   void setConferenceAddress(@Nullable Address var1);

   @NonNull
   Core getCore();

   long getCreationTime();

   @NonNull
   ChatRoomParams getCurrentParams();

   boolean isEphemeralEnabled();

   void setEphemeralEnabled(boolean var1);

   long getEphemeralLifetime();

   void setEphemeralLifetime(long var1);

   ChatRoomEphemeralMode getEphemeralMode();

   void setEphemeralMode(ChatRoomEphemeralMode var1);

   int getHistoryEventsSize();

   int getHistorySize();

   boolean isEmpty();

   boolean isReadOnly();

   boolean isRemoteComposing();

   @Nullable
   ChatMessage getLastMessageInHistory();

   long getLastUpdateTime();

   @NonNull
   Address getLocalAddress();

   @Nullable
   Participant getMe();

   int getNbParticipants();

   @NonNull
   Participant[] getParticipants();

   @NonNull
   Address getPeerAddress();

   ChatRoomSecurityLevel getSecurityLevel();

   ChatRoom.State getState();

   @Nullable
   String getSubject();

   void setSubject(@Nullable String var1);

   @NonNull
   ChatMessage[] getUnreadHistory();

   int getUnreadMessagesCount();

   void addParticipant(@NonNull Address var1);

   boolean addParticipants(@NonNull Address[] var1);

   void allowCpim();

   void allowMultipart();

   boolean canHandleParticipants();

   void compose();

   @NonNull
   ChatMessage createEmptyMessage();

   @NonNull
   ChatMessage createFileTransferMessage(@NonNull Content var1);

   @NonNull
   ChatMessage createForwardMessage(@NonNull ChatMessage var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   ChatMessage createMessage(@Nullable String var1);

   @NonNull
   ChatMessage createMessageFromUtf8(@Nullable String var1);

   @NonNull
   ChatMessage createReplyMessage(@NonNull ChatMessage var1);

   @NonNull
   ChatMessage createVoiceRecordingMessage(@NonNull Recorder var1);

   void deleteHistory();

   void deleteMessage(@NonNull ChatMessage var1);

   boolean ephemeralSupportedByAllParticipants();

   @Nullable
   ChatMessage findMessage(@NonNull String var1);

   @Nullable
   Participant findParticipant(@NonNull Address var1);

   @NonNull
   ChatMessage[] getHistory(int var1);

   @NonNull
   EventLog[] getHistoryEvents(int var1);

   @NonNull
   EventLog[] getHistoryMessageEvents(int var1);

   @NonNull
   ChatMessage[] getHistoryRange(int var1, int var2);

   @NonNull
   EventLog[] getHistoryRangeEvents(int var1, int var2);

   @NonNull
   EventLog[] getHistoryRangeMessageEvents(int var1, int var2);

   /** @deprecated */
   @Deprecated
   boolean hasBeenLeft();

   boolean hasCapability(int var1);

   void leave();

   boolean limeAvailable();

   void markAsRead();

   void notifyParticipantDeviceRegistration(@NonNull Address var1);

   void receiveChatMessage(@NonNull ChatMessage var1);

   void removeParticipant(@NonNull Participant var1);

   void removeParticipants(@NonNull Participant[] var1);

   void setParticipantAdminStatus(@NonNull Participant var1, boolean var2);

   void setParticipantDevices(@NonNull Address var1, @NonNull ParticipantDeviceIdentity[] var2);

   @NonNull
   String stateToString(ChatRoom.State var1);

   void addListener(ChatRoomListener var1);

   void removeListener(ChatRoomListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      None(0),
      Instantiated(1),
      CreationPending(2),
      Created(3),
      CreationFailed(4),
      TerminationPending(5),
      Terminated(6),
      TerminationFailed(7),
      Deleted(8);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static ChatRoom.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return None;
         case 1:
            return Instantiated;
         case 2:
            return CreationPending;
         case 3:
            return Created;
         case 4:
            return CreationFailed;
         case 5:
            return TerminationPending;
         case 6:
            return Terminated;
         case 7:
            return TerminationFailed;
         case 8:
            return Deleted;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}
