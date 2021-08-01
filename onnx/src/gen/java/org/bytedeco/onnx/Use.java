// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;




// Each use is represented by this type, see Node::uses()
// 'user' is the consumer of the value, offset is the index into
// 'user's input this where the produces will be found.
@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Use extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Use(Pointer p) { super(p); }

  public Use(Node user, @Cast("size_t") long offset) { super((Pointer)null); allocate(user, offset); }
  private native void allocate(Node user, @Cast("size_t") long offset);
  public native Node user(); public native Use user(Node setter);
  public native @Cast("size_t") long offset(); public native Use offset(long setter);
}
