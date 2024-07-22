package org.libs.mediastream.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Surface.OutOfResourcesException;
import android.view.SurfaceHolder.Callback;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.libs.mediastream.Log;
import org.libs.mediastream.video.display.OpenGLESDisplay;

public class AndroidVideoWindowImpl {
   private SurfaceView mVideoRenderingView;
   private SurfaceView mVideoPreviewView;
   private boolean useGLrendering;
   private Bitmap mBitmap = null;
   private Surface mSurface = null;
   private AndroidVideoWindowImpl.VideoWindowListener mListener = null;
   private AndroidVideoWindowImpl.Renderer renderer;

   public AndroidVideoWindowImpl(SurfaceView renderingSurface, SurfaceView previewSurface, AndroidVideoWindowImpl.VideoWindowListener listener) {
      this.mVideoRenderingView = renderingSurface;
      this.mVideoPreviewView = previewSurface;
      this.useGLrendering = renderingSurface instanceof GLSurfaceView || this.mVideoPreviewView instanceof GLSurfaceView;
      this.mListener = listener;
      this.init();
   }

   /** @deprecated */
   public AndroidVideoWindowImpl(SurfaceView renderingSurface, SurfaceView previewSurface) {
      this.mVideoRenderingView = renderingSurface;
      this.mVideoPreviewView = previewSurface;
      this.useGLrendering = renderingSurface instanceof GLSurfaceView || this.mVideoPreviewView instanceof GLSurfaceView;
   }

   /** @deprecated */
   public void init() {
      if (this.mVideoRenderingView != null) {
         this.mVideoRenderingView.getHolder().addCallback(new Callback() {
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
               Log.i("Video display surface is being changed.");
               if (!AndroidVideoWindowImpl.this.useGLrendering) {
                  synchronized(AndroidVideoWindowImpl.this) {
                     AndroidVideoWindowImpl.this.mBitmap = Bitmap.createBitmap(width, height, Config.RGB_565);
                     AndroidVideoWindowImpl.this.mSurface = holder.getSurface();
                  }
               }

               if (AndroidVideoWindowImpl.this.mListener != null) {
                  AndroidVideoWindowImpl.this.mListener.onVideoRenderingSurfaceReady(AndroidVideoWindowImpl.this, AndroidVideoWindowImpl.this.mVideoRenderingView);
               }

               Log.w("Video display surface changed");
            }

            public void surfaceCreated(SurfaceHolder holder) {
               Log.w("Video display surface created");
            }

            public void surfaceDestroyed(SurfaceHolder holder) {
               if (!AndroidVideoWindowImpl.this.useGLrendering) {
                  synchronized(AndroidVideoWindowImpl.this) {
                     AndroidVideoWindowImpl.this.mSurface = null;
                     AndroidVideoWindowImpl.this.mBitmap = null;
                  }
               }

               if (AndroidVideoWindowImpl.this.mListener != null) {
                  AndroidVideoWindowImpl.this.mListener.onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl.this);
               }

               Log.d("Video display surface destroyed");
            }
         });
      }

      if (this.mVideoPreviewView != null) {
         this.mVideoPreviewView.getHolder().addCallback(new Callback() {
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
               Log.i("Video preview surface is being changed.");
               if (AndroidVideoWindowImpl.this.mListener != null) {
                  AndroidVideoWindowImpl.this.mListener.onVideoPreviewSurfaceReady(AndroidVideoWindowImpl.this, AndroidVideoWindowImpl.this.mVideoPreviewView);
               }

               Log.w("Video preview surface changed");
            }

            public void surfaceCreated(SurfaceHolder holder) {
               Log.w("Video preview surface created");
            }

            public void surfaceDestroyed(SurfaceHolder holder) {
               if (AndroidVideoWindowImpl.this.mListener != null) {
                  AndroidVideoWindowImpl.this.mListener.onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl.this);
               }

               Log.d("Video preview surface destroyed");
            }
         });
      }

      if (this.useGLrendering && this.mVideoRenderingView != null) {
         this.renderer = new AndroidVideoWindowImpl.Renderer();
         GLSurfaceView surface = this.mVideoRenderingView != null ? (GLSurfaceView)this.mVideoRenderingView : (GLSurfaceView)this.mVideoPreviewView;
         surface.setRenderer(this.renderer);
         surface.setRenderMode(0);
      }

   }

   public void release() {
   }

   /** @deprecated */
   public void setListener(AndroidVideoWindowImpl.VideoWindowListener l) {
      this.mListener = l;
   }

   public Surface getSurface() {
      if (this.useGLrendering) {
         Log.e("View class does not match Video display filter used (you must use a non-GL View)");
      }

      return this.mVideoRenderingView != null ? this.mVideoRenderingView.getHolder().getSurface() : null;
   }

   public SurfaceView getPreviewSurfaceView() {
      if (this.useGLrendering) {
         Log.e("View class does not match Video display filter used (you must use a non-GL View)");
      }

      return this.mVideoPreviewView;
   }

   public Bitmap getBitmap() {
      if (this.useGLrendering) {
         Log.e("View class does not match Video display filter used (you must use a non-GL View)");
      }

      return this.mBitmap;
   }

   public void setOpenGLESDisplay(long ptr) {
      if (!this.useGLrendering) {
         Log.e("View class does not match Video display filter used (you must use a GL View)");
      }

      if (this.renderer != null) {
         this.renderer.setOpenGLESDisplay(ptr);
      }

   }

   public void requestRender() {
      if (this.mVideoRenderingView != null) {
         ((GLSurfaceView)this.mVideoRenderingView).requestRender();
      }

   }

   public synchronized void update() {
      if (this.mSurface != null) {
         try {
            Canvas canvas = this.mSurface.lockCanvas((Rect)null);
            canvas.drawBitmap(this.mBitmap, 0.0F, 0.0F, (Paint)null);
            this.mSurface.unlockCanvasAndPost(canvas);
         } catch (IllegalArgumentException var2) {
            var2.printStackTrace();
         } catch (OutOfResourcesException var3) {
            var3.printStackTrace();
         }
      }

   }

   public static int rotationToAngle(int r) {
      switch(r) {
      case 0:
         return 0;
      case 1:
         return 90;
      case 2:
         return 180;
      case 3:
         return 270;
      default:
         return 0;
      }
   }

   private static class Renderer implements android.opengl.GLSurfaceView.Renderer {
      long ptr = 0L;
      boolean initPending = false;
      int width;
      int height;

      public Renderer() {
      }

      public void setOpenGLESDisplay(long ptr) {
         synchronized(this) {
            if (this.ptr != 0L && ptr != this.ptr) {
               this.initPending = true;
            }

            this.ptr = ptr;
         }
      }

      public void onDrawFrame(GL10 gl) {
         synchronized(this) {
            if (this.ptr != 0L) {
               if (this.initPending) {
                  OpenGLESDisplay.init(this.ptr, this.width, this.height);
                  this.initPending = false;
               }

               OpenGLESDisplay.render(this.ptr);
            }
         }
      }

      public void onSurfaceChanged(GL10 gl, int width, int height) {
         this.width = width;
         this.height = height;
         this.initPending = true;
      }

      public void onSurfaceCreated(GL10 gl, EGLConfig config) {
      }
   }

   public interface VideoWindowListener {
      void onVideoRenderingSurfaceReady(AndroidVideoWindowImpl var1, SurfaceView var2);

      void onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl var1);

      void onVideoPreviewSurfaceReady(AndroidVideoWindowImpl var1, SurfaceView var2);

      void onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl var1);
   }
}
