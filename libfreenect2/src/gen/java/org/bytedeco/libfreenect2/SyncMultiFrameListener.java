// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


/** Collect multiple types of frames. */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class SyncMultiFrameListener extends FrameListener {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SyncMultiFrameListener(Pointer p) { super(p); }

  /**
   * @param frame_types Use bitwise or to combine multiple types, e.g. {@code Frame::Ir | Frame::Depth}.
   */
  public SyncMultiFrameListener(@Cast("unsigned int") int frame_types) { super((Pointer)null); allocate(frame_types); }
  private native void allocate(@Cast("unsigned int") int frame_types);

  /** Test if there are new frames. Non-blocking. */
  public native @Cast("bool") boolean hasNewFrame();

  /** Wait milliseconds for new frames.
   * @param frame [out] Caller is responsible to release the frames.
   * @param milliseconds Timeout. This parameter is ignored if not built with C++11 threading support.
   * @return true if a frame is received; false if not.
   */
  public native @Cast("bool") boolean waitForNewFrame(@ByRef FrameMap frame, int milliseconds);

  /** Wait indefinitely for new frames.
   * @param frame [out] Caller is responsible to release the frames.
   */
  public native void waitForNewFrame(@ByRef FrameMap frame);

  /** Shortcut to delete all frames */
  public native void release(@ByRef FrameMap frame);

  public native @Cast("bool") boolean onNewFrame(@Cast("libfreenect2::Frame::Type") int type, Frame frame);
}
