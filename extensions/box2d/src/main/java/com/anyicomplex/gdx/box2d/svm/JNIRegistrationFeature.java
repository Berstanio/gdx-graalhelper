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

package com.anyicomplex.gdx.box2d.svm;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeJNIAccess;

public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        try {
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class);
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("beginContact", long.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("endContact", long.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("preSolve", long.class, long.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("postSolve", long.class, long.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("reportFixture", long.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("reportRayFixture", long.class, float.class, float.class, float.class, float.class, float.class));
            RuntimeJNIAccess.register(com.badlogic.gdx.physics.box2d.World.class.getDeclaredMethod("contactFilter", long.class, long.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
