package org.linphone.core;

public enum LdapCertVerificationMode {
   Default(-1),
   Disabled(0),
   Enabled(1);

   protected final int mValue;

   private LdapCertVerificationMode(int value) {
      this.mValue = value;
   }

   public static LdapCertVerificationMode fromInt(int value) throws RuntimeException {
      switch(value) {
      case -1:
         return Default;
      case 0:
         return Disabled;
      case 1:
         return Enabled;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LdapCertVerificationMode");
      }
   }

   protected static LdapCertVerificationMode[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LdapCertVerificationMode[] enumArray = new LdapCertVerificationMode[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LdapCertVerificationMode[] values) throws RuntimeException {
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
