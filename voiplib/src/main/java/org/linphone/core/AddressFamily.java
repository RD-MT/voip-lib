package org.linphone.core;

public enum AddressFamily {
   Inet(0),
   Inet6(1),
   Unspec(2);

   protected final int mValue;

   private AddressFamily(int value) {
      this.mValue = value;
   }

   public static AddressFamily fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Inet;
      case 1:
         return Inet6;
      case 2:
         return Unspec;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for AddressFamily");
      }
   }

   protected static AddressFamily[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      AddressFamily[] enumArray = new AddressFamily[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(AddressFamily[] values) throws RuntimeException {
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
