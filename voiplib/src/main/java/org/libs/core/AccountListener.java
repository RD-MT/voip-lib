package org.libs.core;

import androidx.annotation.NonNull;

public interface AccountListener {
   void onRegistrationStateChanged(@NonNull Account var1, RegistrationState var2, @NonNull String var3);
}
