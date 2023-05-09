// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_olympus_makernotes_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_olympus_makernotes_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_olympus_makernotes_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_olympus_makernotes_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_olympus_makernotes_t position(long position) {
          return (libraw_olympus_makernotes_t)super.position(position);
      }
      @Override public libraw_olympus_makernotes_t getPointer(long i) {
          return new libraw_olympus_makernotes_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("char") byte CameraType2(int i); public native libraw_olympus_makernotes_t CameraType2(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer CameraType2();
    public native @Cast("ushort") short ValidBits(); public native libraw_olympus_makernotes_t ValidBits(short setter);
    public native int SensorCalibration(int i); public native libraw_olympus_makernotes_t SensorCalibration(int i, int setter);
    @MemberGetter public native IntPointer SensorCalibration();
    public native @Cast("ushort") short DriveMode(int i); public native libraw_olympus_makernotes_t DriveMode(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer DriveMode();
    public native @Cast("ushort") short ColorSpace(); public native libraw_olympus_makernotes_t ColorSpace(short setter);
    public native @Cast("ushort") short FocusMode(int i); public native libraw_olympus_makernotes_t FocusMode(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer FocusMode();
    public native @Cast("ushort") short AutoFocus(); public native libraw_olympus_makernotes_t AutoFocus(short setter);
    public native @Cast("ushort") short AFPoint(); public native libraw_olympus_makernotes_t AFPoint(short setter);
    public native @Cast("unsigned") int AFAreas(int i); public native libraw_olympus_makernotes_t AFAreas(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer AFAreas();
    public native double AFPointSelected(int i); public native libraw_olympus_makernotes_t AFPointSelected(int i, double setter);
    @MemberGetter public native DoublePointer AFPointSelected();
    public native @Cast("ushort") short AFResult(); public native libraw_olympus_makernotes_t AFResult(short setter);
    public native @Cast("uchar") byte AFFineTune(); public native libraw_olympus_makernotes_t AFFineTune(byte setter);
    public native short AFFineTuneAdj(int i); public native libraw_olympus_makernotes_t AFFineTuneAdj(int i, short setter);
    @MemberGetter public native ShortPointer AFFineTuneAdj();
    public native @Cast("unsigned") int SpecialMode(int i); public native libraw_olympus_makernotes_t SpecialMode(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer SpecialMode();
    public native @Cast("ushort") short ZoomStepCount(); public native libraw_olympus_makernotes_t ZoomStepCount(short setter);
    public native @Cast("ushort") short FocusStepCount(); public native libraw_olympus_makernotes_t FocusStepCount(short setter);
    public native @Cast("ushort") short FocusStepInfinity(); public native libraw_olympus_makernotes_t FocusStepInfinity(short setter);
    public native @Cast("ushort") short FocusStepNear(); public native libraw_olympus_makernotes_t FocusStepNear(short setter);
    public native double FocusDistance(); public native libraw_olympus_makernotes_t FocusDistance(double setter);
    public native @Cast("ushort") short AspectFrame(int i); public native libraw_olympus_makernotes_t AspectFrame(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer AspectFrame(); // left, top, width, height
    public native @Cast("unsigned") int StackedImage(int i); public native libraw_olympus_makernotes_t StackedImage(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer StackedImage();
    public native @Cast("uchar") byte isLiveND(); public native libraw_olympus_makernotes_t isLiveND(byte setter);
    public native @Cast("unsigned") int LiveNDfactor(); public native libraw_olympus_makernotes_t LiveNDfactor(int setter);
    public native @Cast("ushort") short Panorama_mode(); public native libraw_olympus_makernotes_t Panorama_mode(short setter);
    public native @Cast("ushort") short Panorama_frameNum(); public native libraw_olympus_makernotes_t Panorama_frameNum(short setter);
  }
