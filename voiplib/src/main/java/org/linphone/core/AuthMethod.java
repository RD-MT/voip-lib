package org.linphone.core;

public enum AuthMethod {
   HttpDigest(0),
   Tls(1);

   protected final int mValue;

   private AuthMethod(int value) {
      this.mValue = value;
   }

   public static AuthMethod fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return HttpDigest;
      case 1:
         return Tls;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for AuthMethod");
      }
   }

   protected static AuthMethod[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      AuthMethod[] enumArray = new AuthMethod[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(AuthMethod[] values) throws RuntimeException {
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
