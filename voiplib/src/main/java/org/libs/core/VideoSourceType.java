package org.libs.core;

public enum VideoSourceType {
   Unknown(0),
   Call(1),
   Camera(2),
   Image(3);

   protected final int mValue;

   private VideoSourceType(int value) {
      this.mValue = value;
   }

   public static VideoSourceType fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Unknown;
      case 1:
         return Call;
      case 2:
         return Camera;
      case 3:
         return Image;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for VideoSourceType");
      }
   }

   protected static VideoSourceType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      VideoSourceType[] enumArray = new VideoSourceType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(VideoSourceType[] values) throws RuntimeException {
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
