// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;

@Opaque @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class ISampleGrabber extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ISampleGrabber() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISampleGrabber(Pointer p) { super(p); }
}
