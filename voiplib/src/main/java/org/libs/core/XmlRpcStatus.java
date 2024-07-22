package org.libs.core;

public enum XmlRpcStatus {
   Pending(0),
   Ok(1),
   Failed(2);

   protected final int mValue;

   private XmlRpcStatus(int value) {
      this.mValue = value;
   }

   public static XmlRpcStatus fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Pending;
      case 1:
         return Ok;
      case 2:
         return Failed;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for XmlRpcStatus");
      }
   }

   protected static XmlRpcStatus[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      XmlRpcStatus[] enumArray = new XmlRpcStatus[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(XmlRpcStatus[] values) throws RuntimeException {
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
