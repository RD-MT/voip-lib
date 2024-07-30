package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Vcard {
   @Nullable
   String getEtag();

   void setEtag(@Nullable String var1);

   @Nullable
   String getFamilyName();

   void setFamilyName(@Nullable String var1);

   @Nullable
   String getFullName();

   void setFullName(@Nullable String var1);

   @Nullable
   String getGivenName();

   void setGivenName(@Nullable String var1);

   @Nullable
   String getOrganization();

   void setOrganization(@Nullable String var1);

   @NonNull
   String[] getPhoneNumbers();

   @NonNull
   FriendPhoneNumber[] getPhoneNumbersWithLabel();

   @Nullable
   String getPhoto();

   void setPhoto(@Nullable String var1);

   @NonNull
   Address[] getSipAddresses();

   boolean getSkipValidation();

   void setSkipValidation(boolean var1);

   @Nullable
   String getUid();

   void setUid(@Nullable String var1);

   @Nullable
   String getUrl();

   void setUrl(@Nullable String var1);

   void addExtendedProperty(@NonNull String var1, @NonNull String var2);

   void addPhoneNumber(@NonNull String var1);

   void addPhoneNumberWithLabel(@NonNull FriendPhoneNumber var1);

   void addSipAddress(@NonNull String var1);

   @Nullable
   String asVcard4String();

   @NonNull
   Vcard clone();

   void editMainSipAddress(@NonNull String var1);

   boolean generateUniqueId();

   @NonNull
   String[] getExtendedPropertiesValuesByName(@NonNull String var1);

   void removeExtentedPropertiesByName(@NonNull String var1);

   void removeOrganization();

   void removePhoneNumber(@NonNull String var1);

   void removePhoneNumberWithLabel(@NonNull FriendPhoneNumber var1);

   void removePhoto();

   void removeSipAddress(@NonNull String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
