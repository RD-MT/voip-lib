package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AccountCreator {
   @Nullable
   String getAccountCreationRequestToken();

   void setAccountCreationRequestToken(@Nullable String var1);

   @Nullable
   String getActivationCode();

   AccountCreator.ActivationCodeStatus setActivationCode(@Nullable String var1);

   @Nullable
   String getAlgorithm();

   AccountCreatorAlgoStatus setAlgorithm(@Nullable String var1);

   AccountCreator.Status setAsDefault(boolean var1);

   @Nullable
   String getDisplayName();

   AccountCreator.UsernameStatus setDisplayName(@Nullable String var1);

   @Nullable
   String getDomain();

   AccountCreator.DomainStatus setDomain(@Nullable String var1);

   @Nullable
   String getEmail();

   AccountCreator.EmailStatus setEmail(@Nullable String var1);

   @Nullable
   String getHa1();

   AccountCreator.PasswordStatus setHa1(@Nullable String var1);

   @Nullable
   String getLanguage();

   AccountCreator.LanguageStatus setLanguage(@Nullable String var1);

   @Nullable
   String getPassword();

   AccountCreator.PasswordStatus setPassword(@Nullable String var1);

   @Nullable
   String getPhoneCountryCode();

   @Nullable
   String getPhoneNumber();

   @Nullable
   String getPnParam();

   void setPnParam(@Nullable String var1);

   @Nullable
   String getPnPrid();

   void setPnPrid(@Nullable String var1);

   @Nullable
   String getPnProvider();

   void setPnProvider(@Nullable String var1);

   void setProxyConfig(@Nullable ProxyConfig var1);

   @Nullable
   String getRoute();

   AccountCreator.Status setRoute(@Nullable String var1);

   boolean getSetAsDefault();

   @Nullable
   String getToken();

   void setToken(@Nullable String var1);

   TransportType getTransport();

   AccountCreator.TransportStatus setTransport(TransportType var1);

   @Nullable
   String getUsername();

   AccountCreator.UsernameStatus setUsername(@Nullable String var1);

   AccountCreator.Status activateAccount();

   AccountCreator.Status activateAlias();

   AccountCreator.Status createAccount();

   @Nullable
   Account createAccountInCore();

   /** @deprecated */
   @Deprecated
   @Nullable
   ProxyConfig createProxyConfig();

   AccountCreator.Status isAccountActivated();

   AccountCreator.Status isAccountExist();

   AccountCreator.Status isAccountLinked();

   AccountCreator.Status isAliasUsed();

   AccountCreator.Status linkAccount();

   AccountCreator.Status loginLinphoneAccount();

   AccountCreator.Status recoverAccount();

   AccountCreator.Status requestAccountCreationRequestToken();

   AccountCreator.Status requestAccountCreationTokenUsingRequestToken();

   AccountCreator.Status requestAuthToken();

   void reset();

   int setPhoneNumber(@Nullable String var1, @Nullable String var2);

   AccountCreator.Status updateAccount();

   void useTestAdminAccount();

   @NonNull
   AccountCreator create(@NonNull Core var1);

   void addListener(AccountCreatorListener var1);

   void removeListener(AccountCreatorListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum Status {
      RequestOk(0),
      RequestFailed(1),
      MissingArguments(2),
      MissingCallbacks(3),
      AccountCreated(4),
      AccountNotCreated(5),
      AccountExist(6),
      AccountExistWithAlias(7),
      AccountNotExist(8),
      AliasIsAccount(9),
      AliasExist(10),
      AliasNotExist(11),
      AccountActivated(12),
      AccountAlreadyActivated(13),
      AccountNotActivated(14),
      AccountLinked(15),
      AccountNotLinked(16),
      ServerError(17),
      PhoneNumberInvalid(18),
      WrongActivationCode(19),
      PhoneNumberOverused(20),
      AlgoNotSupported(21),
      UnexpectedError(22),
      NotImplementedError(23),
      RequestNotAuthorized(24);

      protected final int mValue;

      private Status(int value) {
         this.mValue = value;
      }

      public static AccountCreator.Status fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return RequestOk;
         case 1:
            return RequestFailed;
         case 2:
            return MissingArguments;
         case 3:
            return MissingCallbacks;
         case 4:
            return AccountCreated;
         case 5:
            return AccountNotCreated;
         case 6:
            return AccountExist;
         case 7:
            return AccountExistWithAlias;
         case 8:
            return AccountNotExist;
         case 9:
            return AliasIsAccount;
         case 10:
            return AliasExist;
         case 11:
            return AliasNotExist;
         case 12:
            return AccountActivated;
         case 13:
            return AccountAlreadyActivated;
         case 14:
            return AccountNotActivated;
         case 15:
            return AccountLinked;
         case 16:
            return AccountNotLinked;
         case 17:
            return ServerError;
         case 18:
            return PhoneNumberInvalid;
         case 19:
            return WrongActivationCode;
         case 20:
            return PhoneNumberOverused;
         case 21:
            return AlgoNotSupported;
         case 22:
            return UnexpectedError;
         case 23:
            return NotImplementedError;
         case 24:
            return RequestNotAuthorized;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Status");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum PhoneNumberStatus {
      Ok(1),
      TooShort(2),
      TooLong(4),
      InvalidCountryCode(8),
      Invalid(16);

      protected final int mValue;

      private PhoneNumberStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.PhoneNumberStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 1:
            return Ok;
         case 2:
            return TooShort;
         case 4:
            return TooLong;
         case 8:
            return InvalidCountryCode;
         case 16:
            return Invalid;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for PhoneNumberStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum UsernameStatus {
      Ok(0),
      TooShort(1),
      TooLong(2),
      InvalidCharacters(3),
      Invalid(4);

      protected final int mValue;

      private UsernameStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.UsernameStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return TooShort;
         case 2:
            return TooLong;
         case 3:
            return InvalidCharacters;
         case 4:
            return Invalid;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for UsernameStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum EmailStatus {
      Ok(0),
      Malformed(1),
      InvalidCharacters(2);

      protected final int mValue;

      private EmailStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.EmailStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return Malformed;
         case 2:
            return InvalidCharacters;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for EmailStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum PasswordStatus {
      Ok(0),
      TooShort(1),
      TooLong(2),
      InvalidCharacters(3),
      MissingCharacters(4);

      protected final int mValue;

      private PasswordStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.PasswordStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return TooShort;
         case 2:
            return TooLong;
         case 3:
            return InvalidCharacters;
         case 4:
            return MissingCharacters;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for PasswordStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum LanguageStatus {
      Ok(0);

      protected final int mValue;

      private LanguageStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.LanguageStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for LanguageStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum ActivationCodeStatus {
      Ok(0),
      TooShort(1),
      TooLong(2),
      InvalidCharacters(3);

      protected final int mValue;

      private ActivationCodeStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.ActivationCodeStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return TooShort;
         case 2:
            return TooLong;
         case 3:
            return InvalidCharacters;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for ActivationCodeStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum DomainStatus {
      Ok(0),
      Invalid(1);

      protected final int mValue;

      private DomainStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.DomainStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return Invalid;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for DomainStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum TransportStatus {
      Ok(0),
      Unsupported(1);

      protected final int mValue;

      private TransportStatus(int value) {
         this.mValue = value;
      }

      public static AccountCreator.TransportStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Ok;
         case 1:
            return Unsupported;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for TransportStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}
