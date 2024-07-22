package org.libs.core;

public enum LimeState {
   Disabled(0),
   Mandatory(1),
   Preferred(2);

   protected final int mValue;

   private LimeState(int value) {
      this.mValue = value;
   }

   public static LimeState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Disabled;
      case 1:
         return Mandatory;
      case 2:
         return Preferred;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LimeState");
      }
   }

   protected static LimeState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LimeState[] enumArray = new LimeState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LimeState[] values) throws RuntimeException {
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
