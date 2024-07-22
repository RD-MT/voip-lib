package org.libs.core;

public enum RecorderFileFormat {
   Unknown(0),
   Wav(1),
   Mkv(2);

   protected final int mValue;

   private RecorderFileFormat(int value) {
      this.mValue = value;
   }

   public static RecorderFileFormat fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Unknown;
      case 1:
         return Wav;
      case 2:
         return Mkv;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for RecorderFileFormat");
      }
   }

   protected static RecorderFileFormat[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      RecorderFileFormat[] enumArray = new RecorderFileFormat[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(RecorderFileFormat[] values) throws RuntimeException {
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
