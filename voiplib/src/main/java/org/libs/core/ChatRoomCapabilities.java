package org.libs.core;

public enum ChatRoomCapabilities {
   None(0),
   Basic(1),
   RealTimeText(2),
   Conference(4),
   Proxy(8),
   Migratable(16),
   OneToOne(32),
   Encrypted(64),
   Ephemeral(128);

   protected final int mValue;

   private ChatRoomCapabilities(int value) {
      this.mValue = value;
   }

   public static ChatRoomCapabilities fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return Basic;
      case 2:
         return RealTimeText;
      case 4:
         return Conference;
      case 8:
         return Proxy;
      case 16:
         return Migratable;
      case 32:
         return OneToOne;
      case 64:
         return Encrypted;
      case 128:
         return Ephemeral;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ChatRoomCapabilities");
      }
   }

   protected static ChatRoomCapabilities[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ChatRoomCapabilities[] enumArray = new ChatRoomCapabilities[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ChatRoomCapabilities[] values) throws RuntimeException {
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
