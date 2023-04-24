package com.anyicomplex.gdx.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.hosted.FeatureImpl.FeatureAccessImpl;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeSerialization;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

@AutomaticFeature
public class AnnotationFeature implements Feature {

	@Override
	public void beforeAnalysis (BeforeAnalysisAccess access) {
		FeatureAccessImpl impl = (FeatureAccessImpl) access;
		impl.findAnnotatedClasses(CollectForReflection.class).forEach(FeatureUtils::registerForGdxJSONSerialization);
		impl.findAnnotatedClasses(CollectForSerialization.class).forEach(RuntimeSerialization::register);

		List<Class<?>> collectedForReflection = impl.findAnnotatedClasses(CollectForReflection.class);
		collectedForReflection.forEach(FeatureUtils::registerForGdxJSONSerialization);

		List<Class<?>> collectedForSerialization = impl.findAnnotatedClasses(CollectForSerialization.class);
		collectedForSerialization.forEach(RuntimeSerialization::register);

		System.out.print("The following classes are added because of the CollectForReflection annotation: ");
		System.out.println(collectedForReflection.stream().map(Class::getName).collect(Collectors.joining(", ")));
		System.out.print("The following classes are added because of the CollectForSerialization annotation: ");
		System.out.println(collectedForSerialization.stream().map(Class::getName).collect(Collectors.joining(", ")));
	}

}
