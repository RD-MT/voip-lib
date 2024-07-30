package org.linphone.core;

public enum ChatRoomSecurityLevel {
   Unsafe(0),
   ClearText(1),
   Encrypted(2),
   Safe(3);

   protected final int mValue;

   private ChatRoomSecurityLevel(int value) {
      this.mValue = value;
   }

   public static ChatRoomSecurityLevel fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Unsafe;
      case 1:
         return ClearText;
      case 2:
         return Encrypted;
      case 3:
         return Safe;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ChatRoomSecurityLevel");
      }
   }

   protected static ChatRoomSecurityLevel[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ChatRoomSecurityLevel[] enumArray = new ChatRoomSecurityLevel[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ChatRoomSecurityLevel[] values) throws RuntimeException {
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
