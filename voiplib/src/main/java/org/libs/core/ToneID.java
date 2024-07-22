package org.libs.core;

public enum ToneID {
   Undefined(0),
   Busy(1),
   CallWaiting(2),
   CallOnHold(3),
   CallLost(4),
   CallEnd(5),
   CallNotAnswered(6);

   protected final int mValue;

   private ToneID(int value) {
      this.mValue = value;
   }

   public static ToneID fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Undefined;
      case 1:
         return Busy;
      case 2:
         return CallWaiting;
      case 3:
         return CallOnHold;
      case 4:
         return CallLost;
      case 5:
         return CallEnd;
      case 6:
         return CallNotAnswered;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ToneID");
      }
   }

   protected static ToneID[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ToneID[] enumArray = new ToneID[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ToneID[] values) throws RuntimeException {
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
