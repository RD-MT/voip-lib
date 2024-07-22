package org.libs.core;

public enum XmlRpcArgType {
   None(0),
   Int(1),
   String(2),
   StringStruct(3);

   protected final int mValue;

   private XmlRpcArgType(int value) {
      this.mValue = value;
   }

   public static XmlRpcArgType fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Int;
      case 2:
         return String;
      case 3:
         return StringStruct;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for XmlRpcArgType");
      }
   }

   protected static XmlRpcArgType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      XmlRpcArgType[] enumArray = new XmlRpcArgType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(XmlRpcArgType[] values) throws RuntimeException {
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
