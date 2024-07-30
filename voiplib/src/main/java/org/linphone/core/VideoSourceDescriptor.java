package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface VideoSourceDescriptor {
   @Nullable
   Call getCall();

   void setCall(@Nullable Call var1);

   @Nullable
   String getCameraId();

   void setCameraId(@Nullable String var1);

   @Nullable
   String getImage();

   void setImage(@Nullable String var1);

   VideoSourceType getType();

   @NonNull
   VideoSourceDescriptor clone();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
