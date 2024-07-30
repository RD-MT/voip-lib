package org.linphone.core;

public interface Range {
   int getMax();

   void setMax(int var1);

   int getMin();

   void setMin(int var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
