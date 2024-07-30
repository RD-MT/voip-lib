package org.linphone.core;

import androidx.annotation.Nullable;

public interface EventLog {
   @Nullable
   CallLog getCallLog();

   @Nullable
   ChatMessage getChatMessage();

   @Nullable
   ConferenceInfo getConferenceInfo();

   long getCreationTime();

   @Nullable
   Address getDeviceAddress();

   long getEphemeralMessageLifetime();

   @Nullable
   Address getLocalAddress();

   int getNotifyId();

   @Nullable
   Address getParticipantAddress();

   @Nullable
   Address getPeerAddress();

   @Nullable
   Address getSecurityEventFaultyDeviceAddress();

   EventLog.SecurityEventType getSecurityEventType();

   @Nullable
   String getSubject();

   EventLog.Type getType();

   void deleteFromDatabase();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum Type {
      None(0),
      ConferenceCreated(1),
      ConferenceTerminated(2),
      ConferenceCallStarted(3),
      ConferenceConnected(21),
      ConferenceCallEnded(4),
      ConferenceChatMessage(5),
      ConferenceParticipantAdded(6),
      ConferenceParticipantRemoved(7),
      ConferenceParticipantSetAdmin(8),
      ConferenceParticipantUnsetAdmin(9),
      ConferenceParticipantDeviceAdded(10),
      ConferenceParticipantDeviceRemoved(11),
      ConferenceParticipantDeviceMediaCapabilityChanged(17),
      ConferenceParticipantDeviceMediaAvailabilityChanged(23),
      ConferenceParticipantDeviceStatusChanged(22),
      ConferenceSubjectChanged(12),
      ConferenceAvailableMediaChanged(18),
      ConferenceSecurityEvent(13),
      ConferenceEphemeralMessageLifetimeChanged(14),
      ConferenceEphemeralMessageEnabled(15),
      ConferenceEphemeralMessageDisabled(16),
      ConferenceEphemeralMessageManagedByAdmin(19),
      ConferenceEphemeralMessageManagedByParticipants(20);

      protected final int mValue;

      private Type(int value) {
         this.mValue = value;
      }

      public static EventLog.Type fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return None;
         case 1:
            return ConferenceCreated;
         case 2:
            return ConferenceTerminated;
         case 3:
            return ConferenceCallStarted;
         case 4:
            return ConferenceCallEnded;
         case 5:
            return ConferenceChatMessage;
         case 6:
            return ConferenceParticipantAdded;
         case 7:
            return ConferenceParticipantRemoved;
         case 8:
            return ConferenceParticipantSetAdmin;
         case 9:
            return ConferenceParticipantUnsetAdmin;
         case 10:
            return ConferenceParticipantDeviceAdded;
         case 11:
            return ConferenceParticipantDeviceRemoved;
         case 12:
            return ConferenceSubjectChanged;
         case 13:
            return ConferenceSecurityEvent;
         case 14:
            return ConferenceEphemeralMessageLifetimeChanged;
         case 15:
            return ConferenceEphemeralMessageEnabled;
         case 16:
            return ConferenceEphemeralMessageDisabled;
         case 17:
            return ConferenceParticipantDeviceMediaCapabilityChanged;
         case 18:
            return ConferenceAvailableMediaChanged;
         case 19:
            return ConferenceEphemeralMessageManagedByAdmin;
         case 20:
            return ConferenceEphemeralMessageManagedByParticipants;
         case 21:
            return ConferenceConnected;
         case 22:
            return ConferenceParticipantDeviceStatusChanged;
         case 23:
            return ConferenceParticipantDeviceMediaAvailabilityChanged;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Type");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum SecurityEventType {
      None(0),
      SecurityLevelDowngraded(1),
      ParticipantMaxDeviceCountExceeded(2),
      EncryptionIdentityKeyChanged(3),
      ManInTheMiddleDetected(4);

      protected final int mValue;

      private SecurityEventType(int value) {
         this.mValue = value;
      }

      public static EventLog.SecurityEventType fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return None;
         case 1:
            return SecurityLevelDowngraded;
         case 2:
            return ParticipantMaxDeviceCountExceeded;
         case 3:
            return EncryptionIdentityKeyChanged;
         case 4:
            return ManInTheMiddleDetected;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for SecurityEventType");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}
