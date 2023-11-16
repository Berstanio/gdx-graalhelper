# gdx-svmhelper [![Java CI with Gradle](https://github.com/berstanio/gdx-graalhelper/actions/workflows/gradle.yml/badge.svg)](https://github.com/berstanio/gdx-graalhelper/actions/workflows/gradle.yml) [![Publish to Maven Central](https://github.com/berstanio/gdx-graalhelper/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/berstanio/gdx-graalhelper/actions/workflows/gradle-publish.yml) ![License](https://img.shields.io/github/license/anyicomplex/gdx-svmhelper)

Experimental helper for [libGDX](https://libgdx.com/) to build [GraalVM](https://www.graalvm.org/) Native Image.  
**Note: Besides best effort, this library can't provide out of the box support for native-image. Some reflection uses are unpredictable. You can mark classes with `CollectForGDXJsonSerialization` to support GDX Json de-serialization**

## Current Status
| Supported libGDX feature  | Version |       Status        |
|:-------------------------:|:-------:|:-------------------:|
|      LWJGL3 Backend       | 1.12.1  |      Complete       |
| MOE Backend (third-party) | 1.12.1  | Working In Progress |
|      Box2D Extension      | 1.12.1  |      Complete       |
|     Bullet Extension      | 1.12.1  | Working In Progress |
|    FreeType Extension     | 1.12.1  |      Complete       |
|   Controllers Extension   |  2.2.3  |      Complete       |

## Examples
https://github.com/anyicomplex/gdx-native-image-example  
https://github.com/anyicomplex/unlucky-ae

## Usage
### 1. Add this repo to your project dependency
Step 1. Add the Maven Central repository to your build file
```groovy
allprojects {
    repositories {
        ...
        mavenCentral()
    }
}
```

Step 2. Add the dependency based on what you need. They will register themselves automatically if they are on the classpath.
```groovy
dependencies {
    implementation 'io.github.berstanio:gdx-svmhelper-annotations:2.0.0'        // Annotations only
    implementation 'io.github.berstanio:gdx-svmhelper:2.0.0'
    implementation 'io.github.berstanio:gdx-svmhelper-backend-lwjgl3:2.0.0'     // LWJGL3
    implementation 'io.github.berstanio:gdx-svmhelper-backend-moe:2.0.0'        // MOE
    implementation 'io.github.berstanio:gdx-svmhelper-extension-box2d:2.0.0'    // Box2D
    implementation 'io.github.berstanio:gdx-svmhelper-extension-bullet:2.0.0'   // Bullet
    implementation 'io.github.berstanio:gdx-svmhelper-extension-freetype:2.0.0' // FreeType
    implementation 'io.github.berstanio:gdx-svmhelper-extension-controllers-lwjgl3:2.0.0' // Controllers
}
```
### 2. Make fat-jar, then build native-image
You need at least [GraalVM](https://www.graalvm.org/) CE (or EE) v22.3.1 to build.  
For more information of GraalVM Native Image, please follow [here](https://www.graalvm.org/reference-manual/native-image/) :)
### 3. Include resources
You need to configure your resources. You need to pass "-H:IncludeResources=\<java regex>" as a parameter.
### 4. All done. Now you can try to run built native-image!

## Special thanks
[Anyicomplex](https://github.com/anyicomplex/) // The original author  
[Berstanio](https://github.com/Berstanio)
