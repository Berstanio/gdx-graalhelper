package com.anyicomplex.gdx.svm;

import com.oracle.svm.hosted.FeatureImpl.FeatureAccessImpl;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeSerialization;

import java.util.List;
import java.util.stream.Collectors;

public class AnnotationFeature implements Feature {

	private static List<Class<?>> collectedForReflection;
	private static List<Class<?>> collectedForSerialization;

	@Override
	public void afterAnalysis(AfterAnalysisAccess access) {
		FeatureUtils.log("The following classes are added because of the CollectForReflection annotation: ");
		FeatureUtils.log(collectedForReflection.stream().map(Class::getName).collect(Collectors.joining(", ")) + "\n");
		FeatureUtils.log("The following classes are added because of the CollectForSerialization annotation: ");
		FeatureUtils.log(collectedForSerialization.stream().map(Class::getName).collect(Collectors.joining(", ")) + "\n");
	}

	@Override
	public void beforeAnalysis (BeforeAnalysisAccess access) {
		FeatureAccessImpl impl = (FeatureAccessImpl) access;
		impl.findAnnotatedClasses(CollectForGDXJsonSerialization.class).forEach(FeatureUtils::registerForGdxJSONSerialization);
		impl.findAnnotatedClasses(CollectForSerialization.class).forEach(RuntimeSerialization::register);

		collectedForReflection = impl.findAnnotatedClasses(CollectForGDXJsonSerialization.class);
		collectedForReflection.forEach(FeatureUtils::registerForGdxJSONSerialization);

		collectedForSerialization = impl.findAnnotatedClasses(CollectForSerialization.class);
		collectedForSerialization.forEach(RuntimeSerialization::register);
	}
}
