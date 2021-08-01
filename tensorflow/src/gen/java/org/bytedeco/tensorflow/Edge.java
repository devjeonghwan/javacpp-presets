// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Edge extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Edge(Pointer p) { super(p); }

  public native Node src();
  public native Node dst();
  public native int id();

  // Return the index of the source output that produces the data
  // carried by this edge.  The special value kControlSlot is used
  // for control dependencies.
  public native int src_output();

  // Return the index of the destination input that consumes the data
  // carried by this edge.  The special value kControlSlot is used
  // for control dependencies.
  public native int dst_input();

  // Return true iff this is an edge that indicates a control-flow
  // (as opposed to a data-flow) dependency.
  public native @Cast("bool") boolean IsControlEdge();

  public native @StdString BytePointer DebugString();
}
