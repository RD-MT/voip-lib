package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface LdapParams {
   LdapAuthMethod getAuthMethod();

   void setAuthMethod(LdapAuthMethod var1);

   @NonNull
   String getBaseObject();

   void setBaseObject(@NonNull String var1);

   @Nullable
   String getBindDn();

   void setBindDn(@Nullable String var1);

   LdapDebugLevel getDebugLevel();

   void setDebugLevel(LdapDebugLevel var1);

   int getDelay();

   void setDelay(int var1);

   boolean getEnabled();

   void setEnabled(boolean var1);

   @Nullable
   String getFilter();

   void setFilter(@Nullable String var1);

   int getMaxResults();

   void setMaxResults(int var1);

   int getMinChars();

   void setMinChars(int var1);

   @Nullable
   String getNameAttribute();

   void setNameAttribute(@Nullable String var1);

   @Nullable
   String getPassword();

   void setPassword(@Nullable String var1);

   boolean isSalEnabled();

   void setSalEnabled(boolean var1);

   @NonNull
   String getServer();

   void setServer(@NonNull String var1);

   LdapCertVerificationMode getServerCertificatesVerificationMode();

   void setServerCertificatesVerificationMode(LdapCertVerificationMode var1);

   @Nullable
   String getSipAttribute();

   void setSipAttribute(@Nullable String var1);

   @Nullable
   String getSipDomain();

   void setSipDomain(@Nullable String var1);

   int getTimeout();

   void setTimeout(int var1);

   boolean isTlsEnabled();

   void setTlsEnabled(boolean var1);

   int check();

   @NonNull
   LdapParams clone();

   @Nullable
   String getCustomValue(@NonNull String var1);

   void setCustomValue(@NonNull String var1, @Nullable String var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
