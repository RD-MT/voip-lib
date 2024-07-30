package org.linphone.core;

public enum ParticipantDeviceJoiningMethod {
   DialedIn(0),
   DialedOut(1),
   FocusOwner(2);

   protected final int mValue;

   private ParticipantDeviceJoiningMethod(int value) {
      this.mValue = value;
   }

   public static ParticipantDeviceJoiningMethod fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return DialedIn;
      case 1:
         return DialedOut;
      case 2:
         return FocusOwner;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ParticipantDeviceJoiningMethod");
      }
   }

   protected static ParticipantDeviceJoiningMethod[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ParticipantDeviceJoiningMethod[] enumArray = new ParticipantDeviceJoiningMethod[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ParticipantDeviceJoiningMethod[] values) throws RuntimeException {
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
