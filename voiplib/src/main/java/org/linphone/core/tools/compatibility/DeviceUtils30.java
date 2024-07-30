package org.linphone.core.tools.compatibility;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.linphone.core.tools.Log;

public class DeviceUtils30 {
   @RequiresApi(api = Build.VERSION_CODES.R)
   public static void logPreviousCrashesIfAny(Context context) {
      ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
      List<ApplicationExitInfo> exitInfos = activityManager.getHistoricalProcessExitReasons((String)null, 0, 5);

      for(Iterator var3 = exitInfos.iterator(); var3.hasNext(); Log.i("=========================================")) {
         ApplicationExitInfo exitInfo = (ApplicationExitInfo)var3.next();
         Log.i("==== Previous exit reason information dump ====");
         Log.i("REASON=", getReasonAsString(exitInfo.getReason()));
         Log.i("TIMESTAMP=", getHumanReadableDateAndTimeFromTimestamp(exitInfo.getTimestamp()));
         Log.i("DESCRIPTION=", exitInfo.getDescription());
         if (exitInfo.getReason() == ApplicationExitInfo.REASON_ANR) {
            try {
               InputStream inputStream = exitInfo.getTraceInputStream();
               if (inputStream != null) {
                  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                  String trace = (String)bufferedReader.lines().collect(Collectors.joining("\n"));
                  Log.w("TRACE=", trace);
                  bufferedReader.close();
               } else {
                  Log.w("[Device Utils 30] No input stream for exit info");
               }
            } catch (IOException var8) {
               Log.i("[Device Utils 30] IO Exception while trying to get trace input stream: ", var8);
            } catch (IllegalStateException var9) {
               Log.i("[Device Utils 30] Illegal State Exception while trying to get trace input stream: ", var9);
            } catch (Exception var10) {
               Log.i("[Device Utils 30] Exception while trying to get trace input stream: ", var10);
            }
         }
      }

   }

   public static String getReasonAsString(int reason) {
      if (reason == 0) {
         return "Unknown";
      } else if (reason == 10) {
         return "User requested";
      } else if (reason == 11) {
         return "User stopped";
      } else if (reason == 2) {
         return "Signaled";
      } else if (reason == 8) {
         return "Permission changed";
      } else if (reason == 13) {
         return "Other";
      } else if (reason == 3) {
         return "Low memory";
      } else if (reason == 7) {
         return "Initialization failure";
      } else if (reason == 1) {
         return "Self stop";
      } else if (reason == 9) {
         return "Excessive resource usage";
      } else if (reason == 12) {
         return "Dependency died";
      } else if (reason == 5) {
         return "Native crash";
      } else if (reason == 4) {
         return "Crash";
      } else {
         return reason == 6 ? "ANR" : "Unexpected: " + reason;
      }
   }

   public static String getHumanReadableDateAndTimeFromTimestamp(long timestamp) {
      Calendar cal = Calendar.getInstance();
      cal.setTimeInMillis(timestamp);
      return DateFormat.format("dd-MM-yyyy HH:mm:ss", cal).toString();
   }
}
