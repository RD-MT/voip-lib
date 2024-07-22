package org.libs.core;

public enum PublishState {
   None(0),
   Progress(1),
   Ok(2),
   Error(3),
   Expiring(4),
   Cleared(5);

   protected final int mValue;

   private PublishState(int value) {
      this.mValue = value;
   }

   public static PublishState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Progress;
      case 2:
         return Ok;
      case 3:
         return Error;
      case 4:
         return Expiring;
      case 5:
         return Cleared;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for PublishState");
      }
   }

   protected static PublishState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      PublishState[] enumArray = new PublishState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(PublishState[] values) throws RuntimeException {
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
