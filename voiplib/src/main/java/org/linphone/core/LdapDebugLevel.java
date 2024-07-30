package org.linphone.core;

public enum LdapDebugLevel {
   Off(0),
   Verbose(1);

   protected final int mValue;

   private LdapDebugLevel(int value) {
      this.mValue = value;
   }

   public static LdapDebugLevel fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Off;
      case 1:
         return Verbose;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LdapDebugLevel");
      }
   }

   protected static LdapDebugLevel[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LdapDebugLevel[] enumArray = new LdapDebugLevel[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LdapDebugLevel[] values) throws RuntimeException {
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
