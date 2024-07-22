package org.libs.core;

public enum ParticipantDeviceState {
   Joining(0),
   Present(1),
   Leaving(2),
   Left(3),
   ScheduledForJoining(4),
   ScheduledForLeaving(5),
   OnHold(6),
   Alerting(7),
   MutedByFocus(8);

   protected final int mValue;

   private ParticipantDeviceState(int value) {
      this.mValue = value;
   }

   public static ParticipantDeviceState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Joining;
      case 1:
         return Present;
      case 2:
         return Leaving;
      case 3:
         return Left;
      case 4:
         return ScheduledForJoining;
      case 5:
         return ScheduledForLeaving;
      case 6:
         return OnHold;
      case 7:
         return Alerting;
      case 8:
         return MutedByFocus;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ParticipantDeviceState");
      }
   }

   protected static ParticipantDeviceState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ParticipantDeviceState[] enumArray = new ParticipantDeviceState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ParticipantDeviceState[] values) throws RuntimeException {
      int arraySize = values.length;
      int[] intArray = new int[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         intArray[i] = values[i].toInt();
      }

      return intArray;
   }

   public int toInt() {
      return this.mValue;
   }
}
