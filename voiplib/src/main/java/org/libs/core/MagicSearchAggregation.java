package org.libs.core;

public enum MagicSearchAggregation {
   None(0),
   Friend(1);

   protected final int mValue;

   private MagicSearchAggregation(int value) {
      this.mValue = value;
   }

   public static MagicSearchAggregation fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Friend;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for MagicSearchAggregation");
      }
   }

   protected static MagicSearchAggregation[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      MagicSearchAggregation[] enumArray = new MagicSearchAggregation[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(MagicSearchAggregation[] values) throws RuntimeException {
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
