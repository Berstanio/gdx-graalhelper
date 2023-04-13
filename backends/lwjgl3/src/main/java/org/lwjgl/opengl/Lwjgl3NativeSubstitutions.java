package org.lwjgl.opengl;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.system.NativeType;

import static org.lwjgl.system.Checks.CHECKS;
import static org.lwjgl.system.Checks.check;
import static org.lwjgl.system.JNI.*;

@TargetClass(org.lwjgl.opengl.GL11C.class)
final class Target_org_lwjgl_opengl_GL11C {
    @Substitute
    public static void glEnable(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void glDisable(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glDisable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glBindTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, texture, __functionAddress);
    }
    @Substitute
    public static void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        long __functionAddress = GL.getICD().glBlendFunc;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sfactor, dfactor, __functionAddress);
    }
    @Substitute
    public static void glClear(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glClear;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        long __functionAddress = GL.getICD().glClearColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glClearDepth(@NativeType("GLdouble") double depth) {
        long __functionAddress = GL.getICD().glClearDepth;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(depth, __functionAddress);
    }
    @Substitute
    public static void glClearStencil(@NativeType("GLint") int s) {
        long __functionAddress = GL.getICD().glClearStencil;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, __functionAddress);
    }
    @Substitute
    public static void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha) {
        long __functionAddress = GL.getICD().glColorMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glCullFace(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glCullFace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void glDepthFunc(@NativeType("GLenum") int func) {
        long __functionAddress = GL.getICD().glDepthFunc;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(func, __functionAddress);
    }
    @Substitute
    public static void glDepthMask(@NativeType("GLboolean") boolean flag) {
        long __functionAddress = GL.getICD().glDepthMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(flag, __functionAddress);
    }
    @Substitute
    public static void glDepthRange(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        long __functionAddress = GL.getICD().glDepthRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zNear, zFar, __functionAddress);
    }
    @Substitute
    public static void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count) {
        long __functionAddress = GL.getICD().glDrawArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, first, count, __functionAddress);
    }
    @Substitute
    public static void glDrawBuffer(@NativeType("GLenum") int buf) {
        long __functionAddress = GL.getICD().glDrawBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, __functionAddress);
    }
    @Substitute
    public static void nglDrawElements(int mode, int count, int type, long indices) {
        long __functionAddress = GL.getICD().glDrawElements;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, __functionAddress);
    }
    @Substitute
    public static void glFinish() {
        long __functionAddress = GL.getICD().glFinish;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glFlush() {
        long __functionAddress = GL.getICD().glFlush;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glFrontFace(@NativeType("GLenum") int dir) {
        long __functionAddress = GL.getICD().glFrontFace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(dir, __functionAddress);
    }
    @Substitute
    public static void nglGenTextures(int n, long textures) {
        long __functionAddress = GL.getICD().glGenTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, textures, __functionAddress);
    }
    @Substitute
    public static void nglDeleteTextures(int n, long textures) {
        long __functionAddress = GL.getICD().glDeleteTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, textures, __functionAddress);
    }
    @Substitute
    public static void nglGetBooleanv(int pname, long params) {
        long __functionAddress = GL.getICD().glGetBooleanv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetFloatv(int pname, long params) {
        long __functionAddress = GL.getICD().glGetFloatv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetIntegerv(int pname, long params) {
        long __functionAddress = GL.getICD().glGetIntegerv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetDoublev(int pname, long params) {
        long __functionAddress = GL.getICD().glGetDoublev;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static int glGetError() {
        long __functionAddress = GL.getICD().glGetError;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void nglGetPointerv(int pname, long params) {
        long __functionAddress = GL.getICD().glGetPointerv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static long nglGetString(int name) {
        long __functionAddress = GL.getICD().glGetString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(name, __functionAddress);
    }
    @Substitute
    public static void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glGetTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int hint) {
        long __functionAddress = GL.getICD().glHint;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, hint, __functionAddress);
    }
    @Substitute
    public static boolean glIsEnabled(@NativeType("GLenum") int cap) {
        long __functionAddress = GL.getICD().glIsEnabled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(cap, __functionAddress);
    }
    @Substitute
    public static boolean glIsTexture(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glIsTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(texture, __functionAddress);
    }
    @Substitute
    public static void glLineWidth(@NativeType("GLfloat") float width) {
        long __functionAddress = GL.getICD().glLineWidth;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(width, __functionAddress);
    }
    @Substitute
    public static void glLogicOp(@NativeType("GLenum") int op) {
        long __functionAddress = GL.getICD().glLogicOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(op, __functionAddress);
    }
    @Substitute
    public static void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glPixelStorei;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glPixelStoref(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glPixelStoref;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glPointSize(@NativeType("GLfloat") float size) {
        long __functionAddress = GL.getICD().glPointSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(size, __functionAddress);
    }
    @Substitute
    public static void glPolygonMode(@NativeType("GLenum") int face, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glPolygonMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, mode, __functionAddress);
    }
    @Substitute
    public static void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units) {
        long __functionAddress = GL.getICD().glPolygonOffset;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(factor, units, __functionAddress);
    }
    @Substitute
    public static void glReadBuffer(@NativeType("GLenum") int src) {
        long __functionAddress = GL.getICD().glReadBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(src, __functionAddress);
    }
    @Substitute
    public static void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glReadPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glScissor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilFunc;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(func, ref, mask, __functionAddress);
    }
    @Substitute
    public static void glStencilMask(@NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void glStencilOp(@NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        long __functionAddress = GL.getICD().glStencilOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sfail, dpfail, dppass, __functionAddress);
    }
    @Substitute
    public static void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, internalFormat, x, y, width, border, __functionAddress);
    }
    @Substitute
    public static void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, internalFormat, x, y, width, height, border, __functionAddress);
    }
    @Substitute
    public static void glCopyTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, xoffset, x, y, width, __functionAddress);
    }
    @Substitute
    public static void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glTexParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glTexParameterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int w, @NativeType("GLsizei") int h) {
        long __functionAddress = GL.getICD().glViewport;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, w, h, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTGeometryShader4.class)
final class Target_org_lwjgl_opengl_EXTGeometryShader4 {

    @Substitute
    public static void glProgramParameteriEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glProgramParameteriEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, pname, value, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTextureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureFaceEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face) {
        long __functionAddress = GL.getICD().glFramebufferTextureFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, face, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVTimelineSemaphore.class)
final class Target_org_lwjgl_opengl_NVTimelineSemaphore {
    @Substitute
    public static void nglCreateSemaphoresNV(int n, long semaphores) {
        long __functionAddress = GL.getICD().glCreateSemaphoresNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, semaphores, __functionAddress);
    }
    @Substitute
    public static void nglSemaphoreParameterivNV(int semaphore, int pname, long params) {
        long __functionAddress = GL.getICD().glSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSemaphoreParameterivNV(int semaphore, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTEGLImageStorage.class)
final class Target_org_lwjgl_opengl_EXTEGLImageStorage {
    @Substitute
    public static void nglEGLImageTargetTexStorageEXT(int target, long image, long attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTexStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
        }
        callPPV(target, image, attrib_list, __functionAddress);
    }
    @Substitute
    public static void nglEGLImageTargetTextureStorageEXT(int texture, long image, long attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTextureStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
        }
        callPPV(texture, image, attrib_list, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL12.class)
final class Target_org_lwjgl_opengl_GL12 {

}
@TargetClass(org.lwjgl.opengl.ARBUniformBufferObject.class)
final class Target_org_lwjgl_opengl_ARBUniformBufferObject {

}
@TargetClass(org.lwjgl.opengl.GL45.class)
final class Target_org_lwjgl_opengl_GL45 {
    @Substitute
    public static void nglGetnMapdv(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnMapfv(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnMapiv(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapfv(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapuiv(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapusv(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapusv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPolygonStipple(int bufSize, long pattern) {
        long __functionAddress = GL.getICD().glGetnPolygonStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufSize, pattern, __functionAddress);
    }
    @Substitute
    public static void nglGetnColorTable(int target, int format, int type, int bufSize, long table) {
        long __functionAddress = GL.getICD().glGetnColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, bufSize, table, __functionAddress);
    }
    @Substitute
    public static void nglGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
        long __functionAddress = GL.getICD().glGetnConvolutionFilter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, bufSize, image, __functionAddress);
    }
    @Substitute
    public static void nglGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
        long __functionAddress = GL.getICD().glGetnSeparableFilter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, format, type, rowBufSize, row, columnBufSize, column, span, __functionAddress);
    }
    @Substitute
    public static void nglGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
        long __functionAddress = GL.getICD().glGetnHistogram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, bufSize, values, __functionAddress);
    }
    @Substitute
    public static void nglGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
        long __functionAddress = GL.getICD().glGetnMinmax;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, bufSize, values, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVPixelDataRange.class)
final class Target_org_lwjgl_opengl_NVPixelDataRange {
    @Substitute
    public static void nglPixelDataRangeNV(int target, int length, long pointer) {
        long __functionAddress = GL.getICD().glPixelDataRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, length, pointer, __functionAddress);
    }
    @Substitute
    public static void glFlushPixelDataRangeNV(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glFlushPixelDataRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBProgramInterfaceQuery.class)
final class Target_org_lwjgl_opengl_ARBProgramInterfaceQuery {

}
@TargetClass(org.lwjgl.opengl.EXTShaderFramebufferFetchNonCoherent.class)
final class Target_org_lwjgl_opengl_EXTShaderFramebufferFetchNonCoherent {

    @Substitute
    public static void glFramebufferFetchBarrierEXT() {
        long __functionAddress = GL.getICD().glFramebufferFetchBarrierEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDGPUShaderInt64.class)
final class Target_org_lwjgl_opengl_AMDGPUShaderInt64 {

}
@TargetClass(org.lwjgl.opengl.GL42.class)
final class Target_org_lwjgl_opengl_GL42 {

}
@TargetClass(org.lwjgl.opengl.ARBSeparateShaderObjects.class)
final class Target_org_lwjgl_opengl_ARBSeparateShaderObjects {

}
@TargetClass(org.lwjgl.opengl.NVScissorExclusive.class)
final class Target_org_lwjgl_opengl_NVScissorExclusive {
    @Substitute
    public static void nglScissorExclusiveArrayvNV(int first, int count, long v) {
        long __functionAddress = GL.getICD().glScissorExclusiveArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, v, __functionAddress);
    }
    @Substitute
    public static void glScissorExclusiveNV(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glScissorExclusiveNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, width, height, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GREMEDYFrameTerminator.class)
final class Target_org_lwjgl_opengl_GREMEDYFrameTerminator {

    @Substitute
    public static void glFrameTerminatorGREMEDY() {
        long __functionAddress = GL.getICD().glFrameTerminatorGREMEDY;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDrawBuffersBlend.class)
final class Target_org_lwjgl_opengl_ARBDrawBuffersBlend {

    @Substitute
    public static void glBlendEquationiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBlendEquationiARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, mode, __functionAddress);
    }
    @Substitute
    public static void glBlendEquationSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        long __functionAddress = GL.getICD().glBlendEquationSeparateiARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, modeRGB, modeAlpha, __functionAddress);
    }
    @Substitute
    public static void glBlendFunciARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst) {
        long __functionAddress = GL.getICD().glBlendFunciARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, src, dst, __functionAddress);
    }
    @Substitute
    public static void glBlendFuncSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        long __functionAddress = GL.getICD().glBlendFuncSeparateiARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTFramebufferObject.class)
final class Target_org_lwjgl_opengl_EXTFramebufferObject {
    @Substitute
    public static boolean glIsRenderbufferEXT(@NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glIsRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(renderbuffer, __functionAddress);
    }
    @Substitute
    public static void glBindRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glBindRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteRenderbuffersEXT(int n, long renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, renderbuffers, __functionAddress);
    }
    @Substitute
    public static void nglGenRenderbuffersEXT(int n, long renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, renderbuffers, __functionAddress);
    }
    @Substitute
    public static void glRenderbufferStorageEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetRenderbufferParameterivEXT(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static boolean glIsFramebufferEXT(@NativeType("GLuint") int framebuffer) {
        long __functionAddress = GL.getICD().glIsFramebufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(framebuffer, __functionAddress);
    }
    @Substitute
    public static void glBindFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        long __functionAddress = GL.getICD().glBindFramebufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, framebuffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteFramebuffersEXT(int n, long framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, framebuffers, __functionAddress);
    }
    @Substitute
    public static void nglGenFramebuffersEXT(int n, long framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, framebuffers, __functionAddress);
    }
    @Substitute
    public static int glCheckFramebufferStatusEXT(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glCheckFramebufferStatusEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(target, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture1DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTexture1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture2DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTexture2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture3DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset) {
        long __functionAddress = GL.getICD().glFramebufferTexture3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, zoffset, __functionAddress);
    }
    @Substitute
    public static void glFramebufferRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glFramebufferRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, renderbuffertarget, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void nglGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, long params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }
    @Substitute
    public static void glGenerateMipmapEXT(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glGenerateMipmapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureBufferObject.class)
final class Target_org_lwjgl_opengl_ARBTextureBufferObject {

    @Substitute
    public static void glTexBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTexBufferARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, buffer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVViewportSwizzle.class)
final class Target_org_lwjgl_opengl_NVViewportSwizzle {

    @Substitute
    public static void glViewportSwizzleNV(@NativeType("GLuint") int index, @NativeType("GLenum") int swizzlex, @NativeType("GLenum") int swizzley, @NativeType("GLenum") int swizzlez, @NativeType("GLenum") int swizzlew) {
        long __functionAddress = GL.getICD().glViewportSwizzleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, swizzlex, swizzley, swizzlez, swizzlew, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL44.class)
final class Target_org_lwjgl_opengl_GL44 {

}
@TargetClass(org.lwjgl.opengl.ARBClipControl.class)
final class Target_org_lwjgl_opengl_ARBClipControl {

}
@TargetClass(org.lwjgl.opengl.ARBMapBufferRange.class)
final class Target_org_lwjgl_opengl_ARBMapBufferRange {

}
@TargetClass(org.lwjgl.opengl.EXTShaderImageLoadStore.class)
final class Target_org_lwjgl_opengl_EXTShaderImageLoadStore {

    @Substitute
    public static void glBindImageTextureEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLint") int format) {
        long __functionAddress = GL.getICD().glBindImageTextureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, texture, level, layered, layer, access, format, __functionAddress);
    }
    @Substitute
    public static void glMemoryBarrierEXT(@NativeType("GLbitfield") int barriers) {
        long __functionAddress = GL.getICD().glMemoryBarrierEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(barriers, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTBlendEquationSeparate.class)
final class Target_org_lwjgl_opengl_EXTBlendEquationSeparate {

    @Substitute
    public static void glBlendEquationSeparateEXT(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        long __functionAddress = GL.getICD().glBlendEquationSeparateEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(modeRGB, modeAlpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL40C.class)
final class Target_org_lwjgl_opengl_GL40C {
    @Substitute
    public static void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBlendEquationi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, mode, __functionAddress);
    }
    @Substitute
    public static void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        long __functionAddress = GL.getICD().glBlendEquationSeparatei;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, modeRGB, modeAlpha, __functionAddress);
    }
    @Substitute
    public static void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        long __functionAddress = GL.getICD().glBlendFunci;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, sfactor, dfactor, __functionAddress);
    }
    @Substitute
    public static void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        long __functionAddress = GL.getICD().glBlendFuncSeparatei;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
    }
    @Substitute
    public static void nglDrawArraysIndirect(int mode, long indirect) {
        long __functionAddress = GL.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, indirect, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
        long __functionAddress = GL.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, type, indirect, __functionAddress);
    }
    @Substitute
    public static void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        long __functionAddress = GL.getICD().glUniform1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, x, __functionAddress);
    }
    @Substitute
    public static void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glUniform2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, x, y, __functionAddress);
    }
    @Substitute
    public static void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glUniform3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glUniform4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglUniform1dv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2dv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3dv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4dv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformdv(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void glMinSampleShading(@NativeType("GLfloat") float value) {
        long __functionAddress = GL.getICD().glMinSampleShading;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(value, __functionAddress);
    }
    @Substitute
    public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        long __functionAddress = GL.getICD().glGetSubroutineUniformLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, shadertype, name, __functionAddress);
    }
    @Substitute
    public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
        long __functionAddress = GL.getICD().glGetSubroutineIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, shadertype, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, shadertype, index, pname, values, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, shadertype, index, bufsize, length, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, shadertype, index, bufsize, length, name, __functionAddress);
    }
    @Substitute
    public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        long __functionAddress = GL.getICD().glUniformSubroutinesuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(shadertype, count, indices, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformSubroutineuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(shadertype, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        long __functionAddress = GL.getICD().glGetProgramStageiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, shadertype, pname, values, __functionAddress);
    }
    @Substitute
    public static void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glPatchParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, value, __functionAddress);
    }
    @Substitute
    public static void nglPatchParameterfv(int pname, long values) {
        long __functionAddress = GL.getICD().glPatchParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, values, __functionAddress);
    }
    @Substitute
    public static void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBindTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, id, __functionAddress);
    }
    @Substitute
    public static void nglDeleteTransformFeedbacks(int n, long ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static void nglGenTransformFeedbacks(int n, long ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glIsTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(id, __functionAddress);
    }
    @Substitute
    public static void glPauseTransformFeedback() {
        long __functionAddress = GL.getICD().glPauseTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glResumeTransformFeedback() {
        long __functionAddress = GL.getICD().glResumeTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glDrawTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, id, __functionAddress);
    }
    @Substitute
    public static void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream) {
        long __functionAddress = GL.getICD().glDrawTransformFeedbackStream;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, id, stream, __functionAddress);
    }
    @Substitute
    public static void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBeginQueryIndexed;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, id, __functionAddress);
    }
    @Substitute
    public static void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEndQueryIndexed;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryIndexediv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexShader.class)
final class Target_org_lwjgl_opengl_ARBVertexShader {
    @Substitute
    public static void glVertexAttrib1fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4NubARB(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        long __functionAddress = GL.getICD().glVertexAttrib4NubARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUUV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1fvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1svARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1dvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2fvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2svARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2dvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3fvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3svARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3dvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4fvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4svARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4dvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4ivARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4bvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4bvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4ubvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4ubvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4usvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4usvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4uivARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4uivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NbvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NbvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NsvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NsvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NivARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NubvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NubvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NusvARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4NuivARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, normalized, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glEnableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableVertexAttribArrayARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void glDisableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableVertexAttribArrayARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void nglBindAttribLocationARB(int programObj, int index, long name) {
        long __functionAddress = GL.getICD().glBindAttribLocationARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programObj, index, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetActiveAttribARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(programObj, index, maxLength, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static int nglGetAttribLocationARB(int programObj, long name) {
        long __functionAddress = GL.getICD().glGetAttribLocationARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(programObj, name, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribivARB(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
        long __functionAddress = GL.getICD().glGetVertexAttribPointervARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, pointer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDInterleavedElements.class)
final class Target_org_lwjgl_opengl_AMDInterleavedElements {

    @Substitute
    public static void glVertexAttribParameteriAMD(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glVertexAttribParameteriAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, pname, param, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL12C.class)
final class Target_org_lwjgl_opengl_GL12C {
    @Substitute
    public static void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        long __functionAddress = GL.getICD().glDrawRangeElements;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, start, end, count, type, indices, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBMultiBind.class)
final class Target_org_lwjgl_opengl_ARBMultiBind {

}
@TargetClass(org.lwjgl.opengl.EXTTextureArray.class)
final class Target_org_lwjgl_opengl_EXTTextureArray {

    @Substitute
    public static void glFramebufferTextureLayerEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glFramebufferTextureLayerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, layer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBInstancedArrays.class)
final class Target_org_lwjgl_opengl_ARBInstancedArrays {

    @Substitute
    public static void glVertexAttribDivisorARB(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexAttribDivisorARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, divisor, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribDivisorEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribDivisorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, index, divisor, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBPointParameters.class)
final class Target_org_lwjgl_opengl_ARBPointParameters {
    @Substitute
    public static void glPointParameterfARB(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glPointParameterfARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglPointParameterfvARB(int pname, long params) {
        long __functionAddress = GL.getICD().glPointParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL45C.class)
final class Target_org_lwjgl_opengl_GL45C {
    @Substitute
    public static void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth) {
        long __functionAddress = GL.getICD().glClipControl;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(origin, depth, __functionAddress);
    }
    @Substitute
    public static void nglCreateTransformFeedbacks(int n, long ids) {
        long __functionAddress = GL.getICD().glCreateTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTransformFeedbackBufferBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(xfb, index, buffer, __functionAddress);
    }
    @Substitute
    public static void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glTransformFeedbackBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(xfb, index, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(xfb, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki64_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }
    @Substitute
    public static void nglCreateBuffers(int n, long buffers) {
        long __functionAddress = GL.getICD().glCreateBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, buffers, __functionAddress);
    }
    @Substitute
    public static void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, size, data, flags, __functionAddress);
    }
    @Substitute
    public static void nglNamedBufferData(int buffer, long size, long data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, size, data, usage, __functionAddress);
    }
    @Substitute
    public static void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glCopyNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }
    @Substitute
    public static long nglMapNamedBuffer(int buffer, int access) {
        long __functionAddress = GL.getICD().glMapNamedBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(buffer, access, __functionAddress);
    }
    @Substitute
    public static long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
        long __functionAddress = GL.getICD().glMapNamedBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(buffer, offset, length, access, __functionAddress);
    }
    @Substitute
    public static boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glUnmapNamedBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(buffer, __functionAddress);
    }
    @Substitute
    public static void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        long __functionAddress = GL.getICD().glFlushMappedNamedBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, offset, length, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedBufferPointerv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void nglCreateFramebuffers(int n, long framebuffers) {
        long __functionAddress = GL.getICD().glCreateFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, framebuffers, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glNamedFramebufferRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, renderbuffertarget, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glNamedFramebufferParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, pname, param, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glNamedFramebufferTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glNamedFramebufferTextureLayer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, layer, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf) {
        long __functionAddress = GL.getICD().glNamedFramebufferDrawBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, buf, __functionAddress);
    }
    @Substitute
    public static void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
        long __functionAddress = GL.getICD().glNamedFramebufferDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, n, bufs, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src) {
        long __functionAddress = GL.getICD().glNamedFramebufferReadBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, src, __functionAddress);
    }
    @Substitute
    public static void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, numAttachments, attachments, __functionAddress);
    }
    @Substitute
    public static void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, numAttachments, attachments, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferfi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, buffer, drawbuffer, depth, stencil, __functionAddress);
    }
    @Substitute
    public static void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glBlitNamedFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }
    @Substitute
    public static int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glCheckNamedFramebufferStatus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(framebuffer, target, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglCreateRenderbuffers(int n, long renderbuffers) {
        long __functionAddress = GL.getICD().glCreateRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, renderbuffers, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorageMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, samples, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglCreateTextures(int target, int n, long textures) {
        long __functionAddress = GL.getICD().glCreateTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, n, textures, __functionAddress);
    }
    @Substitute
    public static void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTextureBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, internalformat, buffer, __functionAddress);
    }
    @Substitute
    public static void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glTextureBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(texture, internalformat, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glTextureStorage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, levels, internalformat, width, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glTextureStorage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, levels, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glTextureStorage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, levels, internalformat, width, height, depth, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTextureStorage2DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTextureStorage3DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, xoffset, x, y, width, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, xoffset, yoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glTextureParameterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterfv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glTextureParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterIiv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterIuiv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameteriv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void glGenerateTextureMipmap(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glGenerateTextureMipmap;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glBindTextureUnit;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(unit, texture, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, bufSize, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, bufSize, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterfv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterIiv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterIuiv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameteriv(int texture, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglCreateVertexArrays(int n, long arrays) {
        long __functionAddress = GL.getICD().glCreateVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, arrays, __functionAddress);
    }
    @Substitute
    public static void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableVertexArrayAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, index, __functionAddress);
    }
    @Substitute
    public static void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableVertexArrayAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, index, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glVertexArrayElementBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, buffer, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexArrayVertexBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, bindingindex, buffer, offset, stride, __functionAddress);
    }
    @Substitute
    public static void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
        long __functionAddress = GL.getICD().glVertexArrayVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(vaobj, first, count, buffers, offsets, strides, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayAttribFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, normalized, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayAttribIFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayAttribLFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        long __functionAddress = GL.getICD().glVertexArrayAttribBinding;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, bindingindex, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexArrayBindingDivisor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, bindingindex, divisor, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayiv(int vaobj, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexediv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexed64iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglCreateSamplers(int n, long samplers) {
        long __functionAddress = GL.getICD().glCreateSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, samplers, __functionAddress);
    }
    @Substitute
    public static void nglCreateProgramPipelines(int n, long pipelines) {
        long __functionAddress = GL.getICD().glCreateProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, pipelines, __functionAddress);
    }
    @Substitute
    public static void nglCreateQueries(int target, int n, long ids) {
        long __functionAddress = GL.getICD().glCreateQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, n, ids, __functionAddress);
    }
    @Substitute
    public static void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glGetQueryBufferObjectiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, buffer, pname, offset, __functionAddress);
    }
    @Substitute
    public static void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glGetQueryBufferObjectuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, buffer, pname, offset, __functionAddress);
    }
    @Substitute
    public static void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glGetQueryBufferObjecti64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, buffer, pname, offset, __functionAddress);
    }
    @Substitute
    public static void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glGetQueryBufferObjectui64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, buffer, pname, offset, __functionAddress);
    }
    @Substitute
    public static void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        long __functionAddress = GL.getICD().glMemoryBarrierByRegion;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(barriers, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels, __functionAddress);
    }
    @Substitute
    public static void glTextureBarrier() {
        long __functionAddress = GL.getICD().glTextureBarrier;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static int glGetGraphicsResetStatus() {
        long __functionAddress = GL.getICD().glGetGraphicsResetStatus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, bufSize, img, __functionAddress);
    }
    @Substitute
    public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, bufSize, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetnCompressedTexImage(int target, int level, int bufSize, long img) {
        long __functionAddress = GL.getICD().glGetnCompressedTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, bufSize, img, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformdv(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTTimerQuery.class)
final class Target_org_lwjgl_opengl_EXTTimerQuery {
    @Substitute
    public static void nglGetQueryObjecti64vEXT(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectui64vEXT(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureView.class)
final class Target_org_lwjgl_opengl_ARBTextureView {

}
@TargetClass(org.lwjgl.opengl.ARBVertexAttrib64Bit.class)
final class Target_org_lwjgl_opengl_ARBVertexAttrib64Bit {

    @Substitute
    public static void glVertexArrayVertexAttribLOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribLOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, index, size, type, stride, offset, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.INTELFramebufferCMAA.class)
final class Target_org_lwjgl_opengl_INTELFramebufferCMAA {

    @Substitute
    public static void glApplyFramebufferAttachmentCMAAINTEL() {
        long __functionAddress = GL.getICD().glApplyFramebufferAttachmentCMAAINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVQueryResourceTag.class)
final class Target_org_lwjgl_opengl_NVQueryResourceTag {
    @Substitute
    public static void nglGenQueryResourceTagNV(int n, long tagIds) {
        long __functionAddress = GL.getICD().glGenQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, tagIds, __functionAddress);
    }
    @Substitute
    public static void nglDeleteQueryResourceTagNV(int n, long tagIds) {
        long __functionAddress = GL.getICD().glDeleteQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, tagIds, __functionAddress);
    }
    @Substitute
    public static void nglQueryResourceTagNV(int tagId, long tagString) {
        long __functionAddress = GL.getICD().glQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tagId, tagString, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL43.class)
final class Target_org_lwjgl_opengl_GL43 {

}
@TargetClass(org.lwjgl.opengl.ARBBlendFuncExtended.class)
final class Target_org_lwjgl_opengl_ARBBlendFuncExtended {

}
@TargetClass(org.lwjgl.opengl.NVBindlessMultiDrawIndirect.class)
final class Target_org_lwjgl_opengl_NVBindlessMultiDrawIndirect {
    @Substitute
    public static void nglMultiDrawArraysIndirectBindlessNV(int mode, long indirect, int drawCount, int stride, int vertexBufferCount) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectBindlessNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, indirect, drawCount, stride, vertexBufferCount, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsIndirectBindlessNV(int mode, int type, long indirect, int drawCount, int stride, int vertexBufferCount) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectBindlessNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, type, indirect, drawCount, stride, vertexBufferCount, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBProvokingVertex.class)
final class Target_org_lwjgl_opengl_ARBProvokingVertex {

}
@TargetClass(org.lwjgl.opengl.GL11.class)
final class Target_org_lwjgl_opengl_GL11 {
    @Substitute
    public static void glAccum(@NativeType("GLenum") int op, @NativeType("GLfloat") float value) {
        long __functionAddress = GL.getICD().glAccum;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(op, value, __functionAddress);
    }
    @Substitute
    public static void glAlphaFunc(@NativeType("GLenum") int func, @NativeType("GLfloat") float ref) {
        long __functionAddress = GL.getICD().glAlphaFunc;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(func, ref, __functionAddress);
    }
    @Substitute
    public static boolean nglAreTexturesResident(int n, long textures, long residences) {
        long __functionAddress = GL.getICD().glAreTexturesResident;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(n, textures, residences, __functionAddress);
    }
    @Substitute
    public static void glArrayElement(@NativeType("GLint") int i) {
        long __functionAddress = GL.getICD().glArrayElement;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(i, __functionAddress);
    }
    @Substitute
    public static void glBegin(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBegin;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        long __functionAddress = GL.getICD().glBitmap;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(w, h, xOrig, yOrig, xInc, yInc, data, __functionAddress);
    }
    @Substitute
    public static void glCallList(@NativeType("GLuint") int list) {
        long __functionAddress = GL.getICD().glCallList;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(list, __functionAddress);
    }
    @Substitute
    public static void nglCallLists(int n, int type, long lists) {
        long __functionAddress = GL.getICD().glCallLists;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, type, lists, __functionAddress);
    }
    @Substitute
    public static void glClearAccum(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        long __functionAddress = GL.getICD().glClearAccum;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glClearIndex(@NativeType("GLfloat") float index) {
        long __functionAddress = GL.getICD().glClearIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void nglClipPlane(int plane, long equation) {
        long __functionAddress = GL.getICD().glClipPlane;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(plane, equation, __functionAddress);
    }
    @Substitute
    public static void glColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue) {
        long __functionAddress = GL.getICD().glColor3b;
        if (CHECKS) {
            check(__functionAddress);
        }
        callBBBV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue) {
        long __functionAddress = GL.getICD().glColor3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glColor3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue) {
        long __functionAddress = GL.getICD().glColor3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue) {
        long __functionAddress = GL.getICD().glColor3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue) {
        long __functionAddress = GL.getICD().glColor3ub;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue) {
        long __functionAddress = GL.getICD().glColor3us;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCCCV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glColor3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void nglColor3bv(long v) {
        long __functionAddress = GL.getICD().glColor3bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3sv(long v) {
        long __functionAddress = GL.getICD().glColor3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3iv(long v) {
        long __functionAddress = GL.getICD().glColor3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3fv(long v) {
        long __functionAddress = GL.getICD().glColor3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3dv(long v) {
        long __functionAddress = GL.getICD().glColor3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3ubv(long v) {
        long __functionAddress = GL.getICD().glColor3ubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3usv(long v) {
        long __functionAddress = GL.getICD().glColor3usv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor3uiv(long v) {
        long __functionAddress = GL.getICD().glColor3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glColor4b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue, @NativeType("GLbyte") byte alpha) {
        long __functionAddress = GL.getICD().glColor4b;
        if (CHECKS) {
            check(__functionAddress);
        }
        callBBBBV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue, @NativeType("GLshort") short alpha) {
        long __functionAddress = GL.getICD().glColor4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha) {
        long __functionAddress = GL.getICD().glColor4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        long __functionAddress = GL.getICD().glColor4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue, @NativeType("GLdouble") double alpha) {
        long __functionAddress = GL.getICD().glColor4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue, @NativeType("GLubyte") byte alpha) {
        long __functionAddress = GL.getICD().glColor4ub;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUUV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue, @NativeType("GLushort") short alpha) {
        long __functionAddress = GL.getICD().glColor4us;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCCCCV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glColor4ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha) {
        long __functionAddress = GL.getICD().glColor4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void nglColor4bv(long v) {
        long __functionAddress = GL.getICD().glColor4bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4sv(long v) {
        long __functionAddress = GL.getICD().glColor4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4iv(long v) {
        long __functionAddress = GL.getICD().glColor4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4fv(long v) {
        long __functionAddress = GL.getICD().glColor4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4dv(long v) {
        long __functionAddress = GL.getICD().glColor4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4ubv(long v) {
        long __functionAddress = GL.getICD().glColor4ubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4usv(long v) {
        long __functionAddress = GL.getICD().glColor4usv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglColor4uiv(long v) {
        long __functionAddress = GL.getICD().glColor4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glColorMaterial(@NativeType("GLenum") int face, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glColorMaterial;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, mode, __functionAddress);
    }
    @Substitute
    public static void nglColorPointer(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glColorPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glCopyPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int type) {
        long __functionAddress = GL.getICD().glCopyPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, width, height, type, __functionAddress);
    }
    @Substitute
    public static void glDeleteLists(@NativeType("GLuint") int list, @NativeType("GLsizei") int range) {
        long __functionAddress = GL.getICD().glDeleteLists;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(list, range, __functionAddress);
    }
    @Substitute
    public static void glDisableClientState(@NativeType("GLenum") int cap) {
        long __functionAddress = GL.getICD().glDisableClientState;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(cap, __functionAddress);
    }
    @Substitute
    public static void nglDrawPixels(int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glDrawPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glEdgeFlag(@NativeType("GLboolean") boolean flag) {
        long __functionAddress = GL.getICD().glEdgeFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(flag, __functionAddress);
    }
    @Substitute
    public static void nglEdgeFlagv(long flag) {
        long __functionAddress = GL.getICD().glEdgeFlagv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(flag, __functionAddress);
    }
    @Substitute
    public static void nglEdgeFlagPointer(int stride, long pointer) {
        long __functionAddress = GL.getICD().glEdgeFlagPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glEnableClientState(@NativeType("GLenum") int cap) {
        long __functionAddress = GL.getICD().glEnableClientState;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(cap, __functionAddress);
    }
    @Substitute
    public static void glEnd() {
        long __functionAddress = GL.getICD().glEnd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glEvalCoord1f(@NativeType("GLfloat") float u) {
        long __functionAddress = GL.getICD().glEvalCoord1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(u, __functionAddress);
    }
    @Substitute
    public static void nglEvalCoord1fv(long u) {
        long __functionAddress = GL.getICD().glEvalCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(u, __functionAddress);
    }
    @Substitute
    public static void glEvalCoord1d(@NativeType("GLdouble") double u) {
        long __functionAddress = GL.getICD().glEvalCoord1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(u, __functionAddress);
    }
    @Substitute
    public static void nglEvalCoord1dv(long u) {
        long __functionAddress = GL.getICD().glEvalCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(u, __functionAddress);
    }
    @Substitute
    public static void glEvalCoord2f(@NativeType("GLfloat") float u, @NativeType("GLfloat") float v) {
        long __functionAddress = GL.getICD().glEvalCoord2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(u, v, __functionAddress);
    }
    @Substitute
    public static void nglEvalCoord2fv(long u) {
        long __functionAddress = GL.getICD().glEvalCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(u, __functionAddress);
    }
    @Substitute
    public static void glEvalCoord2d(@NativeType("GLdouble") double u, @NativeType("GLdouble") double v) {
        long __functionAddress = GL.getICD().glEvalCoord2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(u, v, __functionAddress);
    }
    @Substitute
    public static void nglEvalCoord2dv(long u) {
        long __functionAddress = GL.getICD().glEvalCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(u, __functionAddress);
    }
    @Substitute
    public static void glEvalMesh1(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2) {
        long __functionAddress = GL.getICD().glEvalMesh1;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, i1, i2, __functionAddress);
    }
    @Substitute
    public static void glEvalMesh2(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2, @NativeType("GLint") int j1, @NativeType("GLint") int j2) {
        long __functionAddress = GL.getICD().glEvalMesh2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, i1, i2, j1, j2, __functionAddress);
    }
    @Substitute
    public static void glEvalPoint1(@NativeType("GLint") int i) {
        long __functionAddress = GL.getICD().glEvalPoint1;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(i, __functionAddress);
    }
    @Substitute
    public static void glEvalPoint2(@NativeType("GLint") int i, @NativeType("GLint") int j) {
        long __functionAddress = GL.getICD().glEvalPoint2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(i, j, __functionAddress);
    }
    @Substitute
    public static void nglFeedbackBuffer(int size, int type, long buffer) {
        long __functionAddress = GL.getICD().glFeedbackBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, buffer, __functionAddress);
    }
    @Substitute
    public static void glFogi(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glFogi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglFogiv(int pname, long params) {
        long __functionAddress = GL.getICD().glFogiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void glFogf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glFogf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglFogfv(int pname, long params) {
        long __functionAddress = GL.getICD().glFogfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static int glGenLists(@NativeType("GLsizei") int s) {
        long __functionAddress = GL.getICD().glGenLists;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(s, __functionAddress);
    }
    @Substitute
    public static void nglGetClipPlane(int plane, long equation) {
        long __functionAddress = GL.getICD().glGetClipPlane;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(plane, equation, __functionAddress);
    }
    @Substitute
    public static void nglGetLightiv(int light, int pname, long data) {
        long __functionAddress = GL.getICD().glGetLightiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(light, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetLightfv(int light, int pname, long data) {
        long __functionAddress = GL.getICD().glGetLightfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(light, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetMapiv(int target, int query, long data) {
        long __functionAddress = GL.getICD().glGetMapiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data, __functionAddress);
    }
    @Substitute
    public static void nglGetMapfv(int target, int query, long data) {
        long __functionAddress = GL.getICD().glGetMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data, __functionAddress);
    }
    @Substitute
    public static void nglGetMapdv(int target, int query, long data) {
        long __functionAddress = GL.getICD().glGetMapdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data, __functionAddress);
    }
    @Substitute
    public static void nglGetMaterialiv(int face, int pname, long data) {
        long __functionAddress = GL.getICD().glGetMaterialiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(face, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetMaterialfv(int face, int pname, long data) {
        long __functionAddress = GL.getICD().glGetMaterialfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(face, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetPixelMapfv(int map, long data) {
        long __functionAddress = GL.getICD().glGetPixelMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data, __functionAddress);
    }
    @Substitute
    public static void nglGetPixelMapusv(int map, long data) {
        long __functionAddress = GL.getICD().glGetPixelMapusv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data, __functionAddress);
    }
    @Substitute
    public static void nglGetPixelMapuiv(int map, long data) {
        long __functionAddress = GL.getICD().glGetPixelMapuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data, __functionAddress);
    }
    @Substitute
    public static void nglGetPolygonStipple(long pattern) {
        long __functionAddress = GL.getICD().glGetPolygonStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pattern, __functionAddress);
    }
    @Substitute
    public static void nglGetTexEnviv(int env, int pname, long data) {
        long __functionAddress = GL.getICD().glGetTexEnviv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(env, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetTexEnvfv(int env, int pname, long data) {
        long __functionAddress = GL.getICD().glGetTexEnvfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(env, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetTexGeniv(int coord, int pname, long data) {
        long __functionAddress = GL.getICD().glGetTexGeniv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetTexGenfv(int coord, int pname, long data) {
        long __functionAddress = GL.getICD().glGetTexGenfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetTexGendv(int coord, int pname, long data) {
        long __functionAddress = GL.getICD().glGetTexGendv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, data, __functionAddress);
    }
    @Substitute
    public static void glIndexi(@NativeType("GLint") int index) {
        long __functionAddress = GL.getICD().glIndexi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void glIndexub(@NativeType("GLubyte") byte index) {
        long __functionAddress = GL.getICD().glIndexub;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUV(index, __functionAddress);
    }
    @Substitute
    public static void glIndexs(@NativeType("GLshort") short index) {
        long __functionAddress = GL.getICD().glIndexs;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(index, __functionAddress);
    }
    @Substitute
    public static void glIndexf(@NativeType("GLfloat") float index) {
        long __functionAddress = GL.getICD().glIndexf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void glIndexd(@NativeType("GLdouble") double index) {
        long __functionAddress = GL.getICD().glIndexd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void nglIndexiv(long index) {
        long __functionAddress = GL.getICD().glIndexiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, __functionAddress);
    }
    @Substitute
    public static void nglIndexubv(long index) {
        long __functionAddress = GL.getICD().glIndexubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, __functionAddress);
    }
    @Substitute
    public static void nglIndexsv(long index) {
        long __functionAddress = GL.getICD().glIndexsv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, __functionAddress);
    }
    @Substitute
    public static void nglIndexfv(long index) {
        long __functionAddress = GL.getICD().glIndexfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, __functionAddress);
    }
    @Substitute
    public static void nglIndexdv(long index) {
        long __functionAddress = GL.getICD().glIndexdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, __functionAddress);
    }
    @Substitute
    public static void glIndexMask(@NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glIndexMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void nglIndexPointer(int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glIndexPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glInitNames() {
        long __functionAddress = GL.getICD().glInitNames;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglInterleavedArrays(int format, int stride, long pointer) {
        long __functionAddress = GL.getICD().glInterleavedArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(format, stride, pointer, __functionAddress);
    }
    @Substitute
    public static boolean glIsList(@NativeType("GLuint") int list) {
        long __functionAddress = GL.getICD().glIsList;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(list, __functionAddress);
    }
    @Substitute
    public static void glLightModeli(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glLightModeli;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glLightModelf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glLightModelf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglLightModeliv(int pname, long params) {
        long __functionAddress = GL.getICD().glLightModeliv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglLightModelfv(int pname, long params) {
        long __functionAddress = GL.getICD().glLightModelfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void glLighti(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glLighti;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(light, pname, param, __functionAddress);
    }
    @Substitute
    public static void glLightf(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glLightf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(light, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglLightiv(int light, int pname, long params) {
        long __functionAddress = GL.getICD().glLightiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(light, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglLightfv(int light, int pname, long params) {
        long __functionAddress = GL.getICD().glLightfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(light, pname, params, __functionAddress);
    }
    @Substitute
    public static void glLineStipple(@NativeType("GLint") int factor, @NativeType("GLushort") short pattern) {
        long __functionAddress = GL.getICD().glLineStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCV(factor, pattern, __functionAddress);
    }
    @Substitute
    public static void glListBase(@NativeType("GLuint") int base) {
        long __functionAddress = GL.getICD().glListBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(base, __functionAddress);
    }
    @Substitute
    public static void nglLoadMatrixf(long m) {
        long __functionAddress = GL.getICD().glLoadMatrixf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglLoadMatrixd(long m) {
        long __functionAddress = GL.getICD().glLoadMatrixd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void glLoadIdentity() {
        long __functionAddress = GL.getICD().glLoadIdentity;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glLoadName(@NativeType("GLuint") int name) {
        long __functionAddress = GL.getICD().glLoadName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(name, __functionAddress);
    }
    @Substitute
    public static void nglMap1f(int target, float u1, float u2, int stride, int order, long points) {
        long __functionAddress = GL.getICD().glMap1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, u1, u2, stride, order, points, __functionAddress);
    }
    @Substitute
    public static void nglMap1d(int target, double u1, double u2, int stride, int order, long points) {
        long __functionAddress = GL.getICD().glMap1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, u1, u2, stride, order, points, __functionAddress);
    }
    @Substitute
    public static void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points) {
        long __functionAddress = GL.getICD().glMap2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }
    @Substitute
    public static void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points) {
        long __functionAddress = GL.getICD().glMap2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }
    @Substitute
    public static void glMapGrid1f(@NativeType("GLint") int n, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2) {
        long __functionAddress = GL.getICD().glMapGrid1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(n, u1, u2, __functionAddress);
    }
    @Substitute
    public static void glMapGrid1d(@NativeType("GLint") int n, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2) {
        long __functionAddress = GL.getICD().glMapGrid1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(n, u1, u2, __functionAddress);
    }
    @Substitute
    public static void glMapGrid2f(@NativeType("GLint") int un, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int vn, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glMapGrid2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(un, u1, u2, vn, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glMapGrid2d(@NativeType("GLint") int un, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int vn, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        long __functionAddress = GL.getICD().glMapGrid2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(un, u1, u2, vn, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glMateriali(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glMateriali;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, pname, param, __functionAddress);
    }
    @Substitute
    public static void glMaterialf(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glMaterialf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMaterialiv(int face, int pname, long params) {
        long __functionAddress = GL.getICD().glMaterialiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(face, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMaterialfv(int face, int pname, long params) {
        long __functionAddress = GL.getICD().glMaterialfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(face, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMatrixMode(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glMatrixMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void nglMultMatrixf(long m) {
        long __functionAddress = GL.getICD().glMultMatrixf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglMultMatrixd(long m) {
        long __functionAddress = GL.getICD().glMultMatrixd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void glFrustum(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        long __functionAddress = GL.getICD().glFrustum;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(l, r, b, t, n, f, __functionAddress);
    }
    @Substitute
    public static void glNewList(@NativeType("GLuint") int n, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glNewList;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(n, mode, __functionAddress);
    }
    @Substitute
    public static void glEndList() {
        long __functionAddress = GL.getICD().glEndList;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glNormal3f(@NativeType("GLfloat") float nx, @NativeType("GLfloat") float ny, @NativeType("GLfloat") float nz) {
        long __functionAddress = GL.getICD().glNormal3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void glNormal3b(@NativeType("GLbyte") byte nx, @NativeType("GLbyte") byte ny, @NativeType("GLbyte") byte nz) {
        long __functionAddress = GL.getICD().glNormal3b;
        if (CHECKS) {
            check(__functionAddress);
        }
        callBBBV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void glNormal3s(@NativeType("GLshort") short nx, @NativeType("GLshort") short ny, @NativeType("GLshort") short nz) {
        long __functionAddress = GL.getICD().glNormal3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void glNormal3i(@NativeType("GLint") int nx, @NativeType("GLint") int ny, @NativeType("GLint") int nz) {
        long __functionAddress = GL.getICD().glNormal3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void glNormal3d(@NativeType("GLdouble") double nx, @NativeType("GLdouble") double ny, @NativeType("GLdouble") double nz) {
        long __functionAddress = GL.getICD().glNormal3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void nglNormal3fv(long v) {
        long __functionAddress = GL.getICD().glNormal3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglNormal3bv(long v) {
        long __functionAddress = GL.getICD().glNormal3bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglNormal3sv(long v) {
        long __functionAddress = GL.getICD().glNormal3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglNormal3iv(long v) {
        long __functionAddress = GL.getICD().glNormal3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglNormal3dv(long v) {
        long __functionAddress = GL.getICD().glNormal3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglNormalPointer(int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glNormalPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glOrtho(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        long __functionAddress = GL.getICD().glOrtho;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(l, r, b, t, n, f, __functionAddress);
    }
    @Substitute
    public static void glPassThrough(@NativeType("GLfloat") float token) {
        long __functionAddress = GL.getICD().glPassThrough;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(token, __functionAddress);
    }
    @Substitute
    public static void nglPixelMapfv(int map, int size, long values) {
        long __functionAddress = GL.getICD().glPixelMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, size, values, __functionAddress);
    }
    @Substitute
    public static void nglPixelMapusv(int map, int size, long values) {
        long __functionAddress = GL.getICD().glPixelMapusv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, size, values, __functionAddress);
    }
    @Substitute
    public static void nglPixelMapuiv(int map, int size, long values) {
        long __functionAddress = GL.getICD().glPixelMapuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, size, values, __functionAddress);
    }
    @Substitute
    public static void glPixelTransferi(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glPixelTransferi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glPixelTransferf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glPixelTransferf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glPixelZoom(@NativeType("GLfloat") float xfactor, @NativeType("GLfloat") float yfactor) {
        long __functionAddress = GL.getICD().glPixelZoom;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(xfactor, yfactor, __functionAddress);
    }
    @Substitute
    public static void nglPolygonStipple(long pattern) {
        long __functionAddress = GL.getICD().glPolygonStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pattern, __functionAddress);
    }
    @Substitute
    public static void glPushAttrib(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glPushAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void glPushClientAttrib(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glPushClientAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void glPopAttrib() {
        long __functionAddress = GL.getICD().glPopAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glPopClientAttrib() {
        long __functionAddress = GL.getICD().glPopClientAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glPopMatrix() {
        long __functionAddress = GL.getICD().glPopMatrix;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glPopName() {
        long __functionAddress = GL.getICD().glPopName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglPrioritizeTextures(int n, long textures, long priorities) {
        long __functionAddress = GL.getICD().glPrioritizeTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(n, textures, priorities, __functionAddress);
    }
    @Substitute
    public static void glPushMatrix() {
        long __functionAddress = GL.getICD().glPushMatrix;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glPushName(@NativeType("GLuint") int name) {
        long __functionAddress = GL.getICD().glPushName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(name, __functionAddress);
    }
    @Substitute
    public static void glRasterPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glRasterPos2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glRasterPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        long __functionAddress = GL.getICD().glRasterPos2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(x, y, __functionAddress);
    }
    @Substitute
    public static void glRasterPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glRasterPos2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glRasterPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glRasterPos2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos2iv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos2sv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos2fv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos2dv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void glRasterPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glRasterPos3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glRasterPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        long __functionAddress = GL.getICD().glRasterPos3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glRasterPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glRasterPos3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glRasterPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glRasterPos3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos3iv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos3sv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos3fv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos3dv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void glRasterPos4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glRasterPos4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glRasterPos4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w) {
        long __functionAddress = GL.getICD().glRasterPos4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glRasterPos4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glRasterPos4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glRasterPos4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glRasterPos4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos4iv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos4sv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos4fv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglRasterPos4dv(long coords) {
        long __functionAddress = GL.getICD().glRasterPos4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void glRecti(@NativeType("GLint") int x1, @NativeType("GLint") int y1, @NativeType("GLint") int x2, @NativeType("GLint") int y2) {
        long __functionAddress = GL.getICD().glRecti;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x1, y1, x2, y2, __functionAddress);
    }
    @Substitute
    public static void glRects(@NativeType("GLshort") short x1, @NativeType("GLshort") short y1, @NativeType("GLshort") short x2, @NativeType("GLshort") short y2) {
        long __functionAddress = GL.getICD().glRects;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(x1, y1, x2, y2, __functionAddress);
    }
    @Substitute
    public static void glRectf(@NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float x2, @NativeType("GLfloat") float y2) {
        long __functionAddress = GL.getICD().glRectf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x1, y1, x2, y2, __functionAddress);
    }
    @Substitute
    public static void glRectd(@NativeType("GLdouble") double x1, @NativeType("GLdouble") double y1, @NativeType("GLdouble") double x2, @NativeType("GLdouble") double y2) {
        long __functionAddress = GL.getICD().glRectd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x1, y1, x2, y2, __functionAddress);
    }
    @Substitute
    public static void nglRectiv(long v1, long v2) {
        long __functionAddress = GL.getICD().glRectiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(v1, v2, __functionAddress);
    }
    @Substitute
    public static void nglRectsv(long v1, long v2) {
        long __functionAddress = GL.getICD().glRectsv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(v1, v2, __functionAddress);
    }
    @Substitute
    public static void nglRectfv(long v1, long v2) {
        long __functionAddress = GL.getICD().glRectfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(v1, v2, __functionAddress);
    }
    @Substitute
    public static void nglRectdv(long v1, long v2) {
        long __functionAddress = GL.getICD().glRectdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(v1, v2, __functionAddress);
    }
    @Substitute
    public static int glRenderMode(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glRenderMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(mode, __functionAddress);
    }
    @Substitute
    public static void glRotatef(@NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glRotatef;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(angle, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glRotated(@NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glRotated;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(angle, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glScalef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glScalef;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glScaled(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glScaled;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglSelectBuffer(int size, long buffer) {
        long __functionAddress = GL.getICD().glSelectBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, buffer, __functionAddress);
    }
    @Substitute
    public static void glShadeModel(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glShadeModel;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void glTexCoord1f(@NativeType("GLfloat") float s) {
        long __functionAddress = GL.getICD().glTexCoord1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, __functionAddress);
    }
    @Substitute
    public static void glTexCoord1s(@NativeType("GLshort") short s) {
        long __functionAddress = GL.getICD().glTexCoord1s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(s, __functionAddress);
    }
    @Substitute
    public static void glTexCoord1i(@NativeType("GLint") int s) {
        long __functionAddress = GL.getICD().glTexCoord1i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, __functionAddress);
    }
    @Substitute
    public static void glTexCoord1d(@NativeType("GLdouble") double s) {
        long __functionAddress = GL.getICD().glTexCoord1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord1fv(long v) {
        long __functionAddress = GL.getICD().glTexCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord1sv(long v) {
        long __functionAddress = GL.getICD().glTexCoord1sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord1iv(long v) {
        long __functionAddress = GL.getICD().glTexCoord1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord1dv(long v) {
        long __functionAddress = GL.getICD().glTexCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord2f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t) {
        long __functionAddress = GL.getICD().glTexCoord2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, __functionAddress);
    }
    @Substitute
    public static void glTexCoord2s(@NativeType("GLshort") short s, @NativeType("GLshort") short t) {
        long __functionAddress = GL.getICD().glTexCoord2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(s, t, __functionAddress);
    }
    @Substitute
    public static void glTexCoord2i(@NativeType("GLint") int s, @NativeType("GLint") int t) {
        long __functionAddress = GL.getICD().glTexCoord2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, __functionAddress);
    }
    @Substitute
    public static void glTexCoord2d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t) {
        long __functionAddress = GL.getICD().glTexCoord2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord2fv(long v) {
        long __functionAddress = GL.getICD().glTexCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord2sv(long v) {
        long __functionAddress = GL.getICD().glTexCoord2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord2iv(long v) {
        long __functionAddress = GL.getICD().glTexCoord2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord2dv(long v) {
        long __functionAddress = GL.getICD().glTexCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord3f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r) {
        long __functionAddress = GL.getICD().glTexCoord3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, __functionAddress);
    }
    @Substitute
    public static void glTexCoord3s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r) {
        long __functionAddress = GL.getICD().glTexCoord3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(s, t, r, __functionAddress);
    }
    @Substitute
    public static void glTexCoord3i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r) {
        long __functionAddress = GL.getICD().glTexCoord3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, __functionAddress);
    }
    @Substitute
    public static void glTexCoord3d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r) {
        long __functionAddress = GL.getICD().glTexCoord3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord3fv(long v) {
        long __functionAddress = GL.getICD().glTexCoord3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord3sv(long v) {
        long __functionAddress = GL.getICD().glTexCoord3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord3iv(long v) {
        long __functionAddress = GL.getICD().glTexCoord3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord3dv(long v) {
        long __functionAddress = GL.getICD().glTexCoord3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord4f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q) {
        long __functionAddress = GL.getICD().glTexCoord4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glTexCoord4s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q) {
        long __functionAddress = GL.getICD().glTexCoord4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glTexCoord4i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q) {
        long __functionAddress = GL.getICD().glTexCoord4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glTexCoord4d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q) {
        long __functionAddress = GL.getICD().glTexCoord4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord4fv(long v) {
        long __functionAddress = GL.getICD().glTexCoord4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord4sv(long v) {
        long __functionAddress = GL.getICD().glTexCoord4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord4iv(long v) {
        long __functionAddress = GL.getICD().glTexCoord4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord4dv(long v) {
        long __functionAddress = GL.getICD().glTexCoord4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglTexCoordPointer(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glTexCoordPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glTexEnvi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glTexEnvi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexEnviv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexEnviv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexEnvf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glTexEnvf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexEnvfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexEnvfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexGeni(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glTexGeni;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexGeniv(int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glTexGeniv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexGenf(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glTexGenf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexGenfv(int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glTexGenfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexGend(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param) {
        long __functionAddress = GL.getICD().glTexGend;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTexGendv(int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glTexGendv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTranslatef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glTranslatef;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glTranslated(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glTranslated;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertex2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glVertex2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glVertex2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        long __functionAddress = GL.getICD().glVertex2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(x, y, __functionAddress);
    }
    @Substitute
    public static void glVertex2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glVertex2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glVertex2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glVertex2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void nglVertex2fv(long coords) {
        long __functionAddress = GL.getICD().glVertex2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex2sv(long coords) {
        long __functionAddress = GL.getICD().glVertex2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex2iv(long coords) {
        long __functionAddress = GL.getICD().glVertex2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex2dv(long coords) {
        long __functionAddress = GL.getICD().glVertex2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void glVertex3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glVertex3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertex3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        long __functionAddress = GL.getICD().glVertex3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertex3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glVertex3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertex3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glVertex3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglVertex3fv(long coords) {
        long __functionAddress = GL.getICD().glVertex3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex3sv(long coords) {
        long __functionAddress = GL.getICD().glVertex3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex3iv(long coords) {
        long __functionAddress = GL.getICD().glVertex3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex3dv(long coords) {
        long __functionAddress = GL.getICD().glVertex3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void glVertex4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glVertex4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glVertex4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w) {
        long __functionAddress = GL.getICD().glVertex4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glVertex4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glVertex4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glVertex4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glVertex4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertex4fv(long coords) {
        long __functionAddress = GL.getICD().glVertex4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex4sv(long coords) {
        long __functionAddress = GL.getICD().glVertex4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex4iv(long coords) {
        long __functionAddress = GL.getICD().glVertex4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertex4dv(long coords) {
        long __functionAddress = GL.getICD().glVertex4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coords, __functionAddress);
    }
    @Substitute
    public static void nglVertexPointer(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBCopyImage.class)
final class Target_org_lwjgl_opengl_ARBCopyImage {

}
@TargetClass(org.lwjgl.opengl.ARBSparseBuffer.class)
final class Target_org_lwjgl_opengl_ARBSparseBuffer {

    @Substitute
    public static void glBufferPageCommitmentARB(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glBufferPageCommitmentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, offset, size, commit, __functionAddress);
    }
    @Substitute
    public static void glNamedBufferPageCommitmentEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glNamedBufferPageCommitmentEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, offset, size, commit, __functionAddress);
    }
    @Substitute
    public static void glNamedBufferPageCommitmentARB(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glNamedBufferPageCommitmentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, offset, size, commit, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTBlendMinmax.class)
final class Target_org_lwjgl_opengl_EXTBlendMinmax {

    @Substitute
    public static void glBlendEquationEXT(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBlendEquationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBRobustness.class)
final class Target_org_lwjgl_opengl_ARBRobustness {
    @Substitute
    public static int glGetGraphicsResetStatusARB() {
        long __functionAddress = GL.getICD().glGetGraphicsResetStatusARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void nglGetnMapdvARB(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnMapfvARB(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnMapivARB(int target, int query, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnMapivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapfvARB(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapuivARB(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPixelMapusvARB(int map, int bufSize, long data) {
        long __functionAddress = GL.getICD().glGetnPixelMapusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnPolygonStippleARB(int bufSize, long pattern) {
        long __functionAddress = GL.getICD().glGetnPolygonStippleARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufSize, pattern, __functionAddress);
    }
    @Substitute
    public static void nglGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, bufSize, img, __functionAddress);
    }
    @Substitute
    public static void nglReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, bufSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetnColorTableARB(int target, int format, int type, int bufSize, long table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, bufSize, table, __functionAddress);
    }
    @Substitute
    public static void nglGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long image) {
        long __functionAddress = GL.getICD().glGetnConvolutionFilterARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, bufSize, image, __functionAddress);
    }
    @Substitute
    public static void nglGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
        long __functionAddress = GL.getICD().glGetnSeparableFilterARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, format, type, rowBufSize, row, columnBufSize, column, span, __functionAddress);
    }
    @Substitute
    public static void nglGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long values) {
        long __functionAddress = GL.getICD().glGetnHistogramARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, bufSize, values, __functionAddress);
    }
    @Substitute
    public static void nglGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long values) {
        long __functionAddress = GL.getICD().glGetnMinmaxARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, bufSize, values, __functionAddress);
    }
    @Substitute
    public static void nglGetnCompressedTexImageARB(int target, int level, int bufSize, long img) {
        long __functionAddress = GL.getICD().glGetnCompressedTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, bufSize, img, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformfvARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformivARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformuivARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformdvARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVXProgressFence.class)
final class Target_org_lwjgl_opengl_NVXProgressFence {
    @Substitute
    public static int glCreateProgressFenceNVX() {
        long __functionAddress = GL.getICD().glCreateProgressFenceNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void nglSignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray) {
        long __functionAddress = GL.getICD().glSignalSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray, __functionAddress);
    }
    @Substitute
    public static void nglWaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray) {
        long __functionAddress = GL.getICD().glWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray, __functionAddress);
    }
    @Substitute
    public static void nglClientWaitSemaphoreui64NVX(int fenceObjectCount, long semaphoreArray, long fenceValueArray) {
        long __functionAddress = GL.getICD().glClientWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(fenceObjectCount, semaphoreArray, fenceValueArray, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBSamplerObjects.class)
final class Target_org_lwjgl_opengl_ARBSamplerObjects {

}
@TargetClass(org.lwjgl.opengl.ARBFramebufferNoAttachments.class)
final class Target_org_lwjgl_opengl_ARBFramebufferNoAttachments {
    @Substitute
    public static void glNamedFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glNamedFramebufferParameteriEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedFramebufferParameterivEXT(int framebuffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTSecondaryColor.class)
final class Target_org_lwjgl_opengl_EXTSecondaryColor {
    @Substitute
    public static void glSecondaryColor3bEXT(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3bEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callBBBV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3sEXT(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3sEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3iEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3fEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3dEXT(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3ubEXT(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3ubEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3usEXT(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3usEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCCCV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3uiEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3bvEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3bvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3svEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3svEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3ivEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3fvEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3dvEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3ubvEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3ubvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3usvEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3usvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3uivEXT(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.OVRMultiview.class)
final class Target_org_lwjgl_opengl_OVRMultiview {

    @Substitute
    public static void glFramebufferTextureMultiviewOVR(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews) {
        long __functionAddress = GL.getICD().glFramebufferTextureMultiviewOVR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, baseViewIndex, numViews, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTextureMultiviewOVR(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews) {
        long __functionAddress = GL.getICD().glNamedFramebufferTextureMultiviewOVR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, baseViewIndex, numViews, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL44C.class)
final class Target_org_lwjgl_opengl_GL44C {
    @Substitute
    public static void nglBufferStorage(int target, long size, long data, int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, size, data, flags, __functionAddress);
    }
    @Substitute
    public static void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglClearTexImage(int texture, int level, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglBindBuffersBase(int target, int first, int count, long buffers) {
        long __functionAddress = GL.getICD().glBindBuffersBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, first, count, buffers, __functionAddress);
    }
    @Substitute
    public static void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        long __functionAddress = GL.getICD().glBindBuffersRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, first, count, buffers, offsets, sizes, __functionAddress);
    }
    @Substitute
    public static void nglBindTextures(int first, int count, long textures) {
        long __functionAddress = GL.getICD().glBindTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, textures, __functionAddress);
    }
    @Substitute
    public static void nglBindSamplers(int first, int count, long samplers) {
        long __functionAddress = GL.getICD().glBindSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, samplers, __functionAddress);
    }
    @Substitute
    public static void nglBindImageTextures(int first, int count, long textures) {
        long __functionAddress = GL.getICD().glBindImageTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, textures, __functionAddress);
    }
    @Substitute
    public static void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        long __functionAddress = GL.getICD().glBindVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(first, count, buffers, offsets, strides, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBES31Compatibility.class)
final class Target_org_lwjgl_opengl_ARBES31Compatibility {

}
@TargetClass(org.lwjgl.opengl.ARBBaseInstance.class)
final class Target_org_lwjgl_opengl_ARBBaseInstance {

}
@TargetClass(org.lwjgl.opengl.EXTTransformFeedback.class)
final class Target_org_lwjgl_opengl_EXTTransformFeedback {
    @Substitute
    public static void glBindBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glBindBufferRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, index, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void glBindBufferOffsetEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glBindBufferOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, buffer, offset, __functionAddress);
    }
    @Substitute
    public static void glBindBufferBaseEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glBindBufferBaseEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, buffer, __functionAddress);
    }
    @Substitute
    public static void glBeginTransformFeedbackEXT(@NativeType("GLenum") int primitiveMode) {
        long __functionAddress = GL.getICD().glBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(primitiveMode, __functionAddress);
    }
    @Substitute
    public static void glEndTransformFeedbackEXT() {
        long __functionAddress = GL.getICD().glEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglTransformFeedbackVaryingsEXT(int program, int count, long varyings, int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackVaryingsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, count, varyings, bufferMode, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(program, index, bufSize, length, size, type, name, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTTextureBufferObject.class)
final class Target_org_lwjgl_opengl_EXTTextureBufferObject {

    @Substitute
    public static void glTexBufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTexBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, buffer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVFramebufferMultisampleCoverage.class)
final class Target_org_lwjgl_opengl_NVFramebufferMultisampleCoverage {

    @Substitute
    public static void glRenderbufferStorageMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorageMultisampleCoverageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, coverageSamples, colorSamples, internalformat, width, height, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVAlphaToCoverageDitherControl.class)
final class Target_org_lwjgl_opengl_NVAlphaToCoverageDitherControl {

    @Substitute
    public static void glAlphaToCoverageDitherControlNV(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glAlphaToCoverageDitherControlNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTMemoryObjectWin32.class)
final class Target_org_lwjgl_opengl_EXTMemoryObjectWin32 {

    @Substitute
    public static void glImportMemoryWin32HandleEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        long __functionAddress = GL.getICD().glImportMemoryWin32HandleEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        callJPV(memory, size, handleType, handle, __functionAddress);
    }

    @Substitute
    public static void glImportMemoryWin32NameEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        long __functionAddress = GL.getICD().glImportMemoryWin32NameEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(name);
        }
        callJPV(memory, size, handleType, name, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTDepthBoundsTest.class)
final class Target_org_lwjgl_opengl_EXTDepthBoundsTest {

    @Substitute
    public static void glDepthBoundsEXT(double zmin, double zmax) {
        long __functionAddress = GL.getICD().glDepthBoundsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zmin, zmax, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDOcclusionQueryEvent.class)
final class Target_org_lwjgl_opengl_AMDOcclusionQueryEvent {

    @Substitute
    public static void glQueryObjectParameteruiAMD(@NativeType("GLenum") int target, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint") int param) {
        long __functionAddress = GL.getICD().glQueryObjectParameteruiAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, id, pname, param, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBComputeVariableGroupSize.class)
final class Target_org_lwjgl_opengl_ARBComputeVariableGroupSize {

    @Substitute
    public static void glDispatchComputeGroupSizeARB(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z, @NativeType("GLuint") int group_size_x, @NativeType("GLuint") int group_size_y, @NativeType("GLuint") int group_size_z) {
        long __functionAddress = GL.getICD().glDispatchComputeGroupSizeARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVBlendEquationAdvanced.class)
final class Target_org_lwjgl_opengl_NVBlendEquationAdvanced {

    @Substitute
    public static void glBlendParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glBlendParameteriNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, value, __functionAddress);
    }
    @Substitute
    public static void glBlendBarrierNV() {
        long __functionAddress = GL.getICD().glBlendBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTTextureInteger.class)
final class Target_org_lwjgl_opengl_EXTTextureInteger {
    @Substitute
    public static void glClearColorIiEXT(@NativeType("GLint") int r, @NativeType("GLint") int g, @NativeType("GLint") int b, @NativeType("GLint") int a) {
        long __functionAddress = GL.getICD().glClearColorIiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(r, g, b, a, __functionAddress);
    }
    @Substitute
    public static void glClearColorIuiEXT(@NativeType("GLuint") int r, @NativeType("GLuint") int g, @NativeType("GLuint") int b, @NativeType("GLuint") int a) {
        long __functionAddress = GL.getICD().glClearColorIuiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(r, g, b, a, __functionAddress);
    }
    @Substitute
    public static void nglTexParameterIivEXT(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTexParameterIuivEXT(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameterIivEXT(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameterIuivEXT(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTDebugLabel.class)
final class Target_org_lwjgl_opengl_EXTDebugLabel {
    @Substitute
    public static void nglLabelObjectEXT(int type, int object, int length, long label) {
        long __functionAddress = GL.getICD().glLabelObjectEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, object, length, label, __functionAddress);
    }
    @Substitute
    public static void nglGetObjectLabelEXT(int type, int object, int bufSize, long length, long label) {
        long __functionAddress = GL.getICD().glGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(type, object, bufSize, length, label, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBInternalformatQuery.class)
final class Target_org_lwjgl_opengl_ARBInternalformatQuery {

}
@TargetClass(org.lwjgl.opengl.EXTMemoryObject.class)
final class Target_org_lwjgl_opengl_EXTMemoryObject {
    @Substitute
    public static void nglGetUnsignedBytevEXT(int pname, long data) {
        long __functionAddress = GL.getICD().glGetUnsignedBytevEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGetUnsignedBytei_vEXT(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetUnsignedBytei_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void nglDeleteMemoryObjectsEXT(int n, long memoryObjects) {
        long __functionAddress = GL.getICD().glDeleteMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, memoryObjects, __functionAddress);
    }
    @Substitute
    public static boolean glIsMemoryObjectEXT(@NativeType("GLuint") int memoryObject) {
        long __functionAddress = GL.getICD().glIsMemoryObjectEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(memoryObject, __functionAddress);
    }
    @Substitute
    public static void nglCreateMemoryObjectsEXT(int n, long memoryObjects) {
        long __functionAddress = GL.getICD().glCreateMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, memoryObjects, __functionAddress);
    }
    @Substitute
    public static void nglMemoryObjectParameterivEXT(int memoryObject, int pname, long params) {
        long __functionAddress = GL.getICD().glMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMemoryObjectParameterivEXT(int memoryObject, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexStorageMem2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexStorageMem2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, levels, internalFormat, width, height, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTexStorageMem2DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexStorageMem2DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, samples, internalFormat, width, height, fixedSampleLocations, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTexStorageMem3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexStorageMem3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, levels, internalFormat, width, height, depth, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTexStorageMem3DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexStorageMem3DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glBufferStorageMemEXT(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glBufferStorageMemEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(target, size, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageMem2DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureStorageMem2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, levels, internalFormat, width, height, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageMem2DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureStorageMem2DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, samples, internalFormat, width, height, fixedSampleLocations, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageMem3DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureStorageMem3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, levels, internalFormat, width, height, depth, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageMem3DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureStorageMem3DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glNamedBufferStorageMemEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glNamedBufferStorageMemEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(buffer, size, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTexStorageMem1DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexStorageMem1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, levels, internalFormat, width, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageMem1DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureStorageMem1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, levels, internalFormat, width, memory, offset, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.KHRBlendEquationAdvanced.class)
final class Target_org_lwjgl_opengl_KHRBlendEquationAdvanced {

    @Substitute
    public static void glBlendBarrierKHR() {
        long __functionAddress = GL.getICD().glBlendBarrierKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.KHRDebug.class)
final class Target_org_lwjgl_opengl_KHRDebug {

}
@TargetClass(org.lwjgl.opengl.NVBindlessMultiDrawIndirectCount.class)
final class Target_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount {
    @Substitute
    public static void nglMultiDrawArraysIndirectBindlessCountNV(int mode, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectBindlessCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsIndirectBindlessCountNV(int mode, int type, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectBindlessCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDStencilOperationExtended.class)
final class Target_org_lwjgl_opengl_AMDStencilOperationExtended {

    @Substitute
    public static void glStencilOpValueAMD(@NativeType("GLenum") int face, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glStencilOpValueAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTransposeMatrix.class)
final class Target_org_lwjgl_opengl_ARBTransposeMatrix {
    @Substitute
    public static void nglLoadTransposeMatrixfARB(long m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixfARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglLoadTransposeMatrixdARB(long m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixdARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglMultTransposeMatrixfARB(long m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixfARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglMultTransposeMatrixdARB(long m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixdARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTVertexAttrib64bit.class)
final class Target_org_lwjgl_opengl_EXTVertexAttrib64bit {
    @Substitute
    public static void glVertexAttribL1dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x) {
        long __functionAddress = GL.getICD().glVertexAttribL1dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL2dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glVertexAttribL2dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL3dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glVertexAttribL3dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL4dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glVertexAttribL4dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL1dvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL2dvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL3dvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL4dvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribLPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribLdvEXT(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLdvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVSampleLocations.class)
final class Target_org_lwjgl_opengl_NVSampleLocations {
    @Substitute
    public static void nglFramebufferSampleLocationsfvNV(int target, int start, int count, long v) {
        long __functionAddress = GL.getICD().glFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, count, v, __functionAddress);
    }
    @Substitute
    public static void nglNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, long v) {
        long __functionAddress = GL.getICD().glNamedFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, start, count, v, __functionAddress);
    }
    @Substitute
    public static void glResolveDepthValuesNV() {
        long __functionAddress = GL.getICD().glResolveDepthValuesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBES32Compatibility.class)
final class Target_org_lwjgl_opengl_ARBES32Compatibility {

    @Substitute
    public static void glPrimitiveBoundingBoxARB(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW) {
        long __functionAddress = GL.getICD().glPrimitiveBoundingBoxARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTGPUShader4.class)
final class Target_org_lwjgl_opengl_EXTGPUShader4 {
    @Substitute
    public static void glVertexAttribI1iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x) {
        long __functionAddress = GL.getICD().glVertexAttribI1iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI2iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glVertexAttribI2iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI3iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glVertexAttribI3iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI4iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glVertexAttribI4iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI1uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x) {
        long __functionAddress = GL.getICD().glVertexAttribI1uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI2uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        long __functionAddress = GL.getICD().glVertexAttribI2uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI3uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glVertexAttribI3uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI4uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glVertexAttribI4uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI1ivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI2ivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI3ivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4ivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI1uivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI2uivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI3uivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4uivEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4bvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4bvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4svEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4svEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4ubvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ubvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4usvEXT(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribIivEXT(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribIuivEXT(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformuivEXT(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglBindFragDataLocationEXT(int program, int color, long name) {
        long __functionAddress = GL.getICD().glBindFragDataLocationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, color, name, __functionAddress);
    }
    @Substitute
    public static int nglGetFragDataLocationEXT(int program, long name) {
        long __functionAddress = GL.getICD().glGetFragDataLocationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void glUniform1uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        long __functionAddress = GL.getICD().glUniform1uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        long __functionAddress = GL.getICD().glUniform2uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        long __functionAddress = GL.getICD().glUniform3uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        long __functionAddress = GL.getICD().glUniform4uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglUniform1uivEXT(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2uivEXT(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3uivEXT(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4uivEXT(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVBindlessTexture.class)
final class Target_org_lwjgl_opengl_NVBindlessTexture {
    @Substitute
    public static long glGetTextureHandleNV(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glGetTextureHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, __functionAddress);
    }
    @Substitute
    public static long glGetTextureSamplerHandleNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler) {
        long __functionAddress = GL.getICD().glGetTextureSamplerHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, sampler, __functionAddress);
    }
    @Substitute
    public static void glMakeTextureHandleResidentNV(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeTextureHandleResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static void glMakeTextureHandleNonResidentNV(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeTextureHandleNonResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static long glGetImageHandleNV(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int format) {
        long __functionAddress = GL.getICD().glGetImageHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, level, layered, layer, format, __functionAddress);
    }
    @Substitute
    public static void glMakeImageHandleResidentNV(@NativeType("GLuint64") long handle, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getICD().glMakeImageHandleResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, access, __functionAddress);
    }
    @Substitute
    public static void glMakeImageHandleNonResidentNV(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeImageHandleNonResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static void glUniformHandleui64NV(@NativeType("GLint") int location, @NativeType("GLuint64") long value) {
        long __functionAddress = GL.getICD().glUniformHandleui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformHandleui64vNV(int location, int count, long values) {
        long __functionAddress = GL.getICD().glUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, values, __functionAddress);
    }
    @Substitute
    public static void glProgramUniformHandleui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long value) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformHandleui64vNV(int program, int location, int count, long values) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, values, __functionAddress);
    }
    @Substitute
    public static boolean glIsTextureHandleResidentNV(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glIsTextureHandleResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(handle, __functionAddress);
    }
    @Substitute
    public static boolean glIsImageHandleResidentNV(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glIsImageHandleResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(handle, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTransformFeedback3.class)
final class Target_org_lwjgl_opengl_ARBTransformFeedback3 {

}
@TargetClass(org.lwjgl.opengl.ARBVertexBlend.class)
final class Target_org_lwjgl_opengl_ARBVertexBlend {
    @Substitute
    public static void nglWeightfvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightbvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightbvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightubvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightubvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightsvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightsvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightusvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightivARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightuivARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightdvARB(int size, long weights) {
        long __functionAddress = GL.getICD().glWeightdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, weights, __functionAddress);
    }
    @Substitute
    public static void nglWeightPointerARB(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glVertexBlendARB(@NativeType("GLint") int count) {
        long __functionAddress = GL.getICD().glVertexBlendARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(count, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexArrayObject.class)
final class Target_org_lwjgl_opengl_ARBVertexArrayObject {

}
@TargetClass(org.lwjgl.opengl.EXTStencilTwoSide.class)
final class Target_org_lwjgl_opengl_EXTStencilTwoSide {

    @Substitute
    public static void glActiveStencilFaceEXT(@NativeType("GLenum") int face) {
        long __functionAddress = GL.getICD().glActiveStencilFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBComputeShader.class)
final class Target_org_lwjgl_opengl_ARBComputeShader {

}
@TargetClass(org.lwjgl.opengl.ARBMultitexture.class)
final class Target_org_lwjgl_opengl_ARBMultitexture {
    @Substitute
    public static void glActiveTextureARB(@NativeType("GLenum") int texture) {
        long __functionAddress = GL.getICD().glActiveTextureARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void glClientActiveTextureARB(@NativeType("GLenum") int texture) {
        long __functionAddress = GL.getICD().glClientActiveTextureARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1fvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1svARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1ivARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1dvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2fvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2svARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2ivARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2dvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3fvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3svARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3ivARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3dvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4fvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4svARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4ivARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4dvARB(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBWindowPos.class)
final class Target_org_lwjgl_opengl_ARBWindowPos {
    @Substitute
    public static void glWindowPos2iARB(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glWindowPos2iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        long __functionAddress = GL.getICD().glWindowPos2sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glWindowPos2fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glWindowPos2dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2ivARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos2ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2svARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos2svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2fvARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2dvARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos2dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3iARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glWindowPos3iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        long __functionAddress = GL.getICD().glWindowPos3sARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glWindowPos3fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glWindowPos3dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3ivARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos3ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3svARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos3svARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3fvARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3dvARB(long p) {
        long __functionAddress = GL.getICD().glWindowPos3dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVShadingRateImage.class)
final class Target_org_lwjgl_opengl_NVShadingRateImage {
    @Substitute
    public static void glBindShadingRateImageNV(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glBindShadingRateImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void nglShadingRateImagePaletteNV(int viewport, int first, int count, long rates) {
        long __functionAddress = GL.getICD().glShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(viewport, first, count, rates, __functionAddress);
    }
    @Substitute
    public static void nglGetShadingRateImagePaletteNV(int viewport, int entry, long rate) {
        long __functionAddress = GL.getICD().glGetShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(viewport, entry, rate, __functionAddress);
    }
    @Substitute
    public static void glShadingRateImageBarrierNV(@NativeType("GLboolean") boolean synchronize) {
        long __functionAddress = GL.getICD().glShadingRateImageBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(synchronize, __functionAddress);
    }
    @Substitute
    public static void glShadingRateSampleOrderNV(@NativeType("GLenum") int order) {
        long __functionAddress = GL.getICD().glShadingRateSampleOrderNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(order, __functionAddress);
    }
    @Substitute
    public static void nglShadingRateSampleOrderCustomNV(int rate, int samples, long locations) {
        long __functionAddress = GL.getICD().glShadingRateSampleOrderCustomNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(rate, samples, locations, __functionAddress);
    }
    @Substitute
    public static void nglGetShadingRateSampleLocationivNV(int rate, int samples, int index, long location) {
        long __functionAddress = GL.getICD().glGetShadingRateSampleLocationivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(rate, samples, index, location, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVConservativeRaster.class)
final class Target_org_lwjgl_opengl_NVConservativeRaster {

    @Substitute
    public static void glSubpixelPrecisionBiasNV(@NativeType("GLuint") int xbits, @NativeType("GLuint") int ybits) {
        long __functionAddress = GL.getICD().glSubpixelPrecisionBiasNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(xbits, ybits, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTWin32KeyedMutex.class)
final class Target_org_lwjgl_opengl_EXTWin32KeyedMutex {

    @Substitute
    public static boolean glAcquireKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key, @NativeType("GLuint") int timeout) {
        long __functionAddress = GL.getICD().glAcquireKeyedMutexWin32EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(memory, key, timeout, __functionAddress);
    }
    @Substitute
    public static boolean glReleaseKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key) {
        long __functionAddress = GL.getICD().glReleaseKeyedMutexWin32EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(memory, key, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBBufferStorage.class)
final class Target_org_lwjgl_opengl_ARBBufferStorage {
    @Substitute
    public static void nglNamedBufferStorageEXT(int buffer, long size, long data, int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, size, data, flags, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL43C.class)
final class Target_org_lwjgl_opengl_GL43C {
    @Substitute
    public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, internalformat, offset, size, format, type, data, __functionAddress);
    }
    @Substitute
    public static void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        long __functionAddress = GL.getICD().glDispatchCompute;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(num_groups_x, num_groups_y, num_groups_z, __functionAddress);
    }
    @Substitute
    public static void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        long __functionAddress = GL.getICD().glDispatchComputeIndirect;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indirect, __functionAddress);
    }
    @Substitute
    public static void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth) {
        long __functionAddress = GL.getICD().glCopyImageSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageControl;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, count, ids, enabled, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        long __functionAddress = GL.getICD().glDebugMessageInsert;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, id, severity, length, message, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageCallback(long callback, long userParam) {
        long __functionAddress = GL.getICD().glDebugMessageCallback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(callback, userParam, __functionAddress);
    }
    @Substitute
    public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLog;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(count, bufsize, sources, types, ids, severities, lengths, messageLog, __functionAddress);
    }
    @Substitute
    public static void nglPushDebugGroup(int source, int id, int length, long message) {
        long __functionAddress = GL.getICD().glPushDebugGroup;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, id, length, message, __functionAddress);
    }
    @Substitute
    public static void glPopDebugGroup() {
        long __functionAddress = GL.getICD().glPopDebugGroup;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglObjectLabel(int identifier, int name, int length, long label) {
        long __functionAddress = GL.getICD().glObjectLabel;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(identifier, name, length, label, __functionAddress);
    }
    @Substitute
    public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        long __functionAddress = GL.getICD().glGetObjectLabel;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(identifier, name, bufSize, length, label, __functionAddress);
    }
    @Substitute
    public static void nglObjectPtrLabel(long ptr, int length, long label) {
        long __functionAddress = GL.getICD().glObjectPtrLabel;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        callPPV(ptr, length, label, __functionAddress);
    }
    @Substitute
    public static void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        long __functionAddress = GL.getICD().glGetObjectPtrLabel;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        callPPPV(ptr, bufSize, length, label, __functionAddress);
    }
    @Substitute
    public static void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glFramebufferParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetInternalformati64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, pname, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void glInvalidateTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glInvalidateTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, xoffset, yoffset, zoffset, width, height, depth, __functionAddress);
    }
    @Substitute
    public static void glInvalidateTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glInvalidateTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, __functionAddress);
    }
    @Substitute
    public static void glInvalidateBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        long __functionAddress = GL.getICD().glInvalidateBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, offset, length, __functionAddress);
    }
    @Substitute
    public static void glInvalidateBufferData(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glInvalidateBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buffer, __functionAddress);
    }
    @Substitute
    public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        long __functionAddress = GL.getICD().glInvalidateFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, numAttachments, attachments, __functionAddress);
    }
    @Substitute
    public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        long __functionAddress = GL.getICD().glInvalidateSubFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, numAttachments, attachments, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, indirect, drawcount, stride, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, type, indirect, drawcount, stride, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        long __functionAddress = GL.getICD().glGetProgramInterfaceiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, programInterface, pname, params, __functionAddress);
    }
    @Substitute
    public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        long __functionAddress = GL.getICD().glGetProgramResourceIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, programInterface, name, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        long __functionAddress = GL.getICD().glGetProgramResourceName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, programInterface, index, bufSize, length, name, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        long __functionAddress = GL.getICD().glGetProgramResourceiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
    }
    @Substitute
    public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        long __functionAddress = GL.getICD().glGetProgramResourceLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, programInterface, name, __functionAddress);
    }
    @Substitute
    public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        long __functionAddress = GL.getICD().glGetProgramResourceLocationIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, programInterface, name, __functionAddress);
    }
    @Substitute
    public static void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding) {
        long __functionAddress = GL.getICD().glShaderStorageBlockBinding;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, storageBlockIndex, storageBlockBinding, __functionAddress);
    }
    @Substitute
    public static void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glTexBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, internalformat, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTexStorage2DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTexStorage3DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers) {
        long __functionAddress = GL.getICD().glTextureView;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers, __functionAddress);
    }
    @Substitute
    public static void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glBindVertexBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bindingindex, buffer, offset, stride, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexAttribFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(attribindex, size, type, normalized, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexAttribIFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribLFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexAttribLFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        long __functionAddress = GL.getICD().glVertexAttribBinding;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(attribindex, bindingindex, __functionAddress);
    }
    @Substitute
    public static void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexBindingDivisor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bindingindex, divisor, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDrawElementsBaseVertex.class)
final class Target_org_lwjgl_opengl_ARBDrawElementsBaseVertex {

}
@TargetClass(org.lwjgl.opengl.NVInternalformatSampleQuery.class)
final class Target_org_lwjgl_opengl_NVInternalformatSampleQuery {
    @Substitute
    public static void nglGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetInternalformatSampleivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, samples, pname, bufSize, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTGPUProgramParameters.class)
final class Target_org_lwjgl_opengl_EXTGPUProgramParameters {
    @Substitute
    public static void nglProgramEnvParameters4fvEXT(int target, int index, int count, long params) {
        long __functionAddress = GL.getICD().glProgramEnvParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, count, params, __functionAddress);
    }
    @Substitute
    public static void nglProgramLocalParameters4fvEXT(int target, int index, int count, long params) {
        long __functionAddress = GL.getICD().glProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, count, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.INTELPerformanceQuery.class)
final class Target_org_lwjgl_opengl_INTELPerformanceQuery {
    @Substitute
    public static void glBeginPerfQueryINTEL(@NativeType("GLuint") int queryHandle) {
        long __functionAddress = GL.getICD().glBeginPerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(queryHandle, __functionAddress);
    }
    @Substitute
    public static void nglCreatePerfQueryINTEL(int queryId, long queryHandle) {
        long __functionAddress = GL.getICD().glCreatePerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queryId, queryHandle, __functionAddress);
    }
    @Substitute
    public static void glDeletePerfQueryINTEL(@NativeType("GLuint") int queryHandle) {
        long __functionAddress = GL.getICD().glDeletePerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(queryHandle, __functionAddress);
    }
    @Substitute
    public static void glEndPerfQueryINTEL(@NativeType("GLuint") int queryHandle) {
        long __functionAddress = GL.getICD().glEndPerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(queryHandle, __functionAddress);
    }
    @Substitute
    public static void nglGetFirstPerfQueryIdINTEL(long queryId) {
        long __functionAddress = GL.getICD().glGetFirstPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queryId, __functionAddress);
    }
    @Substitute
    public static void nglGetNextPerfQueryIdINTEL(int queryId, long nextQueryId) {
        long __functionAddress = GL.getICD().glGetNextPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queryId, nextQueryId, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, long counterName, int counterDescLength, long counterDesc, long counterOffset, long counterDataSize, long counterTypeEnum, long counterDataTypeEnum, long rawCounterMaxValue) {
        long __functionAddress = GL.getICD().glGetPerfCounterInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPPPV(queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, long data, long bytesWritten) {
        long __functionAddress = GL.getICD().glGetPerfQueryDataINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(queryHandle, flags, dataSize, data, bytesWritten, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfQueryIdByNameINTEL(long queryName, long queryId) {
        long __functionAddress = GL.getICD().glGetPerfQueryIdByNameINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(queryName, queryId, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfQueryInfoINTEL(int queryId, int queryNameLength, long queryName, long dataSize, long noCounters, long noInstances, long capsMask) {
        long __functionAddress = GL.getICD().glGetPerfQueryInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVVertexBufferUnifiedMemory.class)
final class Target_org_lwjgl_opengl_NVVertexBufferUnifiedMemory {
    @Substitute
    public static void glBufferAddressRangeNV(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLuint64EXT") long address, @NativeType("GLsizeiptr") long length) {
        long __functionAddress = GL.getICD().glBufferAddressRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJPV(pname, index, address, length, __functionAddress);
    }
    @Substitute
    public static void glVertexFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(size, type, stride, __functionAddress);
    }
    @Substitute
    public static void glNormalFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glNormalFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, stride, __functionAddress);
    }
    @Substitute
    public static void glColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glColorFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(size, type, stride, __functionAddress);
    }
    @Substitute
    public static void glIndexFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glIndexFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, stride, __functionAddress);
    }
    @Substitute
    public static void glTexCoordFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glTexCoordFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(size, type, stride, __functionAddress);
    }
    @Substitute
    public static void glEdgeFlagFormatNV(@NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glEdgeFlagFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(stride, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glSecondaryColorFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(size, type, stride, __functionAddress);
    }
    @Substitute
    public static void glFogCoordFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glFogCoordFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, stride, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexAttribFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, size, type, normalized, stride, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribIFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexAttribIFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, size, type, stride, __functionAddress);
    }
    @Substitute
    public static void nglGetIntegerui64i_vNV(int value, int index, long result) {
        long __functionAddress = GL.getICD().glGetIntegerui64i_vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(value, index, result, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBSampleShading.class)
final class Target_org_lwjgl_opengl_ARBSampleShading {

    @Substitute
    public static void glMinSampleShadingARB(@NativeType("GLfloat") float value) {
        long __functionAddress = GL.getICD().glMinSampleShadingARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTTextureStorage.class)
final class Target_org_lwjgl_opengl_EXTTextureStorage {

    @Substitute
    public static void glTexStorage1DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glTexStorage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, __functionAddress);
    }
    @Substitute
    public static void glTexStorage2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glTexStorage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glTexStorage3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glTexStorage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, height, depth, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glTextureStorage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glTextureStorage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glTextureStorage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, height, depth, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBMultisample.class)
final class Target_org_lwjgl_opengl_ARBMultisample {

    @Substitute
    public static void glSampleCoverageARB(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert) {
        long __functionAddress = GL.getICD().glSampleCoverageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(value, invert, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBIndirectParameters.class)
final class Target_org_lwjgl_opengl_ARBIndirectParameters {
    @Substitute
    public static void nglMultiDrawArraysIndirectCountARB(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsIndirectCountARB(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureMultisample.class)
final class Target_org_lwjgl_opengl_ARBTextureMultisample {

}
@TargetClass(org.lwjgl.opengl.ARBViewportArray.class)
final class Target_org_lwjgl_opengl_ARBViewportArray {

}
@TargetClass(org.lwjgl.opengl.EXTFramebufferBlit.class)
final class Target_org_lwjgl_opengl_EXTFramebufferBlit {

    @Substitute
    public static void glBlitFramebufferEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glBlitFramebufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexType2_10_10_10_REV.class)
final class Target_org_lwjgl_opengl_ARBVertexType2_10_10_10_REV {

}
@TargetClass(org.lwjgl.opengl.NVPathRendering.class)
final class Target_org_lwjgl_opengl_NVPathRendering {
    @Substitute
    public static void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords) {
        long __functionAddress = GL.getICD().glPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, numCommands, commands, numCoords, coordType, coords, __functionAddress);
    }
    @Substitute
    public static void nglPathCoordsNV(int path, int numCoords, int coordType, long coords) {
        long __functionAddress = GL.getICD().glPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, numCoords, coordType, coords, __functionAddress);
    }
    @Substitute
    public static void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords) {
        long __functionAddress = GL.getICD().glPathSubCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords, __functionAddress);
    }
    @Substitute
    public static void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords) {
        long __functionAddress = GL.getICD().glPathSubCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coordStart, numCoords, coordType, coords, __functionAddress);
    }
    @Substitute
    public static void nglPathStringNV(int path, int format, int length, long pathString) {
        long __functionAddress = GL.getICD().glPathStringNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, format, length, pathString, __functionAddress);
    }
    @Substitute
    public static void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        long __functionAddress = GL.getICD().glPathGlyphsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale, __functionAddress);
    }
    @Substitute
    public static void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        long __functionAddress = GL.getICD().glPathGlyphRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale, __functionAddress);
    }
    @Substitute
    public static int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        long __functionAddress = GL.getICD().glPathGlyphIndexArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale, __functionAddress);
    }
    @Substitute
    public static int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        long __functionAddress = GL.getICD().glPathMemoryGlyphIndexArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale, __functionAddress);
    }
    @Substitute
    public static void glCopyPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath) {
        long __functionAddress = GL.getICD().glCopyPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(resultPath, srcPath, __functionAddress);
    }
    @Substitute
    public static void nglWeightPathsNV(int resultPath, int numPaths, long paths, long weights) {
        long __functionAddress = GL.getICD().glWeightPathsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(resultPath, numPaths, paths, weights, __functionAddress);
    }
    @Substitute
    public static void glInterpolatePathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int pathA, @NativeType("GLuint") int pathB, @NativeType("GLfloat") float weight) {
        long __functionAddress = GL.getICD().glInterpolatePathsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(resultPath, pathA, pathB, weight, __functionAddress);
    }
    @Substitute
    public static void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glTransformPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(resultPath, srcPath, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void nglPathParameterivNV(int path, int pname, long value) {
        long __functionAddress = GL.getICD().glPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void glPathParameteriNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glPathParameteriNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglPathParameterfvNV(int path, int pname, long value) {
        long __functionAddress = GL.getICD().glPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void glPathParameterfNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat") float value) {
        long __functionAddress = GL.getICD().glPathParameterfNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglPathDashArrayNV(int path, int dashCount, long dashArray) {
        long __functionAddress = GL.getICD().glPathDashArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, dashCount, dashArray, __functionAddress);
    }
    @Substitute
    public static int glGenPathsNV(@NativeType("GLsizei") int range) {
        long __functionAddress = GL.getICD().glGenPathsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(range, __functionAddress);
    }
    @Substitute
    public static void glDeletePathsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int range) {
        long __functionAddress = GL.getICD().glDeletePathsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, range, __functionAddress);
    }
    @Substitute
    public static boolean glIsPathNV(@NativeType("GLuint") int path) {
        long __functionAddress = GL.getICD().glIsPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(path, __functionAddress);
    }
    @Substitute
    public static void glPathStencilFuncNV(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glPathStencilFuncNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(func, ref, mask, __functionAddress);
    }
    @Substitute
    public static void glPathStencilDepthOffsetNV(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units) {
        long __functionAddress = GL.getICD().glPathStencilDepthOffsetNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(factor, units, __functionAddress);
    }
    @Substitute
    public static void glStencilFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilFillPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, fillMode, mask, __functionAddress);
    }
    @Substitute
    public static void glStencilStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilStrokePathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, reference, mask, __functionAddress);
    }
    @Substitute
    public static void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glStencilFillPathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glStencilStrokePathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void glPathCoverDepthFuncNV(@NativeType("GLenum") int zfunc) {
        long __functionAddress = GL.getICD().glPathCoverDepthFuncNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zfunc, __functionAddress);
    }
    @Substitute
    public static void nglPathColorGenNV(int color, int genMode, int colorFormat, long coeffs) {
        long __functionAddress = GL.getICD().glPathColorGenNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(color, genMode, colorFormat, coeffs, __functionAddress);
    }
    @Substitute
    public static void nglPathTexGenNV(int texCoordSet, int genMode, int components, long coeffs) {
        long __functionAddress = GL.getICD().glPathTexGenNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texCoordSet, genMode, components, coeffs, __functionAddress);
    }
    @Substitute
    public static void glPathFogGenNV(@NativeType("GLenum") int genMode) {
        long __functionAddress = GL.getICD().glPathFogGenNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(genMode, __functionAddress);
    }
    @Substitute
    public static void glCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode) {
        long __functionAddress = GL.getICD().glCoverFillPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, coverMode, __functionAddress);
    }
    @Substitute
    public static void glCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode) {
        long __functionAddress = GL.getICD().glCoverStrokePathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, coverMode, __functionAddress);
    }
    @Substitute
    public static void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glCoverFillPathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glCoverStrokePathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void glStencilThenCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode) {
        long __functionAddress = GL.getICD().glStencilThenCoverFillPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, fillMode, mask, coverMode, __functionAddress);
    }
    @Substitute
    public static void glStencilThenCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode) {
        long __functionAddress = GL.getICD().glStencilThenCoverStrokePathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(path, reference, mask, coverMode, __functionAddress);
    }
    @Substitute
    public static void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverFillPathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverStrokePathInstancedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues, __functionAddress);
    }
    @Substitute
    public static int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, long baseAndCount) {
        long __functionAddress = GL.getICD().glPathGlyphIndexRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount, __functionAddress);
    }
    @Substitute
    public static void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs) {
        long __functionAddress = GL.getICD().glProgramPathFragmentInputGenNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, genMode, components, coeffs, __functionAddress);
    }
    @Substitute
    public static void nglGetPathParameterivNV(int path, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglGetPathParameterfvNV(int path, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglGetPathCommandsNV(int path, long commands) {
        long __functionAddress = GL.getICD().glGetPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, commands, __functionAddress);
    }
    @Substitute
    public static void nglGetPathCoordsNV(int path, long coords) {
        long __functionAddress = GL.getICD().glGetPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coords, __functionAddress);
    }
    @Substitute
    public static void nglGetPathDashArrayNV(int path, long dashArray) {
        long __functionAddress = GL.getICD().glGetPathDashArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, dashArray, __functionAddress);
    }
    @Substitute
    public static void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics, __functionAddress);
    }
    @Substitute
    public static void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(metricQueryMask, firstPathName, numPaths, stride, metrics, __functionAddress);
    }
    @Substitute
    public static void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing) {
        long __functionAddress = GL.getICD().glGetPathSpacingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing, __functionAddress);
    }
    @Substitute
    public static void nglGetPathColorGenivNV(int color, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathColorGenivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(color, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglGetPathColorGenfvNV(int color, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathColorGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(color, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglGetPathTexGenivNV(int texCoordSet, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathTexGenivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }
    @Substitute
    public static void nglGetPathTexGenfvNV(int texCoordSet, int pname, long value) {
        long __functionAddress = GL.getICD().glGetPathTexGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }
    @Substitute
    public static boolean glIsPointInFillPathNV(@NativeType("GLuint") int path, @NativeType("GLuint") int mask, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glIsPointInFillPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(path, mask, x, y, __functionAddress);
    }
    @Substitute
    public static boolean glIsPointInStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glIsPointInStrokePathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(path, x, y, __functionAddress);
    }
    @Substitute
    public static float glGetPathLengthNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments) {
        long __functionAddress = GL.getICD().glGetPathLengthNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(path, startSegment, numSegments, __functionAddress);
    }
    @Substitute
    public static boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY) {
        long __functionAddress = GL.getICD().glPointAlongPathNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPZ(path, startSegment, numSegments, distance, x, y, tangentX, tangentY, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoad3x2fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoad3x3fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoadTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMult3x2fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMult3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMult3x3fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMult3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMultTranspose3x3fNV(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMultTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        long __functionAddress = GL.getICD().glGetProgramResourcefvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDirectStateAccess.class)
final class Target_org_lwjgl_opengl_ARBDirectStateAccess {

}
@TargetClass(org.lwjgl.opengl.EXTDrawBuffers2.class)
final class Target_org_lwjgl_opengl_EXTDrawBuffers2 {
    @Substitute
    public static void glColorMaskIndexedEXT(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        long __functionAddress = GL.getICD().glColorMaskIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, r, g, b, a, __functionAddress);
    }
    @Substitute
    public static void nglGetBooleanIndexedvEXT(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetBooleanIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void nglGetIntegerIndexedvEXT(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void glEnableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, __functionAddress);
    }
    @Substitute
    public static void glDisableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, __functionAddress);
    }
    @Substitute
    public static boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glIsEnabledIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(target, index, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL42C.class)
final class Target_org_lwjgl_opengl_GL42C {
    @Substitute
    public static void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
        long __functionAddress = GL.getICD().glGetActiveAtomicCounterBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, bufferIndex, pname, params, __functionAddress);
    }
    @Substitute
    public static void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glTexStorage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, __functionAddress);
    }
    @Substitute
    public static void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glTexStorage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glTexStorage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, levels, internalformat, width, height, depth, __functionAddress);
    }
    @Substitute
    public static void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount) {
        long __functionAddress = GL.getICD().glDrawTransformFeedbackInstanced;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, id, primcount, __functionAddress);
    }
    @Substitute
    public static void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount) {
        long __functionAddress = GL.getICD().glDrawTransformFeedbackStreamInstanced;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, id, stream, primcount, __functionAddress);
    }
    @Substitute
    public static void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        long __functionAddress = GL.getICD().glDrawArraysInstancedBaseInstance;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, first, count, primcount, baseinstance, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        long __functionAddress = GL.getICD().glDrawElementsInstancedBaseInstance;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, baseinstance, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        long __functionAddress = GL.getICD().glDrawElementsInstancedBaseVertexBaseInstance;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, basevertex, baseinstance, __functionAddress);
    }
    @Substitute
    public static void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format) {
        long __functionAddress = GL.getICD().glBindImageTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(unit, texture, level, layered, layer, access, format, __functionAddress);
    }
    @Substitute
    public static void glMemoryBarrier(@NativeType("GLbitfield") int barriers) {
        long __functionAddress = GL.getICD().glMemoryBarrier;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(barriers, __functionAddress);
    }
    @Substitute
    public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetInternalformativ;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, pname, bufSize, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDFramebufferMultisampleAdvanced.class)
final class Target_org_lwjgl_opengl_AMDFramebufferMultisampleAdvanced {

    @Substitute
    public static void glRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorageMultisampleAdvancedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, storageSamples, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorageMultisampleAdvancedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, samples, storageSamples, internalformat, width, height, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBMatrixPalette.class)
final class Target_org_lwjgl_opengl_ARBMatrixPalette {
    @Substitute
    public static void glCurrentPaletteMatrixARB(@NativeType("GLint") int index) {
        long __functionAddress = GL.getICD().glCurrentPaletteMatrixARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void nglMatrixIndexuivARB(int size, long indices) {
        long __functionAddress = GL.getICD().glMatrixIndexuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, indices, __functionAddress);
    }
    @Substitute
    public static void nglMatrixIndexubvARB(int size, long indices) {
        long __functionAddress = GL.getICD().glMatrixIndexubvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, indices, __functionAddress);
    }
    @Substitute
    public static void nglMatrixIndexusvARB(int size, long indices) {
        long __functionAddress = GL.getICD().glMatrixIndexusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, indices, __functionAddress);
    }
    @Substitute
    public static void nglMatrixIndexPointerARB(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glMatrixIndexPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTMemoryObjectFD.class)
final class Target_org_lwjgl_opengl_EXTMemoryObjectFD {

    @Substitute
    public static void glImportMemoryFdEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd) {
        long __functionAddress = GL.getICD().glImportMemoryFdEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(memory, size, handleType, fd, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVConservativeRasterDilate.class)
final class Target_org_lwjgl_opengl_NVConservativeRasterDilate {

    @Substitute
    public static void glConservativeRasterParameterfNV(@NativeType("GLenum") int pname, @NativeType("GLfloat") float value) {
        long __functionAddress = GL.getICD().glConservativeRasterParameterfNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVFramebufferMixedSamples.class)
final class Target_org_lwjgl_opengl_NVFramebufferMixedSamples {
    @Substitute
    public static void nglCoverageModulationTableNV(int n, long v) {
        long __functionAddress = GL.getICD().glCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, v, __functionAddress);
    }
    @Substitute
    public static void nglGetCoverageModulationTableNV(int bufsize, long v) {
        long __functionAddress = GL.getICD().glGetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufsize, v, __functionAddress);
    }
    @Substitute
    public static void glCoverageModulationNV(@NativeType("GLenum") int components) {
        long __functionAddress = GL.getICD().glCoverageModulationNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(components, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVQueryResource.class)
final class Target_org_lwjgl_opengl_NVQueryResource {
    @Substitute
    public static int nglQueryResourceNV(int queryType, int pname, int bufSize, long buffer) {
        long __functionAddress = GL.getICD().glQueryResourceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(queryType, pname, bufSize, buffer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTPointParameters.class)
final class Target_org_lwjgl_opengl_EXTPointParameters {
    @Substitute
    public static void glPointParameterfEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glPointParameterfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglPointParameterfvEXT(int pname, long params) {
        long __functionAddress = GL.getICD().glPointParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBInternalformatQuery2.class)
final class Target_org_lwjgl_opengl_ARBInternalformatQuery2 {

}
@TargetClass(org.lwjgl.opengl.AMDDebugOutput.class)
final class Target_org_lwjgl_opengl_AMDDebugOutput {
    @Substitute
    public static void nglDebugMessageEnableAMD(int category, int severity, int count, long ids, boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageEnableAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(category, severity, count, ids, enabled, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageInsertAMD(int category, int severity, int id, int length, long buf) {
        long __functionAddress = GL.getICD().glDebugMessageInsertAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(category, severity, id, length, buf, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageCallbackAMD(long callback, long userParam) {
        long __functionAddress = GL.getICD().glDebugMessageCallbackAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(callback, userParam, __functionAddress);
    }
    @Substitute
    public static int nglGetDebugMessageLogAMD(int count, int bufsize, long categories, long severities, long ids, long lengths, long messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLogAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(count, bufsize, categories, severities, ids, lengths, messageLog, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTBindableUniform.class)
final class Target_org_lwjgl_opengl_EXTBindableUniform {

    @Substitute
    public static void glUniformBufferEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glUniformBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, buffer, __functionAddress);
    }
    @Substitute
    public static int glGetUniformBufferSizeEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        long __functionAddress = GL.getICD().glGetUniformBufferSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(program, location, __functionAddress);
    }
    @Substitute
    public static long glGetUniformOffsetEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        long __functionAddress = GL.getICD().glGetUniformOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(program, location, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBGetTextureSubImage.class)
final class Target_org_lwjgl_opengl_ARBGetTextureSubImage {

}
@TargetClass(org.lwjgl.opengl.ARBES2Compatibility.class)
final class Target_org_lwjgl_opengl_ARBES2Compatibility {

}
@TargetClass(org.lwjgl.opengl.NVDrawTexture.class)
final class Target_org_lwjgl_opengl_NVDrawTexture {

    @Substitute
    public static void glDrawTextureNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1) {
        long __functionAddress = GL.getICD().glDrawTextureNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVCommandList.class)
final class Target_org_lwjgl_opengl_NVCommandList {
    @Substitute
    public static void nglCreateStatesNV(int n, long states) {
        long __functionAddress = GL.getICD().glCreateStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, states, __functionAddress);
    }
    @Substitute
    public static void nglDeleteStatesNV(int n, long states) {
        long __functionAddress = GL.getICD().glDeleteStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, states, __functionAddress);
    }
    @Substitute
    public static boolean glIsStateNV(@NativeType("GLuint") int state) {
        long __functionAddress = GL.getICD().glIsStateNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(state, __functionAddress);
    }
    @Substitute
    public static void glStateCaptureNV(@NativeType("GLuint") int state, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glStateCaptureNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(state, mode, __functionAddress);
    }
    @Substitute
    public static int glGetCommandHeaderNV(@NativeType("GLenum") int tokenID, @NativeType("GLuint") int size) {
        long __functionAddress = GL.getICD().glGetCommandHeaderNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(tokenID, size, __functionAddress);
    }
    @Substitute
    public static short glGetStageIndexNV(@NativeType("GLenum") int shadertype) {
        long __functionAddress = GL.getICD().glGetStageIndexNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callC(shadertype, __functionAddress);
    }
    @Substitute
    public static void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count) {
        long __functionAddress = GL.getICD().glDrawCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(primitiveMode, buffer, indirects, sizes, count, __functionAddress);
    }
    @Substitute
    public static void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count) {
        long __functionAddress = GL.getICD().glDrawCommandsAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(primitiveMode, indirects, sizes, count, __functionAddress);
    }
    @Substitute
    public static void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(buffer, indirects, sizes, states, fbos, count, __functionAddress);
    }
    @Substitute
    public static void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(indirects, sizes, states, fbos, count, __functionAddress);
    }
    @Substitute
    public static void nglCreateCommandListsNV(int n, long lists) {
        long __functionAddress = GL.getICD().glCreateCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, lists, __functionAddress);
    }
    @Substitute
    public static void nglDeleteCommandListsNV(int n, long lists) {
        long __functionAddress = GL.getICD().glDeleteCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, lists, __functionAddress);
    }
    @Substitute
    public static boolean glIsCommandListNV(@NativeType("GLuint") int list) {
        long __functionAddress = GL.getICD().glIsCommandListNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(list, __functionAddress);
    }
    @Substitute
    public static void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count) {
        long __functionAddress = GL.getICD().glListDrawCommandsStatesClientNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(list, segment, indirects, sizes, states, fbos, count, __functionAddress);
    }
    @Substitute
    public static void glCommandListSegmentsNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segments) {
        long __functionAddress = GL.getICD().glCommandListSegmentsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(list, segments, __functionAddress);
    }
    @Substitute
    public static void glCompileCommandListNV(@NativeType("GLuint") int list) {
        long __functionAddress = GL.getICD().glCompileCommandListNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(list, __functionAddress);
    }
    @Substitute
    public static void glCallCommandListNV(@NativeType("GLuint") int list) {
        long __functionAddress = GL.getICD().glCallCommandListNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(list, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBParallelShaderCompile.class)
final class Target_org_lwjgl_opengl_ARBParallelShaderCompile {

    @Substitute
    public static void glMaxShaderCompilerThreadsARB(@NativeType("GLuint") int count) {
        long __functionAddress = GL.getICD().glMaxShaderCompilerThreadsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(count, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL30C.class)
final class Target_org_lwjgl_opengl_GL30C {
    @Substitute
    public static long nglGetStringi(int name, int index) {
        long __functionAddress = GL.getICD().glGetStringi;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(name, index, __functionAddress);
    }
    @Substitute
    public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearBufferuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        long __functionAddress = GL.getICD().glClearBufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }
    @Substitute
    public static void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        long __functionAddress = GL.getICD().glClearBufferfi;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buffer, drawbuffer, depth, stencil, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x) {
        long __functionAddress = GL.getICD().glVertexAttribI1i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glVertexAttribI2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glVertexAttribI3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glVertexAttribI4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x) {
        long __functionAddress = GL.getICD().glVertexAttribI1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        long __functionAddress = GL.getICD().glVertexAttribI2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glVertexAttribI3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glVertexAttribI4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI1iv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI2iv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI3iv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4iv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI1uiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI2uiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI3uiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4uiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4bv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4sv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4ubv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribI4usv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribIiv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribIuiv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        long __functionAddress = GL.getICD().glUniform1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        long __functionAddress = GL.getICD().glUniform2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        long __functionAddress = GL.getICD().glUniform3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        long __functionAddress = GL.getICD().glUniform4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglUniform1uiv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2uiv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3uiv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4uiv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformuiv(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglBindFragDataLocation(int program, int colorNumber, long name) {
        long __functionAddress = GL.getICD().glBindFragDataLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, colorNumber, name, __functionAddress);
    }
    @Substitute
    public static int nglGetFragDataLocation(int program, long name) {
        long __functionAddress = GL.getICD().glGetFragDataLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBeginConditionalRender;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(id, mode, __functionAddress);
    }
    @Substitute
    public static void glEndConditionalRender() {
        long __functionAddress = GL.getICD().glEndConditionalRender;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static long nglMapBufferRange(int target, long offset, long length, int access) {
        long __functionAddress = GL.getICD().glMapBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(target, offset, length, access, __functionAddress);
    }
    @Substitute
    public static void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        long __functionAddress = GL.getICD().glFlushMappedBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, offset, length, __functionAddress);
    }
    @Substitute
    public static void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp) {
        long __functionAddress = GL.getICD().glClampColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, clamp, __functionAddress);
    }
    @Substitute
    public static boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glIsRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(renderbuffer, __functionAddress);
    }
    @Substitute
    public static void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glBindRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, renderbuffers, __functionAddress);
    }
    @Substitute
    public static void nglGenRenderbuffers(int n, long renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, renderbuffers, __functionAddress);
    }
    @Substitute
    public static void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorageMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        long __functionAddress = GL.getICD().glIsFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(framebuffer, __functionAddress);
    }
    @Substitute
    public static void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        long __functionAddress = GL.getICD().glBindFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, framebuffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteFramebuffers(int n, long framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, framebuffers, __functionAddress);
    }
    @Substitute
    public static void nglGenFramebuffers(int n, long framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, framebuffers, __functionAddress);
    }
    @Substitute
    public static int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glCheckFramebufferStatus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(target, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTexture1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTexture2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glFramebufferTexture3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, textarget, texture, level, layer, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glFramebufferTextureLayer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, layer, __functionAddress);
    }
    @Substitute
    public static void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glFramebufferRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, renderbuffertarget, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }
    @Substitute
    public static void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glBlitFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }
    @Substitute
    public static void glGenerateMipmap(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glGenerateMipmap;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void nglTexParameterIiv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTexParameterIuiv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameterIiv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTexParameterIuiv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        long __functionAddress = GL.getICD().glColorMaski;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, r, g, b, a, __functionAddress);
    }
    @Substitute
    public static void nglGetBooleani_v(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetBooleani_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void nglGetIntegeri_v(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetIntegeri_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnablei;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(cap, index, __functionAddress);
    }
    @Substitute
    public static void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisablei;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, __functionAddress);
    }
    @Substitute
    public static boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glIsEnabledi;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(target, index, __functionAddress);
    }
    @Substitute
    public static void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glBindBufferRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, index, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glBindBufferBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, buffer, __functionAddress);
    }
    @Substitute
    public static void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode) {
        long __functionAddress = GL.getICD().glBeginTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(primitiveMode, __functionAddress);
    }
    @Substitute
    public static void glEndTransformFeedback() {
        long __functionAddress = GL.getICD().glEndTransformFeedback;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackVaryings;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, count, varyings, bufferMode, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVarying;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(program, index, bufSize, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static void glBindVertexArray(@NativeType("GLuint") int array) {
        long __functionAddress = GL.getICD().glBindVertexArray;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(array, __functionAddress);
    }
    @Substitute
    public static void nglDeleteVertexArrays(int n, long arrays) {
        long __functionAddress = GL.getICD().glDeleteVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, arrays, __functionAddress);
    }
    @Substitute
    public static void nglGenVertexArrays(int n, long arrays) {
        long __functionAddress = GL.getICD().glGenVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, arrays, __functionAddress);
    }
    @Substitute
    public static boolean glIsVertexArray(@NativeType("GLuint") int array) {
        long __functionAddress = GL.getICD().glIsVertexArray;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(array, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBShaderSubroutine.class)
final class Target_org_lwjgl_opengl_ARBShaderSubroutine {

}
@TargetClass(org.lwjgl.opengl.EXTSemaphoreWin32.class)
final class Target_org_lwjgl_opengl_EXTSemaphoreWin32 {
    @Substitute
    public static void glImportSemaphoreWin32HandleEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        long __functionAddress = GL.getICD().glImportSemaphoreWin32HandleEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        callPV(semaphore, handleType, handle, __functionAddress);
    }

    @Substitute
    public static void glImportSemaphoreWin32NameEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        long __functionAddress = GL.getICD().glImportSemaphoreWin32NameEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(name);
        }
        callPV(semaphore, handleType, name, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVDepthBufferFloat.class)
final class Target_org_lwjgl_opengl_NVDepthBufferFloat {

    @Substitute
    public static void glDepthRangedNV(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        long __functionAddress = GL.getICD().glDepthRangedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zNear, zFar, __functionAddress);
    }
    @Substitute
    public static void glClearDepthdNV(@NativeType("GLdouble") double depth) {
        long __functionAddress = GL.getICD().glClearDepthdNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(depth, __functionAddress);
    }
    @Substitute
    public static void glDepthBoundsdNV(@NativeType("GLdouble") double zmin, @NativeType("GLdouble") double zmax) {
        long __functionAddress = GL.getICD().glDepthBoundsdNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zmin, zmax, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVMemoryObjectSparse.class)
final class Target_org_lwjgl_opengl_NVMemoryObjectSparse {

    @Substitute
    public static void glBufferPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glBufferPageCommitmentMemNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(target, offset, size, memory, memOffset, commit, __functionAddress);
    }
    @Substitute
    public static void glNamedBufferPageCommitmentMemNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glNamedBufferPageCommitmentMemNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(buffer, offset, size, memory, memOffset, commit, __functionAddress);
    }
    @Substitute
    public static void glTexPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glTexPageCommitmentMemNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit, __functionAddress);
    }
    @Substitute
    public static void glTexturePageCommitmentMemNV(@NativeType("GLuint") int texture, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glTexturePageCommitmentMemNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDDrawBuffersBlend.class)
final class Target_org_lwjgl_opengl_AMDDrawBuffersBlend {

    @Substitute
    public static void glBlendFuncIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst) {
        long __functionAddress = GL.getICD().glBlendFuncIndexedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, src, dst, __functionAddress);
    }
    @Substitute
    public static void glBlendFuncSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        long __functionAddress = GL.getICD().glBlendFuncSeparateIndexedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
    }
    @Substitute
    public static void glBlendEquationIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBlendEquationIndexedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, mode, __functionAddress);
    }
    @Substitute
    public static void glBlendEquationSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        long __functionAddress = GL.getICD().glBlendEquationSeparateIndexedAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buf, modeRGB, modeAlpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVPrimitiveRestart.class)
final class Target_org_lwjgl_opengl_NVPrimitiveRestart {

    @Substitute
    public static void glPrimitiveRestartNV() {
        long __functionAddress = GL.getICD().glPrimitiveRestartNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glPrimitiveRestartIndexNV(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glPrimitiveRestartIndexNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVXConditionalRender.class)
final class Target_org_lwjgl_opengl_NVXConditionalRender {

    @Substitute
    public static void glBeginConditionalRenderNVX(@NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBeginConditionalRenderNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(id, __functionAddress);
    }
    @Substitute
    public static void glEndConditionalRenderNVX() {
        long __functionAddress = GL.getICD().glEndConditionalRenderNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDPerformanceMonitor.class)
final class Target_org_lwjgl_opengl_AMDPerformanceMonitor {
    @Substitute
    public static void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups) {
        long __functionAddress = GL.getICD().glGetPerfMonitorGroupsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(numGroups, groupsSize, groups, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(group, numCounters, maxActiveCounters, counterSize, counters, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString) {
        long __functionAddress = GL.getICD().glGetPerfMonitorGroupStringAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(group, bufSize, length, groupString, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterStringAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(group, counter, bufSize, length, counterString, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(group, counter, pname, data, __functionAddress);
    }
    @Substitute
    public static void nglGenPerfMonitorsAMD(int n, long monitors) {
        long __functionAddress = GL.getICD().glGenPerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, monitors, __functionAddress);
    }
    @Substitute
    public static void nglDeletePerfMonitorsAMD(int n, long monitors) {
        long __functionAddress = GL.getICD().glDeletePerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, monitors, __functionAddress);
    }
    @Substitute
    public static void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList) {
        long __functionAddress = GL.getICD().glSelectPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitor, enable, group, numCounters, counterList, __functionAddress);
    }
    @Substitute
    public static void glBeginPerfMonitorAMD(@NativeType("GLuint") int monitor) {
        long __functionAddress = GL.getICD().glBeginPerfMonitorAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(monitor, __functionAddress);
    }
    @Substitute
    public static void glEndPerfMonitorAMD(@NativeType("GLuint") int monitor) {
        long __functionAddress = GL.getICD().glEndPerfMonitorAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(monitor, __functionAddress);
    }
    @Substitute
    public static void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterDataAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(monitor, pname, dataSize, data, bytesWritten, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTransformFeedback2.class)
final class Target_org_lwjgl_opengl_ARBTransformFeedback2 {

}
@TargetClass(org.lwjgl.opengl.EXTDebugMarker.class)
final class Target_org_lwjgl_opengl_EXTDebugMarker {
    @Substitute
    public static void nglInsertEventMarkerEXT(int length, long marker) {
        long __functionAddress = GL.getICD().glInsertEventMarkerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(length, marker, __functionAddress);
    }
    @Substitute
    public static void nglPushGroupMarkerEXT(int length, long marker) {
        long __functionAddress = GL.getICD().glPushGroupMarkerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(length, marker, __functionAddress);
    }
    @Substitute
    public static void glPopGroupMarkerEXT() {
        long __functionAddress = GL.getICD().glPopGroupMarkerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVVertexArrayRange.class)
final class Target_org_lwjgl_opengl_NVVertexArrayRange {
    @Substitute
    public static void nglVertexArrayRangeNV(int length, long pointer) {
        long __functionAddress = GL.getICD().glVertexArrayRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(length, pointer, __functionAddress);
    }
    @Substitute
    public static void glFlushVertexArrayRangeNV() {
        long __functionAddress = GL.getICD().glFlushVertexArrayRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTStencilClearTag.class)
final class Target_org_lwjgl_opengl_EXTStencilClearTag {

    @Substitute
    public static void glStencilClearTagEXT(@NativeType("GLsizei") int stencilTagBits, @NativeType("GLuint") int stencilClearTag) {
        long __functionAddress = GL.getICD().glStencilClearTagEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(stencilTagBits, stencilClearTag, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL20.class)
final class Target_org_lwjgl_opengl_GL20 {

}
@TargetClass(org.lwjgl.opengl.GL46C.class)
final class Target_org_lwjgl_opengl_GL46C {
    @Substitute
    public static void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }
    @Substitute
    public static void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp) {
        long __functionAddress = GL.getICD().glPolygonOffsetClamp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(factor, units, clamp, __functionAddress);
    }
    @Substitute
    public static void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureBufferRange.class)
final class Target_org_lwjgl_opengl_ARBTextureBufferRange {

    @Substitute
    public static void glTextureBufferRangeEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glTextureBufferRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(texture, target, internalformat, buffer, offset, size, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL41C.class)
final class Target_org_lwjgl_opengl_GL41C {
    @Substitute
    public static void glReleaseShaderCompiler() {
        long __functionAddress = GL.getICD().glReleaseShaderCompiler;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        long __functionAddress = GL.getICD().glShaderBinary;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(count, shaders, binaryformat, binary, length, __functionAddress);
    }
    @Substitute
    public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        long __functionAddress = GL.getICD().glGetShaderPrecisionFormat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shadertype, precisiontype, range, precision, __functionAddress);
    }
    @Substitute
    public static void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar) {
        long __functionAddress = GL.getICD().glDepthRangef;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(zNear, zFar, __functionAddress);
    }
    @Substitute
    public static void glClearDepthf(@NativeType("GLfloat") float depth) {
        long __functionAddress = GL.getICD().glClearDepthf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(depth, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        long __functionAddress = GL.getICD().glGetProgramBinary;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(program, bufSize, length, binaryFormat, binary, __functionAddress);
    }
    @Substitute
    public static void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        long __functionAddress = GL.getICD().glProgramBinary;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, binaryFormat, binary, length, __functionAddress);
    }
    @Substitute
    public static void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glProgramParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, pname, value, __functionAddress);
    }
    @Substitute
    public static void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glUseProgramStages;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pipeline, stages, program, __functionAddress);
    }
    @Substitute
    public static void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glActiveShaderProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pipeline, program, __functionAddress);
    }
    @Substitute
    public static int nglCreateShaderProgramv(int type, int count, long strings) {
        long __functionAddress = GL.getICD().glCreateShaderProgramv;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(type, count, strings, __functionAddress);
    }
    @Substitute
    public static void glBindProgramPipeline(@NativeType("GLuint") int pipeline) {
        long __functionAddress = GL.getICD().glBindProgramPipeline;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pipeline, __functionAddress);
    }
    @Substitute
    public static void nglDeleteProgramPipelines(int n, long pipelines) {
        long __functionAddress = GL.getICD().glDeleteProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, pipelines, __functionAddress);
    }
    @Substitute
    public static void nglGenProgramPipelines(int n, long pipelines) {
        long __functionAddress = GL.getICD().glGenProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, pipelines, __functionAddress);
    }
    @Substitute
    public static boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline) {
        long __functionAddress = GL.getICD().glIsProgramPipeline;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(pipeline, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        long __functionAddress = GL.getICD().glGetProgramPipelineiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipeline, pname, params, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x) {
        long __functionAddress = GL.getICD().glProgramUniform1i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glProgramUniform2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glProgramUniform3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glProgramUniform4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x) {
        long __functionAddress = GL.getICD().glProgramUniform1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        long __functionAddress = GL.getICD().glProgramUniform2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z) {
        long __functionAddress = GL.getICD().glProgramUniform3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        long __functionAddress = GL.getICD().glProgramUniform4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x) {
        long __functionAddress = GL.getICD().glProgramUniform1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glProgramUniform2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glProgramUniform3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glProgramUniform4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        long __functionAddress = GL.getICD().glProgramUniform1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glProgramUniform2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glProgramUniform3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glProgramUniform4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1iv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2iv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3iv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4iv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1fv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2fv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3fv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4fv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1dv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2dv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3dv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4dv(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void glValidateProgramPipeline(@NativeType("GLuint") int pipeline) {
        long __functionAddress = GL.getICD().glValidateProgramPipeline;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pipeline, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        long __functionAddress = GL.getICD().glGetProgramPipelineInfoLog;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pipeline, bufSize, length, infoLog, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x) {
        long __functionAddress = GL.getICD().glVertexAttribL1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glVertexAttribL2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glVertexAttribL3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glVertexAttribL4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL1dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL2dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL3dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL4dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribLPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribLdv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglViewportArrayv(int first, int count, long v) {
        long __functionAddress = GL.getICD().glViewportArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, v, __functionAddress);
    }
    @Substitute
    public static void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h) {
        long __functionAddress = GL.getICD().glViewportIndexedf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, x, y, w, h, __functionAddress);
    }
    @Substitute
    public static void nglViewportIndexedfv(int index, long v) {
        long __functionAddress = GL.getICD().glViewportIndexedfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglScissorArrayv(int first, int count, long v) {
        long __functionAddress = GL.getICD().glScissorArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, v, __functionAddress);
    }
    @Substitute
    public static void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glScissorIndexed;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, left, bottom, width, height, __functionAddress);
    }
    @Substitute
    public static void nglScissorIndexedv(int index, long v) {
        long __functionAddress = GL.getICD().glScissorIndexedv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglDepthRangeArrayv(int first, int count, long v) {
        long __functionAddress = GL.getICD().glDepthRangeArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, count, v, __functionAddress);
    }
    @Substitute
    public static void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        long __functionAddress = GL.getICD().glDepthRangeIndexed;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, zNear, zFar, __functionAddress);
    }
    @Substitute
    public static void nglGetFloati_v(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetFloati_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
    @Substitute
    public static void nglGetDoublei_v(int target, int index, long data) {
        long __functionAddress = GL.getICD().glGetDoublei_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, data, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDSamplePositions.class)
final class Target_org_lwjgl_opengl_AMDSamplePositions {
    @Substitute
    public static void nglSetMultisamplefvAMD(int pname, int index, long val) {
        long __functionAddress = GL.getICD().glSetMultisamplefvAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, val, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVConditionalRender.class)
final class Target_org_lwjgl_opengl_NVConditionalRender {

    @Substitute
    public static void glBeginConditionalRenderNV(@NativeType("GLuint") int id, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBeginConditionalRenderNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(id, mode, __functionAddress);
    }
    @Substitute
    public static void glEndConditionalRenderNV() {
        long __functionAddress = GL.getICD().glEndConditionalRenderNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBGeometryShader4.class)
final class Target_org_lwjgl_opengl_ARBGeometryShader4 {

    @Substitute
    public static void glProgramParameteriARB(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        long __functionAddress = GL.getICD().glProgramParameteriARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, pname, value, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTextureARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureLayerARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glFramebufferTextureLayerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, layer, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTextureFaceARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face) {
        long __functionAddress = GL.getICD().glFramebufferTextureFaceARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, face, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTSemaphoreFD.class)
final class Target_org_lwjgl_opengl_EXTSemaphoreFD {

    @Substitute
    public static void glImportSemaphoreFdEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd) {
        long __functionAddress = GL.getICD().glImportSemaphoreFdEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(semaphore, handleType, fd, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL13C.class)
final class Target_org_lwjgl_opengl_GL13C {
    @Substitute
    public static void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedTexImage(int target, int level, long pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, pixels, __functionAddress);
    }
    @Substitute
    public static void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert) {
        long __functionAddress = GL.getICD().glSampleCoverage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(value, invert, __functionAddress);
    }
    @Substitute
    public static void glActiveTexture(@NativeType("GLenum") int texture) {
        long __functionAddress = GL.getICD().glActiveTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVGPUMulticast.class)
final class Target_org_lwjgl_opengl_NVGPUMulticast {
    @Substitute
    public static void glRenderGpuMaskNV(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glRenderGpuMaskNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void nglMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void glMulticastCopyBufferSubDataNV(@NativeType("GLuint") int readGpu, @NativeType("GLbitfield") int writeGpuMask, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glMulticastCopyBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
    }
    @Substitute
    public static void glMulticastCopyImageSubDataNV(@NativeType("GLuint") int srcGpu, @NativeType("GLbitfield") int dstGpuMask, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srxY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth) {
        long __functionAddress = GL.getICD().glMulticastCopyImageSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, __functionAddress);
    }
    @Substitute
    public static void glMulticastBlitFramebufferNV(@NativeType("GLuint") int srcGpu, @NativeType("GLuint") int dstGpu, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glMulticastBlitFramebufferNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }
    @Substitute
    public static void nglMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, long v) {
        long __functionAddress = GL.getICD().glMulticastFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, framebuffer, start, count, v, __functionAddress);
    }
    @Substitute
    public static void glMulticastBarrierNV() {
        long __functionAddress = GL.getICD().glMulticastBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glMulticastWaitSyncNV(@NativeType("GLuint") int signalGpu, @NativeType("GLbitfield") int waitGpuMask) {
        long __functionAddress = GL.getICD().glMulticastWaitSyncNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(signalGpu, waitGpuMask, __functionAddress);
    }
    @Substitute
    public static void nglMulticastGetQueryObjectivNV(int gpu, int id, int pname, long params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMulticastGetQueryObjectuivNV(int gpu, int id, int pname, long params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectuivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, long params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjecti64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, long params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBGPUShaderInt64.class)
final class Target_org_lwjgl_opengl_ARBGPUShaderInt64 {
    @Substitute
    public static void glUniform1i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x) {
        long __functionAddress = GL.getICD().glUniform1i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, x, __functionAddress);
    }
    @Substitute
    public static void nglUniform1i64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x) {
        long __functionAddress = GL.getICD().glProgramUniform1i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1i64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform2i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y) {
        long __functionAddress = GL.getICD().glUniform2i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(location, x, y, __functionAddress);
    }
    @Substitute
    public static void nglUniform2i64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y) {
        long __functionAddress = GL.getICD().glProgramUniform2i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2i64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform3i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z) {
        long __functionAddress = GL.getICD().glUniform3i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglUniform3i64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z) {
        long __functionAddress = GL.getICD().glProgramUniform3i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3i64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform4i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w) {
        long __functionAddress = GL.getICD().glUniform4i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglUniform4i64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w) {
        long __functionAddress = GL.getICD().glProgramUniform4i64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4i64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform1ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x) {
        long __functionAddress = GL.getICD().glUniform1ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, x, __functionAddress);
    }
    @Substitute
    public static void nglUniform1ui64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1ui64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform2ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y) {
        long __functionAddress = GL.getICD().glUniform2ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(location, x, y, __functionAddress);
    }
    @Substitute
    public static void nglUniform2ui64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2ui64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform3ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z) {
        long __functionAddress = GL.getICD().glUniform3ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglUniform3ui64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3ui64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform4ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w) {
        long __functionAddress = GL.getICD().glUniform4ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglUniform4ui64vARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4ui64vARB(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformi64vARB(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformui64vARB(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformi64vARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
    @Substitute
    public static void nglGetnUniformui64vARB(int program, int location, int bufSize, long params) {
        long __functionAddress = GL.getICD().glGetnUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, bufSize, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDebugOutput.class)
final class Target_org_lwjgl_opengl_ARBDebugOutput {
    @Substitute
    public static void nglDebugMessageControlARB(int source, int type, int severity, int count, long ids, boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageControlARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, count, ids, enabled, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageInsertARB(int source, int type, int id, int severity, int length, long buf) {
        long __functionAddress = GL.getICD().glDebugMessageInsertARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, id, severity, length, buf, __functionAddress);
    }
    @Substitute
    public static void nglDebugMessageCallbackARB(long callback, long userParam) {
        long __functionAddress = GL.getICD().glDebugMessageCallbackARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(callback, userParam, __functionAddress);
    }
    @Substitute
    public static int nglGetDebugMessageLogARB(int count, int bufSize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLogARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(count, bufSize, sources, types, ids, severities, lengths, messageLog, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.MESAFramebufferFlipY.class)
final class Target_org_lwjgl_opengl_MESAFramebufferFlipY {
    @Substitute
    public static void glFramebufferParameteriMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glFramebufferParameteriMESA;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetFramebufferParameterivMESA(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivMESA;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTSeparateShaderObjects.class)
final class Target_org_lwjgl_opengl_EXTSeparateShaderObjects {
    @Substitute
    public static void glUseShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glUseShaderProgramEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, program, __functionAddress);
    }
    @Substitute
    public static void glActiveProgramEXT(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glActiveProgramEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, __functionAddress);
    }
    @Substitute
    public static int nglCreateShaderProgramEXT(int type, long string) {
        long __functionAddress = GL.getICD().glCreateShaderProgramEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(type, string, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBShaderAtomicCounters.class)
final class Target_org_lwjgl_opengl_ARBShaderAtomicCounters {

}
@TargetClass(org.lwjgl.opengl.KHRRobustness.class)
final class Target_org_lwjgl_opengl_KHRRobustness {

}
@TargetClass(org.lwjgl.opengl.EXTBlendFuncSeparate.class)
final class Target_org_lwjgl_opengl_EXTBlendFuncSeparate {

    @Substitute
    public static void glBlendFuncSeparateEXT(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha) {
        long __functionAddress = GL.getICD().glBlendFuncSeparateEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDrawIndirect.class)
final class Target_org_lwjgl_opengl_ARBDrawIndirect {

}
@TargetClass(org.lwjgl.opengl.ARBGLSPIRV.class)
final class Target_org_lwjgl_opengl_ARBGLSPIRV {
    @Substitute
    public static void nglSpecializeShaderARB(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVConservativeRasterPreSnapTriangles.class)
final class Target_org_lwjgl_opengl_NVConservativeRasterPreSnapTriangles {

    @Substitute
    public static void glConservativeRasterParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glConservativeRasterParameteriNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBShaderStorageBufferObject.class)
final class Target_org_lwjgl_opengl_ARBShaderStorageBufferObject {

}
@TargetClass(org.lwjgl.opengl.EXTFramebufferBlitLayers.class)
final class Target_org_lwjgl_opengl_EXTFramebufferBlitLayers {

    @Substitute
    public static void glBlitFramebufferLayersEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glBlitFramebufferLayersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }
    @Substitute
    public static void glBlitFramebufferLayerEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int srcLayer, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLint") int dstLayer, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getICD().glBlitFramebufferLayerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVXGpuMulticast2.class)
final class Target_org_lwjgl_opengl_NVXGpuMulticast2 {
    @Substitute
    public static int nglAsyncCopyImageSubDataNVX(int waitSemaphoreCount, long waitSemaphoreArray, long waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, long signalSemaphoreArray, long signalValueArray) {
        long __functionAddress = GL.getICD().glAsyncCopyImageSubDataNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray, __functionAddress);
    }
    @Substitute
    public static long nglAsyncCopyBufferSubDataNVX(int waitSemaphoreCount, long waitSemaphoreArray, long fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, long signalSemaphoreArray, long signalValueArray) {
        long __functionAddress = GL.getICD().glAsyncCopyBufferSubDataNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPPP(waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray, __functionAddress);
    }
    @Substitute
    public static void glUploadGpuMaskNVX(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glUploadGpuMaskNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void nglMulticastViewportArrayvNVX(int gpu, int first, int count, long v) {
        long __functionAddress = GL.getICD().glMulticastViewportArrayvNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, first, count, v, __functionAddress);
    }
    @Substitute
    public static void nglMulticastScissorArrayvNVX(int gpu, int first, int count, long v) {
        long __functionAddress = GL.getICD().glMulticastScissorArrayvNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, first, count, v, __functionAddress);
    }
    @Substitute
    public static void glMulticastViewportPositionWScaleNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int index, @NativeType("GLfloat") float xcoeff, @NativeType("GLfloat") float ycoeff) {
        long __functionAddress = GL.getICD().glMulticastViewportPositionWScaleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(gpu, index, xcoeff, ycoeff, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBClearBufferObject.class)
final class Target_org_lwjgl_opengl_ARBClearBufferObject {
    @Substitute
    public static void nglClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTimerQuery.class)
final class Target_org_lwjgl_opengl_ARBTimerQuery {

}
@TargetClass(org.lwjgl.opengl.ARBOcclusionQuery.class)
final class Target_org_lwjgl_opengl_ARBOcclusionQuery {
    @Substitute
    public static void nglGenQueriesARB(int n, long ids) {
        long __functionAddress = GL.getICD().glGenQueriesARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static void nglDeleteQueriesARB(int n, long ids) {
        long __functionAddress = GL.getICD().glDeleteQueriesARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static boolean glIsQueryARB(@NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glIsQueryARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(id, __functionAddress);
    }
    @Substitute
    public static void glBeginQueryARB(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBeginQueryARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, id, __functionAddress);
    }
    @Substitute
    public static void glEndQueryARB(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glEndQueryARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryivARB(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectivARB(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectuivARB(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBShaderObjects.class)
final class Target_org_lwjgl_opengl_ARBShaderObjects {
    @Substitute
    public static void glDeleteObjectARB(@NativeType("GLhandleARB") int obj) {
        long __functionAddress = GL.getICD().glDeleteObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(obj, __functionAddress);
    }
    @Substitute
    public static int glGetHandleARB(@NativeType("GLenum") int pname) {
        long __functionAddress = GL.getICD().glGetHandleARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(pname, __functionAddress);
    }
    @Substitute
    public static void glDetachObjectARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLhandleARB") int attachedObj) {
        long __functionAddress = GL.getICD().glDetachObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(containerObj, attachedObj, __functionAddress);
    }
    @Substitute
    public static int glCreateShaderObjectARB(@NativeType("GLenum") int shaderType) {
        long __functionAddress = GL.getICD().glCreateShaderObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(shaderType, __functionAddress);
    }
    @Substitute
    public static void nglShaderSourceARB(int shaderObj, int count, long string, long length) {
        long __functionAddress = GL.getICD().glShaderSourceARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shaderObj, count, string, length, __functionAddress);
    }
    @Substitute
    public static void glCompileShaderARB(@NativeType("GLhandleARB") int shaderObj) {
        long __functionAddress = GL.getICD().glCompileShaderARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(shaderObj, __functionAddress);
    }
    @Substitute
    public static int glCreateProgramObjectARB() {
        long __functionAddress = GL.getICD().glCreateProgramObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void glAttachObjectARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLhandleARB") int obj) {
        long __functionAddress = GL.getICD().glAttachObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(containerObj, obj, __functionAddress);
    }
    @Substitute
    public static void glLinkProgramARB(@NativeType("GLhandleARB") int programObj) {
        long __functionAddress = GL.getICD().glLinkProgramARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(programObj, __functionAddress);
    }
    @Substitute
    public static void glUseProgramObjectARB(@NativeType("GLhandleARB") int programObj) {
        long __functionAddress = GL.getICD().glUseProgramObjectARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(programObj, __functionAddress);
    }
    @Substitute
    public static void glValidateProgramARB(@NativeType("GLhandleARB") int programObj) {
        long __functionAddress = GL.getICD().glValidateProgramARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(programObj, __functionAddress);
    }
    @Substitute
    public static void glUniform1fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        long __functionAddress = GL.getICD().glUniform1fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        long __functionAddress = GL.getICD().glUniform2fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glUniform3fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        long __functionAddress = GL.getICD().glUniform4fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glUniform1iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0) {
        long __functionAddress = GL.getICD().glUniform1iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        long __functionAddress = GL.getICD().glUniform2iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        long __functionAddress = GL.getICD().glUniform3iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        long __functionAddress = GL.getICD().glUniform4iARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglUniform1fvARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2fvARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3fvARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4fvARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform1ivARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2ivARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3ivARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4ivARB(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2fvARB(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3fvARB(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4fvARB(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglGetObjectParameterfvARB(int obj, int pname, long params) {
        long __functionAddress = GL.getICD().glGetObjectParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(obj, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetObjectParameterivARB(int obj, int pname, long params) {
        long __functionAddress = GL.getICD().glGetObjectParameterivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(obj, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetInfoLogARB(int obj, int maxLength, long length, long infoLog) {
        long __functionAddress = GL.getICD().glGetInfoLogARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(obj, maxLength, length, infoLog, __functionAddress);
    }
    @Substitute
    public static void nglGetAttachedObjectsARB(int containerObj, int maxCount, long count, long obj) {
        long __functionAddress = GL.getICD().glGetAttachedObjectsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(containerObj, maxCount, count, obj, __functionAddress);
    }
    @Substitute
    public static int nglGetUniformLocationARB(int programObj, long name) {
        long __functionAddress = GL.getICD().glGetUniformLocationARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(programObj, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniformARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetActiveUniformARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(programObj, index, maxLength, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformfvARB(int programObj, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programObj, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformivARB(int programObj, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programObj, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetShaderSourceARB(int obj, int maxLength, long length, long source) {
        long __functionAddress = GL.getICD().glGetShaderSourceARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(obj, maxLength, length, source, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVMemoryAttachment.class)
final class Target_org_lwjgl_opengl_NVMemoryAttachment {
    @Substitute
    public static void nglGetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, long params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectDetachedResourcesuivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memory, pname, first, count, params, __functionAddress);
    }
    @Substitute
    public static void glResetMemoryObjectParameterNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname) {
        long __functionAddress = GL.getICD().glResetMemoryObjectParameterNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(memory, pname, __functionAddress);
    }
    @Substitute
    public static void glTexAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTexAttachMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glBufferAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glBufferAttachMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(target, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glTextureAttachMemoryNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glTextureAttachMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(texture, memory, offset, __functionAddress);
    }
    @Substitute
    public static void glNamedBufferAttachMemoryNV(@NativeType("GLuint") int buffer, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset) {
        long __functionAddress = GL.getICD().glNamedBufferAttachMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(buffer, memory, offset, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTessellationShader.class)
final class Target_org_lwjgl_opengl_ARBTessellationShader {

}
@TargetClass(org.lwjgl.opengl.ARBTransformFeedbackInstanced.class)
final class Target_org_lwjgl_opengl_ARBTransformFeedbackInstanced {

}
@TargetClass(org.lwjgl.opengl.ARBCopyBuffer.class)
final class Target_org_lwjgl_opengl_ARBCopyBuffer {

}
@TargetClass(org.lwjgl.opengl.EXTX11SyncObject.class)
final class Target_org_lwjgl_opengl_EXTX11SyncObject {

    @Substitute
    public static long glImportSyncEXT(@NativeType("GLenum") int external_sync_type, @NativeType("GLintptr") long external_sync, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glImportSyncEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(external_sync_type, external_sync, flags, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVTextureMultisample.class)
final class Target_org_lwjgl_opengl_NVTextureMultisample {

    @Substitute
    public static void glTexImage2DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTexImage2DMultisampleCoverageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
    }
    @Substitute
    public static void glTexImage3DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTexImage3DMultisampleCoverageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
    }
    @Substitute
    public static void glTextureImage2DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTextureImage2DMultisampleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, samples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
    }
    @Substitute
    public static void glTextureImage3DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTextureImage3DMultisampleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
    }
    @Substitute
    public static void glTextureImage2DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTextureImage2DMultisampleCoverageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
    }
    @Substitute
    public static void glTextureImage3DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations) {
        long __functionAddress = GL.getICD().glTextureImage3DMultisampleCoverageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBCLEvent.class)
final class Target_org_lwjgl_opengl_ARBCLEvent {
    @Substitute
    @NativeType("GLsync")
    public static long glCreateSyncFromCLeventARB(@NativeType("cl_context") long context, @NativeType("cl_event") long event, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glCreateSyncFromCLeventARB;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(event);
        }
        return callPPP(context, event, flags, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL31.class)
final class Target_org_lwjgl_opengl_GL31 {

}
@TargetClass(org.lwjgl.opengl.ARBGPUShaderFP64.class)
final class Target_org_lwjgl_opengl_ARBGPUShaderFP64 {
    @Substitute
    public static void glProgramUniform1dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        long __functionAddress = GL.getICD().glProgramUniform1dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glProgramUniform2dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glProgramUniform3dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glProgramUniform4dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1dvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2dvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3dvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4dvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVTransformFeedback2.class)
final class Target_org_lwjgl_opengl_NVTransformFeedback2 {
    @Substitute
    public static void glBindTransformFeedbackNV(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBindTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, id, __functionAddress);
    }
    @Substitute
    public static void nglDeleteTransformFeedbacksNV(int n, long ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static void nglGenTransformFeedbacksNV(int n, long ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static boolean glIsTransformFeedbackNV(@NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glIsTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(id, __functionAddress);
    }
    @Substitute
    public static void glPauseTransformFeedbackNV() {
        long __functionAddress = GL.getICD().glPauseTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glResumeTransformFeedbackNV() {
        long __functionAddress = GL.getICD().glResumeTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void glDrawTransformFeedbackNV(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glDrawTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, id, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVExplicitMultisample.class)
final class Target_org_lwjgl_opengl_NVExplicitMultisample {
    @Substitute
    public static void nglGetMultisamplefvNV(int pname, int index, long val) {
        long __functionAddress = GL.getICD().glGetMultisamplefvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, val, __functionAddress);
    }
    @Substitute
    public static void glSampleMaskIndexedNV(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glSampleMaskIndexedNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, mask, __functionAddress);
    }
    @Substitute
    public static void glTexRenderbufferNV(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glTexRenderbufferNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, renderbuffer, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL32.class)
final class Target_org_lwjgl_opengl_GL32 {

}
@TargetClass(org.lwjgl.opengl.AMDSparseTexture.class)
final class Target_org_lwjgl_opengl_AMDSparseTexture {

    @Substitute
    public static void glTexStorageSparseAMD(@NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glTexStorageSparseAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalFormat, width, height, depth, layers, flags, __functionAddress);
    }
    @Substitute
    public static void glTextureStorageSparseAMD(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glTextureStorageSparseAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, internalFormat, width, height, depth, layers, flags, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTExternalBuffer.class)
final class Target_org_lwjgl_opengl_EXTExternalBuffer {

    @Substitute
    public static void glBufferStorageExternalEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorageExternalEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(clientBuffer);
        }
        callPPPV(target, offset, size, clientBuffer, flags, __functionAddress);
    }

    @Substitute
    public static void glNamedBufferStorageExternalEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageExternalEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(clientBuffer);
        }
        callPPPV(buffer, offset, size, clientBuffer, flags, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBSampleLocations.class)
final class Target_org_lwjgl_opengl_ARBSampleLocations {
    @Substitute
    public static void nglFramebufferSampleLocationsfvARB(int target, int start, int count, long v) {
        long __functionAddress = GL.getICD().glFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, count, v, __functionAddress);
    }
    @Substitute
    public static void nglNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, long v) {
        long __functionAddress = GL.getICD().glNamedFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, start, count, v, __functionAddress);
    }
    @Substitute
    public static void glEvaluateDepthValuesARB() {
        long __functionAddress = GL.getICD().glEvaluateDepthValuesARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTFramebufferMultisample.class)
final class Target_org_lwjgl_opengl_EXTFramebufferMultisample {

    @Substitute
    public static void glRenderbufferStorageMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glRenderbufferStorageMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVPointSprite.class)
final class Target_org_lwjgl_opengl_NVPointSprite {
    @Substitute
    public static void glPointParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glPointParameteriNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglPointParameterivNV(int pname, long params) {
        long __functionAddress = GL.getICD().glPointParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVMeshShader.class)
final class Target_org_lwjgl_opengl_NVMeshShader {

    @Substitute
    public static void glDrawMeshTasksNV(@NativeType("GLuint") int first, @NativeType("GLuint") int count) {
        long __functionAddress = GL.getICD().glDrawMeshTasksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(first, count, __functionAddress);
    }
    @Substitute
    public static void glDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect) {
        long __functionAddress = GL.getICD().glDrawMeshTasksIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indirect, __functionAddress);
    }
    @Substitute
    public static void glMultiDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawMeshTasksIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indirect, drawcount, stride, __functionAddress);
    }
    @Substitute
    public static void glMultiDrawMeshTasksIndirectCountNV(@NativeType("GLintptr") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawMeshTasksIndirectCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL33.class)
final class Target_org_lwjgl_opengl_GL33 {
    @Substitute
    public static void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexP2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, value, __functionAddress);
    }
    @Substitute
    public static void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, value, __functionAddress);
    }
    @Substitute
    public static void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexP4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexP2uiv(int type, long value) {
        long __functionAddress = GL.getICD().glVertexP2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexP3uiv(int type, long value) {
        long __functionAddress = GL.getICD().glVertexP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexP4uiv(int type, long value) {
        long __functionAddress = GL.getICD().glVertexP4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, value, __functionAddress);
    }
    @Substitute
    public static void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glTexCoordP1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, coords, __functionAddress);
    }
    @Substitute
    public static void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glTexCoordP2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, coords, __functionAddress);
    }
    @Substitute
    public static void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glTexCoordP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, coords, __functionAddress);
    }
    @Substitute
    public static void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glTexCoordP4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, coords, __functionAddress);
    }
    @Substitute
    public static void nglTexCoordP1uiv(int type, long coords) {
        long __functionAddress = GL.getICD().glTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, coords, __functionAddress);
    }
    @Substitute
    public static void nglTexCoordP2uiv(int type, long coords) {
        long __functionAddress = GL.getICD().glTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, coords, __functionAddress);
    }
    @Substitute
    public static void nglTexCoordP3uiv(int type, long coords) {
        long __functionAddress = GL.getICD().glTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, coords, __functionAddress);
    }
    @Substitute
    public static void nglTexCoordP4uiv(int type, long coords) {
        long __functionAddress = GL.getICD().glTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, coords, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, type, coords, __functionAddress);
    }
    @Substitute
    public static void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        long __functionAddress = GL.getICD().glNormalP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, coords, __functionAddress);
    }
    @Substitute
    public static void nglNormalP3uiv(int type, long coords) {
        long __functionAddress = GL.getICD().glNormalP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, coords, __functionAddress);
    }
    @Substitute
    public static void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        long __functionAddress = GL.getICD().glColorP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, color, __functionAddress);
    }
    @Substitute
    public static void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        long __functionAddress = GL.getICD().glColorP4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, color, __functionAddress);
    }
    @Substitute
    public static void nglColorP3uiv(int type, long color) {
        long __functionAddress = GL.getICD().glColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, color, __functionAddress);
    }
    @Substitute
    public static void nglColorP4uiv(int type, long color) {
        long __functionAddress = GL.getICD().glColorP4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, color, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        long __functionAddress = GL.getICD().glSecondaryColorP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(type, color, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColorP3uiv(int type, long color) {
        long __functionAddress = GL.getICD().glSecondaryColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, color, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL30.class)
final class Target_org_lwjgl_opengl_GL30 {

}
@TargetClass(org.lwjgl.opengl.EXTBlendColor.class)
final class Target_org_lwjgl_opengl_EXTBlendColor {

    @Substitute
    public static void glBlendColorEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        long __functionAddress = GL.getICD().glBlendColorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVTransformFeedback.class)
final class Target_org_lwjgl_opengl_NVTransformFeedback {
    @Substitute
    public static void glBeginTransformFeedbackNV(@NativeType("GLenum") int primitiveMode) {
        long __functionAddress = GL.getICD().glBeginTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(primitiveMode, __functionAddress);
    }
    @Substitute
    public static void glEndTransformFeedbackNV() {
        long __functionAddress = GL.getICD().glEndTransformFeedbackNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
    @Substitute
    public static void nglTransformFeedbackAttribsNV(int count, long attribs, int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackAttribsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(count, attribs, bufferMode, __functionAddress);
    }
    @Substitute
    public static void glBindBufferRangeNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glBindBufferRangeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, index, buffer, offset, size, __functionAddress);
    }
    @Substitute
    public static void glBindBufferOffsetNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glBindBufferOffsetNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, buffer, offset, __functionAddress);
    }
    @Substitute
    public static void glBindBufferBaseNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glBindBufferBaseNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, buffer, __functionAddress);
    }
    @Substitute
    public static void nglTransformFeedbackVaryingsNV(int program, int count, long locations, int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackVaryingsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, count, locations, bufferMode, __functionAddress);
    }
    @Substitute
    public static void nglActiveVaryingNV(int program, long name) {
        long __functionAddress = GL.getICD().glActiveVaryingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, name, __functionAddress);
    }
    @Substitute
    public static int nglGetVaryingLocationNV(int program, long name) {
        long __functionAddress = GL.getICD().glGetVaryingLocationNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveVaryingNV(int program, int index, int bufSize, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetActiveVaryingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(program, index, bufSize, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static void nglGetTransformFeedbackVaryingNV(int program, int index, long location) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, index, location, __functionAddress);
    }
    @Substitute
    public static void nglTransformFeedbackStreamAttribsNV(int count, long attribs, int nbuffers, long bufstreams, int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackStreamAttribsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(count, attribs, nbuffers, bufstreams, bufferMode, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTDirectStateAccess.class)
final class Target_org_lwjgl_opengl_EXTDirectStateAccess {
    @Substitute
    public static void glClientAttribDefaultEXT(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glClientAttribDefaultEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void glPushClientAttribDefaultEXT(@NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glPushClientAttribDefaultEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mask, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoadfEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoadfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoaddEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoaddEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMultfEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMultfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMultdEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMultdEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void glMatrixLoadIdentityEXT(@NativeType("GLenum") int matrixMode) {
        long __functionAddress = GL.getICD().glMatrixLoadIdentityEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, __functionAddress);
    }
    @Substitute
    public static void glMatrixRotatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glMatrixRotatefEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, angle, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixRotatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glMatrixRotatedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, angle, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixScalefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glMatrixScalefEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixScaledEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glMatrixScaledEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixTranslatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glMatrixTranslatefEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixTranslatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glMatrixTranslatedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glMatrixOrthoEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        long __functionAddress = GL.getICD().glMatrixOrthoEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, l, r, b, t, n, f, __functionAddress);
    }
    @Substitute
    public static void glMatrixFrustumEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        long __functionAddress = GL.getICD().glMatrixFrustumEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, l, r, b, t, n, f, __functionAddress);
    }
    @Substitute
    public static void glMatrixPushEXT(@NativeType("GLenum") int matrixMode) {
        long __functionAddress = GL.getICD().glMatrixPushEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, __functionAddress);
    }
    @Substitute
    public static void glMatrixPopEXT(@NativeType("GLenum") int matrixMode) {
        long __functionAddress = GL.getICD().glMatrixPopEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(matrixMode, __functionAddress);
    }
    @Substitute
    public static void glTextureParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glTextureParameteriEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterivEXT(int texture, int target, int pname, long param) {
        long __functionAddress = GL.getICD().glTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void glTextureParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glTextureParameterfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterfvEXT(int texture, int target, int pname, long param) {
        long __functionAddress = GL.getICD().glTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, level, internalformat, x, y, width, border, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, level, internalformat, x, y, width, height, border, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, level, xoffset, x, y, width, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterivEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glBindMultiTextureEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glBindMultiTextureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, texture, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glMultiTexEnvfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glMultiTexEnvfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMultiTexEnviEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glMultiTexEnviEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMultiTexGendEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param) {
        long __functionAddress = GL.getICD().glMultiTexGendEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMultiTexGenfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glMultiTexGenfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMultiTexGeniEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glMultiTexGeniEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, coord, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMultiTexParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glMultiTexParameteriEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param) {
        long __functionAddress = GL.getICD().glMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void glMultiTexParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glMultiTexParameterfEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param) {
        long __functionAddress = GL.getICD().glMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, level, internalformat, x, y, width, border, __functionAddress);
    }
    @Substitute
    public static void glCopyMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        long __functionAddress = GL.getICD().glCopyMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, level, internalformat, x, y, width, height, border, __functionAddress);
    }
    @Substitute
    public static void glCopyMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, level, xoffset, x, y, width, __functionAddress);
    }
    @Substitute
    public static void glCopyMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }
    @Substitute
    public static void glCopyMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void glEnableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableClientStateIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(array, index, __functionAddress);
    }
    @Substitute
    public static void glDisableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableClientStateIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(array, index, __functionAddress);
    }
    @Substitute
    public static void glEnableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableClientStateiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(array, index, __functionAddress);
    }
    @Substitute
    public static void glDisableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableClientStateiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(array, index, __functionAddress);
    }
    @Substitute
    public static void nglGetFloatIndexedvEXT(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetFloatIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetDoubleIndexedvEXT(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetDoubleIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetPointerIndexedvEXT(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetPointerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetFloati_vEXT(int pname, int index, long params) {
        long __functionAddress = GL.getICD().glGetFloati_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetDoublei_vEXT(int pname, int index, long params) {
        long __functionAddress = GL.getICD().glGetDoublei_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetPointeri_vEXT(int pname, int index, long params) {
        long __functionAddress = GL.getICD().glGetPointeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, params, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramStringEXT(int program, int target, int format, int len, long string) {
        long __functionAddress = GL.getICD().glNamedProgramStringEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, format, len, string, __functionAddress);
    }
    @Substitute
    public static void glNamedProgramLocalParameter4dEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4dEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void glNamedProgramLocalParameter4fEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterdvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramivEXT(int program, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedProgramivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramStringEXT(int program, int target, int pname, long string) {
        long __functionAddress = GL.getICD().glGetNamedProgramStringEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, pname, string, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img) {
        long __functionAddress = GL.getICD().glGetCompressedTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, img, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img) {
        long __functionAddress = GL.getICD().glGetCompressedMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, img, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoadTransposefEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixLoadTransposedEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMultTransposefEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglMatrixMultTransposedEXT(int matrixMode, long m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(matrixMode, m, __functionAddress);
    }
    @Substitute
    public static void nglNamedBufferDataEXT(int buffer, long size, long data, int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, size, data, usage, __functionAddress);
    }
    @Substitute
    public static void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, size, data, __functionAddress);
    }
    @Substitute
    public static long nglMapNamedBufferEXT(int buffer, int access) {
        long __functionAddress = GL.getICD().glMapNamedBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(buffer, access, __functionAddress);
    }
    @Substitute
    public static boolean glUnmapNamedBufferEXT(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glUnmapNamedBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(buffer, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        long __functionAddress = GL.getICD().glProgramUniform1fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        long __functionAddress = GL.getICD().glProgramUniform2fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glProgramUniform3fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        long __functionAddress = GL.getICD().glProgramUniform4fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0) {
        long __functionAddress = GL.getICD().glProgramUniform1iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        long __functionAddress = GL.getICD().glProgramUniform2iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        long __functionAddress = GL.getICD().glProgramUniform3iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        long __functionAddress = GL.getICD().glProgramUniform4iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1fvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2fvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3fvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4fvEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1ivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2ivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3ivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4ivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void glTextureBufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTextureBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, internalformat, buffer, __functionAddress);
    }
    @Substitute
    public static void glMultiTexBufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glMultiTexBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, internalformat, buffer, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterIivEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglTextureParameterIuivEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        long __functionAddress = GL.getICD().glProgramUniform1uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        long __functionAddress = GL.getICD().glProgramUniform2uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        long __functionAddress = GL.getICD().glProgramUniform3uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        long __functionAddress = GL.getICD().glProgramUniform4uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1uivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2uivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3uivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4uivEXT(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, count, params, __functionAddress);
    }
    @Substitute
    public static void glNamedProgramLocalParameterI4iEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4iEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, count, params, __functionAddress);
    }
    @Substitute
    public static void glNamedProgramLocalParameterI4uiEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4uiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, count, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorageMultisampleEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorageMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, samples, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glNamedRenderbufferStorageMultisampleCoverageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glNamedRenderbufferStorageMultisampleCoverageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(renderbuffer, coverageSamples, colorSamples, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static int glCheckNamedFramebufferStatusEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glCheckNamedFramebufferStatusEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(framebuffer, target, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTexture1DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glNamedFramebufferTexture1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTexture2DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glNamedFramebufferTexture2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, textarget, texture, level, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTexture3DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset) {
        long __functionAddress = GL.getICD().glNamedFramebufferTexture3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, textarget, texture, level, zoffset, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferRenderbufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glNamedFramebufferRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, renderbuffertarget, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }
    @Substitute
    public static void glGenerateTextureMipmapEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glGenerateTextureMipmapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, __functionAddress);
    }
    @Substitute
    public static void glGenerateMultiTexMipmapEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glGenerateMultiTexMipmapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, __functionAddress);
    }
    @Substitute
    public static void glFramebufferDrawBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glFramebufferDrawBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, mode, __functionAddress);
    }
    @Substitute
    public static void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs) {
        long __functionAddress = GL.getICD().glFramebufferDrawBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, n, bufs, __functionAddress);
    }
    @Substitute
    public static void glFramebufferReadBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glFramebufferReadBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, mode, __functionAddress);
    }
    @Substitute
    public static void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, pname, param, __functionAddress);
    }
    @Substitute
    public static void glNamedCopyBufferSubDataEXT(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glNamedCopyBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTextureEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glNamedFramebufferTextureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTextureLayerEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        long __functionAddress = GL.getICD().glNamedFramebufferTextureLayerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, layer, __functionAddress);
    }
    @Substitute
    public static void glNamedFramebufferTextureFaceEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face) {
        long __functionAddress = GL.getICD().glNamedFramebufferTextureFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(framebuffer, attachment, texture, level, face, __functionAddress);
    }
    @Substitute
    public static void glTextureRenderbufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glTextureRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void glMultiTexRenderbufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        long __functionAddress = GL.getICD().glMultiTexRenderbufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texunit, target, renderbuffer, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayColorOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayEdgeFlagOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayEdgeFlagOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayIndexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayIndexOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayNormalOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayNormalOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayTexCoordOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayMultiTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayMultiTexCoordOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, texunit, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayFogCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayFogCoordOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArraySecondaryColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArraySecondaryColorOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, index, size, type, normalized, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribIOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribIOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, buffer, index, size, type, stride, offset, __functionAddress);
    }
    @Substitute
    public static void glEnableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array) {
        long __functionAddress = GL.getICD().glEnableVertexArrayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, array, __functionAddress);
    }
    @Substitute
    public static void glDisableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array) {
        long __functionAddress = GL.getICD().glDisableVertexArrayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, array, __functionAddress);
    }
    @Substitute
    public static void glEnableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableVertexArrayAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, index, __functionAddress);
    }
    @Substitute
    public static void glDisableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableVertexArrayAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, index, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegervEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayPointervEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param) {
        long __functionAddress = GL.getICD().glGetVertexArrayPointeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }
    @Substitute
    public static long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
        long __functionAddress = GL.getICD().glMapNamedBufferRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(buffer, offset, length, access, __functionAddress);
    }
    @Substitute
    public static void glFlushMappedNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        long __functionAddress = GL.getICD().glFlushMappedNamedBufferRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, offset, length, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBColorBufferFloat.class)
final class Target_org_lwjgl_opengl_ARBColorBufferFloat {

    @Substitute
    public static void glClampColorARB(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp) {
        long __functionAddress = GL.getICD().glClampColorARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, clamp, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDrawBuffers.class)
final class Target_org_lwjgl_opengl_ARBDrawBuffers {
    @Substitute
    public static void nglDrawBuffersARB(int n, long bufs) {
        long __functionAddress = GL.getICD().glDrawBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, bufs, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVShaderBufferLoad.class)
final class Target_org_lwjgl_opengl_NVShaderBufferLoad {
    @Substitute
    public static void glMakeBufferResidentNV(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getICD().glMakeBufferResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, access, __functionAddress);
    }
    @Substitute
    public static void glMakeBufferNonResidentNV(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glMakeBufferNonResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static boolean glIsBufferResidentNV(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glIsBufferResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(target, __functionAddress);
    }
    @Substitute
    public static void glMakeNamedBufferResidentNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getICD().glMakeNamedBufferResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buffer, access, __functionAddress);
    }
    @Substitute
    public static void glMakeNamedBufferNonResidentNV(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glMakeNamedBufferNonResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(buffer, __functionAddress);
    }
    @Substitute
    public static boolean glIsNamedBufferResidentNV(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glIsNamedBufferResidentNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(buffer, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferParameterui64vNV(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetIntegerui64vNV(int value, long result) {
        long __functionAddress = GL.getICD().glGetIntegerui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(value, result, __functionAddress);
    }
    @Substitute
    public static void glUniformui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long value) {
        long __functionAddress = GL.getICD().glUniformui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformui64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformui64vNV(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void glProgramUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long value) {
        long __functionAddress = GL.getICD().glProgramUniformui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformui64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL41.class)
final class Target_org_lwjgl_opengl_GL41 {

}
@TargetClass(org.lwjgl.opengl.INTELMapTexture.class)
final class Target_org_lwjgl_opengl_INTELMapTexture {
    @Substitute
    public static void glSyncTextureINTEL(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glSyncTextureINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void glUnmapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glUnmapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, __functionAddress);
    }
    @Substitute
    public static long nglMapTexture2DINTEL(int texture, int level, int access, long stride, long layout) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(texture, level, access, stride, layout, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.AMDVertexShaderTessellator.class)
final class Target_org_lwjgl_opengl_AMDVertexShaderTessellator {

    @Substitute
    public static void glTessellationFactorAMD(@NativeType("GLfloat") float factor) {
        long __functionAddress = GL.getICD().glTessellationFactorAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(factor, __functionAddress);
    }
    @Substitute
    public static void glTessellationModeAMD(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glTessellationModeAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureBarrier.class)
final class Target_org_lwjgl_opengl_ARBTextureBarrier {

}
@TargetClass(org.lwjgl.opengl.NVTextureBarrier.class)
final class Target_org_lwjgl_opengl_NVTextureBarrier {

    @Substitute
    public static void glTextureBarrierNV() {
        long __functionAddress = GL.getICD().glTextureBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL15.class)
final class Target_org_lwjgl_opengl_GL15 {

}
@TargetClass(org.lwjgl.opengl.ARBTextureCompression.class)
final class Target_org_lwjgl_opengl_ARBTextureCompression {
    @Substitute
    public static void nglCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage3DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage2DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexImage1DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage3DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage2DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        long __functionAddress = GL.getICD().glCompressedTexSubImage1DARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, imageSize, data, __functionAddress);
    }
    @Substitute
    public static void nglGetCompressedTexImageARB(int target, int level, long pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, pixels, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL21.class)
final class Target_org_lwjgl_opengl_GL21 {

}
@TargetClass(org.lwjgl.opengl.GL14C.class)
final class Target_org_lwjgl_opengl_GL14C {
    @Substitute
    public static void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        long __functionAddress = GL.getICD().glBlendColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void glBlendEquation(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glBlendEquation;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawArrays(int mode, long first, long count, int drawcount) {
        long __functionAddress = GL.getICD().glMultiDrawArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, first, count, drawcount, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount) {
        long __functionAddress = GL.getICD().glMultiDrawElements;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(mode, count, type, indices, drawcount, __functionAddress);
    }
    @Substitute
    public static void glPointParameterf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glPointParameterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glPointParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(pname, param, __functionAddress);
    }
    @Substitute
    public static void nglPointParameterfv(int pname, long params) {
        long __functionAddress = GL.getICD().glPointParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglPointParameteriv(int pname, long params) {
        long __functionAddress = GL.getICD().glPointParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha) {
        long __functionAddress = GL.getICD().glBlendFuncSeparate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL33C.class)
final class Target_org_lwjgl_opengl_GL33C {
    @Substitute
    public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        long __functionAddress = GL.getICD().glBindFragDataLocationIndexed;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, colorNumber, index, name, __functionAddress);
    }
    @Substitute
    public static int nglGetFragDataIndex(int program, long name) {
        long __functionAddress = GL.getICD().glGetFragDataIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void nglGenSamplers(int count, long samplers) {
        long __functionAddress = GL.getICD().glGenSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(count, samplers, __functionAddress);
    }
    @Substitute
    public static void nglDeleteSamplers(int count, long samplers) {
        long __functionAddress = GL.getICD().glDeleteSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(count, samplers, __functionAddress);
    }
    @Substitute
    public static boolean glIsSampler(@NativeType("GLuint") int sampler) {
        long __functionAddress = GL.getICD().glIsSampler;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(sampler, __functionAddress);
    }
    @Substitute
    public static void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        long __functionAddress = GL.getICD().glBindSampler;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(unit, sampler, __functionAddress);
    }
    @Substitute
    public static void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glSamplerParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sampler, pname, param, __functionAddress);
    }
    @Substitute
    public static void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glSamplerParameterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sampler, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglSamplerParameteriv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglSamplerParameterfv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(sampler, pname, params, __functionAddress);
    }
    @Substitute
    public static void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glQueryCounter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(id, target, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjecti64v(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectui64v(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexAttribDivisor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, divisor, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexAttribP1ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexAttribP2ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexAttribP3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        long __functionAddress = GL.getICD().glVertexAttribP4ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        long __functionAddress = GL.getICD().glVertexAttribP1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        long __functionAddress = GL.getICD().glVertexAttribP2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        long __functionAddress = GL.getICD().glVertexAttribP3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        long __functionAddress = GL.getICD().glVertexAttribP4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVDrawVulkanImage.class)
final class Target_org_lwjgl_opengl_NVDrawVulkanImage {
    @Substitute
    public static void glDrawVkImageNV(@NativeType("GLuint64") long vkImage, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1) {
        long __functionAddress = GL.getICD().glDrawVkImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1, __functionAddress);
    }
    @Substitute
    public static long nglGetVkProcAddrNV(long name) {
        long __functionAddress = GL.getICD().glGetVkProcAddrNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(name, __functionAddress);
    }
    @Substitute
    public static void glWaitVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore) {
        long __functionAddress = GL.getICD().glWaitVkSemaphoreNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(vkSemaphore, __functionAddress);
    }
    @Substitute
    public static void glSignalVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore) {
        long __functionAddress = GL.getICD().glSignalVkSemaphoreNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(vkSemaphore, __functionAddress);
    }
    @Substitute
    public static void glSignalVkFenceNV(@NativeType("GLuint64") long vkFence) {
        long __functionAddress = GL.getICD().glSignalVkFenceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(vkFence, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureStorage.class)
final class Target_org_lwjgl_opengl_ARBTextureStorage {

    @Substitute
    public static void glTextureStorage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glTextureStorage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glTextureStorage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, height, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glTextureStorage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, levels, internalformat, width, height, depth, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL13.class)
final class Target_org_lwjgl_opengl_GL13 {
    @Substitute
    public static void glClientActiveTexture(@NativeType("GLenum") int texture) {
        long __functionAddress = GL.getICD().glClientActiveTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1i(@NativeType("GLenum") int texture, @NativeType("GLint") int s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1fv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1sv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1iv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1dv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2fv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2sv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2iv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2dv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3fv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3sv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3iv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3dv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4fv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4sv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4iv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4dv(int texture, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, v, __functionAddress);
    }
    @Substitute
    public static void nglLoadTransposeMatrixf(long m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglLoadTransposeMatrixd(long m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglMultTransposeMatrixf(long m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
    @Substitute
    public static void nglMultTransposeMatrixd(long m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(m, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBMultiDrawIndirect.class)
final class Target_org_lwjgl_opengl_ARBMultiDrawIndirect {

}
@TargetClass(org.lwjgl.opengl.ARBBindlessTexture.class)
final class Target_org_lwjgl_opengl_ARBBindlessTexture {
    @Substitute
    public static long glGetTextureHandleARB(@NativeType("GLuint") int texture) {
        long __functionAddress = GL.getICD().glGetTextureHandleARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, __functionAddress);
    }
    @Substitute
    public static long glGetTextureSamplerHandleARB(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler) {
        long __functionAddress = GL.getICD().glGetTextureSamplerHandleARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, sampler, __functionAddress);
    }
    @Substitute
    public static void glMakeTextureHandleResidentARB(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeTextureHandleResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static void glMakeTextureHandleNonResidentARB(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeTextureHandleNonResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static long glGetImageHandleARB(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int format) {
        long __functionAddress = GL.getICD().glGetImageHandleARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(texture, level, layered, layer, format, __functionAddress);
    }
    @Substitute
    public static void glMakeImageHandleResidentARB(@NativeType("GLuint64") long handle, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getICD().glMakeImageHandleResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, access, __functionAddress);
    }
    @Substitute
    public static void glMakeImageHandleNonResidentARB(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glMakeImageHandleNonResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(handle, __functionAddress);
    }
    @Substitute
    public static void glUniformHandleui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long value) {
        long __functionAddress = GL.getICD().glUniformHandleui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformHandleui64vARB(int location, int count, long values) {
        long __functionAddress = GL.getICD().glUniformHandleui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, values, __functionAddress);
    }
    @Substitute
    public static void glProgramUniformHandleui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long value) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniformHandleui64vARB(int program, int location, int count, long values) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, values, __functionAddress);
    }
    @Substitute
    public static boolean glIsTextureHandleResidentARB(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glIsTextureHandleResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(handle, __functionAddress);
    }
    @Substitute
    public static boolean glIsImageHandleResidentARB(@NativeType("GLuint64") long handle) {
        long __functionAddress = GL.getICD().glIsImageHandleResidentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(handle, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL1ui64ARB(@NativeType("GLuint") int index, @NativeType("GLuint64") long x) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64ARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(index, x, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL1ui64vARB(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribLui64vARB(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexProgram.class)
final class Target_org_lwjgl_opengl_ARBVertexProgram {
    @Substitute
    public static void nglProgramStringARB(int target, int format, int len, long string) {
        long __functionAddress = GL.getICD().glProgramStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, len, string, __functionAddress);
    }
    @Substitute
    public static void glBindProgramARB(@NativeType("GLenum") int target, @NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glBindProgramARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, program, __functionAddress);
    }
    @Substitute
    public static void nglDeleteProgramsARB(int n, long programs) {
        long __functionAddress = GL.getICD().glDeleteProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, programs, __functionAddress);
    }
    @Substitute
    public static void nglGenProgramsARB(int n, long programs) {
        long __functionAddress = GL.getICD().glGenProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, programs, __functionAddress);
    }
    @Substitute
    public static void glProgramEnvParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramEnvParameter4dvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void glProgramEnvParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramEnvParameter4fvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void glProgramLocalParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4dARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramLocalParameter4dvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void glProgramLocalParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4fARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramLocalParameter4fvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramEnvParameterfvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramEnvParameterdvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramLocalParameterfvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramLocalParameterdvARB(int target, int index, long params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramivARB(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetProgramivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramStringARB(int target, int pname, long string) {
        long __functionAddress = GL.getICD().glGetProgramStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, string, __functionAddress);
    }
    @Substitute
    public static boolean glIsProgramARB(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glIsProgramARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(program, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTWindowRectangles.class)
final class Target_org_lwjgl_opengl_EXTWindowRectangles {
    @Substitute
    public static void nglWindowRectanglesEXT(int mode, int count, long box) {
        long __functionAddress = GL.getICD().glWindowRectanglesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, box, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVVertexAttribInteger64bit.class)
final class Target_org_lwjgl_opengl_NVVertexAttribInteger64bit {
    @Substitute
    public static void glVertexAttribL1i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x) {
        long __functionAddress = GL.getICD().glVertexAttribL1i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL2i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        long __functionAddress = GL.getICD().glVertexAttribL2i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL3i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        long __functionAddress = GL.getICD().glVertexAttribL3i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL4i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        long __functionAddress = GL.getICD().glVertexAttribL4i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL1i64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL2i64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL3i64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL4i64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL1ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(index, x, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL2ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        long __functionAddress = GL.getICD().glVertexAttribL2ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL3ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        long __functionAddress = GL.getICD().glVertexAttribL3ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribL4ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        long __functionAddress = GL.getICD().glVertexAttribL4ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL1ui64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL2ui64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL3ui64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribL4ui64vNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttribL4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribLi64vNV(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLi64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribLui64vNV(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void glVertexAttribLFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexAttribLFormatNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, size, type, stride, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBClearTexture.class)
final class Target_org_lwjgl_opengl_ARBClearTexture {

}
@TargetClass(org.lwjgl.opengl.ARBShadingLanguageInclude.class)
final class Target_org_lwjgl_opengl_ARBShadingLanguageInclude {
    @Substitute
    public static void nglNamedStringARB(int type, int namelen, long name, int stringlen, long string) {
        long __functionAddress = GL.getICD().glNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(type, namelen, name, stringlen, string, __functionAddress);
    }
    @Substitute
    public static void nglDeleteNamedStringARB(int namelen, long name) {
        long __functionAddress = GL.getICD().glDeleteNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(namelen, name, __functionAddress);
    }
    @Substitute
    public static void nglCompileShaderIncludeARB(int shader, int count, long path, long length) {
        long __functionAddress = GL.getICD().glCompileShaderIncludeARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shader, count, path, length, __functionAddress);
    }
    @Substitute
    public static boolean nglIsNamedStringARB(int namelen, long name) {
        long __functionAddress = GL.getICD().glIsNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(namelen, name, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedStringARB(int namelen, long name, int bufSize, long stringlen, long string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(namelen, name, bufSize, stringlen, string, __functionAddress);
    }
    @Substitute
    public static void nglGetNamedStringivARB(int namelen, long name, int pname, long params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(namelen, name, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTCompiledVertexArray.class)
final class Target_org_lwjgl_opengl_EXTCompiledVertexArray {

    @Substitute
    public static void glLockArraysEXT(@NativeType("GLint") int first, @NativeType("GLsizei") int count) {
        long __functionAddress = GL.getICD().glLockArraysEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(first, count, __functionAddress);
    }
    @Substitute
    public static void glUnlockArraysEXT() {
        long __functionAddress = GL.getICD().glUnlockArraysEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTSemaphore.class)
final class Target_org_lwjgl_opengl_EXTSemaphore {
    @Substitute
    public static void nglGenSemaphoresEXT(int n, long semaphores) {
        long __functionAddress = GL.getICD().glGenSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, semaphores, __functionAddress);
    }
    @Substitute
    public static void nglDeleteSemaphoresEXT(int n, long semaphores) {
        long __functionAddress = GL.getICD().glDeleteSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, semaphores, __functionAddress);
    }
    @Substitute
    public static boolean glIsSemaphoreEXT(@NativeType("GLuint") int semaphore) {
        long __functionAddress = GL.getICD().glIsSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(semaphore, __functionAddress);
    }
    @Substitute
    public static void nglSemaphoreParameterui64vEXT(int semaphore, int pname, long params) {
        long __functionAddress = GL.getICD().glSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSemaphoreParameterui64vEXT(int semaphore, int pname, long params) {
        long __functionAddress = GL.getICD().glGetSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglWaitSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long srcLayouts) {
        long __functionAddress = GL.getICD().glWaitSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts, __functionAddress);
    }
    @Substitute
    public static void nglSignalSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long dstLayouts) {
        long __functionAddress = GL.getICD().glSignalSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTProvokingVertex.class)
final class Target_org_lwjgl_opengl_EXTProvokingVertex {

    @Substitute
    public static void glProvokingVertexEXT(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glProvokingVertexEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL14.class)
final class Target_org_lwjgl_opengl_GL14 {
    @Substitute
    public static void glFogCoordf(@NativeType("GLfloat") float coord) {
        long __functionAddress = GL.getICD().glFogCoordf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(coord, __functionAddress);
    }
    @Substitute
    public static void glFogCoordd(@NativeType("GLdouble") double coord) {
        long __functionAddress = GL.getICD().glFogCoordd;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(coord, __functionAddress);
    }
    @Substitute
    public static void nglFogCoordfv(long coord) {
        long __functionAddress = GL.getICD().glFogCoordfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, __functionAddress);
    }
    @Substitute
    public static void nglFogCoorddv(long coord) {
        long __functionAddress = GL.getICD().glFogCoorddv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(coord, __functionAddress);
    }
    @Substitute
    public static void nglFogCoordPointer(int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glFogCoordPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3b;
        if (CHECKS) {
            check(__functionAddress);
        }
        callBBBV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3ub;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3us;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCCCV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3ui;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3bv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3sv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3iv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3fv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3dv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3ubv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3ubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3usv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3usv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3uiv(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColorPointer(int size, int type, int stride, long pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        long __functionAddress = GL.getICD().glWindowPos2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        long __functionAddress = GL.getICD().glWindowPos2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        long __functionAddress = GL.getICD().glWindowPos2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void glWindowPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        long __functionAddress = GL.getICD().glWindowPos2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2iv(long p) {
        long __functionAddress = GL.getICD().glWindowPos2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2sv(long p) {
        long __functionAddress = GL.getICD().glWindowPos2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2fv(long p) {
        long __functionAddress = GL.getICD().glWindowPos2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos2dv(long p) {
        long __functionAddress = GL.getICD().glWindowPos2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        long __functionAddress = GL.getICD().glWindowPos3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        long __functionAddress = GL.getICD().glWindowPos3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        long __functionAddress = GL.getICD().glWindowPos3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void glWindowPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        long __functionAddress = GL.getICD().glWindowPos3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3iv(long p) {
        long __functionAddress = GL.getICD().glWindowPos3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3sv(long p) {
        long __functionAddress = GL.getICD().glWindowPos3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3fv(long p) {
        long __functionAddress = GL.getICD().glWindowPos3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
    @Substitute
    public static void nglWindowPos3dv(long p) {
        long __functionAddress = GL.getICD().glWindowPos3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(p, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexAttribBinding.class)
final class Target_org_lwjgl_opengl_ARBVertexAttribBinding {

    @Substitute
    public static void glVertexArrayBindVertexBufferEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glVertexArrayBindVertexBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(vaobj, bindingindex, buffer, offset, stride, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribFormatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, normalized, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribIFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribIFormatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribLFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribLFormatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexAttribBindingEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        long __functionAddress = GL.getICD().glVertexArrayVertexAttribBindingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, attribindex, bindingindex, __functionAddress);
    }
    @Substitute
    public static void glVertexArrayVertexBindingDivisorEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        long __functionAddress = GL.getICD().glVertexArrayVertexBindingDivisorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(vaobj, bindingindex, divisor, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBFramebufferObject.class)
final class Target_org_lwjgl_opengl_ARBFramebufferObject {

}
@TargetClass(org.lwjgl.opengl.GL15C.class)
final class Target_org_lwjgl_opengl_GL15C {
    @Substitute
    public static void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glBindBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, buffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteBuffers(int n, long buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, buffers, __functionAddress);
    }
    @Substitute
    public static void nglGenBuffers(int n, long buffers) {
        long __functionAddress = GL.getICD().glGenBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, buffers, __functionAddress);
    }
    @Substitute
    public static boolean glIsBuffer(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glIsBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(buffer, __functionAddress);
    }
    @Substitute
    public static void nglBufferData(int target, long size, long data, int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, size, data, usage, __functionAddress);
    }
    @Substitute
    public static void nglBufferSubData(int target, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferSubData(int target, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, size, data, __functionAddress);
    }
    @Substitute
    public static long nglMapBuffer(int target, int access) {
        long __functionAddress = GL.getICD().glMapBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(target, access, __functionAddress);
    }
    @Substitute
    public static boolean glUnmapBuffer(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glUnmapBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(target, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferPointerv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferPointerv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGenQueries(int n, long ids) {
        long __functionAddress = GL.getICD().glGenQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static void nglDeleteQueries(int n, long ids) {
        long __functionAddress = GL.getICD().glDeleteQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, ids, __functionAddress);
    }
    @Substitute
    public static boolean glIsQuery(@NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glIsQuery;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(id, __functionAddress);
    }
    @Substitute
    public static void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        long __functionAddress = GL.getICD().glBeginQuery;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, id, __functionAddress);
    }
    @Substitute
    public static void glEndQuery(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glEndQuery;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryiv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectiv(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetQueryObjectuiv(int id, int pname, long params) {
        long __functionAddress = GL.getICD().glGetQueryObjectuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(id, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVHalfFloat.class)
final class Target_org_lwjgl_opengl_NVHalfFloat {
    @Substitute
    public static void glVertex2hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y) {
        long __functionAddress = GL.getICD().glVertex2hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(x, y, __functionAddress);
    }
    @Substitute
    public static void nglVertex2hvNV(long v) {
        long __functionAddress = GL.getICD().glVertex2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glVertex3hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z) {
        long __functionAddress = GL.getICD().glVertex3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglVertex3hvNV(long v) {
        long __functionAddress = GL.getICD().glVertex3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glVertex4hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w) {
        long __functionAddress = GL.getICD().glVertex4hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertex4hvNV(long v) {
        long __functionAddress = GL.getICD().glVertex4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glNormal3hNV(@NativeType("GLhalfNV") short nx, @NativeType("GLhalfNV") short ny, @NativeType("GLhalfNV") short nz) {
        long __functionAddress = GL.getICD().glNormal3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(nx, ny, nz, __functionAddress);
    }
    @Substitute
    public static void nglNormal3hvNV(long v) {
        long __functionAddress = GL.getICD().glNormal3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue) {
        long __functionAddress = GL.getICD().glColor3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void nglColor3hvNV(long v) {
        long __functionAddress = GL.getICD().glColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glColor4hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue, @NativeType("GLhalfNV") short alpha) {
        long __functionAddress = GL.getICD().glColor4hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(red, green, blue, alpha, __functionAddress);
    }
    @Substitute
    public static void nglColor4hvNV(long v) {
        long __functionAddress = GL.getICD().glColor4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord1hNV(@NativeType("GLhalfNV") short s) {
        long __functionAddress = GL.getICD().glTexCoord1hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(s, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord1hvNV(long v) {
        long __functionAddress = GL.getICD().glTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord2hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t) {
        long __functionAddress = GL.getICD().glTexCoord2hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(s, t, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord2hvNV(long v) {
        long __functionAddress = GL.getICD().glTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord3hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r) {
        long __functionAddress = GL.getICD().glTexCoord3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(s, t, r, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord3hvNV(long v) {
        long __functionAddress = GL.getICD().glTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glTexCoord4hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q) {
        long __functionAddress = GL.getICD().glTexCoord4hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void nglTexCoord4hvNV(long v) {
        long __functionAddress = GL.getICD().glTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord1hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s) {
        long __functionAddress = GL.getICD().glMultiTexCoord1hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(target, s, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord1hvNV(int target, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord2hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t) {
        long __functionAddress = GL.getICD().glMultiTexCoord2hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(target, s, t, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord2hvNV(int target, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord3hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r) {
        long __functionAddress = GL.getICD().glMultiTexCoord3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(target, s, t, r, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord3hvNV(int target, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, v, __functionAddress);
    }
    @Substitute
    public static void glMultiTexCoord4hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q) {
        long __functionAddress = GL.getICD().glMultiTexCoord4hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(target, s, t, r, q, __functionAddress);
    }
    @Substitute
    public static void nglMultiTexCoord4hvNV(int target, long v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, v, __functionAddress);
    }
    @Substitute
    public static void glFogCoordhNV(@NativeType("GLhalfNV") short fog) {
        long __functionAddress = GL.getICD().glFogCoordhNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(fog, __functionAddress);
    }
    @Substitute
    public static void nglFogCoordhvNV(long fog) {
        long __functionAddress = GL.getICD().glFogCoordhvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fog, __functionAddress);
    }
    @Substitute
    public static void glSecondaryColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue) {
        long __functionAddress = GL.getICD().glSecondaryColor3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(red, green, blue, __functionAddress);
    }
    @Substitute
    public static void nglSecondaryColor3hvNV(long v) {
        long __functionAddress = GL.getICD().glSecondaryColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v, __functionAddress);
    }
    @Substitute
    public static void glVertexWeighthNV(@NativeType("GLhalfNV") short weight) {
        long __functionAddress = GL.getICD().glVertexWeighthNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(weight, __functionAddress);
    }
    @Substitute
    public static void nglVertexWeighthvNV(long weight) {
        long __functionAddress = GL.getICD().glVertexWeighthvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weight, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x) {
        long __functionAddress = GL.getICD().glVertexAttrib1hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(index, x, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1hvNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y) {
        long __functionAddress = GL.getICD().glVertexAttrib2hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(index, x, y, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2hvNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z) {
        long __functionAddress = GL.getICD().glVertexAttrib3hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(index, x, y, z, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3hvNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w) {
        long __functionAddress = GL.getICD().glVertexAttrib4hNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4hvNV(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribs1hvNV(int index, int n, long v) {
        long __functionAddress = GL.getICD().glVertexAttribs1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, n, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribs2hvNV(int index, int n, long v) {
        long __functionAddress = GL.getICD().glVertexAttribs2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, n, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribs3hvNV(int index, int n, long v) {
        long __functionAddress = GL.getICD().glVertexAttribs3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, n, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribs4hvNV(int index, int n, long v) {
        long __functionAddress = GL.getICD().glVertexAttribs4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, n, v, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBShaderImageLoadStore.class)
final class Target_org_lwjgl_opengl_ARBShaderImageLoadStore {

}
@TargetClass(org.lwjgl.opengl.GL20C.class)
final class Target_org_lwjgl_opengl_GL20C {
    @Substitute
    public static int glCreateProgram() {
        long __functionAddress = GL.getICD().glCreateProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }
    @Substitute
    public static void glDeleteProgram(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glDeleteProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, __functionAddress);
    }
    @Substitute
    public static boolean glIsProgram(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glIsProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(program, __functionAddress);
    }
    @Substitute
    public static int glCreateShader(@NativeType("GLenum") int type) {
        long __functionAddress = GL.getICD().glCreateShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(type, __functionAddress);
    }
    @Substitute
    public static void glDeleteShader(@NativeType("GLuint") int shader) {
        long __functionAddress = GL.getICD().glDeleteShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(shader, __functionAddress);
    }
    @Substitute
    public static boolean glIsShader(@NativeType("GLuint") int shader) {
        long __functionAddress = GL.getICD().glIsShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(shader, __functionAddress);
    }
    @Substitute
    public static void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        long __functionAddress = GL.getICD().glAttachShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, shader, __functionAddress);
    }
    @Substitute
    public static void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        long __functionAddress = GL.getICD().glDetachShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, shader, __functionAddress);
    }
    @Substitute
    public static void nglShaderSource(int shader, int count, long strings, long length) {
        long __functionAddress = GL.getICD().glShaderSource;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shader, count, strings, length, __functionAddress);
    }
    @Substitute
    public static void glCompileShader(@NativeType("GLuint") int shader) {
        long __functionAddress = GL.getICD().glCompileShader;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(shader, __functionAddress);
    }
    @Substitute
    public static void glLinkProgram(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glLinkProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, __functionAddress);
    }
    @Substitute
    public static void glUseProgram(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glUseProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, __functionAddress);
    }
    @Substitute
    public static void glValidateProgram(@NativeType("GLuint") int program) {
        long __functionAddress = GL.getICD().glValidateProgram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, __functionAddress);
    }
    @Substitute
    public static void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        long __functionAddress = GL.getICD().glUniform1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        long __functionAddress = GL.getICD().glUniform2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glUniform3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        long __functionAddress = GL.getICD().glUniform4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0) {
        long __functionAddress = GL.getICD().glUniform1i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, __functionAddress);
    }
    @Substitute
    public static void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        long __functionAddress = GL.getICD().glUniform2i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        long __functionAddress = GL.getICD().glUniform3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        long __functionAddress = GL.getICD().glUniform4i;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(location, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void nglUniform1fv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2fv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3fv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4fv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform1iv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2iv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3iv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4iv(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglGetShaderiv(int shader, int pname, long params) {
        long __functionAddress = GL.getICD().glGetShaderiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(shader, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramiv(int program, int pname, long params) {
        long __functionAddress = GL.getICD().glGetProgramiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        long __functionAddress = GL.getICD().glGetShaderInfoLog;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shader, maxLength, length, infoLog, __functionAddress);
    }
    @Substitute
    public static void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        long __functionAddress = GL.getICD().glGetProgramInfoLog;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, maxLength, length, infoLog, __functionAddress);
    }
    @Substitute
    public static void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        long __functionAddress = GL.getICD().glGetAttachedShaders;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, maxCount, count, shaders, __functionAddress);
    }
    @Substitute
    public static int nglGetUniformLocation(int program, long name) {
        long __functionAddress = GL.getICD().glGetUniformLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetActiveUniform;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(program, index, maxLength, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformfv(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformiv(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        long __functionAddress = GL.getICD().glGetShaderSource;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shader, maxLength, length, source, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        long __functionAddress = GL.getICD().glVertexAttrib1d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        long __functionAddress = GL.getICD().glVertexAttrib2d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        long __functionAddress = GL.getICD().glVertexAttrib3d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4f;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4s;
        if (CHECKS) {
            check(__functionAddress);
        }
        callSSSSV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        long __functionAddress = GL.getICD().glVertexAttrib4d;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, v0, v1, v2, v3, __functionAddress);
    }
    @Substitute
    public static void glVertexAttrib4Nub(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nub;
        if (CHECKS) {
            check(__functionAddress);
        }
        callUUUUV(index, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1fv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1sv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib1dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2fv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2sv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib2dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3fv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3sv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib3dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4fv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4sv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4sv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4dv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4iv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4bv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4bv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4ubv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4ubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4usv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4usv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4uiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Nbv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nbv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Nsv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nsv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Niv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Niv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Nubv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nubv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Nusv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nusv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttrib4Nuiv(int index, long v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v, __functionAddress);
    }
    @Substitute
    public static void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        long __functionAddress = GL.getICD().glVertexAttribPointer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, normalized, stride, pointer, __functionAddress);
    }
    @Substitute
    public static void glEnableVertexAttribArray(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glEnableVertexAttribArray;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void glDisableVertexAttribArray(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glDisableVertexAttribArray;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void nglBindAttribLocation(int program, int index, long name) {
        long __functionAddress = GL.getICD().glBindAttribLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, index, name, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        long __functionAddress = GL.getICD().glGetActiveAttrib;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(program, index, maxLength, length, size, type, name, __functionAddress);
    }
    @Substitute
    public static int nglGetAttribLocation(int program, long name) {
        long __functionAddress = GL.getICD().glGetAttribLocation;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, name, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribiv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribfv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribdv(int index, int pname, long params) {
        long __functionAddress = GL.getICD().glGetVertexAttribdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        long __functionAddress = GL.getICD().glGetVertexAttribPointerv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, pname, pointer, __functionAddress);
    }
    @Substitute
    public static void nglDrawBuffers(int n, long bufs) {
        long __functionAddress = GL.getICD().glDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, bufs, __functionAddress);
    }
    @Substitute
    public static void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        long __functionAddress = GL.getICD().glBlendEquationSeparate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(modeRGB, modeAlpha, __functionAddress);
    }
    @Substitute
    public static void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        long __functionAddress = GL.getICD().glStencilOpSeparate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, sfail, dpfail, dppass, __functionAddress);
    }
    @Substitute
    public static void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilFuncSeparate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, func, ref, mask, __functionAddress);
    }
    @Substitute
    public static void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask) {
        long __functionAddress = GL.getICD().glStencilMaskSeparate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(face, mask, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBTextureStorageMultisample.class)
final class Target_org_lwjgl_opengl_ARBTextureStorageMultisample {

    @Substitute
    public static void glTextureStorage2DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTextureStorage2DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void glTextureStorage3DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTextureStorage3DMultisampleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBVertexBufferObject.class)
final class Target_org_lwjgl_opengl_ARBVertexBufferObject {
    @Substitute
    public static void glBindBufferARB(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glBindBufferARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, buffer, __functionAddress);
    }
    @Substitute
    public static void nglDeleteBuffersARB(int n, long buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, buffers, __functionAddress);
    }
    @Substitute
    public static void nglGenBuffersARB(int n, long buffers) {
        long __functionAddress = GL.getICD().glGenBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, buffers, __functionAddress);
    }
    @Substitute
    public static boolean glIsBufferARB(@NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glIsBufferARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(buffer, __functionAddress);
    }
    @Substitute
    public static void nglBufferDataARB(int target, long size, long data, int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, size, data, usage, __functionAddress);
    }
    @Substitute
    public static void nglBufferSubDataARB(int target, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, size, data, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferSubDataARB(int target, long offset, long size, long data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, size, data, __functionAddress);
    }
    @Substitute
    public static long nglMapBufferARB(int target, int access) {
        long __functionAddress = GL.getICD().glMapBufferARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(target, access, __functionAddress);
    }
    @Substitute
    public static boolean glUnmapBufferARB(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glUnmapBufferARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(target, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferParameterivARB(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferParameterivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetBufferPointervARB(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferPointervARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GREMEDYStringMarker.class)
final class Target_org_lwjgl_opengl_GREMEDYStringMarker {
    @Substitute
    public static void nglStringMarkerGREMEDY(int len, long string) {
        long __functionAddress = GL.getICD().glStringMarkerGREMEDY;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(len, string, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.NVCopyImage.class)
final class Target_org_lwjgl_opengl_NVCopyImage {

    @Substitute
    public static void glCopyImageSubDataNV(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getICD().glCopyImageSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBInvalidateSubdata.class)
final class Target_org_lwjgl_opengl_ARBInvalidateSubdata {

}
@TargetClass(org.lwjgl.opengl.GL32C.class)
final class Target_org_lwjgl_opengl_GL32C {
    @Substitute
    public static void nglGetBufferParameteri64v(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        long __functionAddress = GL.getICD().glDrawElementsBaseVertex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, basevertex, __functionAddress);
    }
    @Substitute
    public static void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        long __functionAddress = GL.getICD().glDrawRangeElementsBaseVertex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, start, end, count, type, indices, basevertex, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        long __functionAddress = GL.getICD().glDrawElementsInstancedBaseVertex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, basevertex, __functionAddress);
    }
    @Substitute
    public static void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int drawcount, long basevertex) {
        long __functionAddress = GL.getICD().glMultiDrawElementsBaseVertex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(mode, count, type, indices, drawcount, basevertex, __functionAddress);
    }
    @Substitute
    public static void glProvokingVertex(@NativeType("GLenum") int mode) {
        long __functionAddress = GL.getICD().glProvokingVertex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, __functionAddress);
    }
    @Substitute
    public static void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTexImage2DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glTexImage3DMultisample;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
    }
    @Substitute
    public static void nglGetMultisamplefv(int pname, int index, long val) {
        long __functionAddress = GL.getICD().glGetMultisamplefv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, val, __functionAddress);
    }
    @Substitute
    public static void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        long __functionAddress = GL.getICD().glSampleMaski;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, mask, __functionAddress);
    }
    @Substitute
    public static void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        long __functionAddress = GL.getICD().glFramebufferTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, attachment, texture, level, __functionAddress);
    }
    @Substitute
    public static long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glFenceSync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(condition, flags, __functionAddress);
    }

    @Substitute
    @NativeType("GLboolean")
    public static boolean glIsSync(@NativeType("GLsync") long sync) {
        long __functionAddress = GL.getICD().glIsSync;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPZ(sync, __functionAddress);
    }

    @Substitute
    public static void glDeleteSync(@NativeType("GLsync") long sync) {
        long __functionAddress = GL.getICD().glDeleteSync;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        callPV(sync, __functionAddress);
    }

    @Substitute
    @NativeType("GLenum")
    public static int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        long __functionAddress = GL.getICD().glClientWaitSync;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPJI(sync, flags, timeout, __functionAddress);
    }


    @Substitute
    public static void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        long __functionAddress = GL.getICD().glWaitSync;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        callPJV(sync, flags, timeout, __functionAddress);
    }
    @Substitute
    public static void nglGetInteger64v(int pname, long params) {
        long __functionAddress = GL.getICD().glGetInteger64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetInteger64i_v(int pname, int index, long params) {
        long __functionAddress = GL.getICD().glGetInteger64i_v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pname, index, params, __functionAddress);
    }
    @Substitute
    public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        long __functionAddress = GL.getICD().glGetSynciv;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        callPPPV(sync, pname, bufSize, length, values, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTPolygonOffsetClamp.class)
final class Target_org_lwjgl_opengl_EXTPolygonOffsetClamp {

    @Substitute
    public static void glPolygonOffsetClampEXT(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp) {
        long __functionAddress = GL.getICD().glPolygonOffsetClampEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(factor, units, clamp, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBDrawInstanced.class)
final class Target_org_lwjgl_opengl_ARBDrawInstanced {
    @Substitute
    public static void glDrawArraysInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        long __functionAddress = GL.getICD().glDrawArraysInstancedARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, first, count, primcount, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstancedARB(int mode, int count, int type, long indices, int primcount) {
        long __functionAddress = GL.getICD().glDrawElementsInstancedARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL40.class)
final class Target_org_lwjgl_opengl_GL40 {

}
@TargetClass(org.lwjgl.opengl.NVFragmentCoverageToColor.class)
final class Target_org_lwjgl_opengl_NVFragmentCoverageToColor {

    @Substitute
    public static void glFragmentCoverageColorNV(@NativeType("GLuint") int color) {
        long __functionAddress = GL.getICD().glFragmentCoverageColorNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(color, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTRasterMultisample.class)
final class Target_org_lwjgl_opengl_EXTRasterMultisample {

    @Substitute
    public static void glRasterSamplesEXT(@NativeType("GLuint") int samples, @NativeType("GLboolean") boolean fixedsamplelocations) {
        long __functionAddress = GL.getICD().glRasterSamplesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(samples, fixedsamplelocations, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL31C.class)
final class Target_org_lwjgl_opengl_GL31C {
    @Substitute
    public static void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        long __functionAddress = GL.getICD().glDrawArraysInstanced;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, first, count, primcount, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        long __functionAddress = GL.getICD().glDrawElementsInstanced;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, __functionAddress);
    }
    @Substitute
    public static void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getICD().glCopyBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(readTarget, writeTarget, readOffset, writeOffset, size, __functionAddress);
    }
    @Substitute
    public static void glPrimitiveRestartIndex(@NativeType("GLuint") int index) {
        long __functionAddress = GL.getICD().glPrimitiveRestartIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, __functionAddress);
    }
    @Substitute
    public static void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        long __functionAddress = GL.getICD().glTexBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, buffer, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        long __functionAddress = GL.getICD().glGetUniformIndices;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, uniformCount, uniformNames, uniformIndices, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        long __functionAddress = GL.getICD().glGetActiveUniformsiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, uniformCount, uniformIndices, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
        long __functionAddress = GL.getICD().glGetActiveUniformName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, uniformIndex, bufSize, length, uniformName, __functionAddress);
    }
    @Substitute
    public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        long __functionAddress = GL.getICD().glGetUniformBlockIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(program, uniformBlockName, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, uniformBlockIndex, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockName;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(program, uniformBlockIndex, bufSize, length, uniformBlockName, __functionAddress);
    }
    @Substitute
    public static void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding) {
        long __functionAddress = GL.getICD().glUniformBlockBinding;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(program, uniformBlockIndex, uniformBlockBinding, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBPolygonOffsetClamp.class)
final class Target_org_lwjgl_opengl_ARBPolygonOffsetClamp {

}
@TargetClass(org.lwjgl.opengl.NVGPUShader5.class)
final class Target_org_lwjgl_opengl_NVGPUShader5 {
    @Substitute
    public static void glUniform1i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        long __functionAddress = GL.getICD().glUniform1i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, x, __functionAddress);
    }
    @Substitute
    public static void glUniform2i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        long __functionAddress = GL.getICD().glUniform2i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(location, x, y, __functionAddress);
    }
    @Substitute
    public static void glUniform3i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        long __functionAddress = GL.getICD().glUniform3i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glUniform4i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        long __functionAddress = GL.getICD().glUniform4i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglUniform1i64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2i64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3i64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4i64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void glUniform1ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        long __functionAddress = GL.getICD().glUniform1ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(location, x, __functionAddress);
    }
    @Substitute
    public static void glUniform2ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        long __functionAddress = GL.getICD().glUniform2ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(location, x, y, __functionAddress);
    }
    @Substitute
    public static void glUniform3ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        long __functionAddress = GL.getICD().glUniform3ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glUniform4ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        long __functionAddress = GL.getICD().glUniform4ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglUniform1ui64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform2ui64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform3ui64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglUniform4ui64vNV(int location, int count, long value) {
        long __functionAddress = GL.getICD().glUniform4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglGetUniformi64vNV(int program, int location, long params) {
        long __functionAddress = GL.getICD().glGetUniformi64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        long __functionAddress = GL.getICD().glProgramUniform1i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        long __functionAddress = GL.getICD().glProgramUniform2i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        long __functionAddress = GL.getICD().glProgramUniform3i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        long __functionAddress = GL.getICD().glProgramUniform4i64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform1ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJV(program, location, x, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform2ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJV(program, location, x, y, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform3ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJV(program, location, x, y, z, __functionAddress);
    }
    @Substitute
    public static void glProgramUniform4ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJJJJV(program, location, x, y, z, w, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
    @Substitute
    public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, count, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL21C.class)
final class Target_org_lwjgl_opengl_GL21C {
    @Substitute
    public static void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
    @Substitute
    public static void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, count, transpose, value, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.KHRParallelShaderCompile.class)
final class Target_org_lwjgl_opengl_KHRParallelShaderCompile {

    @Substitute
    public static void glMaxShaderCompilerThreadsKHR(@NativeType("GLuint") int count) {
        long __functionAddress = GL.getICD().glMaxShaderCompilerThreadsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(count, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.GL46.class)
final class Target_org_lwjgl_opengl_GL46 {

}
@TargetClass(org.lwjgl.opengl.ARBGetProgramBinary.class)
final class Target_org_lwjgl_opengl_ARBGetProgramBinary {

}
@TargetClass(org.lwjgl.opengl.NVFence.class)
final class Target_org_lwjgl_opengl_NVFence {
    @Substitute
    public static void nglDeleteFencesNV(int n, long fences) {
        long __functionAddress = GL.getICD().glDeleteFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, fences, __functionAddress);
    }
    @Substitute
    public static void nglGenFencesNV(int n, long fences) {
        long __functionAddress = GL.getICD().glGenFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(n, fences, __functionAddress);
    }
    @Substitute
    public static boolean glIsFenceNV(@NativeType("GLuint") int fence) {
        long __functionAddress = GL.getICD().glIsFenceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(fence, __functionAddress);
    }
    @Substitute
    public static boolean glTestFenceNV(@NativeType("GLuint") int fence) {
        long __functionAddress = GL.getICD().glTestFenceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(fence, __functionAddress);
    }
    @Substitute
    public static void nglGetFenceivNV(int fence, int pname, long params) {
        long __functionAddress = GL.getICD().glGetFenceivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fence, pname, params, __functionAddress);
    }
    @Substitute
    public static void glFinishFenceNV(@NativeType("GLuint") int fence) {
        long __functionAddress = GL.getICD().glFinishFenceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fence, __functionAddress);
    }
    @Substitute
    public static void glSetFenceNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int condition) {
        long __functionAddress = GL.getICD().glSetFenceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fence, condition, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBSparseTexture.class)
final class Target_org_lwjgl_opengl_ARBSparseTexture {

    @Substitute
    public static void glTexPageCommitmentARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glTexPageCommitmentARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, level, xoffset, yoffset, zoffset, width, height, depth, commit, __functionAddress);
    }
    @Substitute
    public static void glTexturePageCommitmentEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean commit) {
        long __functionAddress = GL.getICD().glTexturePageCommitmentEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(texture, level, xoffset, yoffset, zoffset, width, height, depth, commit, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.EXTDrawInstanced.class)
final class Target_org_lwjgl_opengl_EXTDrawInstanced {
    @Substitute
    public static void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        long __functionAddress = GL.getICD().glDrawArraysInstancedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(mode, start, count, primcount, __functionAddress);
    }
    @Substitute
    public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
        long __functionAddress = GL.getICD().glDrawElementsInstancedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, count, type, indices, primcount, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBImaging.class)
final class Target_org_lwjgl_opengl_ARBImaging {
    @Substitute
    public static void nglColorTable(int target, int internalformat, int width, int format, int type, long table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }
    @Substitute
    public static void glCopyColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, x, y, width, __functionAddress);
    }
    @Substitute
    public static void nglColorTableParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglColorTableParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetColorTable(int target, int format, int type, long table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }
    @Substitute
    public static void nglGetColorTableParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetColorTableParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglColorSubTable(int target, int start, int count, int format, int type, long data) {
        long __functionAddress = GL.getICD().glColorSubTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, count, format, type, data, __functionAddress);
    }
    @Substitute
    public static void glCopyColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyColorSubTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, start, x, y, width, __functionAddress);
    }
    @Substitute
    public static void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data) {
        long __functionAddress = GL.getICD().glConvolutionFilter1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, data, __functionAddress);
    }
    @Substitute
    public static void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data) {
        long __functionAddress = GL.getICD().glConvolutionFilter2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, height, format, type, data, __functionAddress);
    }
    @Substitute
    public static void glCopyConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        long __functionAddress = GL.getICD().glCopyConvolutionFilter1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, x, y, width, __functionAddress);
    }
    @Substitute
    public static void glCopyConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glCopyConvolutionFilter2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, x, y, width, height, __functionAddress);
    }
    @Substitute
    public static void nglGetConvolutionFilter(int target, int format, int type, long image) {
        long __functionAddress = GL.getICD().glGetConvolutionFilter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, image, __functionAddress);
    }
    @Substitute
    public static void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column) {
        long __functionAddress = GL.getICD().glSeparableFilter2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, internalformat, width, height, format, type, row, column, __functionAddress);
    }
    @Substitute
    public static void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span) {
        long __functionAddress = GL.getICD().glGetSeparableFilter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, format, type, row, column, span, __functionAddress);
    }
    @Substitute
    public static void glConvolutionParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        long __functionAddress = GL.getICD().glConvolutionParameteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglConvolutionParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glConvolutionParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        long __functionAddress = GL.getICD().glConvolutionParameterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, pname, param, __functionAddress);
    }
    @Substitute
    public static void nglConvolutionParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetConvolutionParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetConvolutionParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glHistogram(@NativeType("GLenum") int target, @NativeType("GLsizei") int width, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink) {
        long __functionAddress = GL.getICD().glHistogram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, width, internalformat, sink, __functionAddress);
    }
    @Substitute
    public static void glResetHistogram(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glResetHistogram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void nglGetHistogram(int target, boolean reset, int format, int type, long values) {
        long __functionAddress = GL.getICD().glGetHistogram;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, values, __functionAddress);
    }
    @Substitute
    public static void nglGetHistogramParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetHistogramParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetHistogramParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetHistogramParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void glMinmax(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink) {
        long __functionAddress = GL.getICD().glMinmax;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, internalformat, sink, __functionAddress);
    }
    @Substitute
    public static void glResetMinmax(@NativeType("GLenum") int target) {
        long __functionAddress = GL.getICD().glResetMinmax;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(target, __functionAddress);
    }
    @Substitute
    public static void nglGetMinmax(int target, boolean reset, int format, int type, long values) {
        long __functionAddress = GL.getICD().glGetMinmax;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, reset, format, type, values, __functionAddress);
    }
    @Substitute
    public static void nglGetMinmaxParameteriv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
    @Substitute
    public static void nglGetMinmaxParameterfv(int target, int pname, long params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, pname, params, __functionAddress);
    }
}
@TargetClass(org.lwjgl.opengl.ARBSync.class)
final class Target_org_lwjgl_opengl_ARBSync {

}
@TargetClass(org.lwjgl.opengl.NVClipSpaceWScaling.class)
final class Target_org_lwjgl_opengl_NVClipSpaceWScaling {

    @Substitute
    public static void glViewportPositionWScaleNV(@NativeType("GLuint") int index, @NativeType("GLfloat") float xcoeff, @NativeType("GLfloat") float ycoeff) {
        long __functionAddress = GL.getICD().glViewportPositionWScaleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(index, xcoeff, ycoeff, __functionAddress);
    }
}



/** Dummy class with the file's name. */
public class Lwjgl3NativeSubstitutions {
}
