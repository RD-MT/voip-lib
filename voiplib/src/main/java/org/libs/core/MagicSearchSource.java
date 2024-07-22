package org.libs.core;

public enum MagicSearchSource {
   None(0),
   Friends(1),
   CallLogs(2),
   LdapServers(4),
   ChatRooms(8),
   Request(16),
   FavoriteFriends(32),
   All(-1);

   protected final int mValue;

   private MagicSearchSource(int value) {
      this.mValue = value;
   }

   public static MagicSearchSource fromInt(int value) throws RuntimeException {
      switch(value) {
      case -1:
         return All;
      case 0:
         return None;
      case 1:
         return Friends;
      case 2:
         return CallLogs;
      case 4:
         return LdapServers;
      case 8:
         return ChatRooms;
      case 16:
         return Request;
      case 32:
         return FavoriteFriends;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for MagicSearchSource");
      }
   }

   protected static MagicSearchSource[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      MagicSearchSource[] enumArray = new MagicSearchSource[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(MagicSearchSource[] values) throws RuntimeException {
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
