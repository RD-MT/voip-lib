package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface XmlRpcRequest {
   @Nullable
   String getContent();

   int getIntResponse();

   @NonNull
   String[] getListResponse();

   @Nullable
   String getRawResponse();

   XmlRpcStatus getStatus();

   @Nullable
   String getStringResponse();

   void addIntArg(int var1);

   void addStringArg(@NonNull String var1);

   void addListener(XmlRpcRequestListener var1);

   void removeListener(XmlRpcRequestListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
