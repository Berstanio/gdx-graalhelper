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

package com.anyicomplex.gdx.svm;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.hosted.FeatureImpl;
import com.oracle.svm.hosted.FeatureImpl.FeatureAccessImpl;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

import java.lang.reflect.Field;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        // libGDX
        try {
            Field tagClasses = Skin.class.getDeclaredField("defaultTagClasses");
            tagClasses.setAccessible(true);
            Class[] defaultTagClasses = (Class[])tagClasses.get(null);
            FeatureUtils.registerForGdxJSONSerialization(defaultTagClasses);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        FeatureAccessImpl impl = (FeatureAccessImpl) access;

        FeatureUtils.registerOnlyNoArgConstructor(com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        FeatureUtils.registerOnlyNoArgConstructor(aClass),
                com.badlogic.gdx.utils.Pool.Poolable.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            if (aClass == com.badlogic.gdx.utils.Json.Serializable.class) return;
            impl.findSubclasses(aClass).forEach(access::registerAsUsed);
            RuntimeReflection.register(aClass);
            FeatureUtils.registerOnlyNoArgConstructor(aClass);
        }, com.badlogic.gdx.utils.Json.Serializable.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        RuntimeReflection.register(aClass.getDeclaredMethods()),
                com.badlogic.gdx.scenes.scene2d.Actor.class);

        RuntimeReflection.register(com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData[].class);
        access.registerReachabilityHandler(duringAnalysisAccess ->
                        FeatureUtils.registerForGdxJSONSerialization(com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch.Config.class)
                , com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch.class);
        access.registerReachabilityHandler(duringAnalysisAccess ->
                        RuntimeReflection.register(com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData[].class),
                com.badlogic.gdx.graphics.g3d.particles.ResourceData.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> FeatureUtils.registerForGdxJSONSerialization(com.badlogic.gdx.graphics.g2d.ParticleEffect.class),
                com.badlogic.gdx.graphics.g2d.ParticleEffect.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> {
                    FeatureUtils.registerForGdxJSONSerialization(com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class);
                    RuntimeReflection.register(com.badlogic.gdx.graphics.g3d.particles.ParticleController[].class);
                    RuntimeReflection.register(com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter.class);
                    impl.findSubclasses(com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter.class).forEach(FeatureUtils::registerOnlyNoArgConstructor);
                    impl.findSubclasses(com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class).forEach(FeatureUtils::registerOnlyNoArgConstructor);
                },
                com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class);

        access.registerReachabilityHandler(duringAnalysisAccess ->
                        RuntimeReflection.register(com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel[].class),
                com.badlogic.gdx.graphics.g3d.particles.ParallelArray.class);

        try {
            RuntimeReflection.register(java.io.File.class.getMethod("canExecute"));
            RuntimeReflection.register(java.io.File.class.getMethod("setExecutable", boolean.class, boolean.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
