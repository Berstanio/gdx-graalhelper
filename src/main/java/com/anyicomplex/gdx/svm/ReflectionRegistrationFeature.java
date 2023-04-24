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

        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.audio.Music.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.Pixmap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.audio.Sound.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.Texture.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.ParticleEffect.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.PolygonRegion.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.Model.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.glutils.ShaderProgram.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.Cubemap.class);
        RuntimeReflection.register(com.badlogic.gdx.files.FileHandle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.Sprite.class);
        FeatureUtils.registerForGdxInstantiation(int[].class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.model.Node.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.math.Matrix4.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.VertexAttribute.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.ModelInstance.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.Array.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer.AspectTextureRegion.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue.SpawnSide.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.attributes.DirectionalLightsAttribute.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.attributes.PointLightsAttribute.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.attributes.SpotLightsAttribute.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.math.CumulativeDistribution.CumulativeValue.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.Net.HttpRequest.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.math.Rectangle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.Actor.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Image.class);

        FeatureUtils.registerOnlyNoArgConstructor(com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class);
        FeatureUtils.registerOnlyNoArgConstructor(com.badlogic.gdx.graphics.g2d.GlyphLayout.class);
        FeatureUtils.registerOnlyNoArgConstructor(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        FeatureUtils.registerOnlyNoArgConstructor(aClass),
                com.badlogic.gdx.utils.Pool.Poolable.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        FeatureUtils.registerOnlyNoArgConstructor(aClass),
                com.badlogic.gdx.utils.Json.Serializable.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) ->
                        RuntimeReflection.register(aClass.getDeclaredMethods()),
                com.badlogic.gdx.scenes.scene2d.Actor.class);

        FeatureUtils.registerForGdxInstantiation(Object.class);
        FeatureUtils.registerForGdxInstantiation(String.class);
        FeatureUtils.registerForGdxInstantiation(Integer.class);
        FeatureUtils.registerForGdxInstantiation(Boolean.class);
        FeatureUtils.registerForGdxInstantiation(Float.class);
        FeatureUtils.registerForGdxInstantiation(Long.class);
        FeatureUtils.registerForGdxInstantiation(Double.class);
        FeatureUtils.registerForGdxInstantiation(Short.class);
        FeatureUtils.registerForGdxInstantiation(Byte.class);
        FeatureUtils.registerForGdxInstantiation(Character.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.Queue.class);
        FeatureUtils.registerForGdxInstantiation(java.util.ArrayList.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.ObjectMap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.ObjectIntMap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.ObjectFloatMap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.ObjectSet.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.IntMap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.LongMap.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.IntSet.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.ArrayMap.class);
        FeatureUtils.registerForGdxInstantiation(java.util.HashMap.class);
        FeatureUtils.registerForGdxInstantiation(Enum.class);
        FeatureUtils.registerForGdxInstantiation(java.util.Collection.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.Json.Serializable.class);
        FeatureUtils.registerForGdxInstantiation(java.util.Map.class);
        FeatureUtils.registerForGdxInstantiation(Deprecated.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.SharedLibraryLoader.class);

        RuntimeReflection.register(com.badlogic.gdx.math.Circle.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Ellipse.class);
        RuntimeReflection.register(com.badlogic.gdx.math.GridPoint2.class);
        RuntimeReflection.register(com.badlogic.gdx.math.GridPoint3.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector2.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector3.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Ray.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Segment.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Sphere.class);
        RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.Action.class);
        RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.Bits.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.I18NBundle.class);
        RuntimeReflection.register(StringBuilder.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.Timer.class);

        RuntimeReflection.register(java.nio.ByteBuffer.class);
        RuntimeReflection.register(java.nio.ShortBuffer.class);
        RuntimeReflection.register(java.nio.CharBuffer.class);
        RuntimeReflection.register(java.nio.IntBuffer.class);
        RuntimeReflection.register(java.nio.LongBuffer.class);
        RuntimeReflection.register(java.nio.FloatBuffer.class);
        RuntimeReflection.register(java.nio.DoubleBuffer.class);
        RuntimeReflection.register(java.nio.Buffer.class);

        RuntimeReflection.register(com.badlogic.gdx.LifecycleListener.class);

        try {
            RuntimeReflection.register(java.io.File.class.getMethod("canExecute"));
            RuntimeReflection.register(java.io.File.class.getMethod("setExecutable", boolean.class, boolean.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
