package org.libs.core;

public enum AVPFMode {
   Default(-1),
   Disabled(0),
   Enabled(1);

   protected final int mValue;

   private AVPFMode(int value) {
      this.mValue = value;
   }

   public static AVPFMode fromInt(int value) throws RuntimeException {
      switch(value) {
      case -1:
         return Default;
      case 0:
         return Disabled;
      case 1:
         return Enabled;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for AVPFMode");
      }
   }

   protected static AVPFMode[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      AVPFMode[] enumArray = new AVPFMode[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(AVPFMode[] values) throws RuntimeException {
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
