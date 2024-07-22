package org.libs.core;

public interface VideoActivationPolicy {
   boolean getAutomaticallyAccept();

   void setAutomaticallyAccept(boolean var1);

   boolean getAutomaticallyInitiate();

   void setAutomaticallyInitiate(boolean var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
