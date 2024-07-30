package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ChatMessage {
   @Nullable
   String getAppdata();

   void setAppdata(@Nullable String var1);

   @NonNull
   String getCallId();

   @NonNull
   ChatRoom getChatRoom();

   @NonNull
   String getContentType();

   void setContentType(@NonNull String var1);

   @NonNull
   Content[] getContents();

   @NonNull
   Core getCore();

   long getEphemeralExpireTime();

   long getEphemeralLifetime();

   @NonNull
   ErrorInfo getErrorInfo();

   @Nullable
   String getExternalBodyUrl();

   void setExternalBodyUrl(@Nullable String var1);

   @Nullable
   Content getFileTransferInformation();

   @Nullable
   String getForwardInfo();

   @NonNull
   Address getFromAddress();

   boolean isEphemeral();

   /** @deprecated */
   @Deprecated
   boolean isFileTransfer();

   boolean isFileTransferInProgress();

   boolean isForward();

   boolean isOutgoing();

   boolean isRead();

   boolean isReply();

   boolean isSecured();

   /** @deprecated */
   @Deprecated
   boolean isText();

   @NonNull
   Address getLocalAddress();

   @NonNull
   String getMessageId();

   @Nullable
   ChatMessage getReplyMessage();

   @Nullable
   String getReplyMessageId();

   @Nullable
   Address getReplyMessageSenderAddress();

   ChatMessage.State getState();

   /** @deprecated */
   @Deprecated
   @Nullable
   String getTextContent();

   long getTime();

   @NonNull
   Address getToAddress();

   boolean getToBeStored();

   void setToBeStored(boolean var1);

   @Nullable
   String getUtf8Text();

   int setUtf8Text(@Nullable String var1);

   void addContent(@NonNull Content var1);

   void addCustomHeader(@NonNull String var1, @Nullable String var2);

   void addFileContent(@NonNull Content var1);

   /** @deprecated */
   @Deprecated
   void addTextContent(@NonNull String var1);

   void addUtf8TextContent(@NonNull String var1);

   void cancelFileTransfer();

   boolean downloadContent(@NonNull Content var1);

   @Nullable
   String getCustomHeader(@NonNull String var1);

   @NonNull
   ParticipantImdnState[] getParticipantsByImdnState(ChatMessage.State var1);

   boolean hasConferenceInvitationContent();

   /** @deprecated */
   @Deprecated
   boolean hasTextContent();

   int putChar(int var1);

   void removeContent(@NonNull Content var1);

   void removeCustomHeader(@NonNull String var1);

   void send();

   void addListener(ChatMessageListener var1);

   void removeListener(ChatMessageListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      Idle(0),
      InProgress(1),
      Delivered(2),
      NotDelivered(3),
      FileTransferError(4),
      FileTransferDone(5),
      DeliveredToUser(6),
      Displayed(7),
      FileTransferInProgress(8);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static ChatMessage.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Idle;
         case 1:
            return InProgress;
         case 2:
            return Delivered;
         case 3:
            return NotDelivered;
         case 4:
            return FileTransferError;
         case 5:
            return FileTransferDone;
         case 6:
            return DeliveredToUser;
         case 7:
            return Displayed;
         case 8:
            return FileTransferInProgress;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum Direction {
      Incoming(0),
      Outgoing(1);

      protected final int mValue;

      private Direction(int value) {
         this.mValue = value;
      }

      public static ChatMessage.Direction fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Incoming;
         case 1:
            return Outgoing;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Direction");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}
