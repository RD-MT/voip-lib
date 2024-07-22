package org.libs.core;

import androidx.annotation.NonNull;

public class LoggingServiceListenerStub implements LoggingServiceListener {
   public void onLogMessageWritten(@NonNull LoggingService logService, @NonNull String domain, LogLevel level, @NonNull String message) {
   }
}
