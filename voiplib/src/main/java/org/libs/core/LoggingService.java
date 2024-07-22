package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface LoggingService {
   @Nullable
   String getDomain();

   void setDomain(@Nullable String var1);

   void setLogLevel(LogLevel var1);

   int getLogLevelMask();

   void setLogLevelMask(int var1);

   void setStackTraceDumpsEnabled(boolean var1);

   void debug(@NonNull String var1);

   void error(@NonNull String var1);

   void fatal(@NonNull String var1);

   void message(@NonNull String var1);

   void setLogFile(@NonNull String var1, @NonNull String var2, int var3);

   void trace(@NonNull String var1);

   void warning(@NonNull String var1);

   @NonNull
   LoggingService get();

   void addListener(LoggingServiceListener var1);

   void removeListener(LoggingServiceListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
