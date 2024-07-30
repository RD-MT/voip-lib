package org.linphone.core;

import androidx.annotation.NonNull;

public interface DialPlan {
   String getCountry();

   @NonNull
   String getCountryCallingCode();

   @NonNull
   String getInternationalCallPrefix();

   boolean isGeneric();

   @NonNull
   String getIsoCountryCode();

   int getNationalNumberLength();

   @NonNull
   DialPlan byCcc(@NonNull String var1);

   @NonNull
   DialPlan byCccAsInt(@NonNull int var1);

   @NonNull
   DialPlan[] getAllList();

   int lookupCccFromE164(@NonNull String var1);

   int lookupCccFromIso(@NonNull String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
