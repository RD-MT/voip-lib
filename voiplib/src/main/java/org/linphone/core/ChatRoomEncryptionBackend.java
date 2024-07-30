package org.linphone.core;

public enum ChatRoomEncryptionBackend {
   None(0),
   Lime(1);

   protected final int mValue;

   private ChatRoomEncryptionBackend(int value) {
      this.mValue = value;
   }

   public static ChatRoomEncryptionBackend fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Lime;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ChatRoomEncryptionBackend");
      }
   }

   protected static ChatRoomEncryptionBackend[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ChatRoomEncryptionBackend[] enumArray = new ChatRoomEncryptionBackend[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ChatRoomEncryptionBackend[] values) throws RuntimeException {
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
