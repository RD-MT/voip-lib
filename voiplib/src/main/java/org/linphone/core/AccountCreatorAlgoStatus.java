package org.linphone.core;

public enum AccountCreatorAlgoStatus {
   Ok(0),
   NotSupported(1);

   protected final int mValue;

   private AccountCreatorAlgoStatus(int value) {
      this.mValue = value;
   }

   public static AccountCreatorAlgoStatus fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Ok;
      case 1:
         return NotSupported;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for AccountCreatorAlgoStatus");
      }
   }

   protected static AccountCreatorAlgoStatus[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      AccountCreatorAlgoStatus[] enumArray = new AccountCreatorAlgoStatus[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(AccountCreatorAlgoStatus[] values) throws RuntimeException {
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
