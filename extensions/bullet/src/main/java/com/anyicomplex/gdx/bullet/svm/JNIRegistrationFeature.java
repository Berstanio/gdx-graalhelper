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

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeJNIAccess;

@AutomaticFeature
public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.linearmath.LinearMath.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphaseAabbCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphaseRayCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btNodeOverlapCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btOverlapCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btOverlapFilterCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleCallback.class);
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btInternalTriangleIndexCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ICollide.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactListener.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactCache.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.dynamics.CustomActionInterface.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class);
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.linearmath.btMotionState.class);
        RuntimeJNIAccess.register(java.math.BigInteger.class);

        // TODO: 21.06.2021 Add the methods more selective
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.LinearMathJNI.class.getDeclaredMethods());
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.extras.ExtrasJNI.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.CollisionJNI.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.DynamicsJNI.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btBroadphaseAabbCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btBroadphaseRayCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btNodeOverlapCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btOverlapFilterCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btTriangleCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(com.badlogic.gdx.physics.bullet.collision.btInternalTriangleIndexCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ICollide.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class.getDeclaredMethods());
        RuntimeJNIAccess.register(
            com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ContactListener.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ContactCache.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.CustomActionInterface.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class.getDeclaredMethods());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.btMotionState.class.getDeclaredMethods());
        RuntimeJNIAccess.register(com.badlogic.gdx.utils.Pool.class.getDeclaredMethods());

        RuntimeJNIAccess.register(com.badlogic.gdx.math.Vector3.class.getDeclaredFields());
        RuntimeJNIAccess.register(com.badlogic.gdx.math.Matrix4.class.getDeclaredFields());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.LinearMath.class.getDeclaredFields());
        RuntimeJNIAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class.getDeclaredFields());

        try {
            RuntimeJNIAccess.register(java.math.BigInteger.class.getConstructor(byte[].class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
