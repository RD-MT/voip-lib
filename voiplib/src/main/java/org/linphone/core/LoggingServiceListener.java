package org.linphone.core;

import androidx.annotation.NonNull;

public interface LoggingServiceListener {
   void onLogMessageWritten(@NonNull LoggingService var1, @NonNull String var2, LogLevel var3, @NonNull String var4);
}
