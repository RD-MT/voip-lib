package org.libs.core;

public enum SupportLevel {
   NoSupport(0),
   Optional(1),
   Mandatory(2);

   protected final int mValue;

   private SupportLevel(int value) {
      this.mValue = value;
   }

   public static SupportLevel fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return NoSupport;
      case 1:
         return Optional;
      case 2:
         return Mandatory;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SupportLevel");
      }
   }

   protected static SupportLevel[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SupportLevel[] enumArray = new SupportLevel[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SupportLevel[] values) throws RuntimeException {
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
