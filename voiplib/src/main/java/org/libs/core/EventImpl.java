package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class EventImpl implements Event {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected EventImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this.core = this.getCore();
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native ErrorInfo getErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo getErrorInfo() {
      synchronized(this.core) {
         return this.getErrorInfo(this.nativePtr);
      }
   }

   private native Address getFrom(long var1);

   @NonNull
   public synchronized Address getFrom() {
      synchronized(this.core) {
         return this.getFrom(this.nativePtr);
      }
   }

   private native String getName(long var1);

   @NonNull
   public synchronized String getName() {
      synchronized(this.core) {
         return this.getName(this.nativePtr);
      }
   }

   private native int getPublishState(long var1);

   public synchronized PublishState getPublishState() {
      synchronized(this.core) {
         return PublishState.fromInt(this.getPublishState(this.nativePtr));
      }
   }

   private native int getReason(long var1);

   public synchronized Reason getReason() {
      synchronized(this.core) {
         return Reason.fromInt(this.getReason(this.nativePtr));
      }
   }

   private native Address getRemoteContact(long var1);

   @NonNull
   public synchronized Address getRemoteContact() {
      synchronized(this.core) {
         return this.getRemoteContact(this.nativePtr);
      }
   }

   private native Address getResource(long var1);

   @NonNull
   public synchronized Address getResource() {
      synchronized(this.core) {
         return this.getResource(this.nativePtr);
      }
   }

   private native int getSubscriptionDir(long var1);

   public synchronized SubscriptionDir getSubscriptionDir() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getSubscriptionDir() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return SubscriptionDir.fromInt(this.getSubscriptionDir(this.nativePtr));
      }
   }

   private native int getSubscriptionState(long var1);

   public synchronized SubscriptionState getSubscriptionState() {
      synchronized(this.core) {
         return SubscriptionState.fromInt(this.getSubscriptionState(this.nativePtr));
      }
   }

   private native Address getTo(long var1);

   @NonNull
   public synchronized Address getTo() {
      synchronized(this.core) {
         return this.getTo(this.nativePtr);
      }
   }

   private native int acceptSubscription(long var1);

   public synchronized int acceptSubscription() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call acceptSubscription() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.acceptSubscription(this.nativePtr);
      }
   }

   private native void addCustomHeader(long var1, String var3, String var4);

   public synchronized void addCustomHeader(@NonNull String name, @Nullable String value) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addCustomHeader() on it, clone it first.");
            } catch (CoreException var10) {
               Log.e(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.e(st);
               }
            }
         }

         this.addCustomHeader(this.nativePtr, name, value);
      }
   }

   private native int denySubscription(long var1, int var3);

   public synchronized int denySubscription(Reason reason) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call denySubscription() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.denySubscription(this.nativePtr, reason.toInt());
      }
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String name) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getCustomHeader() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.getCustomHeader(this.nativePtr, name);
      }
   }

   private native int notify(long var1, Content var3);

   public synchronized int notify(@Nullable Content body) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call notify() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.notify(this.nativePtr, body);
      }
   }

   private native void pausePublish(long var1);

   public synchronized void pausePublish() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call pausePublish() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         this.pausePublish(this.nativePtr);
      }
   }

   private native int refreshPublish(long var1);

   public synchronized int refreshPublish() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call refreshPublish() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.refreshPublish(this.nativePtr);
      }
   }

   private native int refreshSubscribe(long var1);

   public synchronized int refreshSubscribe() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call refreshSubscribe() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         return this.refreshSubscribe(this.nativePtr);
      }
   }

   private native void removeCustomHeader(long var1, String var3);

   public synchronized void removeCustomHeader(@NonNull String name) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeCustomHeader() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         this.removeCustomHeader(this.nativePtr, name);
      }
   }

   private native int sendPublish(long var1, Content var3);

   public synchronized int sendPublish(@NonNull Content body) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendPublish() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.sendPublish(this.nativePtr, body);
      }
   }

   private native int sendSubscribe(long var1, Content var3);

   public synchronized int sendSubscribe(@Nullable Content body) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendSubscribe() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.sendSubscribe(this.nativePtr, body);
      }
   }

   private native void terminate(long var1);

   public synchronized void terminate() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call terminate() on it, clone it first.");
            } catch (CoreException var8) {
               Log.e(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.e(st);
               }
            }
         }

         this.terminate(this.nativePtr);
      }
   }

   private native int updatePublish(long var1, Content var3);

   public synchronized int updatePublish(@NonNull Content body) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call updatePublish() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.updatePublish(this.nativePtr, body);
      }
   }

   private native int updateSubscribe(long var1, Content var3);

   @Nullable
   public synchronized int updateSubscribe(@Nullable Content body) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call updateSubscribe() on it, clone it first.");
            } catch (CoreException var9) {
               Log.e(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.e(st);
               }
            }
         }

         return this.updateSubscribe(this.nativePtr, body);
      }
   }

   private native void addListener(long var1, EventListener var3);

   public synchronized void addListener(EventListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, EventListener var3);

   public synchronized void removeListener(EventListener listener) {
      this.removeListener(this.nativePtr, listener);
   }

   private native boolean unref(long var1, boolean var3);

   protected void finalize() throws Throwable {
      if (this.nativePtr != 0L) {
         boolean destroyed = this.unref(this.nativePtr, this._isConst);
         if (destroyed) {
            this.nativePtr = 0L;
         }
      }

      super.finalize();
   }

   public void setUserData(Object data) {
      this.userData = data;
   }

   public Object getUserData() {
      return this.userData;
   }

   public String toString() {
      return "Java object [" + super.toString() + "], native pointer [" + String.format("0x%08x", this.nativePtr) + "]";
   }
}
