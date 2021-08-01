// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VBuilderConfig extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VBuilderConfig(Pointer p) { super(p); }

    public native @NoException(true) void setMinTimingIterations(int minTiming);
    public native @NoException(true) int getMinTimingIterations();
    public native @NoException(true) void setAvgTimingIterations(int avgTiming);
    public native @NoException(true) int getAvgTimingIterations();
    public native @NoException(true) void setEngineCapability(EngineCapability capability);
    public native @NoException(true) void setEngineCapability(@Cast("nvinfer1::EngineCapability") int capability);
    public native @NoException(true) EngineCapability getEngineCapability();
    public native @NoException(true) void setInt8Calibrator(IInt8Calibrator calibrator);
    public native @NoException(true) IInt8Calibrator getInt8Calibrator();
    public native @NoException(true) void setMaxWorkspaceSize(@Cast("std::size_t") long workspaceSize);
    public native @Cast("std::size_t") @NoException(true) long getMaxWorkspaceSize();
    public native @NoException(true) void setFlags(@Cast("nvinfer1::BuilderFlags") int builderFlags);
    public native @Cast("nvinfer1::BuilderFlags") @NoException(true) int getFlags();
    public native @NoException(true) void clearFlag(BuilderFlag builderFlag);
    public native @NoException(true) void clearFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);
    public native @NoException(true) void setFlag(BuilderFlag builderFlag);
    public native @NoException(true) void setFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);
    public native @Cast("bool") @NoException(true) boolean getFlag(BuilderFlag builderFlag);
    public native @Cast("bool") @NoException(true) boolean getFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);
    public native @NoException(true) void setDeviceType(@Const ILayer layer, DeviceType deviceType);
    public native @NoException(true) void setDeviceType(@Const ILayer layer, @Cast("nvinfer1::DeviceType") int deviceType);
    public native @NoException(true) DeviceType getDeviceType(@Const ILayer layer);
    public native @Cast("bool") @NoException(true) boolean isDeviceTypeSet(@Const ILayer layer);
    public native @NoException(true) void resetDeviceType(@Const ILayer layer);
    public native @Cast("bool") @NoException(true) boolean canRunOnDLA(@Const ILayer layer);
    public native @NoException(true) void setDLACore(int dlaCore);
    public native @NoException(true) int getDLACore();
    public native @NoException(true) void setDefaultDeviceType(DeviceType deviceType);
    public native @NoException(true) void setDefaultDeviceType(@Cast("nvinfer1::DeviceType") int deviceType);
    public native @NoException(true) DeviceType getDefaultDeviceType();
    public native @NoException(true) void reset();
    public native @NoException(true) void setProfileStream(CUstream_st stream);
    public native @NoException(true) CUstream_st getProfileStream();
    public native @NoException(true) int addOptimizationProfile(@Const IOptimizationProfile profile);
    public native @NoException(true) int getNbOptimizationProfiles();
    public native @NoException(true) void setProfilingVerbosity(ProfilingVerbosity verbosity);
    public native @NoException(true) void setProfilingVerbosity(@Cast("nvinfer1::ProfilingVerbosity") int verbosity);
    public native @NoException(true) ProfilingVerbosity getProfilingVerbosity();
    public native @NoException(true) void setAlgorithmSelector(IAlgorithmSelector selector);
    public native @NoException(true) IAlgorithmSelector getAlgorithmSelector();
    public native @Cast("bool") @NoException(true) boolean setCalibrationProfile(@Const IOptimizationProfile profile);
    public native @Const @NoException(true) IOptimizationProfile getCalibrationProfile();
    public native @NoException(true) void setQuantizationFlags(@Cast("nvinfer1::QuantizationFlags") int flags);
    public native @Cast("nvinfer1::QuantizationFlags") @NoException(true) int getQuantizationFlags();
    public native @NoException(true) void clearQuantizationFlag(QuantizationFlag flag);
    public native @NoException(true) void clearQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);
    public native @NoException(true) void setQuantizationFlag(QuantizationFlag flag);
    public native @NoException(true) void setQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);
    public native @Cast("bool") @NoException(true) boolean getQuantizationFlag(QuantizationFlag flag);
    public native @Cast("bool") @NoException(true) boolean getQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);
    public native @Cast("bool") @NoException(true) boolean setTacticSources(@Cast("nvinfer1::TacticSources") int tacticSources);
    public native @Cast("nvinfer1::TacticSources") @NoException(true) int getTacticSources();
    public native @NoException(true) ITimingCache createTimingCache(@Const Pointer blob, @Cast("std::size_t") long size);
    public native @Cast("bool") @NoException(true) boolean setTimingCache(@Const @ByRef ITimingCache cache, @Cast("bool") boolean ignoreMismatch);
    public native @Const @NoException(true) ITimingCache getTimingCache();
}
