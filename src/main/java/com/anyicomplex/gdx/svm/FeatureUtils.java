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

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;

/**
 * Simple utility class for {@link Feature}s.
 */
public class FeatureUtils {

    /**
     * <p>libGDX has quite heavy reflection usage, includes all collection classes.
     * So if a class was used in any collection-related libGDX feature, e.g. JSON serialization, you should register it with this method.</p>
     * <p>This method equal as GdxFeatureUtils#registerForAnyInstantiation(false, Class...)</p>
     * @see FeatureUtils#registerForAnyInstantiation(boolean, Class...)
     * @param classes the classes will be registered
     */
    public static void registerForGdxInstantiation(Class<?>... classes) {
        registerForAnyInstantiation(false, classes);
    }

    /**
     * <p>Register for class instantiation recursively, with all subclasses and fields' classes, optional with: all constructors' parameters' classes.</p>
     * <p><b>NOTE this method not for serialization.</b></p>
     * @see RuntimeReflection#register(Field...)
     * @see RuntimeReflection#register(Class...)
     * @see RuntimeReflection#register(Executable...)
     * @param registerConstructorsParams whether with all constructors' classes
     * @param classes the classes will be registered
     */
    public static void registerForAnyInstantiation(boolean registerConstructorsParams, Class<?>... classes) {
        RuntimeReflection.register(classes);
        for (Class<?> clazz : classes) {
            RuntimeReflection.register(clazz.getDeclaredConstructors());
            if (registerConstructorsParams) {
                for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                    for (Class<?> paramClazz : constructor.getParameterTypes()) {
                        registerForAnyInstantiation(true, paramClazz);
                    }
                }
            }
            RuntimeReflection.register(clazz.getDeclaredMethods());
            for (Field field : clazz.getDeclaredFields()) {
                registerForAnyInstantiation(registerConstructorsParams, field.getType());
            }
            RuntimeReflection.register(clazz.getDeclaredFields());
            registerForAnyInstantiation(registerConstructorsParams, clazz.getDeclaredClasses());
        }
    }

}
