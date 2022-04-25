package com.anyicomplex.gdx.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeSerialization;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

@AutomaticFeature
public class AnnotationFeature implements Feature {

	@Override
	public void beforeAnalysis (BeforeAnalysisAccess access) {
		try {
			Field f = ClassLoader.class.getDeclaredField("classes");
			f.setAccessible(true);
			ClassLoader classLoader = access.getApplicationClassLoader();
			Vector<Class<?>> classes = (Vector<Class<?>>)f.get(classLoader);
			ArrayList<String> collectedForReflection = new ArrayList<>();
			ArrayList<String> collectedForSerialization = new ArrayList<>();
			classes.forEach(aClass -> {
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
			e.printStackTrace();
		}
	}

}
