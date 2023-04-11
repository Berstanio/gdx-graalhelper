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

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        // libGDX
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.BitmapFont.class);
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
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.Color.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g2d.Sprite.class);
        FeatureUtils.registerForGdxInstantiation(int[].class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.model.Node.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.math.Matrix4.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.VertexAttribute.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.ModelInstance.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleController.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.utils.Array.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.class);
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
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.InputEvent.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveToAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveByAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeToAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeByAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateToAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateByAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ColorAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.VisibleAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TouchableAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.DelayAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TimeScaleAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RepeatAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RunnableAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.LayoutAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AfterAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddListenerAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextTooltip.TextTooltipStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Tree.TreeStyle.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.Drawable.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedDrawable.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable.class);

        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable.class);
        FeatureUtils.registerForGdxInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable.class);
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
        //RuntimeReflection.register(com.badlogic.gdx.math.Rectangle.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector2.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector3.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Ray.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Segment.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Sphere.class);
        RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.Action.class);
        //RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
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
