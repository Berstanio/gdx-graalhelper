# gdx-svmhelper [![Java CI with Gradle](https://github.com/anyicomplex/gdx-svmhelper/actions/workflows/gradle.yml/badge.svg)](https://github.com/anyicomplex/gdx-svmhelper/actions/workflows/gradle.yml) [![Publish to Maven Central](https://github.com/anyicomplex/gdx-svmhelper/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/anyicomplex/gdx-svmhelper/actions/workflows/gradle-publish.yml) ![License](https://img.shields.io/github/license/anyicomplex/gdx-svmhelper)

Experimental helper for [libGDX](https://libgdx.com/) to build [GraalVM](https://www.graalvm.org/) Native Image.  
**Note: This library is now beta version, should has some bugs and cannot provide any guarantee of success build.**

## Current Status
| Supported libGDX feature  |Version|        Status       |
|:-------------------------:|:-----:|:-------------------:|
|      LWJGL3 Backend       |1.10.0 |   Almost Complete   |
| MOE Backend (third-party) |1.10.0 | Working In Progress |
|      Box2D Extension      |1.10.0 |      Complete       |
|     Bullet Extension      |1.10.0 | Working In Progress |
|    FreeType Extension     |1.10.0 |      Complete       |
|   Controllers Extension   |2.2.1  |      Complete       |

## Annotations
There are two annotations, "CollectForReflection" and "CollectForSerialization". They currently only work on classes.
PR's are welcome to extend this functionality!

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

Step 2. Add the dependency based on what you mean. They will register themselves automatically if they are on the classpath.
```groovy
dependencies {
    implementation 'io.github.berstanio:gdx-svmhelper:1.11.1-SNAPSHOT'
    implementation 'io.github.berstanio:gdx-svmhelper-backend-lwjgl3:1.11.1-SNAPSHOT'     // LWJGL3
    implementation 'io.github.berstanio:gdx-svmhelper-backend-moe:1.11.1-SNAPSHOT'        // MOE
    implementation 'io.github.berstanio:gdx-svmhelper-extension-box2d:1.11.1-SNAPSHOT'    // Box2D
    implementation 'io.github.berstanio:gdx-svmhelper-extension-bullet:1.11.1-SNAPSHOT'   // Bullet
    implementation 'io.github.berstanio:gdx-svmhelper-extension-freetype:1.11.1-SNAPSHOT' // FreeType
    implementation 'io.github.berstanio:gdx-svmhelper-extension-controllers-lwjgl3:2.2.1-SNAPSHOT' // Controllers
}
```
### 2. Make fat-jar, then build native-image
You need at least [GraalVM](https://www.graalvm.org/) CE (or EE) v22.3.1 to build.  
For more information of GraalVM Native Image, please follow [here](https://www.graalvm.org/reference-manual/native-image/) :)  
### 3. Include resources
You need to configure your resources. You need to pass "-H:IncludeResources=\<java regex>" as a parameter. Please note, that you also need to take care of library inclusion.
So something like ""-H:IncludeResources=.*.dll" for windows.
### 4. All done. Now you can try to run built native-image!

## Special thanks
[Anyicomplex](https://github.com/anyicomplex/) // The original author
[Berstanio](https://github.com/Berstanio)
