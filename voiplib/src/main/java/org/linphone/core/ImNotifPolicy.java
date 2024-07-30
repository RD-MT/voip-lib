package org.linphone.core;

public interface ImNotifPolicy {
   boolean getRecvImdnDelivered();

   void setRecvImdnDelivered(boolean var1);

   boolean getRecvImdnDeliveryError();

   void setRecvImdnDeliveryError(boolean var1);

   boolean getRecvImdnDisplayed();

   void setRecvImdnDisplayed(boolean var1);

   boolean getRecvIsComposing();

   void setRecvIsComposing(boolean var1);

   boolean getSendImdnDelivered();

   void setSendImdnDelivered(boolean var1);

   boolean getSendImdnDeliveryError();

   void setSendImdnDeliveryError(boolean var1);

   boolean getSendImdnDisplayed();

   void setSendImdnDisplayed(boolean var1);

   boolean getSendIsComposing();

   void setSendIsComposing(boolean var1);

   void clear();

   void enableAll();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
