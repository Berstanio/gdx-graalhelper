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

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple utility class for {@link Feature}s.
 */
public class FeatureUtils {

    private static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(Arrays.asList(
            Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Void.class, String.class));
    public static final Set<Class<?>> registered = new HashSet<>();

    public static void registerForGdxJSONSerialization(Class<?>... classes) {
        for (Class<?> c : classes) {
            c = preProcess(c);
            if (c != null) {
                registerForGdxJSONSerialization(0, c);
            }
        }
    }

    private static Class<?> preProcess(Class<?> toProcess) {
        if (toProcess.isEnum() || toProcess.isInterface() || WRAPPER_TYPES.contains(toProcess) || toProcess.isPrimitive())
            return null;
        if (toProcess.isArray()) {
            return preProcess(toProcess.getComponentType());
        }
        if (registered.contains(toProcess))
            return null;
        return toProcess;
    }

    private static void registerForGdxJSONSerialization(int depth, Class<?> clazz) {
        registered.add(clazz);
        RuntimeReflection.register(clazz);
        registerOnlyNoArgConstructor(clazz);
        if (clazz.getSuperclass() != null)
            registerForGdxJSONSerialization(clazz.getSuperclass());
        Set<Field> fields = new HashSet<>(Arrays.asList(clazz.getFields()));
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
        fields.removeIf(field -> preProcess(field.getType()) == null);
        if (fields.size() > 0) {
            if (depth == 0)
                log(clazz.getName());
            log(String.join("", Collections.nCopies(depth + 1, "-")) + "|");
            fields.forEach(field -> {
                if (preProcess(field.getType()) == null)
                    return;
                log(String.join("", Collections.nCopies(depth + 1, "-")) + field.getName() + ": " + preProcess(field.getType()).getName());
                registerForGdxJSONSerialization(depth + 1, preProcess(field.getType()));
            });
        }
        RuntimeReflection.register(clazz.getFields());
        RuntimeReflection.register(clazz.getDeclaredFields());
    }

    public static void log(String toLog) {
        if (System.getProperty("SVMHELPER_DEBUG") != null) {
            System.out.println(toLog);
        }
    }

    public static void registerOnlyNoArgConstructor(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            if (clazz.isInterface() || clazz.isAnonymousClass())
                return;
            try {
                RuntimeReflection.register(clazz.getDeclaredConstructor());
            } catch (NoSuchMethodException e) {
                //System.err.println("Tried to register " + clazz.getName() + " no-arg constructor, but it doesn't have one.");
            }
        }
    }
}
