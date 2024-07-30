package org.linphone.core;

public enum LdapCheck {
   Ok(0),
   ServerEmpty(1),
   ServerNotUrl(2),
   ServerNoScheme(4),
   ServerNotLdap(8),
   ServerLdaps(16),
   BaseObjectEmpty(32),
   MissingFields(64);

   protected final int mValue;

   private LdapCheck(int value) {
      this.mValue = value;
   }

   public static LdapCheck fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Ok;
      case 1:
         return ServerEmpty;
      case 2:
         return ServerNotUrl;
      case 4:
         return ServerNoScheme;
      case 8:
         return ServerNotLdap;
      case 16:
         return ServerLdaps;
      case 32:
         return BaseObjectEmpty;
      case 64:
         return MissingFields;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LdapCheck");
      }
   }

   protected static LdapCheck[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LdapCheck[] enumArray = new LdapCheck[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LdapCheck[] values) throws RuntimeException {
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
