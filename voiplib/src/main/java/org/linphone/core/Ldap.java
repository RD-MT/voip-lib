package org.linphone.core;

import androidx.annotation.NonNull;

public interface Ldap {
   @NonNull
   Core getCore();

   int getIndex();

   void setIndex(int var1);

   @NonNull
   LdapParams getParams();

   void setParams(@NonNull LdapParams var1);

   @NonNull
   Ldap newWithParams(@NonNull Core var1, @NonNull LdapParams var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
