package org.libs.core;

public enum SrtpSuite {
   AESCM128HMACSHA180(0),
   AESCM128HMACSHA132(1),
   AES192CMHMACSHA180(2),
   AES192CMHMACSHA132(3),
   AES256CMHMACSHA180(4),
   AES256CMHMACSHA132(5),
   AEADAES128GCM(6),
   AEADAES256GCM(7),
   Invalid(255);

   protected final int mValue;

   private SrtpSuite(int value) {
      this.mValue = value;
   }

   public static SrtpSuite fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return AESCM128HMACSHA180;
      case 1:
         return AESCM128HMACSHA132;
      case 2:
         return AES192CMHMACSHA180;
      case 3:
         return AES192CMHMACSHA132;
      case 4:
         return AES256CMHMACSHA180;
      case 5:
         return AES256CMHMACSHA132;
      case 6:
         return AEADAES128GCM;
      case 7:
         return AEADAES256GCM;
      case 255:
         return Invalid;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SrtpSuite");
      }
   }

   protected static SrtpSuite[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SrtpSuite[] enumArray = new SrtpSuite[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SrtpSuite[] values) throws RuntimeException {
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
