package org.linphone.core;

public enum VersionUpdateCheckResult {
   UpToDate(0),
   NewVersionAvailable(1),
   Error(2);

   protected final int mValue;

   private VersionUpdateCheckResult(int value) {
      this.mValue = value;
   }

   public static VersionUpdateCheckResult fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return UpToDate;
      case 1:
         return NewVersionAvailable;
      case 2:
         return Error;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for VersionUpdateCheckResult");
      }
   }

   protected static VersionUpdateCheckResult[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      VersionUpdateCheckResult[] enumArray = new VersionUpdateCheckResult[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(VersionUpdateCheckResult[] values) throws RuntimeException {
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
