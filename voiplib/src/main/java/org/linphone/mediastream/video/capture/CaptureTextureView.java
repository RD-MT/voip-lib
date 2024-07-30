package org.linphone.mediastream.video.capture;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Matrix.ScaleToFit;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import org.linphone.mediastream.Log;

public class CaptureTextureView extends TextureView {
   private int mCapturedVideoWidth;
   private int mCapturedVideoHeight;
   private int mRotation;
   private CaptureTextureView.DisplayMode mActualMode;
   private RectF mPreviewRect;
   protected boolean mAlignTopRight;
   protected CaptureTextureView.DisplayMode mDisplayMode;

   public CaptureTextureView(Context context) {
      this(context, (AttributeSet)null);
   }

   public CaptureTextureView(Context context, AttributeSet attrs) {
      this(context, attrs, 0);
   }

   public CaptureTextureView(Context context, AttributeSet attrs, int defStyle) {
      super(context, attrs, defStyle);
      this.mCapturedVideoWidth = 0;
      this.mCapturedVideoHeight = 0;
      this.mRotation = 0;
      this.mActualMode = CaptureTextureView.DisplayMode.BLACK_BARS;
      this.mPreviewRect = null;
      this.mAlignTopRight = true;
      this.mDisplayMode = CaptureTextureView.DisplayMode.BLACK_BARS;
   }

   public CaptureTextureView.DisplayMode getActualDisplayMode() {
      return this.mActualMode;
   }

   public Size getPreviewVideoSize() {
      return new Size(this.mCapturedVideoWidth, this.mCapturedVideoHeight);
   }

   public RectF getPreviewRectF() {
      return this.mPreviewRect;
   }

   public void rotateToMatchDisplayOrientation(int rotation) {
      this.mRotation = rotation;
      int width = this.getMeasuredWidth();
      int height = this.getMeasuredHeight();
      Matrix matrix = new Matrix();
      RectF textureViewRect = new RectF(0.0F, 0.0F, (float)width, (float)height);
      matrix.mapRect(textureViewRect);
      Log.d("[Capture TextureView] Rotating preview texture by " + rotation);
      if (rotation % 180 == 90) {
         float[] src = new float[]{0.0F, 0.0F, (float)width, 0.0F, 0.0F, (float)height, (float)width, (float)height};
         float[] dst = new float[]{0.0F, (float)height, 0.0F, 0.0F, (float)width, (float)height, (float)width, 0.0F};
         if (rotation == 270) {
            dst = new float[]{(float)width, 0.0F, (float)width, (float)height, 0.0F, 0.0F, 0.0F, (float)height};
         }

         matrix.setPolyToPoly(src, 0, dst, 0, 4);
      } else if (rotation == 180) {
         matrix.postRotate(180.0F, (float)(width / 2), (float)(height / 2));
      }

      if (this.mCapturedVideoWidth != 0 && this.mCapturedVideoHeight != 0) {
         Log.i("[Capture TextureView] TextureView size is " + width + "x" + height + ", captured video size is " + this.mCapturedVideoWidth + "x" + this.mCapturedVideoHeight);
         if (this.mDisplayMode != CaptureTextureView.DisplayMode.HYBRID) {
            if (this.mDisplayMode == CaptureTextureView.DisplayMode.BLACK_BARS) {
               Log.i("[Capture TextureView] Hybrid mode disabled, display mode will be 'black bars'");
            } else {
               Log.i("[Capture TextureView] Hybrid mode disabled, display mode will be 'occupy all space'");
            }

            this.mActualMode = this.mDisplayMode;
         } else if ((width < height || this.mCapturedVideoWidth < this.mCapturedVideoHeight) && (height < width || this.mCapturedVideoHeight < this.mCapturedVideoWidth)) {
            Log.i("[Capture TextureView] Hybrid mode enabled, display mode will be 'black bars'");
            this.mActualMode = CaptureTextureView.DisplayMode.BLACK_BARS;
         } else {
            Log.i("[Capture TextureView] Hybrid mode enabled, display mode will be 'occupy all space'");
            this.mActualMode = CaptureTextureView.DisplayMode.OCCUPY_ALL_SPACE;
         }

         Matrix addtionalTransform = new Matrix();
         float ratioWidth = (float)width;
         float ratioHeight = (float)height;
         RectF capturedVideoRect;
         if (this.mActualMode == CaptureTextureView.DisplayMode.BLACK_BARS) {
            if (width < height * this.mCapturedVideoWidth / this.mCapturedVideoHeight) {
               ratioHeight = (float)(width * this.mCapturedVideoHeight / this.mCapturedVideoWidth);
            } else {
               ratioWidth = (float)(height * this.mCapturedVideoWidth / this.mCapturedVideoHeight);
            }

            capturedVideoRect = new RectF(0.0F, 0.0F, ratioWidth, ratioHeight);
            if (this.mAlignTopRight) {
               Log.i("[Capture TextureView] Aligning the video in the rop-right corner");
               capturedVideoRect.offset((float)width - ratioWidth, 0.0F);
            } else {
               capturedVideoRect.offset(textureViewRect.centerX() - capturedVideoRect.centerX(), textureViewRect.centerY() - capturedVideoRect.centerY());
            }

            addtionalTransform.setRectToRect(textureViewRect, capturedVideoRect, ScaleToFit.FILL);
            this.mPreviewRect = capturedVideoRect;
         } else {
            capturedVideoRect = new RectF(0.0F, 0.0F, (float)this.mCapturedVideoWidth, (float)this.mCapturedVideoHeight);
            float centerX = textureViewRect.centerX() - capturedVideoRect.centerX();
            float centerY = textureViewRect.centerY() - capturedVideoRect.centerY();
            capturedVideoRect.offset(centerX, centerY);
            addtionalTransform.setRectToRect(textureViewRect, capturedVideoRect, ScaleToFit.FILL);
            float scale = Math.max((float)height / (float)this.mCapturedVideoHeight, (float)width / (float)this.mCapturedVideoWidth);
            addtionalTransform.postScale(scale, scale, textureViewRect.centerX(), textureViewRect.centerY());
            this.mPreviewRect = textureViewRect;
         }

         matrix.postConcat(addtionalTransform);
      }

      this.setTransform(matrix);
   }

   public void setAspectRatio(int width, int height) {
      if (width >= 0 && height >= 0) {
         Log.i("[Capture TextureView] Changing preview texture ratio to match " + width + "x" + height + " captured video size");
         this.mCapturedVideoWidth = width;
         this.mCapturedVideoHeight = height;
         this.rotateToMatchDisplayOrientation(this.mRotation);
      } else {
         throw new IllegalArgumentException("Size cannot be negative.");
      }
   }

   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
      super.onMeasure(widthMeasureSpec, heightMeasureSpec);
      this.rotateToMatchDisplayOrientation(this.mRotation);
   }

   public static enum DisplayMode {
      BLACK_BARS,
      OCCUPY_ALL_SPACE,
      HYBRID;
   }
}
