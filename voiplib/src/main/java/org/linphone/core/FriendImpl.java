package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class FriendImpl implements Friend {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected FriendImpl(long ptr, boolean isConst) {
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

   private native Address getAddress(long var1);

   @Nullable
   public synchronized Address getAddress() {
      synchronized(this.core) {
         return this.getAddress(this.nativePtr);
      }
   }

   private native int setAddress(long var1, Address var3);

   public synchronized int setAddress(@Nullable Address address) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setAddress() on it, clone it first.");
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

         return this.setAddress(this.nativePtr, address);
      }
   }

   private native Address[] getAddresses(long var1);

   @NonNull
   public synchronized Address[] getAddresses() {
      synchronized(this.core) {
         return this.getAddresses(this.nativePtr);
      }
   }

   private native int getCapabilities(long var1);

   public synchronized int getCapabilities() {
      synchronized(this.core) {
         return this.getCapabilities(this.nativePtr);
      }
   }

   private native int getConsolidatedPresence(long var1);

   public synchronized ConsolidatedPresence getConsolidatedPresence() {
      synchronized(this.core) {
         return ConsolidatedPresence.fromInt(this.getConsolidatedPresence(this.nativePtr));
      }
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native int getIncSubscribePolicy(long var1);

   public synchronized SubscribePolicy getIncSubscribePolicy() {
      synchronized(this.core) {
         return SubscribePolicy.fromInt(this.getIncSubscribePolicy(this.nativePtr));
      }
   }

   private native int setIncSubscribePolicy(long var1, int var3);

   public synchronized int setIncSubscribePolicy(SubscribePolicy policy) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setIncSubscribePolicy() on it, clone it first.");
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

         return this.setIncSubscribePolicy(this.nativePtr, policy.toInt());
      }
   }

   private native boolean isPresenceReceived(long var1);

   public synchronized boolean isPresenceReceived() {
      synchronized(this.core) {
         return this.isPresenceReceived(this.nativePtr);
      }
   }

   private native String getName(long var1);

   @Nullable
   public synchronized String getName() {
      synchronized(this.core) {
         return this.getName(this.nativePtr);
      }
   }

   private native int setName(long var1, String var3);

   public synchronized int setName(@Nullable String name) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setName() on it, clone it first.");
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

         return this.setName(this.nativePtr, name);
      }
   }

   private native String getNativeUri(long var1);

   @Nullable
   public synchronized String getNativeUri() {
      synchronized(this.core) {
         return this.getNativeUri(this.nativePtr);
      }
   }

   private native void setNativeUri(long var1, String var3);

   public synchronized void setNativeUri(@Nullable String nativeUri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setNativeUri() on it, clone it first.");
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

         this.setNativeUri(this.nativePtr, nativeUri);
      }
   }

   private native String getOrganization(long var1);

   @Nullable
   public synchronized String getOrganization() {
      synchronized(this.core) {
         return this.getOrganization(this.nativePtr);
      }
   }

   private native void setOrganization(long var1, String var3);

   public synchronized void setOrganization(@Nullable String organization) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setOrganization() on it, clone it first.");
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

         this.setOrganization(this.nativePtr, organization);
      }
   }

   private native String[] getPhoneNumbers(long var1);

   @NonNull
   public synchronized String[] getPhoneNumbers() {
      synchronized(this.core) {
         return this.getPhoneNumbers(this.nativePtr);
      }
   }

   private native FriendPhoneNumber[] getPhoneNumbersWithLabel(long var1);

   @NonNull
   public synchronized FriendPhoneNumber[] getPhoneNumbersWithLabel() {
      synchronized(this.core) {
         return this.getPhoneNumbersWithLabel(this.nativePtr);
      }
   }

   private native String getPhoto(long var1);

   @Nullable
   public synchronized String getPhoto() {
      synchronized(this.core) {
         return this.getPhoto(this.nativePtr);
      }
   }

   private native void setPhoto(long var1, String var3);

   public synchronized void setPhoto(@Nullable String pictureUri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPhoto() on it, clone it first.");
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

         this.setPhoto(this.nativePtr, pictureUri);
      }
   }

   private native PresenceModel getPresenceModel(long var1);

   @Nullable
   public synchronized PresenceModel getPresenceModel() {
      synchronized(this.core) {
         return this.getPresenceModel(this.nativePtr);
      }
   }

   private native void setPresenceModel(long var1, PresenceModel var3);

   public synchronized void setPresenceModel(@Nullable PresenceModel presence) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPresenceModel() on it, clone it first.");
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

         this.setPresenceModel(this.nativePtr, presence);
      }
   }

   private native String getRefKey(long var1);

   @Nullable
   public synchronized String getRefKey() {
      synchronized(this.core) {
         return this.getRefKey(this.nativePtr);
      }
   }

   private native void setRefKey(long var1, String var3);

   public synchronized void setRefKey(@Nullable String key) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setRefKey() on it, clone it first.");
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

         this.setRefKey(this.nativePtr, key);
      }
   }

   private native boolean getStarred(long var1);

   public synchronized boolean getStarred() {
      synchronized(this.core) {
         return this.getStarred(this.nativePtr);
      }
   }

   private native void setStarred(long var1, boolean var3);

   public synchronized void setStarred(boolean isStarred) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setStarred() on it, clone it first.");
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

         this.setStarred(this.nativePtr, isStarred);
      }
   }

   private native boolean isSubscribesEnabled(long var1);

   public synchronized boolean isSubscribesEnabled() {
      synchronized(this.core) {
         return this.isSubscribesEnabled(this.nativePtr);
      }
   }

   private native int setSubscribesEnabled(long var1, boolean var3);

   public synchronized int setSubscribesEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSubscribesEnabled() on it, clone it first.");
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

         return this.setSubscribesEnabled(this.nativePtr, enable);
      }
   }

   private native int getSubscriptionState(long var1);

   public synchronized SubscriptionState getSubscriptionState() {
      synchronized(this.core) {
         return SubscriptionState.fromInt(this.getSubscriptionState(this.nativePtr));
      }
   }

   private native Vcard getVcard(long var1);

   @Nullable
   public synchronized Vcard getVcard() {
      synchronized(this.core) {
         return this.getVcard(this.nativePtr);
      }
   }

   private native void setVcard(long var1, Vcard var3);

   public synchronized void setVcard(@Nullable Vcard vcard) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setVcard() on it, clone it first.");
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

         this.setVcard(this.nativePtr, vcard);
      }
   }

   private native void addAddress(long var1, Address var3);

   public synchronized void addAddress(@NonNull Address address) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addAddress() on it, clone it first.");
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

         this.addAddress(this.nativePtr, address);
      }
   }

   private native void addPhoneNumber(long var1, String var3);

   public synchronized void addPhoneNumber(@NonNull String phoneNumber) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addPhoneNumber() on it, clone it first.");
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

         this.addPhoneNumber(this.nativePtr, phoneNumber);
      }
   }

   private native void addPhoneNumberWithLabel(long var1, FriendPhoneNumber var3);

   public synchronized void addPhoneNumberWithLabel(@NonNull FriendPhoneNumber phoneNumber) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addPhoneNumberWithLabel() on it, clone it first.");
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

         this.addPhoneNumberWithLabel(this.nativePtr, phoneNumber);
      }
   }

   private native boolean createVcard(long var1, String var3);

   public synchronized boolean createVcard(@Nullable String name) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createVcard() on it, clone it first.");
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

         return this.createVcard(this.nativePtr, name);
      }
   }

   private native void done(long var1);

   public synchronized void done() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call done() on it, clone it first.");
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

         this.done(this.nativePtr);
      }
   }

   private native void edit(long var1);

   public synchronized void edit() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call edit() on it, clone it first.");
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

         this.edit(this.nativePtr);
      }
   }

   private native float getCapabilityVersion(long var1, int var3);

   public synchronized float getCapabilityVersion(FriendCapability capability) {
      synchronized(this.core) {
         return this.getCapabilityVersion(this.nativePtr, capability.toInt());
      }
   }

   private native PresenceModel getPresenceModelForUriOrTel(long var1, String var3);

   @Nullable
   public synchronized PresenceModel getPresenceModelForUriOrTel(@NonNull String uriOrTel) {
      synchronized(this.core) {
         return this.getPresenceModelForUriOrTel(this.nativePtr, uriOrTel);
      }
   }

   private native boolean hasCapability(long var1, int var3);

   public synchronized boolean hasCapability(FriendCapability capability) {
      synchronized(this.core) {
         return this.hasCapability(this.nativePtr, capability.toInt());
      }
   }

   private native boolean hasCapabilityWithVersion(long var1, int var3, float var4);

   public synchronized boolean hasCapabilityWithVersion(FriendCapability capability, float version) {
      synchronized(this.core) {
         return this.hasCapabilityWithVersion(this.nativePtr, capability.toInt(), version);
      }
   }

   private native boolean hasCapabilityWithVersionOrMore(long var1, int var3, float var4);

   public synchronized boolean hasCapabilityWithVersionOrMore(FriendCapability capability, float version) {
      synchronized(this.core) {
         return this.hasCapabilityWithVersionOrMore(this.nativePtr, capability.toInt(), version);
      }
   }

   private native boolean hasPhoneNumber(long var1, String var3);

   public synchronized boolean hasPhoneNumber(@NonNull String phoneNumber) {
      synchronized(this.core) {
         return this.hasPhoneNumber(this.nativePtr, phoneNumber);
      }
   }

   private native boolean inList(long var1);

   public synchronized boolean inList() {
      synchronized(this.core) {
         return this.inList(this.nativePtr);
      }
   }

   private native void remove(long var1);

   public synchronized void remove() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call remove() on it, clone it first.");
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

         this.remove(this.nativePtr);
      }
   }

   private native void removeAddress(long var1, Address var3);

   public synchronized void removeAddress(@NonNull Address address) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeAddress() on it, clone it first.");
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

         this.removeAddress(this.nativePtr, address);
      }
   }

   private native void removePhoneNumber(long var1, String var3);

   public synchronized void removePhoneNumber(@NonNull String phoneNumber) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removePhoneNumber() on it, clone it first.");
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

         this.removePhoneNumber(this.nativePtr, phoneNumber);
      }
   }

   private native void removePhoneNumberWithLabel(long var1, FriendPhoneNumber var3);

   public synchronized void removePhoneNumberWithLabel(@NonNull FriendPhoneNumber phoneNumber) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removePhoneNumberWithLabel() on it, clone it first.");
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

         this.removePhoneNumberWithLabel(this.nativePtr, phoneNumber);
      }
   }

   private native void save(long var1, Core var3);

   public synchronized void save(@NonNull Core core) {
      synchronized(core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call save() on it, clone it first.");
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

         this.save(this.nativePtr, core);
      }
   }

   private native void setPresenceModelForUriOrTel(long var1, String var3, PresenceModel var4);

   public synchronized void setPresenceModelForUriOrTel(@NonNull String uriOrTel, @Nullable PresenceModel presence) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setPresenceModelForUriOrTel() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         this.setPresenceModelForUriOrTel(this.nativePtr, uriOrTel, presence);
      }
   }

   private native Friend newFromVcard(long var1, Vcard var3);

   @Nullable
   public synchronized Friend newFromVcard(@NonNull Vcard vcard) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call newFromVcard() on it, clone it first.");
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

         return this.newFromVcard(this.nativePtr, vcard);
      }
   }

   private native void addListener(long var1, FriendListener var3);

   public synchronized void addListener(FriendListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, FriendListener var3);

   public synchronized void removeListener(FriendListener listener) {
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
