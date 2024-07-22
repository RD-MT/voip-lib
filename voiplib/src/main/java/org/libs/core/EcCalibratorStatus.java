package org.libs.core;

public enum EcCalibratorStatus {
   InProgress(0),
   Done(1),
   Failed(2),
   DoneNoEcho(3);

   protected final int mValue;

   private EcCalibratorStatus(int value) {
      this.mValue = value;
   }

   public static EcCalibratorStatus fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return InProgress;
      case 1:
         return Done;
      case 2:
         return Failed;
      case 3:
         return DoneNoEcho;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for EcCalibratorStatus");
      }
   }

   protected static EcCalibratorStatus[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      EcCalibratorStatus[] enumArray = new EcCalibratorStatus[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(EcCalibratorStatus[] values) throws RuntimeException {
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
