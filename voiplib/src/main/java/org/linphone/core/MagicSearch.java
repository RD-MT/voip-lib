package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface MagicSearch {
   @Nullable
   String getDelimiter();

   void setDelimiter(@Nullable String var1);

   @NonNull
   SearchResult[] getLastSearch();

   boolean getLimitedSearch();

   void setLimitedSearch(boolean var1);

   int getMaxWeight();

   void setMaxWeight(int var1);

   int getMinWeight();

   void setMinWeight(int var1);

   int getSearchLimit();

   void setSearchLimit(int var1);

   boolean getUseDelimiter();

   void setUseDelimiter(boolean var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   SearchResult[] getContactListFromFilter(@Nullable String var1, @Nullable String var2);

   /** @deprecated */
   @Deprecated
   void getContactListFromFilterAsync(@Nullable String var1, @Nullable String var2);

   /** @deprecated */
   @Deprecated
   @NonNull
   SearchResult[] getContacts(@Nullable String var1, @Nullable String var2, int var3);

   /** @deprecated */
   @Deprecated
   void getContactsAsync(@Nullable String var1, @Nullable String var2, int var3);

   @NonNull
   SearchResult[] getContactsList(@Nullable String var1, @Nullable String var2, int var3, MagicSearchAggregation var4);

   void getContactsListAsync(@Nullable String var1, @Nullable String var2, int var3, MagicSearchAggregation var4);

   void resetSearchCache();

   void addListener(MagicSearchListener var1);

   void removeListener(MagicSearchListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
