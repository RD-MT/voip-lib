package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PresenceModel {
   @Nullable
   PresenceActivity getActivity();

   PresenceBasicStatus getBasicStatus();

   int setBasicStatus(PresenceBasicStatus var1);

   int getCapabilities();

   ConsolidatedPresence getConsolidatedPresence();

   @Nullable
   String getContact();

   int setContact(@Nullable String var1);

   boolean isOnline();

   long getLatestActivityTimestamp();

   int getNbActivities();

   int getNbPersons();

   int getNbServices();

   @Nullable
   Address getPresentity();

   int setPresentity(@Nullable Address var1);

   long getTimestamp();

   int addActivity(@NonNull PresenceActivity var1);

   int addNote(@NonNull String var1, @Nullable String var2);

   int addPerson(@NonNull PresencePerson var1);

   int addService(@NonNull PresenceService var1);

   int clearActivities();

   int clearNotes();

   int clearPersons();

   int clearServices();

   float getCapabilityVersion(FriendCapability var1);

   @Nullable
   PresenceNote getNote(@Nullable String var1);

   @Nullable
   PresenceActivity getNthActivity(int var1);

   @Nullable
   PresencePerson getNthPerson(int var1);

   @Nullable
   PresenceService getNthService(int var1);

   boolean hasCapability(FriendCapability var1);

   boolean hasCapabilityWithVersion(FriendCapability var1, float var2);

   boolean hasCapabilityWithVersionOrMore(FriendCapability var1, float var2);

   int setActivity(PresenceActivity.Type var1, @Nullable String var2);

   @Nullable
   PresenceModel newWithActivity(PresenceActivity.Type var1, @Nullable String var2);

   @Nullable
   PresenceModel newWithActivityAndNote(PresenceActivity.Type var1, @Nullable String var2, @NonNull String var3, @Nullable String var4);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
