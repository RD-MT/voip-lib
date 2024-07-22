package org.libs.core;

public enum ChatRoomEphemeralMode {
   DeviceManaged(0),
   AdminManaged(1);

   protected final int mValue;

   private ChatRoomEphemeralMode(int value) {
      this.mValue = value;
   }

   public static ChatRoomEphemeralMode fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return DeviceManaged;
      case 1:
         return AdminManaged;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ChatRoomEphemeralMode");
      }
   }

   protected static ChatRoomEphemeralMode[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ChatRoomEphemeralMode[] enumArray = new ChatRoomEphemeralMode[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ChatRoomEphemeralMode[] values) throws RuntimeException {
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
