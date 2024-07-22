package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ChatMessageImpl implements ChatMessage {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected ChatMessageImpl(long ptr, boolean isConst) {
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

   private native String getAppdata(long var1);

   @Nullable
   public synchronized String getAppdata() {
      synchronized(this.core) {
         return this.getAppdata(this.nativePtr);
      }
   }

   private native void setAppdata(long var1, String var3);

   public synchronized void setAppdata(@Nullable String data) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setAppdata() on it, clone it first.");
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

         this.setAppdata(this.nativePtr, data);
      }
   }

   private native String getCallId(long var1);

   @NonNull
   public synchronized String getCallId() {
      synchronized(this.core) {
         return this.getCallId(this.nativePtr);
      }
   }

   private native ChatRoom getChatRoom(long var1);

   @NonNull
   public synchronized ChatRoom getChatRoom() {
      synchronized(this.core) {
         return this.getChatRoom(this.nativePtr);
      }
   }

   private native String getContentType(long var1);

   @NonNull
   public synchronized String getContentType() {
      synchronized(this.core) {
         return this.getContentType(this.nativePtr);
      }
   }

   private native void setContentType(long var1, String var3);

   public synchronized void setContentType(@NonNull String contentType) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setContentType() on it, clone it first.");
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

         this.setContentType(this.nativePtr, contentType);
      }
   }

   private native Content[] getContents(long var1);

   @NonNull
   public synchronized Content[] getContents() {
      synchronized(this.core) {
         return this.getContents(this.nativePtr);
      }
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native long getEphemeralExpireTime(long var1);

   public synchronized long getEphemeralExpireTime() {
      synchronized(this.core) {
         return this.getEphemeralExpireTime(this.nativePtr);
      }
   }

   private native long getEphemeralLifetime(long var1);

   public synchronized long getEphemeralLifetime() {
      synchronized(this.core) {
         return this.getEphemeralLifetime(this.nativePtr);
      }
   }

   private native ErrorInfo getErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo getErrorInfo() {
      synchronized(this.core) {
         return this.getErrorInfo(this.nativePtr);
      }
   }

   private native String getExternalBodyUrl(long var1);

   @Nullable
   public synchronized String getExternalBodyUrl() {
      synchronized(this.core) {
         return this.getExternalBodyUrl(this.nativePtr);
      }
   }

   private native void setExternalBodyUrl(long var1, String var3);

   public synchronized void setExternalBodyUrl(@Nullable String externalBodyUrl) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setExternalBodyUrl() on it, clone it first.");
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

         this.setExternalBodyUrl(this.nativePtr, externalBodyUrl);
      }
   }

   private native Content getFileTransferInformation(long var1);

   @Nullable
   public synchronized Content getFileTransferInformation() {
      synchronized(this.core) {
         return this.getFileTransferInformation(this.nativePtr);
      }
   }

   private native String getForwardInfo(long var1);

   @Nullable
   public synchronized String getForwardInfo() {
      synchronized(this.core) {
         return this.getForwardInfo(this.nativePtr);
      }
   }

   private native Address getFromAddress(long var1);

   @NonNull
   public synchronized Address getFromAddress() {
      synchronized(this.core) {
         return this.getFromAddress(this.nativePtr);
      }
   }

   private native boolean isEphemeral(long var1);

   public synchronized boolean isEphemeral() {
      synchronized(this.core) {
         return this.isEphemeral(this.nativePtr);
      }
   }

   private native boolean isFileTransfer(long var1);

   public synchronized boolean isFileTransfer() {
      synchronized(this.core) {
         return this.isFileTransfer(this.nativePtr);
      }
   }

   private native boolean isFileTransferInProgress(long var1);

   public synchronized boolean isFileTransferInProgress() {
      synchronized(this.core) {
         return this.isFileTransferInProgress(this.nativePtr);
      }
   }

   private native boolean isForward(long var1);

   public synchronized boolean isForward() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isForward() on it, clone it first.");
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

         return this.isForward(this.nativePtr);
      }
   }

   private native boolean isOutgoing(long var1);

   public synchronized boolean isOutgoing() {
      synchronized(this.core) {
         return this.isOutgoing(this.nativePtr);
      }
   }

   private native boolean isRead(long var1);

   public synchronized boolean isRead() {
      synchronized(this.core) {
         return this.isRead(this.nativePtr);
      }
   }

   private native boolean isReply(long var1);

   public synchronized boolean isReply() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isReply() on it, clone it first.");
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

         return this.isReply(this.nativePtr);
      }
   }

   private native boolean isSecured(long var1);

   public synchronized boolean isSecured() {
      synchronized(this.core) {
         return this.isSecured(this.nativePtr);
      }
   }

   private native boolean isText(long var1);

   public synchronized boolean isText() {
      synchronized(this.core) {
         return this.isText(this.nativePtr);
      }
   }

   private native Address getLocalAddress(long var1);

   @NonNull
   public synchronized Address getLocalAddress() {
      synchronized(this.core) {
         return this.getLocalAddress(this.nativePtr);
      }
   }

   private native String getMessageId(long var1);

   @NonNull
   public synchronized String getMessageId() {
      synchronized(this.core) {
         return this.getMessageId(this.nativePtr);
      }
   }

   private native ChatMessage getReplyMessage(long var1);

   @Nullable
   public synchronized ChatMessage getReplyMessage() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getReplyMessage() on it, clone it first.");
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

         return this.getReplyMessage(this.nativePtr);
      }
   }

   private native String getReplyMessageId(long var1);

   @Nullable
   public synchronized String getReplyMessageId() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getReplyMessageId() on it, clone it first.");
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

         return this.getReplyMessageId(this.nativePtr);
      }
   }

   private native Address getReplyMessageSenderAddress(long var1);

   @Nullable
   public synchronized Address getReplyMessageSenderAddress() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getReplyMessageSenderAddress() on it, clone it first.");
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

         return this.getReplyMessageSenderAddress(this.nativePtr);
      }
   }

   private native int getState(long var1);

   public synchronized ChatMessage.State getState() {
      synchronized(this.core) {
         return ChatMessage.State.fromInt(this.getState(this.nativePtr));
      }
   }

   private native String getTextContent(long var1);

   @Nullable
   public synchronized String getTextContent() {
      synchronized(this.core) {
         return this.getTextContent(this.nativePtr);
      }
   }

   private native long getTime(long var1);

   public synchronized long getTime() {
      synchronized(this.core) {
         return this.getTime(this.nativePtr);
      }
   }

   private native Address getToAddress(long var1);

   @NonNull
   public synchronized Address getToAddress() {
      synchronized(this.core) {
         return this.getToAddress(this.nativePtr);
      }
   }

   private native boolean getToBeStored(long var1);

   public synchronized boolean getToBeStored() {
      synchronized(this.core) {
         return this.getToBeStored(this.nativePtr);
      }
   }

   private native void setToBeStored(long var1, boolean var3);

   public synchronized void setToBeStored(boolean toBeStored) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setToBeStored() on it, clone it first.");
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

         this.setToBeStored(this.nativePtr, toBeStored);
      }
   }

   private native String getUtf8Text(long var1);

   @Nullable
   public synchronized String getUtf8Text() {
      synchronized(this.core) {
         return this.getUtf8Text(this.nativePtr);
      }
   }

   private native int setUtf8Text(long var1, String var3);

   public synchronized int setUtf8Text(@Nullable String text) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setUtf8Text() on it, clone it first.");
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

         return this.setUtf8Text(this.nativePtr, text);
      }
   }

   private native void addContent(long var1, Content var3);

   public synchronized void addContent(@NonNull Content content) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addContent() on it, clone it first.");
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

         this.addContent(this.nativePtr, content);
      }
   }

   private native void addCustomHeader(long var1, String var3, String var4);

   public synchronized void addCustomHeader(@NonNull String headerName, @Nullable String headerValue) {
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

         this.addCustomHeader(this.nativePtr, headerName, headerValue);
      }
   }

   private native void addFileContent(long var1, Content var3);

   public synchronized void addFileContent(@NonNull Content content) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addFileContent() on it, clone it first.");
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

         this.addFileContent(this.nativePtr, content);
      }
   }

   private native void addTextContent(long var1, String var3);

   public synchronized void addTextContent(@NonNull String text) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addTextContent() on it, clone it first.");
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

         this.addTextContent(this.nativePtr, text);
      }
   }

   private native void addUtf8TextContent(long var1, String var3);

   public synchronized void addUtf8TextContent(@NonNull String text) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addUtf8TextContent() on it, clone it first.");
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

         this.addUtf8TextContent(this.nativePtr, text);
      }
   }

   private native void cancelFileTransfer(long var1);

   public synchronized void cancelFileTransfer() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call cancelFileTransfer() on it, clone it first.");
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

         this.cancelFileTransfer(this.nativePtr);
      }
   }

   private native boolean downloadContent(long var1, Content var3);

   public synchronized boolean downloadContent(@NonNull Content content) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call downloadContent() on it, clone it first.");
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

         return this.downloadContent(this.nativePtr, content);
      }
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String headerName) {
      synchronized(this.core) {
         return this.getCustomHeader(this.nativePtr, headerName);
      }
   }

   private native ParticipantImdnState[] getParticipantsByImdnState(long var1, int var3);

   @NonNull
   public synchronized ParticipantImdnState[] getParticipantsByImdnState(ChatMessage.State state) {
      synchronized(this.core) {
         return this.getParticipantsByImdnState(this.nativePtr, state.toInt());
      }
   }

   private native boolean hasConferenceInvitationContent(long var1);

   public synchronized boolean hasConferenceInvitationContent() {
      synchronized(this.core) {
         return this.hasConferenceInvitationContent(this.nativePtr);
      }
   }

   private native boolean hasTextContent(long var1);

   public synchronized boolean hasTextContent() {
      synchronized(this.core) {
         return this.hasTextContent(this.nativePtr);
      }
   }

   private native int putChar(long var1, int var3);

   public synchronized int putChar(int character) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call putChar() on it, clone it first.");
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

         return this.putChar(this.nativePtr, character);
      }
   }

   private native void removeContent(long var1, Content var3);

   public synchronized void removeContent(@NonNull Content content) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeContent() on it, clone it first.");
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

         this.removeContent(this.nativePtr, content);
      }
   }

   private native void removeCustomHeader(long var1, String var3);

   public synchronized void removeCustomHeader(@NonNull String headerName) {
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

         this.removeCustomHeader(this.nativePtr, headerName);
      }
   }

   private native void send(long var1);

   public synchronized void send() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call send() on it, clone it first.");
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

         this.send(this.nativePtr);
      }
   }

   private native void addListener(long var1, ChatMessageListener var3);

   public synchronized void addListener(ChatMessageListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, ChatMessageListener var3);

   public synchronized void removeListener(ChatMessageListener listener) {
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
