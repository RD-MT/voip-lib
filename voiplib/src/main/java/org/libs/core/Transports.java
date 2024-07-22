package org.libs.core;

public interface Transports {
   int getDtlsPort();

   void setDtlsPort(int var1);

   int getTcpPort();

   void setTcpPort(int var1);

   int getTlsPort();

   void setTlsPort(int var1);

   int getUdpPort();

   void setUdpPort(int var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
