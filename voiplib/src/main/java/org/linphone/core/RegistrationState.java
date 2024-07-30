package org.linphone.core;

public enum RegistrationState {
   None(0),
   Progress(1),
   Ok(2),
   Cleared(3),
   Failed(4),
   Refreshing(5);

   protected final int mValue;

   private RegistrationState(int value) {
      this.mValue = value;
   }

   public static RegistrationState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Progress;
      case 2:
         return Ok;
      case 3:
         return Cleared;
      case 4:
         return Failed;
      case 5:
         return Refreshing;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for RegistrationState");
      }
   }

   protected static RegistrationState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      RegistrationState[] enumArray = new RegistrationState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(RegistrationState[] values) throws RuntimeException {
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
