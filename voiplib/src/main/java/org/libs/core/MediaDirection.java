package org.libs.core;

public enum MediaDirection {
   Invalid(-1),
   Inactive(0),
   SendOnly(1),
   RecvOnly(2),
   SendRecv(3);

   protected final int mValue;

   private MediaDirection(int value) {
      this.mValue = value;
   }

   public static MediaDirection fromInt(int value) throws RuntimeException {
      switch(value) {
      case -1:
         return Invalid;
      case 0:
         return Inactive;
      case 1:
         return SendOnly;
      case 2:
         return RecvOnly;
      case 3:
         return SendRecv;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for MediaDirection");
      }
   }

   protected static MediaDirection[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      MediaDirection[] enumArray = new MediaDirection[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(MediaDirection[] values) throws RuntimeException {
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
