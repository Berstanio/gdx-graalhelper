package com.anyicomplex.gdx.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeSerialization;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

@AutomaticFeature
public class AnnotationFeature implements Feature {

	@Override
	public void beforeAnalysis (BeforeAnalysisAccess access) {
		try {
			Field f = ClassLoader.class.getDeclaredField("classes");
			f.setAccessible(true);
			ClassLoader classLoader = com.badlogic.gdx.files.FileHandle.class.getClassLoader();
			Vector<Class<?>> vectorClasses = (Vector<Class<?>>)f.get(classLoader);
			Class<?>[] classes = vectorClasses.toArray(new Class[0]);
			ArrayList<String> collectedForReflection = new ArrayList<>();
			ArrayList<String> collectedForSerialization = new ArrayList<>();
			Arrays.stream(classes).forEach(aClass -> {
				if (aClass.isAnnotationPresent(CollectForReflection.class)) {
					FeatureUtils.registerForGdxInstantiation(aClass);
					collectedForReflection.add(aClass.getName());
				}
				if (aClass.isAnnotationPresent(CollectForSerialization.class)) {
					RuntimeSerialization.register(aClass);
					collectedForSerialization.add(aClass.getName());
				}
			});
			System.out.print("The following classes are added because of the CollectForReflection annotation: ");
			System.out.println(String.join(", ", collectedForReflection));
			System.out.print("The following classes are added because of the CollectForSerialization annotation: ");
			System.out.println(String.join(", ", collectedForSerialization));
		} catch (NoSuchFieldException | IllegalAccessException e) {
			System.err.println("You are probably using Java 17 GraalVM. The annotation are not currently supported for that.");
		}
	}

}
