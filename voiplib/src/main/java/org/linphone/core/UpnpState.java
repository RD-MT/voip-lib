package org.linphone.core;

public enum UpnpState {
   Idle(0),
   Pending(1),
   Adding(2),
   Removing(3),
   NotAvailable(4),
   Ok(5),
   Ko(6),
   Blacklisted(7);

   protected final int mValue;

   private UpnpState(int value) {
      this.mValue = value;
   }

   public static UpnpState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Idle;
      case 1:
         return Pending;
      case 2:
         return Adding;
      case 3:
         return Removing;
      case 4:
         return NotAvailable;
      case 5:
         return Ok;
      case 6:
         return Ko;
      case 7:
         return Blacklisted;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for UpnpState");
      }
   }

   protected static UpnpState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      UpnpState[] enumArray = new UpnpState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(UpnpState[] values) throws RuntimeException {
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
