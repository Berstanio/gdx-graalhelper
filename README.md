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
    implementation 'io.github.anyicomplex:gdx-svmhelper:1.10.0-beta4'
    implementation 'io.github.anyicomplex:gdx-svmhelper-backend-lwjgl3:1.10.0-beta4'     // LWJGL3
    implementation 'io.github.anyicomplex:gdx-svmhelper-backend-moe:1.10.0-beta4'        // MOE
    implementation 'io.github.anyicomplex:gdx-svmhelper-extension-box2d:1.10.0-beta4'    // Box2D
    implementation 'io.github.anyicomplex:gdx-svmhelper-extension-bullet:1.10.0-beta4'   // Bullet
    implementation 'io.github.anyicomplex:gdx-svmhelper-extension-freetype:1.10.0-beta4' // FreeType
    implementation 'io.github.anyicomplex:gdx-svmhelper-extension-controllers-lwjgl3:2.2.1-beta4' // Controllers
}
```
### 2. Set the shared library path (LWJGL3 backend only)
You can either add `Lwjgl3NativeImageUtils.setupSharedLibraryPath(String libPath)` to your Launcher's `main(String[] args)`
```java
public static void main(String[] args) {
    // Ensure that path has been set before Lwjgl3Application initialization
    Lwjgl3NativeImageUtils.setupSharedLibraryPath(); // equal as Lwjgl3NativeImageUtils.setSharedLibraryPath(".");
    /*Code*/
    createApplication();
}
```
or set jvmFlag `org.lwjgl.librarypath`  
At run time:  
either
```java
System.setProperty("org.lwjgl.librarypath", /*Your shared library path*/); // equal as Lwjgl3NativeImageUtils.setSharedLibraryPath(String libPath);
```
or
```sh
java /*args*/ -Dorg.lwjgl.librarypath=<Your shared library path> /*args*/
```
At build time:
```sh
native-image /*args*/ -Dorg.lwjgl.librarypath=<Your shared library path> /*args*/
```
### 3. Make fat-jar, then build native-image
You need at least [GraalVM](https://www.graalvm.org/) CE (or EE) v22.0.0 to build.  
For more information of GraalVM Native Image, please follow [here](https://www.graalvm.org/reference-manual/native-image/) :)  
You should pass `--report-unsupported-elements-at-runtime` arg to `native-image`, otherwise it will build a fallback image.
### 4. Copy shared libraries and assets
Shared libraries can be found at dependency jars, or you can also extract them from the built fat-jar.  
Put them to `org.lwjgl.librarypath` directory.  
Assets should be put at the running path of built native-image.
### 5. All done. Now you can try to run built native-image!

## Special thanks
[Berstanio](https://github.com/Berstanio)
