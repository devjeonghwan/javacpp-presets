// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;


//allows us to directShow classes here with the includes in the cpp
@Opaque @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class ICaptureGraphBuilder2 extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ICaptureGraphBuilder2() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ICaptureGraphBuilder2(Pointer p) { super(p); }
}
