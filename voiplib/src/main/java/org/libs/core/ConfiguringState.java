package org.libs.core;

public enum ConfiguringState {
   Successful(0),
   Failed(1),
   Skipped(2);

   protected final int mValue;

   private ConfiguringState(int value) {
      this.mValue = value;
   }

   public static ConfiguringState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Successful;
      case 1:
         return Failed;
      case 2:
         return Skipped;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ConfiguringState");
      }
   }

   protected static ConfiguringState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ConfiguringState[] enumArray = new ConfiguringState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ConfiguringState[] values) throws RuntimeException {
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
