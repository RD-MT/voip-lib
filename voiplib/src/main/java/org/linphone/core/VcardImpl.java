package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class VcardImpl implements Vcard {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected VcardImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getEtag(long var1);

   @Nullable
   public synchronized String getEtag() {
      return this.getEtag(this.nativePtr);
   }

   private native void setEtag(long var1, String var3);

   public synchronized void setEtag(@Nullable String etag) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEtag() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setEtag(this.nativePtr, etag);
   }

   private native String getFamilyName(long var1);

   @Nullable
   public synchronized String getFamilyName() {
      return this.getFamilyName(this.nativePtr);
   }

   private native void setFamilyName(long var1, String var3);

   public synchronized void setFamilyName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFamilyName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setFamilyName(this.nativePtr, name);
   }

   private native String getFullName(long var1);

   @Nullable
   public synchronized String getFullName() {
      return this.getFullName(this.nativePtr);
   }

   private native void setFullName(long var1, String var3);

   public synchronized void setFullName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFullName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setFullName(this.nativePtr, name);
   }

   private native String getGivenName(long var1);

   @Nullable
   public synchronized String getGivenName() {
      return this.getGivenName(this.nativePtr);
   }

   private native void setGivenName(long var1, String var3);

   public synchronized void setGivenName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setGivenName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setGivenName(this.nativePtr, name);
   }

   private native String getOrganization(long var1);

   @Nullable
   public synchronized String getOrganization() {
      return this.getOrganization(this.nativePtr);
   }

   private native void setOrganization(long var1, String var3);

   public synchronized void setOrganization(@Nullable String organization) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOrganization() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setOrganization(this.nativePtr, organization);
   }

   private native String[] getPhoneNumbers(long var1);

   @NonNull
   public synchronized String[] getPhoneNumbers() {
      return this.getPhoneNumbers(this.nativePtr);
   }

   private native FriendPhoneNumber[] getPhoneNumbersWithLabel(long var1);

   @NonNull
   public synchronized FriendPhoneNumber[] getPhoneNumbersWithLabel() {
      return this.getPhoneNumbersWithLabel(this.nativePtr);
   }

   private native String getPhoto(long var1);

   @Nullable
   public synchronized String getPhoto() {
      return this.getPhoto(this.nativePtr);
   }

   private native void setPhoto(long var1, String var3);

   public synchronized void setPhoto(@Nullable String picture) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPhoto() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setPhoto(this.nativePtr, picture);
   }

   private native Address[] getSipAddresses(long var1);

   @NonNull
   public synchronized Address[] getSipAddresses() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getSipAddresses() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.getSipAddresses(this.nativePtr);
   }

   private native boolean getSkipValidation(long var1);

   public synchronized boolean getSkipValidation() {
      return this.getSkipValidation(this.nativePtr);
   }

   private native void setSkipValidation(long var1, boolean var3);

   public synchronized void setSkipValidation(boolean skip) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSkipValidation() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setSkipValidation(this.nativePtr, skip);
   }

   private native String getUid(long var1);

   @Nullable
   public synchronized String getUid() {
      return this.getUid(this.nativePtr);
   }

   private native void setUid(long var1, String var3);

   public synchronized void setUid(@Nullable String uid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUid() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setUid(this.nativePtr, uid);
   }

   private native String getUrl(long var1);

   @Nullable
   public synchronized String getUrl() {
      return this.getUrl(this.nativePtr);
   }

   private native void setUrl(long var1, String var3);

   public synchronized void setUrl(@Nullable String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUrl() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setUrl(this.nativePtr, url);
   }

   private native void addExtendedProperty(long var1, String var3, String var4);

   public synchronized void addExtendedProperty(@NonNull String name, @NonNull String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addExtendedProperty() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.addExtendedProperty(this.nativePtr, name, value);
   }

   private native void addPhoneNumber(long var1, String var3);

   public synchronized void addPhoneNumber(@NonNull String phone) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addPhoneNumber() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addPhoneNumber(this.nativePtr, phone);
   }

   private native void addPhoneNumberWithLabel(long var1, FriendPhoneNumber var3);

   public synchronized void addPhoneNumberWithLabel(@NonNull FriendPhoneNumber phoneNumber) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addPhoneNumberWithLabel() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addPhoneNumberWithLabel(this.nativePtr, phoneNumber);
   }

   private native void addSipAddress(long var1, String var3);

   public synchronized void addSipAddress(@NonNull String sipAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addSipAddress() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addSipAddress(this.nativePtr, sipAddress);
   }

   private native String asVcard4String(long var1);

   @Nullable
   public synchronized String asVcard4String() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call asVcard4String() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.asVcard4String(this.nativePtr);
   }

   private native Vcard clone(long var1);

   @NonNull
   public synchronized Vcard clone() {
      return this.clone(this.nativePtr);
   }

   private native void editMainSipAddress(long var1, String var3);

   public synchronized void editMainSipAddress(@NonNull String sipAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call editMainSipAddress() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.editMainSipAddress(this.nativePtr, sipAddress);
   }

   private native boolean generateUniqueId(long var1);

   public synchronized boolean generateUniqueId() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call generateUniqueId() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      return this.generateUniqueId(this.nativePtr);
   }

   private native String[] getExtendedPropertiesValuesByName(long var1, String var3);

   @NonNull
   public synchronized String[] getExtendedPropertiesValuesByName(@NonNull String name) {
      return this.getExtendedPropertiesValuesByName(this.nativePtr, name);
   }

   private native void removeExtentedPropertiesByName(long var1, String var3);

   public synchronized void removeExtentedPropertiesByName(@NonNull String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeExtentedPropertiesByName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.removeExtentedPropertiesByName(this.nativePtr, name);
   }

   private native void removeOrganization(long var1);

   public synchronized void removeOrganization() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeOrganization() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.removeOrganization(this.nativePtr);
   }

   private native void removePhoneNumber(long var1, String var3);

   public synchronized void removePhoneNumber(@NonNull String phone) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removePhoneNumber() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.removePhoneNumber(this.nativePtr, phone);
   }

   private native void removePhoneNumberWithLabel(long var1, FriendPhoneNumber var3);

   public synchronized void removePhoneNumberWithLabel(@NonNull FriendPhoneNumber phoneNumber) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removePhoneNumberWithLabel() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.removePhoneNumberWithLabel(this.nativePtr, phoneNumber);
   }

   private native void removePhoto(long var1);

   public synchronized void removePhoto() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removePhoto() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.removePhoto(this.nativePtr);
   }

   private native void removeSipAddress(long var1, String var3);

   public synchronized void removeSipAddress(@NonNull String sipAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeSipAddress() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.removeSipAddress(this.nativePtr, sipAddress);
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
