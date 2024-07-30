package org.linphone.core;

public enum ConferenceJoiningMode {
   DialIn(0),
   DialOut(1);

   protected final int mValue;

   private ConferenceJoiningMode(int value) {
      this.mValue = value;
   }

   public static ConferenceJoiningMode fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return DialIn;
      case 1:
         return DialOut;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ConferenceJoiningMode");
      }
   }

   protected static ConferenceJoiningMode[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ConferenceJoiningMode[] enumArray = new ConferenceJoiningMode[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ConferenceJoiningMode[] values) throws RuntimeException {
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
