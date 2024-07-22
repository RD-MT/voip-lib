package org.libs.core;

public enum ZrtpPeerStatus {
   Unknown(0),
   Invalid(1),
   Valid(2);

   protected final int mValue;

   private ZrtpPeerStatus(int value) {
      this.mValue = value;
   }

   public static ZrtpPeerStatus fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Unknown;
      case 1:
         return Invalid;
      case 2:
         return Valid;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ZrtpPeerStatus");
      }
   }

   protected static ZrtpPeerStatus[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ZrtpPeerStatus[] enumArray = new ZrtpPeerStatus[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ZrtpPeerStatus[] values) throws RuntimeException {
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
