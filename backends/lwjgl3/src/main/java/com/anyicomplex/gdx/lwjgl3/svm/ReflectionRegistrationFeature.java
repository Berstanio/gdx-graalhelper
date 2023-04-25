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

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import org.lwjgl.system.StructBuffer;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        boolean isWindows = System.getProperty("os.name").contains("Windows");
        boolean isLinux = System.getProperty("os.name").contains("Linux");
        boolean isMac = System.getProperty("os.name").contains("Mac");

        try {

            // LWJGL3 backend
            // Can be fine-tuned to public Sound (OpenALLwjgl3Audio audio, FileHandle file)
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> RuntimeReflection.register(aClass.getDeclaredConstructors()),
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALSound.class);

            // Can be fine-tuned to public Music (OpenALLwjgl3Audio audio, FileHandle file)
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> RuntimeReflection.register(aClass.getDeclaredConstructors()),
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALMusic.class);

            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredField("theUnsafe"));
            RuntimeReflection.register(java.nio.Buffer.class.getDeclaredFields());

            // Could be maybe a bit fine-tuned, but should be fine
            RuntimeReflection.register(access.findClassByName("java.nio.DirectByteBuffer").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectShortBufferU").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectCharBufferU").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectIntBufferU").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectLongBufferU").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectFloatBufferU").getDeclaredFields());
            RuntimeReflection.register(access.findClassByName("java.nio.DirectDoubleBufferU").getDeclaredFields());

            RuntimeReflection.register(org.lwjgl.PointerBuffer.class.getDeclaredConstructors());
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                    // Would only need to be one constructor I think, but w/e
                    RuntimeReflection.register(aClass.getDeclaredConstructors()),
                org.lwjgl.system.Struct.class);
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        // Would only need to be one constructor I think, but w/e
                        RuntimeReflection.register(aClass.getDeclaredConstructors()),
                org.lwjgl.system.StructBuffer.class);

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}