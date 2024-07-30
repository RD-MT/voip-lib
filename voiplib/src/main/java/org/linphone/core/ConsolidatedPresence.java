package org.linphone.core;

public enum ConsolidatedPresence {
   Online(0),
   Busy(1),
   DoNotDisturb(2),
   Offline(3);

   protected final int mValue;

   private ConsolidatedPresence(int value) {
      this.mValue = value;
   }

   public static ConsolidatedPresence fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Online;
      case 1:
         return Busy;
      case 2:
         return DoNotDisturb;
      case 3:
         return Offline;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ConsolidatedPresence");
      }
   }

   protected static ConsolidatedPresence[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ConsolidatedPresence[] enumArray = new ConsolidatedPresence[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ConsolidatedPresence[] values) throws RuntimeException {
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
