package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PushNotificationConfig {
   @Nullable
   String getBundleIdentifier();

   void setBundleIdentifier(@Nullable String var1);

   @NonNull
   String getCallSnd();

   void setCallSnd(@NonNull String var1);

   @NonNull
   String getCallStr();

   void setCallStr(@NonNull String var1);

   @NonNull
   String getGroupChatStr();

   void setGroupChatStr(@NonNull String var1);

   @NonNull
   String getMsgSnd();

   void setMsgSnd(@NonNull String var1);

   @NonNull
   String getMsgStr();

   void setMsgStr(@NonNull String var1);

   @Nullable
   String getParam();

   void setParam(@Nullable String var1);

   @Nullable
   String getPrid();

   void setPrid(@Nullable String var1);

   @Nullable
   String getProvider();

   void setProvider(@Nullable String var1);

   @Nullable
   String getRemoteToken();

   void setRemoteToken(@Nullable String var1);

   @Nullable
   String getTeamId();

   void setTeamId(@Nullable String var1);

   @Nullable
   String getVoipToken();

   void setVoipToken(@Nullable String var1);

   @NonNull
   PushNotificationConfig clone();

   @NonNull
   boolean isEqual(@NonNull PushNotificationConfig var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
