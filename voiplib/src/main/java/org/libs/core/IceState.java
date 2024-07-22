package org.libs.core;

public enum IceState {
   NotActivated(0),
   Failed(1),
   InProgress(2),
   HostConnection(3),
   ReflexiveConnection(4),
   RelayConnection(5);

   protected final int mValue;

   private IceState(int value) {
      this.mValue = value;
   }

   public static IceState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return NotActivated;
      case 1:
         return Failed;
      case 2:
         return InProgress;
      case 3:
         return HostConnection;
      case 4:
         return ReflexiveConnection;
      case 5:
         return RelayConnection;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for IceState");
      }
   }

   protected static IceState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      IceState[] enumArray = new IceState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(IceState[] values) throws RuntimeException {
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
