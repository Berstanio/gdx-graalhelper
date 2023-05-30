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

package com.anyicomplex.gdx.bullet.svm;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ICollide.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class);

    }

}
