package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PresencePerson {
   @Nullable
   String getId();

   int setId(@Nullable String var1);

   int getNbActivities();

   int getNbActivitiesNotes();

   int getNbNotes();

   int addActivitiesNote(@NonNull PresenceNote var1);

   int addActivity(@NonNull PresenceActivity var1);

   int addNote(@NonNull PresenceNote var1);

   int clearActivities();

   int clearActivitiesNotes();

   int clearNotes();

   @Nullable
   PresenceNote getNthActivitiesNote(int var1);

   @Nullable
   PresenceActivity getNthActivity(int var1);

   @Nullable
   PresenceNote getNthNote(int var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
