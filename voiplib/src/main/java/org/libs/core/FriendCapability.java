package org.libs.core;

public enum FriendCapability {
   None(0),
   GroupChat(1),
   LimeX3Dh(2),
   EphemeralMessages(4);

   protected final int mValue;

   private FriendCapability(int value) {
      this.mValue = value;
   }

   public static FriendCapability fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return GroupChat;
      case 2:
         return LimeX3Dh;
      case 3:
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for FriendCapability");
      case 4:
         return EphemeralMessages;
      }
   }

   protected static FriendCapability[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      FriendCapability[] enumArray = new FriendCapability[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(FriendCapability[] values) throws RuntimeException {
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
