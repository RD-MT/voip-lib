package org.libs.core;

import androidx.annotation.NonNull;

public interface MagicSearchListener {
   void onLdapHaveMoreResults(@NonNull MagicSearch var1, @NonNull Ldap var2);

   void onSearchResultsReceived(@NonNull MagicSearch var1);
}
