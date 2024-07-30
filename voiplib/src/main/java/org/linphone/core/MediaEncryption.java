package org.linphone.core;

public enum MediaEncryption {
   None(0),
   SRTP(1),
   ZRTP(2),
   DTLS(3);

   protected final int mValue;

   private MediaEncryption(int value) {
      this.mValue = value;
   }

   public static MediaEncryption fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return SRTP;
      case 2:
         return ZRTP;
      case 3:
         return DTLS;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for MediaEncryption");
      }
   }

   protected static MediaEncryption[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      MediaEncryption[] enumArray = new MediaEncryption[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(MediaEncryption[] values) throws RuntimeException {
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
