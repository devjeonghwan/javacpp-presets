// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** EXPERIMENTAL */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StopSource extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StopSource(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StopSource(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StopSource position(long position) {
        return (StopSource)super.position(position);
    }
    @Override public StopSource getPointer(long i) {
        return new StopSource((Pointer)this).offsetAddress(i);
    }

  public StopSource() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Consumer API (the side that stops)
  public native void RequestStop();
  public native void RequestStop(@ByVal Status error);
  public native void RequestStopFromSignal(int signum);

  public native @ByVal StopToken token();

  // For internal use only
  public native void Reset();
}
