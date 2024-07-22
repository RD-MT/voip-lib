package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PresenceService {
   PresenceBasicStatus getBasicStatus();

   int setBasicStatus(PresenceBasicStatus var1);

   @Nullable
   String getContact();

   int setContact(@Nullable String var1);

   @Nullable
   String getId();

   int setId(@Nullable String var1);

   int getNbNotes();

   @NonNull
   String[] getServiceDescriptions();

   int setServiceDescriptions(@Nullable String[] var1);

   int addNote(@NonNull PresenceNote var1);

   int clearNotes();

   @Nullable
   PresenceNote getNthNote(int var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
