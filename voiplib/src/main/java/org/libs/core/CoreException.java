package org.libs.core;

public class CoreException extends Exception {
   public CoreException() {
   }

   public CoreException(String detailMessage) {
      super(detailMessage);
   }

   public CoreException(Throwable e) {
      super(e);
   }

   public CoreException(String detailMessage, Throwable e) {
      super(detailMessage, e);
   }
}
