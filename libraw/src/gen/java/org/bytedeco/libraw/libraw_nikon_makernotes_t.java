// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_nikon_makernotes_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_nikon_makernotes_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_nikon_makernotes_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_nikon_makernotes_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_nikon_makernotes_t position(long position) {
          return (libraw_nikon_makernotes_t)super.position(position);
      }
      @Override public libraw_nikon_makernotes_t getPointer(long i) {
          return new libraw_nikon_makernotes_t((Pointer)this).offsetAddress(i);
      }
  
    public native double ExposureBracketValue(); public native libraw_nikon_makernotes_t ExposureBracketValue(double setter);
    public native @Cast("ushort") short ActiveDLighting(); public native libraw_nikon_makernotes_t ActiveDLighting(short setter);
    public native @Cast("ushort") short ShootingMode(); public native libraw_nikon_makernotes_t ShootingMode(short setter);
    /* stabilization */
    public native @Cast("uchar") byte ImageStabilization(int i); public native libraw_nikon_makernotes_t ImageStabilization(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer ImageStabilization();
    public native @Cast("uchar") byte VibrationReduction(); public native libraw_nikon_makernotes_t VibrationReduction(byte setter);
    public native @Cast("uchar") byte VRMode(); public native libraw_nikon_makernotes_t VRMode(byte setter);
    /* flash */
    public native @Cast("char") byte FlashSetting(int i); public native libraw_nikon_makernotes_t FlashSetting(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer FlashSetting();
    public native @Cast("char") byte FlashType(int i); public native libraw_nikon_makernotes_t FlashType(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer FlashType();
    public native @Cast("uchar") byte FlashExposureCompensation(int i); public native libraw_nikon_makernotes_t FlashExposureCompensation(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer FlashExposureCompensation();
    public native @Cast("uchar") byte ExternalFlashExposureComp(int i); public native libraw_nikon_makernotes_t ExternalFlashExposureComp(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer ExternalFlashExposureComp();
    public native @Cast("uchar") byte FlashExposureBracketValue(int i); public native libraw_nikon_makernotes_t FlashExposureBracketValue(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer FlashExposureBracketValue();
    public native @Cast("uchar") byte FlashMode(); public native libraw_nikon_makernotes_t FlashMode(byte setter);
    public native byte FlashExposureCompensation2(); public native libraw_nikon_makernotes_t FlashExposureCompensation2(byte setter);
    public native byte FlashExposureCompensation3(); public native libraw_nikon_makernotes_t FlashExposureCompensation3(byte setter);
    public native byte FlashExposureCompensation4(); public native libraw_nikon_makernotes_t FlashExposureCompensation4(byte setter);
    public native @Cast("uchar") byte FlashSource(); public native libraw_nikon_makernotes_t FlashSource(byte setter);
    public native @Cast("uchar") byte FlashFirmware(int i); public native libraw_nikon_makernotes_t FlashFirmware(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer FlashFirmware();
    public native @Cast("uchar") byte ExternalFlashFlags(); public native libraw_nikon_makernotes_t ExternalFlashFlags(byte setter);
    public native @Cast("uchar") byte FlashControlCommanderMode(); public native libraw_nikon_makernotes_t FlashControlCommanderMode(byte setter);
    public native @Cast("uchar") byte FlashOutputAndCompensation(); public native libraw_nikon_makernotes_t FlashOutputAndCompensation(byte setter);
    public native @Cast("uchar") byte FlashFocalLength(); public native libraw_nikon_makernotes_t FlashFocalLength(byte setter);
    public native @Cast("uchar") byte FlashGNDistance(); public native libraw_nikon_makernotes_t FlashGNDistance(byte setter);
    public native @Cast("uchar") byte FlashGroupControlMode(int i); public native libraw_nikon_makernotes_t FlashGroupControlMode(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer FlashGroupControlMode();
    public native @Cast("uchar") byte FlashGroupOutputAndCompensation(int i); public native libraw_nikon_makernotes_t FlashGroupOutputAndCompensation(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer FlashGroupOutputAndCompensation();
    public native @Cast("uchar") byte FlashColorFilter(); public native libraw_nikon_makernotes_t FlashColorFilter(byte setter);

/* NEF compression, comments follow those for ExifTool tag 0x0093:
	 1: Lossy (type 1)
	 2: Uncompressed
	 3: Lossless
	 4: Lossy (type 2)
	 5: Striped packed 12-bit
	 6: Uncompressed (14-bit reduced to 12-bit)
	 7: Unpacked 12-bit
	 8: Small raw
	 9: Packed 12-bit
	10: Packed 14-bit
	13: High Efficiency  (HE)
	14: High Efficiency* (HE*)
*/
    public native @Cast("ushort") short NEFCompression(); public native libraw_nikon_makernotes_t NEFCompression(short setter);

    public native int ExposureMode(); public native libraw_nikon_makernotes_t ExposureMode(int setter);
    public native int ExposureProgram(); public native libraw_nikon_makernotes_t ExposureProgram(int setter);
    public native int nMEshots(); public native libraw_nikon_makernotes_t nMEshots(int setter);
    public native int MEgainOn(); public native libraw_nikon_makernotes_t MEgainOn(int setter);
    public native double ME_WB(int i); public native libraw_nikon_makernotes_t ME_WB(int i, double setter);
    @MemberGetter public native DoublePointer ME_WB();
    public native @Cast("uchar") byte AFFineTune(); public native libraw_nikon_makernotes_t AFFineTune(byte setter);
    public native @Cast("uchar") byte AFFineTuneIndex(); public native libraw_nikon_makernotes_t AFFineTuneIndex(byte setter);
    
    public native @Cast("unsigned") int LensDataVersion(); public native libraw_nikon_makernotes_t LensDataVersion(int setter);
    public native @Cast("unsigned") int FlashInfoVersion(); public native libraw_nikon_makernotes_t FlashInfoVersion(int setter);
    public native @Cast("unsigned") int ColorBalanceVersion(); public native libraw_nikon_makernotes_t ColorBalanceVersion(int setter);
    public native @Cast("uchar") byte key(); public native libraw_nikon_makernotes_t key(byte setter);
    public native @Cast("ushort") short NEFBitDepth(int i); public native libraw_nikon_makernotes_t NEFBitDepth(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer NEFBitDepth();
    public native @Cast("ushort") short HighSpeedCropFormat(); public native libraw_nikon_makernotes_t HighSpeedCropFormat(short setter); /* 1 -> 1.3x; 2 -> DX; 3 -> 5:4; 4 -> 3:2; 6 ->
                                   16:9; 11 -> FX uncropped; 12 -> DX uncropped;
                                   17 -> 1:1 */
    public native @ByRef libraw_sensor_highspeed_crop_t SensorHighSpeedCrop(); public native libraw_nikon_makernotes_t SensorHighSpeedCrop(libraw_sensor_highspeed_crop_t setter);
    public native @Cast("ushort") short SensorWidth(); public native libraw_nikon_makernotes_t SensorWidth(short setter);
    public native @Cast("ushort") short SensorHeight(); public native libraw_nikon_makernotes_t SensorHeight(short setter);
    public native @Cast("ushort") short Active_D_Lighting(); public native libraw_nikon_makernotes_t Active_D_Lighting(short setter);
    public native @Cast("unsigned") int ShotInfoVersion(); public native libraw_nikon_makernotes_t ShotInfoVersion(int setter);
    public native short MakernotesFlip(); public native libraw_nikon_makernotes_t MakernotesFlip(short setter);
    public native double RollAngle(); public native libraw_nikon_makernotes_t RollAngle(double setter);  // positive is clockwise, CW
    public native double PitchAngle(); public native libraw_nikon_makernotes_t PitchAngle(double setter); // positive is upwords
    public native double YawAngle(); public native libraw_nikon_makernotes_t YawAngle(double setter);   // positive is to the right
  }
