package org.linphone.core;

public enum Privacy {
   None(0),
   User(1),
   Header(2),
   Session(4),
   Id(8),
   Critical(16),
   Default(32768);

   protected final int mValue;

   private Privacy(int value) {
      this.mValue = value;
   }

   public static Privacy fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return User;
      case 2:
         return Header;
      case 4:
         return Session;
      case 8:
         return Id;
      case 16:
         return Critical;
      case 32768:
         return Default;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for Privacy");
      }
   }

   protected static Privacy[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      Privacy[] enumArray = new Privacy[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(Privacy[] values) throws RuntimeException {
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
