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

package com.anyicomplex.gdx.moe.svm;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        try {
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSMusic$1").getMethods());
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSInput$4").getMethods());
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSInput$5").getMethods());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
