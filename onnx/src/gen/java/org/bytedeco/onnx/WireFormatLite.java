// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("google::protobuf::internal") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class WireFormatLite extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public WireFormatLite() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WireFormatLite(Pointer p) { super(p); }
}
