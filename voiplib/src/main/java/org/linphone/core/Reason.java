package org.linphone.core;

public enum Reason {
   None(0),
   NoResponse(1),
   Forbidden(2),
   Declined(3),
   NotFound(4),
   NotAnswered(5),
   Busy(6),
   UnsupportedContent(7),
   BadEvent(8),
   IOError(9),
   DoNotDisturb(10),
   Unauthorized(11),
   NotAcceptable(12),
   NoMatch(13),
   MovedPermanently(14),
   Gone(15),
   TemporarilyUnavailable(16),
   AddressIncomplete(17),
   NotImplemented(18),
   BadGateway(19),
   SessionIntervalTooSmall(20),
   ServerTimeout(21),
   Unknown(22),
   Transferred(23);

   protected final int mValue;

   private Reason(int value) {
      this.mValue = value;
   }

   public static Reason fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return NoResponse;
      case 2:
         return Forbidden;
      case 3:
         return Declined;
      case 4:
         return NotFound;
      case 5:
         return NotAnswered;
      case 6:
         return Busy;
      case 7:
         return UnsupportedContent;
      case 8:
         return BadEvent;
      case 9:
         return IOError;
      case 10:
         return DoNotDisturb;
      case 11:
         return Unauthorized;
      case 12:
         return NotAcceptable;
      case 13:
         return NoMatch;
      case 14:
         return MovedPermanently;
      case 15:
         return Gone;
      case 16:
         return TemporarilyUnavailable;
      case 17:
         return AddressIncomplete;
      case 18:
         return NotImplemented;
      case 19:
         return BadGateway;
      case 20:
         return SessionIntervalTooSmall;
      case 21:
         return ServerTimeout;
      case 22:
         return Unknown;
      case 23:
         return Transferred;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for Reason");
      }
   }

   protected static Reason[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      Reason[] enumArray = new Reason[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(Reason[] values) throws RuntimeException {
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
