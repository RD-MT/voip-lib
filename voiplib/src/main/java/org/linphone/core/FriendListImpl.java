package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class FriendListImpl implements FriendList {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected FriendListImpl(long ptr, boolean isConst) {
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

   private native String getDisplayName(long var1);

   @Nullable
   public synchronized String getDisplayName() {
      synchronized(this.core) {
         return this.getDisplayName(this.nativePtr);
      }
   }

   private native void setDisplayName(long var1, String var3);

   public synchronized void setDisplayName(@Nullable String displayName) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setDisplayName() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setDisplayName(this.nativePtr, displayName);
      }
   }

   private native Friend[] getFriends(long var1);

   @NonNull
   public synchronized Friend[] getFriends() {
      synchronized(this.core) {
         return this.getFriends(this.nativePtr);
      }
   }

   private native boolean isSubscriptionBodyless(long var1);

   public synchronized boolean isSubscriptionBodyless() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isSubscriptionBodyless() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.isSubscriptionBodyless(this.nativePtr);
      }
   }

   private native Address getRlsAddress(long var1);

   @Nullable
   public synchronized Address getRlsAddress() {
      synchronized(this.core) {
         return this.getRlsAddress(this.nativePtr);
      }
   }

   private native void setRlsAddress(long var1, Address var3);

   public synchronized void setRlsAddress(@Nullable Address rlsAddr) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRlsAddress() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setRlsAddress(this.nativePtr, rlsAddr);
      }
   }

   private native String getRlsUri(long var1);

   @Nullable
   public synchronized String getRlsUri() {
      synchronized(this.core) {
         return this.getRlsUri(this.nativePtr);
      }
   }

   private native void setRlsUri(long var1, String var3);

   public synchronized void setRlsUri(@Nullable String rlsUri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRlsUri() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setRlsUri(this.nativePtr, rlsUri);
      }
   }

   private native void setSubscriptionBodyless(long var1, boolean var3);

   public synchronized void setSubscriptionBodyless(boolean bodyless) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSubscriptionBodyless() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setSubscriptionBodyless(this.nativePtr, bodyless);
      }
   }

   private native boolean isSubscriptionsEnabled(long var1);

   public synchronized boolean isSubscriptionsEnabled() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isSubscriptionsEnabled() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.isSubscriptionsEnabled(this.nativePtr);
      }
   }

   private native void setSubscriptionsEnabled(long var1, boolean var3);

   public synchronized void setSubscriptionsEnabled(boolean enabled) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSubscriptionsEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setSubscriptionsEnabled(this.nativePtr, enabled);
      }
   }

   private native int getType(long var1);

   public synchronized FriendListType getType() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getType() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return FriendListType.fromInt(this.getType(this.nativePtr));
      }
   }

   private native void setType(long var1, int var3);

   public synchronized void setType(FriendListType type) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setType() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setType(this.nativePtr, type.toInt());
      }
   }

   private native String getUri(long var1);

   @Nullable
   public synchronized String getUri() {
      synchronized(this.core) {
         return this.getUri(this.nativePtr);
      }
   }

   private native void setUri(long var1, String var3);

   public synchronized void setUri(@Nullable String uri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setUri() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setUri(this.nativePtr, uri);
      }
   }

   private native int addFriend(long var1, Friend var3);

   public synchronized FriendList.Status addFriend(@NonNull Friend linphoneFriend) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addFriend() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return FriendList.Status.fromInt(this.addFriend(this.nativePtr, linphoneFriend));
      }
   }

   private native int addLocalFriend(long var1, Friend var3);

   public synchronized FriendList.Status addLocalFriend(@NonNull Friend linphoneFriend) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addLocalFriend() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return FriendList.Status.fromInt(this.addLocalFriend(this.nativePtr, linphoneFriend));
      }
   }

   private native void exportFriendsAsVcard4File(long var1, String var3);

   public synchronized void exportFriendsAsVcard4File(@NonNull String vcardFile) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call exportFriendsAsVcard4File() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.exportFriendsAsVcard4File(this.nativePtr, vcardFile);
      }
   }

   private native Friend findFriendByAddress(long var1, Address var3);

   @Nullable
   public synchronized Friend findFriendByAddress(@NonNull Address address) {
      synchronized(this.core) {
         return this.findFriendByAddress(this.nativePtr, address);
      }
   }

   private native Friend findFriendByPhoneNumber(long var1, String var3);

   @Nullable
   public synchronized Friend findFriendByPhoneNumber(@NonNull String phoneNumber) {
      synchronized(this.core) {
         return this.findFriendByPhoneNumber(this.nativePtr, phoneNumber);
      }
   }

   private native Friend findFriendByRefKey(long var1, String var3);

   @Nullable
   public synchronized Friend findFriendByRefKey(@NonNull String refKey) {
      synchronized(this.core) {
         return this.findFriendByRefKey(this.nativePtr, refKey);
      }
   }

   private native Friend findFriendByUri(long var1, String var3);

   @Nullable
   public synchronized Friend findFriendByUri(@NonNull String uri) {
      synchronized(this.core) {
         return this.findFriendByUri(this.nativePtr, uri);
      }
   }

   private native Friend[] findFriendsByAddress(long var1, Address var3);

   @NonNull
   public synchronized Friend[] findFriendsByAddress(@NonNull Address address) {
      synchronized(this.core) {
         return this.findFriendsByAddress(this.nativePtr, address);
      }
   }

   private native Friend[] findFriendsByUri(long var1, String var3);

   @NonNull
   public synchronized Friend[] findFriendsByUri(@NonNull String uri) {
      synchronized(this.core) {
         return this.findFriendsByUri(this.nativePtr, uri);
      }
   }

   private native int importFriendsFromVcard4Buffer(long var1, String var3);

   public synchronized int importFriendsFromVcard4Buffer(@NonNull String vcardBuffer) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call importFriendsFromVcard4Buffer() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.importFriendsFromVcard4Buffer(this.nativePtr, vcardBuffer);
      }
   }

   private native int importFriendsFromVcard4File(long var1, String var3);

   public synchronized int importFriendsFromVcard4File(@NonNull String vcardFile) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call importFriendsFromVcard4File() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.importFriendsFromVcard4File(this.nativePtr, vcardFile);
      }
   }

   private native void notifyPresence(long var1, PresenceModel var3);

   public synchronized void notifyPresence(@NonNull PresenceModel presence) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call notifyPresence() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.notifyPresence(this.nativePtr, presence);
      }
   }

   private native int removeFriend(long var1, Friend var3);

   public synchronized FriendList.Status removeFriend(@NonNull Friend linphoneFriend) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeFriend() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return FriendList.Status.fromInt(this.removeFriend(this.nativePtr, linphoneFriend));
      }
   }

   private native void synchronizeFriendsFromServer(long var1);

   public synchronized void synchronizeFriendsFromServer() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call synchronizeFriendsFromServer() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.synchronizeFriendsFromServer(this.nativePtr);
      }
   }

   private native void updateDirtyFriends(long var1);

   public synchronized void updateDirtyFriends() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call updateDirtyFriends() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.updateDirtyFriends(this.nativePtr);
      }
   }

   private native void updateRevision(long var1, int var3);

   public synchronized void updateRevision(int revision) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call updateRevision() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.updateRevision(this.nativePtr, revision);
      }
   }

   private native void updateSubscriptions(long var1);

   public synchronized void updateSubscriptions() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call updateSubscriptions() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.updateSubscriptions(this.nativePtr);
      }
   }

   private native void addListener(long var1, FriendListListener var3);

   public synchronized void addListener(FriendListListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, FriendListListener var3);

   public synchronized void removeListener(FriendListListener listener) {
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
