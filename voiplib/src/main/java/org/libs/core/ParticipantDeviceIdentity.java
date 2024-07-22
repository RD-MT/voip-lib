package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ParticipantDeviceIdentity {
   @NonNull
   Address getAddress();

   /** @deprecated */
   @Deprecated
   String getCapabilityDescriptor();

   /** @deprecated */
   @Deprecated
   void setCapabilityDescriptor(String var1);

   void setCapabilityDescriptor(@Nullable String[] var1);

   @NonNull
   String[] getCapabilityDescriptorList();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
