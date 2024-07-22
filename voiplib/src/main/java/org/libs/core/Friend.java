package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Friend {
   @Nullable
   Address getAddress();

   int setAddress(@Nullable Address var1);

   @NonNull
   Address[] getAddresses();

   int getCapabilities();

   ConsolidatedPresence getConsolidatedPresence();

   @NonNull
   Core getCore();

   SubscribePolicy getIncSubscribePolicy();

   int setIncSubscribePolicy(SubscribePolicy var1);

   boolean isPresenceReceived();

   @Nullable
   String getName();

   int setName(@Nullable String var1);

   @Nullable
   String getNativeUri();

   void setNativeUri(@Nullable String var1);

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

   @Nullable
   PresenceModel getPresenceModel();

   void setPresenceModel(@Nullable PresenceModel var1);

   @Nullable
   String getRefKey();

   void setRefKey(@Nullable String var1);

   boolean getStarred();

   void setStarred(boolean var1);

   boolean isSubscribesEnabled();

   int setSubscribesEnabled(boolean var1);

   SubscriptionState getSubscriptionState();

   @Nullable
   Vcard getVcard();

   void setVcard(@Nullable Vcard var1);

   void addAddress(@NonNull Address var1);

   void addPhoneNumber(@NonNull String var1);

   void addPhoneNumberWithLabel(@NonNull FriendPhoneNumber var1);

   boolean createVcard(@Nullable String var1);

   void done();

   void edit();

   float getCapabilityVersion(FriendCapability var1);

   @Nullable
   PresenceModel getPresenceModelForUriOrTel(@NonNull String var1);

   boolean hasCapability(FriendCapability var1);

   boolean hasCapabilityWithVersion(FriendCapability var1, float var2);

   boolean hasCapabilityWithVersionOrMore(FriendCapability var1, float var2);

   boolean hasPhoneNumber(@NonNull String var1);

   boolean inList();

   void remove();

   void removeAddress(@NonNull Address var1);

   void removePhoneNumber(@NonNull String var1);

   void removePhoneNumberWithLabel(@NonNull FriendPhoneNumber var1);

   void save(@NonNull Core var1);

   void setPresenceModelForUriOrTel(@NonNull String var1, @Nullable PresenceModel var2);

   @Nullable
   Friend newFromVcard(@NonNull Vcard var1);

   void addListener(FriendListener var1);

   void removeListener(FriendListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
