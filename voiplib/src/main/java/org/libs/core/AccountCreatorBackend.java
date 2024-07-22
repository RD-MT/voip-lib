package org.libs.core;

public enum AccountCreatorBackend {
   XMLRPC(0),
   FlexiAPI(1);

   protected final int mValue;

   private AccountCreatorBackend(int value) {
      this.mValue = value;
   }

   public static AccountCreatorBackend fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return XMLRPC;
      case 1:
         return FlexiAPI;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for AccountCreatorBackend");
      }
   }

   protected static AccountCreatorBackend[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      AccountCreatorBackend[] enumArray = new AccountCreatorBackend[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(AccountCreatorBackend[] values) throws RuntimeException {
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
