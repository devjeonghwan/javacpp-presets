// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


/**
 * this class used to be called ARParam in the classical ARToolkit
 * so do not wonder because of the method names
 */
@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class Camera extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Camera(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Camera(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Camera position(long position) {
        return (Camera)super.position(position);
    }
    @Override public Camera getPointer(long i) {
        return new Camera((Pointer)this).offsetAddress(i);
    }

    public Camera() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native int xsize(); public native Camera xsize(int setter);
    public native int ysize(); public native Camera ysize(int setter);
    // http://www.vision.caltech.edu/bouguetj/calib_doc/htmls/parameters.html
    public native @Cast("ARFloat") float mat(int i, int j); public native Camera mat(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer mat();
    public native @Cast("ARFloat") float kc(int i); public native Camera kc(int i, float setter);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer kc();

    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") FloatPointer ix, @Cast("ARFloat*") FloatPointer iy);
    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") FloatBuffer ix, @Cast("ARFloat*") FloatBuffer iy);
    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") float[] ix, @Cast("ARFloat*") float[] iy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") FloatPointer ox, @Cast("ARFloat*") FloatPointer oy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") FloatBuffer ox, @Cast("ARFloat*") FloatBuffer oy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") float[] ox, @Cast("ARFloat*") float[] oy);
    public native @Cast("bool") boolean loadFromFile(@StdString BytePointer filename);
    public native @Cast("bool") boolean loadFromFile(@StdString String filename);
    public native Camera clone();
    public native @Cast("bool") boolean changeFrameSize(int frameWidth, int frameHeight);
    public native void printSettings();
    public native @StdString BytePointer getFileName();
}
