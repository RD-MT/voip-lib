package org.libs.core;

public enum LdapAuthMethod {
   Anonymous(0),
   Simple(1);

   protected final int mValue;

   private LdapAuthMethod(int value) {
      this.mValue = value;
   }

   public static LdapAuthMethod fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Anonymous;
      case 1:
         return Simple;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LdapAuthMethod");
      }
   }

   protected static LdapAuthMethod[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LdapAuthMethod[] enumArray = new LdapAuthMethod[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LdapAuthMethod[] values) throws RuntimeException {
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
