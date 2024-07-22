package org.libs.core;

import androidx.annotation.NonNull;

public interface XmlRpcSession {
   @NonNull
   XmlRpcRequest createRequest(XmlRpcArgType var1, @NonNull String var2);

   void release();

   void sendRequest(@NonNull XmlRpcRequest var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
