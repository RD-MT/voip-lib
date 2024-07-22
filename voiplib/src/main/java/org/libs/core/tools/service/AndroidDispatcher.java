package org.libs.core.tools.service;

import android.os.Handler;
import android.os.Looper;

public final class AndroidDispatcher {
   private static final Handler sHandler = new Handler(Looper.getMainLooper());

   private AndroidDispatcher() {
   }

   public static void dispatchOnUIThread(Runnable r) {
      sHandler.post(r);
   }

   public static void dispatchOnUIThreadAfter(Runnable r, long after) {
      sHandler.postDelayed(r, after);
   }

   public static void removeFromUIThreadDispatcher(Runnable r) {
      sHandler.removeCallbacks(r);
   }
}
