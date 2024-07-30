package org.linphone.mediastream;

public final class Log {
   private static Log logger;

   private static Log instance() {
      if (logger == null) {
         logger = new Log();
      }

      return logger;
   }

   private Log() {
   }

   /** @deprecated */
   @Deprecated
   public Log(String tag, boolean enable) {
   }

   private native void d(String var1);

   public static void d(Object... objects) {
      instance().d(toString(objects));
   }

   private native void i(String var1);

   public static void i(Object... objects) {
      instance().i(toString(objects));
   }

   private native void w(String var1);

   public static void w(Object... objects) {
      instance().w(toString(objects));
   }

   private native void e(String var1);

   public static void e(Object... objects) {
      instance().e(toString(objects));
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
