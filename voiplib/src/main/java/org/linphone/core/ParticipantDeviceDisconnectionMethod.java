package org.linphone.core;

public enum ParticipantDeviceDisconnectionMethod {
   Booted(0),
   Departed(1),
   Busy(2),
   Failed(3);

   protected final int mValue;

   private ParticipantDeviceDisconnectionMethod(int value) {
      this.mValue = value;
   }

   public static ParticipantDeviceDisconnectionMethod fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Booted;
      case 1:
         return Departed;
      case 2:
         return Busy;
      case 3:
         return Failed;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ParticipantDeviceDisconnectionMethod");
      }
   }

   protected static ParticipantDeviceDisconnectionMethod[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ParticipantDeviceDisconnectionMethod[] enumArray = new ParticipantDeviceDisconnectionMethod[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ParticipantDeviceDisconnectionMethod[] values) throws RuntimeException {
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
