package org.libs.mediastream.video.display;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.util.AttributeSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.libs.mediastream.Log;

public class GL2JNIView extends GLSurfaceView {
   private static final boolean DEBUG = false;

   public GL2JNIView(Context context) {
      super(context);
      this.init(false, 0, 0);
   }

   public GL2JNIView(Context context, AttributeSet att) {
      super(context, att);
      this.init(false, 0, 0);
   }

   public GL2JNIView(Context context, boolean translucent, int depth, int stencil) {
      super(context);
      this.init(translucent, depth, stencil);
   }

   private void init(boolean translucent, int depth, int stencil) {
      if (translucent) {
         this.getHolder().setFormat(-3);
      }

      this.setEGLContextFactory(new GL2JNIView.ContextFactory());
      this.setEGLConfigChooser(translucent ? new GL2JNIView.ConfigChooser(8, 8, 8, 8, depth, stencil) : new GL2JNIView.ConfigChooser(5, 6, 5, 0, depth, stencil));
   }

   private static void checkEglError(String prompt, EGL10 egl) {
      int error;
      while((error = egl.eglGetError()) != 12288) {
         Log.e(String.format("%s: EGL error: 0x%x", prompt, error));
      }

   }

   private static class ConfigChooser implements EGLConfigChooser {
      private static int EGL_OPENGL_ES2_BIT = 4;
      private static int[] s_configAttribs2;
      protected int mRedSize;
      protected int mGreenSize;
      protected int mBlueSize;
      protected int mAlphaSize;
      protected int mDepthSize;
      protected int mStencilSize;
      private int[] mValue = new int[1];

      public ConfigChooser(int r, int g, int b, int a, int depth, int stencil) {
         this.mRedSize = r;
         this.mGreenSize = g;
         this.mBlueSize = b;
         this.mAlphaSize = a;
         this.mDepthSize = depth;
         this.mStencilSize = stencil;
      }

      public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
         int[] num_config = new int[1];
         egl.eglChooseConfig(display, s_configAttribs2, (EGLConfig[])null, 0, num_config);
         int numConfigs = num_config[0];
         if (numConfigs <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
         } else {
            EGLConfig[] configs = new EGLConfig[numConfigs];
            egl.eglChooseConfig(display, s_configAttribs2, configs, numConfigs, num_config);
            return this.chooseConfig(egl, display, configs);
         }
      }

      public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display, EGLConfig[] configs) {
         EGLConfig[] var4 = configs;
         int var5 = configs.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            EGLConfig config = var4[var6];
            int d = this.findConfigAttrib(egl, display, config, 12325, 0);
            int s = this.findConfigAttrib(egl, display, config, 12326, 0);
            if (d >= this.mDepthSize && s >= this.mStencilSize) {
               int r = this.findConfigAttrib(egl, display, config, 12324, 0);
               int g = this.findConfigAttrib(egl, display, config, 12323, 0);
               int b = this.findConfigAttrib(egl, display, config, 12322, 0);
               int a = this.findConfigAttrib(egl, display, config, 12321, 0);
               if (r == this.mRedSize && g == this.mGreenSize && b == this.mBlueSize && a == this.mAlphaSize) {
                  return config;
               }
            }
         }

         return null;
      }

      private int findConfigAttrib(EGL10 egl, EGLDisplay display, EGLConfig config, int attribute, int defaultValue) {
         return egl.eglGetConfigAttrib(display, config, attribute, this.mValue) ? this.mValue[0] : defaultValue;
      }

      private void printConfigs(EGL10 egl, EGLDisplay display, EGLConfig[] configs) {
         int numConfigs = configs.length;
         Log.w(String.format("%d configurations", numConfigs));

         for(int i = 0; i < numConfigs; ++i) {
            Log.w(String.format("Configuration %d:\n", i));
            this.printConfig(egl, display, configs[i]);
         }

      }

      private void printConfig(EGL10 egl, EGLDisplay display, EGLConfig config) {
         int[] attributes = new int[]{12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
         String[] names = new String[]{"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
         int[] value = new int[1];

         for(int i = 0; i < attributes.length; ++i) {
            int attribute = attributes[i];
            String name = names[i];
            if (egl.eglGetConfigAttrib(display, config, attribute, value)) {
               Log.w(String.format("  %s: %d\n", name, value[0]));
            } else {
               while(egl.eglGetError() != 12288) {
               }
            }
         }

      }

      static {
         s_configAttribs2 = new int[]{12324, 4, 12323, 4, 12322, 4, 12352, EGL_OPENGL_ES2_BIT, 12344};
      }
   }

   private static class ContextFactory implements EGLContextFactory {
      private static int EGL_CONTEXT_CLIENT_VERSION = 12440;

      private ContextFactory() {
      }

      public EGLContext createContext(EGL10 egl, EGLDisplay display, EGLConfig eglConfig) {
         Log.w("creating OpenGL ES 2.0 context");
         GL2JNIView.checkEglError("Before eglCreateContext", egl);
         int[] attrib_list = new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
         EGLContext context = egl.eglCreateContext(display, eglConfig, EGL10.EGL_NO_CONTEXT, attrib_list);
         GL2JNIView.checkEglError("After eglCreateContext", egl);
         return context;
      }

      public void destroyContext(EGL10 egl, EGLDisplay display, EGLContext context) {
         egl.eglDestroyContext(display, context);
      }

      // $FF: synthetic method
      ContextFactory(Object x0) {
         this();
      }
   }
}
