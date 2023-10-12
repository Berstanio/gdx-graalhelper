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

import org.graalvm.nativeimage.ImageSingletons;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import org.graalvm.nativeimage.impl.ConfigurationCondition;
import org.graalvm.nativeimage.impl.RuntimeResourceSupport;

public class ReflectionRegistrationFeature implements Feature {


    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        boolean isWindows = System.getProperty("os.name").contains("Windows");
        boolean isLinux = System.getProperty("os.name").contains("Linux");
        boolean isMac = System.getProperty("os.name").contains("Mac");

        try {

            if (isWindows) {
                ImageSingletons.lookup(RuntimeResourceSupport.class).addResources(ConfigurationCondition.alwaysTrue(), ".+\\.dll");
            } else if (isLinux) {
                ImageSingletons.lookup(RuntimeResourceSupport.class).addResources(ConfigurationCondition.alwaysTrue(), ".+\\.so");
            } else if (isMac) {
                ImageSingletons.lookup(RuntimeResourceSupport.class).addResources(ConfigurationCondition.alwaysTrue(), ".+\\.dylib");
            } else {
                throw new IllegalStateException("Unable to detect OS. Please report this.");
            }

            // LWJGL3 backend
            // Can be fine-tuned to public Sound (OpenALLwjgl3Audio audio, FileHandle file)
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> RuntimeReflection.register(aClass.getDeclaredConstructors()),
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALSound.class);

            // Can be fine-tuned to public Music (OpenALLwjgl3Audio audio, FileHandle file)
            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> RuntimeReflection.register(aClass.getDeclaredConstructors()),
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALMusic.class);

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}