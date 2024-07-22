package org.libs.core.tools;

public final class Log {
   private static Log logger;
   private static String domain = "linphone-android";

   private static Log instance() {
      if (logger == null) {
         logger = new Log();
         Log var10000 = logger;
         setLogDomain(domain);
      }

      return logger;
   }

   private Log() {
   }

   private native void setDomain(String var1);

   public static void setLogDomain(String logDomain) {
      instance().setDomain(logDomain);
      domain = logDomain;
   }

   private native void d(String var1, String var2);

   public static void d(Object... objects) {
      instance().d(domain, toString(objects));
   }

   private native void i(String var1, String var2);

   public static void i(Object... objects) {
      instance().i(domain, toString(objects));
   }

   private native void w(String var1, String var2);

   public static void w(Object... objects) {
      instance().w(domain, toString(objects));
   }

   private native void e(String var1, String var2);

   public static void e(Object... objects) {
      instance().e(domain, toString(objects));
   }

   private native void f(String var1, String var2);

   public static void f(Object... objects) {
      instance().f(domain, toString(objects));
   }

   private static String toString(Object... objects) {
      StringBuilder sb = new StringBuilder();
      Object[] var2 = objects;
      int var3 = objects.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object o = var2[var4];
         sb.append(o);
      }

      return sb.toString();
   }
}
