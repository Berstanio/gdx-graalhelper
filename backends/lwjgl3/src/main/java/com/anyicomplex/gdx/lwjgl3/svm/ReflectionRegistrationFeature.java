/*
 * Copyright 2022 Yi An
 * Copyright 2022 Berstanio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anyicomplex.gdx.lwjgl3.svm;

import com.anyicomplex.gdx.svm.FeatureUtils;
import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeClassInitialization;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import org.lwjgl.system.jemalloc.JEmallocAllocator;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        boolean isWindows = System.getProperty("os.name").contains("Windows");
        boolean isLinux = System.getProperty("os.name").contains("Linux");
        boolean isMac = System.getProperty("os.name").contains("Mac");

        // LWJGL3 backend
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Sound.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Music.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Sound.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Music.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Sound.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Music.class);
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Sound.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Music.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Sound.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Music.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Sound.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Music.class.getConstructors());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.OpenALMusic.class);
        RuntimeReflection.register(java.nio.Buffer.class.getDeclaredFields());
        RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window.class);

        // JLayer
        RuntimeReflection.register(javazoom.jl.decoder.SynthesisFilter.class);

        // LWJGL3
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.CLongBuffer.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.PointerBuffer.class);
        RuntimeReflection.register(org.lwjgl.system.APIUtil.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.CallbackI.class);
        RuntimeReflection.register(org.lwjgl.system.Library.class);
        RuntimeReflection.register(org.lwjgl.system.LibraryResource.class);
        RuntimeReflection.register(org.lwjgl.system.MemoryStack.class);
        //RuntimeReflection.register(java.lang.Object.class);

        RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class);

        RuntimeReflection.register(org.lwjgl.system.Pointer.Default.class.getDeclaredFields());
        RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredFields());
        //RuntimeReflection.register(org.lwjgl.system.Struct.class.getDeclaredField("container"));
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.jni.JNINativeMethod.class);

        RuntimeReflection.register(sun.misc.Unsafe.class);
        RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredMethods());
        RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredFields());
        try {
            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredMethod("arrayIndexScale", Class.class));
            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredMethod("objectFieldOffset", java.lang.reflect.Field.class));
            RuntimeReflection.register(ClassLoader.class.getDeclaredMethod("findLibrary", String.class));
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }

        RuntimeReflection.register(org.lwjgl.system.MemoryUtil.MemoryAllocator.class);
        RuntimeReflection.register(access.findClassByName("java.nio.DirectByteBuffer").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectShortBufferU").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectCharBufferU").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectIntBufferU").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectLongBufferU").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectFloatBufferU").getDeclaredFields());
        RuntimeReflection.register(access.findClassByName("java.nio.DirectDoubleBufferU").getDeclaredFields());

        FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.Struct.class);
        // Platform APIs
        if (isWindows) {
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.DEVMODE.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.DEVMODE.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.Buffer.class);
            RuntimeReflection.register(org.lwjgl.system.windows.GDI32.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.INPUT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.INPUT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.KEYBDINPUT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.KEYBDINPUT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MONITORINFOEX.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MONITORINFOEX.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MOUSEINPUT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MOUSEINPUT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MSG.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.MSG.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.POINT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.POINT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.POINTL.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.POINTL.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.RECT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.RECT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.TOUCHINPUT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.TOUCHINPUT.Buffer.class);
            RuntimeReflection.register(org.lwjgl.system.windows.User32.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.WNDCLASSEX.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.windows.WNDCLASSEX.Buffer.class);
        }
        else if (isLinux) {
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.Visual.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.Visual.Buffer.class);
            RuntimeReflection.register(org.lwjgl.system.linux.X11.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XAnyEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XAnyEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XButtonEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XButtonEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCirculateEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCirculateEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XClientMessageEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XClientMessageEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XColormapEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XColormapEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XConfigureEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XConfigureEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCrossingEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XCrossingEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XErrorEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XErrorEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XExposeEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XExposeEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGenericEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGenericEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGenericEventCookie.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGenericEventCookie.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGravityEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XGravityEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XKeyEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XKeyEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XKeymapEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XKeymapEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMapEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMapEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMappingEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMappingEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMapRequestEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMapRequestEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMotionEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XMotionEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XNoExposeEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XNoExposeEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XPropertyEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XPropertyEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XReparentEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XReparentEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XTimeCoord.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XTimeCoord.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XUnmapEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XUnmapEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XVisibilityEvent.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XVisibilityEvent.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XVisualInfo.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.linux.XVisualInfo.Buffer.class);
        }
        else if (isMac) {
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.CGPoint.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.CGPoint.Buffer.class);
            RuntimeReflection.register(org.lwjgl.system.macosx.CoreGraphics.class);
            RuntimeReflection.register(org.lwjgl.system.macosx.LibSystem.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.Buffer.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.class);
            FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer.class);
            RuntimeReflection.register(org.lwjgl.system.macosx.ObjCRuntime.class);
        }

        // LWJGL3 GLFW
        RuntimeReflection.register(org.lwjgl.glfw.GLFW.class);
        RuntimeReflection.register(org.lwjgl.glfw.GLFW.class.getDeclaredFields());
        RuntimeReflection.register(org.lwjgl.glfw.GLFWErrorCallback.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWGamepadState.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWGamepadState.Buffer.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWGammaRamp.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWGammaRamp.Buffer.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWImage.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWImage.Buffer.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWVidMode.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.glfw.GLFWVidMode.Buffer.class);

        // LWJGL3 jemalloc
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.system.jemalloc.ExtentHooks.class);
        RuntimeReflection.register(org.lwjgl.system.jemalloc.JEmalloc.class);

        // LWJGL3 OpenAL
        RuntimeReflection.register(org.lwjgl.openal.ALC.class);
        RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class);
        RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class.getFields());

        // LWJGL3 OpenGL
        RuntimeReflection.register(org.lwjgl.opengl.GL.class);
        RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class);
        RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class.getFields());
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.opengl.GPU_DEVICE.class);
        FeatureUtils.registerForGdxInstantiation(org.lwjgl.opengl.GPU_DEVICE.Buffer.class);
    }

}
