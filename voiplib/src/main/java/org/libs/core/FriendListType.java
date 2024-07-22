package org.libs.core;

public enum FriendListType {
   Default(-1),
   CardDAV(0),
   VCard4(1);

   protected final int mValue;

   private FriendListType(int value) {
      this.mValue = value;
   }

   public static FriendListType fromInt(int value) throws RuntimeException {
      switch(value) {
      case -1:
         return Default;
      case 0:
         return CardDAV;
      case 1:
         return VCard4;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for FriendListType");
      }
   }

   protected static FriendListType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      FriendListType[] enumArray = new FriendListType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(FriendListType[] values) throws RuntimeException {
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
