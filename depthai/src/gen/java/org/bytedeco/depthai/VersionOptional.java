// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

@NoOffset @Name("tl::optional<dai::OpenVINO::Version>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class VersionOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VersionOptional(Pointer p) { super(p); }
    public VersionOptional(int value) { this(); put(value); }
    public VersionOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef VersionOptional put(@ByRef VersionOptional x);


    @Name("value") public native @Cast("dai::OpenVINO::Version") int get();
    @ValueSetter public native VersionOptional put(@Cast("dai::OpenVINO::Version") int value);
}

