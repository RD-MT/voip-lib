package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Event {
   @NonNull
   Core getCore();

   @NonNull
   ErrorInfo getErrorInfo();

   @NonNull
   Address getFrom();

   @NonNull
   String getName();

   PublishState getPublishState();

   Reason getReason();

   @NonNull
   Address getRemoteContact();

   @NonNull
   Address getResource();

   SubscriptionDir getSubscriptionDir();

   SubscriptionState getSubscriptionState();

   @NonNull
   Address getTo();

   int acceptSubscription();

   void addCustomHeader(@NonNull String var1, @Nullable String var2);

   int denySubscription(Reason var1);

   @Nullable
   String getCustomHeader(@NonNull String var1);

   int notify(@Nullable Content var1);

   void pausePublish();

   int refreshPublish();

   int refreshSubscribe();

   void removeCustomHeader(@NonNull String var1);

   int sendPublish(@NonNull Content var1);

   int sendSubscribe(@Nullable Content var1);

   void terminate();

   int updatePublish(@NonNull Content var1);

   @Nullable
   int updateSubscribe(@Nullable Content var1);

   void addListener(EventListener var1);

   void removeListener(EventListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}
