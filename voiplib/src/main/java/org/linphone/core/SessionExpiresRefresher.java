package org.linphone.core;

public enum SessionExpiresRefresher {
   Unspecified(0),
   UAS(1),
   UAC(2);

   protected final int mValue;

   private SessionExpiresRefresher(int value) {
      this.mValue = value;
   }

   public static SessionExpiresRefresher fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Unspecified;
      case 1:
         return UAS;
      case 2:
         return UAC;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SessionExpiresRefresher");
      }
   }

   protected static SessionExpiresRefresher[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SessionExpiresRefresher[] enumArray = new SessionExpiresRefresher[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SessionExpiresRefresher[] values) throws RuntimeException {
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
