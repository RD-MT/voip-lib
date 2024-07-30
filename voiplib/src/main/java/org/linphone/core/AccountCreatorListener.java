package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AccountCreatorListener {
   void onActivateAlias(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onLinkAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onIsAliasUsed(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onCreateAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onAccountCreationTokenUsingRequestToken(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onSendToken(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onRecoverAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onActivateAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onIsAccountLinked(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onIsAccountExist(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onAccountCreationRequestToken(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onIsAccountActivated(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onUpdateAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);

   void onLoginLinphoneAccount(@NonNull AccountCreator var1, AccountCreator.Status var2, @Nullable String var3);
}
