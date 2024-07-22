package org.libs.core;

public enum GlobalState {
   Off(0),
   Startup(1),
   On(2),
   Shutdown(3),
   Configuring(4),
   Ready(5);

   protected final int mValue;

   private GlobalState(int value) {
      this.mValue = value;
   }

   public static GlobalState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Off;
      case 1:
         return Startup;
      case 2:
         return On;
      case 3:
         return Shutdown;
      case 4:
         return Configuring;
      case 5:
         return Ready;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for GlobalState");
      }
   }

   protected static GlobalState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      GlobalState[] enumArray = new GlobalState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(GlobalState[] values) throws RuntimeException {
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
