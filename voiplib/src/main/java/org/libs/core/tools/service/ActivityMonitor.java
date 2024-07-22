package org.libs.core.tools.service;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.util.ArrayList;
import org.libs.core.tools.Log;

public class ActivityMonitor implements ActivityLifecycleCallbacks {
   private final ArrayList<Activity> activities = new ArrayList();
   private boolean mActive = false;
   private int mRunningActivities = 0;
   private ActivityMonitor.InactivityChecker mLastChecker;

   public synchronized void onActivityCreated(Activity activity, Bundle savedInstanceState) {
      Log.i("[Activity Monitor] Activity created:" + activity);
      if (!this.activities.contains(activity)) {
         this.activities.add(activity);
      }

   }

   public void onActivityStarted(Activity activity) {
      Log.i("Activity started:" + activity);
   }

   public synchronized void onActivityResumed(Activity activity) {
      Log.i("[Activity Monitor] Activity resumed:" + activity);
      if (!this.activities.contains(activity)) {
         Log.w("[Activity Monitor] Activity wasn't registered yet...");
         this.activities.add(activity);
      }

      ++this.mRunningActivities;
      Log.i("[Activity Monitor] runningActivities=" + this.mRunningActivities);
      this.checkActivity();
   }

   public synchronized void onActivityPaused(Activity activity) {
      Log.i("[Activity Monitor] Activity paused:" + activity);
      if (!this.activities.contains(activity)) {
         Log.w("[Activity Monitor] Activity wasn't registered yet...");
         this.activities.add(activity);
      } else {
         --this.mRunningActivities;
         Log.i("[Activity Monitor] runningActivities=" + this.mRunningActivities);
         this.checkActivity();
      }

   }

   public void onActivityStopped(Activity activity) {
      Log.i("[Activity Monitor] Activity stopped:" + activity);
   }

   public synchronized void onActivityDestroyed(Activity activity) {
      Log.i("[Activity Monitor] Activity destroyed:" + activity);
      this.activities.remove(activity);
   }

   void startInactivityChecker() {
      if (this.mLastChecker != null) {
         this.mLastChecker.cancel();
      }

      AndroidDispatcher.dispatchOnUIThreadAfter(this.mLastChecker = new ActivityMonitor.InactivityChecker(), 2000L);
   }

   void checkActivity() {
      if (this.mRunningActivities == 0) {
         if (this.mActive) {
            this.startInactivityChecker();
         }
      } else if (this.mRunningActivities > 0) {
         if (!this.mActive) {
            this.mActive = true;
            this.onForegroundMode();
         }

         if (this.mLastChecker != null) {
            this.mLastChecker.cancel();
            this.mLastChecker = null;
         }
      }

   }

   private void onBackgroundMode() {
      Log.i("[Activity Monitor] App has entered background mode");
      if (CoreManager.isReady()) {
         CoreManager.instance().onBackgroundMode();
      }

   }

   private void onForegroundMode() {
      Log.i("[Activity Monitor] App has left background mode");
      if (CoreManager.isReady()) {
         CoreManager.instance().onForegroundMode();
      }

   }

   public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
   }

   class InactivityChecker implements Runnable {
      private boolean isCanceled;

      void cancel() {
         this.isCanceled = true;
      }

      public void run() {
         if (CoreManager.isReady()) {
            synchronized(CoreManager.instance()) {
               if (!this.isCanceled && ActivityMonitor.this.mRunningActivities == 0 && ActivityMonitor.this.mActive) {
                  ActivityMonitor.this.mActive = false;
                  ActivityMonitor.this.onBackgroundMode();
               }
            }
         }

      }
   }
}
