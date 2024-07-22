package org.libs.core;

public enum TransportType {
   Udp(0),
   Tcp(1),
   Tls(2),
   Dtls(3);

   protected final int mValue;

   private TransportType(int value) {
      this.mValue = value;
   }

   public static TransportType fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Udp;
      case 1:
         return Tcp;
      case 2:
         return Tls;
      case 3:
         return Dtls;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for TransportType");
      }
   }

   protected static TransportType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      TransportType[] enumArray = new TransportType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(TransportType[] values) throws RuntimeException {
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
