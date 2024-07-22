package org.libs.core;

public enum LogCollectionState {
   Disabled(0),
   Enabled(1),
   EnabledWithoutPreviousLogHandler(2);

   protected final int mValue;

   private LogCollectionState(int value) {
      this.mValue = value;
   }

   public static LogCollectionState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Disabled;
      case 1:
         return Enabled;
      case 2:
         return EnabledWithoutPreviousLogHandler;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LogCollectionState");
      }
   }

   protected static LogCollectionState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LogCollectionState[] enumArray = new LogCollectionState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LogCollectionState[] values) throws RuntimeException {
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
