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

package com.anyicomplex.gdx.lwjgl3.svm;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.RecomputeFieldValue.Kind;
import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.graalvm.jniutils.HotSpotCalls;
import org.graalvm.jniutils.JNI;
import org.graalvm.jniutils.JNIMethodScope;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.ThreadLocalUtil;

import java.lang.reflect.Field;
import java.util.List;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.POINTER_SIZE;

@TargetClass(org.lwjgl.system.ThreadLocalUtil.class)
final class Target_org_lwjgl_system_ThreadLocalUtil {

  @Substitute
  public static void setFunctionMissingAddresses(int functionCount) {
    // Not support on graal atm https://github.com/oracle/graal/issues/6391
  }


  @Substitute
  public static void setCapabilities(long capabilities) {
      // Not support on graal atm https://github.com/oracle/graal/issues/6391
  }
}



/** Dummy class with the file's name. */
public class Lwjgl3Substitutions {
}