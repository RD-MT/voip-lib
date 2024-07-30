package org.linphone.core;

public enum RecorderState {
   Closed(0),
   Paused(1),
   Running(2);

   protected final int mValue;

   private RecorderState(int value) {
      this.mValue = value;
   }

   public static RecorderState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Closed;
      case 1:
         return Paused;
      case 2:
         return Running;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for RecorderState");
      }
   }

   protected static RecorderState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      RecorderState[] enumArray = new RecorderState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(RecorderState[] values) throws RuntimeException {
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
