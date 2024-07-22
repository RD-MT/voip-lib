package org.libs.core;

public interface PushNotificationMessage {
   boolean isConferenceInvitationCancellation();

   boolean isConferenceInvitationNew();

   boolean isConferenceInvitationUpdate();

   boolean isIcalendar();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
