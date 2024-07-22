package org.libs.core;

public interface DigestAuthenticationPolicy {
   boolean getAllowMd5();

   void setAllowMd5(boolean var1);

   boolean getAllowNoQop();

   void setAllowNoQop(boolean var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
