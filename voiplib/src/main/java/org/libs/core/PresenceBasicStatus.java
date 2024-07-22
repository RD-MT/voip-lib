package org.libs.core;

public enum PresenceBasicStatus {
   Open(0),
   Closed(1);

   protected final int mValue;

   private PresenceBasicStatus(int value) {
      this.mValue = value;
   }

   public static PresenceBasicStatus fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Open;
      case 1:
         return Closed;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for PresenceBasicStatus");
      }
   }

   protected static PresenceBasicStatus[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      PresenceBasicStatus[] enumArray = new PresenceBasicStatus[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(PresenceBasicStatus[] values) throws RuntimeException {
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
