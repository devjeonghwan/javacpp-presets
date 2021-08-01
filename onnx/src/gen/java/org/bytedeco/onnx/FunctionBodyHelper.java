// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionBodyHelper extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FunctionBodyHelper() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionBodyHelper(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionBodyHelper(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FunctionBodyHelper position(long position) {
        return (FunctionBodyHelper)super.position(position);
    }
    @Override public FunctionBodyHelper getPointer(long i) {
        return new FunctionBodyHelper((Pointer)this).offsetAddress(i);
    }

  @NoOffset public static class AttributeProtoWrapper extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public AttributeProtoWrapper(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public AttributeProtoWrapper(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public AttributeProtoWrapper position(long position) {
          return (AttributeProtoWrapper)super.position(position);
      }
      @Override public AttributeProtoWrapper getPointer(long i) {
          return new AttributeProtoWrapper((Pointer)this).offsetAddress(i);
      }
  
    public native @ByRef AttributeProto proto(); public native AttributeProtoWrapper proto(AttributeProto setter);

    public AttributeProtoWrapper() { super((Pointer)null); allocate(); }
    private native void allocate();

    public AttributeProtoWrapper(@Const @ByRef AttributeProto attr_prot) { super((Pointer)null); allocate(attr_prot); }
    private native void allocate(@Const @ByRef AttributeProto attr_prot);
  }

  @NoOffset public static class NodeDef extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public NodeDef(Pointer p) { super(p); }
  
    public NodeDef(
            @ByVal StringVector outputs,
            @StdString BytePointer op_type,
            @ByVal StringVector inputs) { super((Pointer)null); allocate(outputs, op_type, inputs); }
    private native void allocate(
            @ByVal StringVector outputs,
            @StdString BytePointer op_type,
            @ByVal StringVector inputs);
    public NodeDef(
            @ByVal StringVector outputs,
            @StdString String op_type,
            @ByVal StringVector inputs) { super((Pointer)null); allocate(outputs, op_type, inputs); }
    private native void allocate(
            @ByVal StringVector outputs,
            @StdString String op_type,
            @ByVal StringVector inputs);

    public NodeDef(
            @ByVal StringVector outputs,
            @StdString BytePointer op_type,
            @ByVal StringVector inputs,
            @StdVector AttributeProtoWrapper attributes) { super((Pointer)null); allocate(outputs, op_type, inputs, attributes); }
    private native void allocate(
            @ByVal StringVector outputs,
            @StdString BytePointer op_type,
            @ByVal StringVector inputs,
            @StdVector AttributeProtoWrapper attributes);
    public NodeDef(
            @ByVal StringVector outputs,
            @StdString String op_type,
            @ByVal StringVector inputs,
            @StdVector AttributeProtoWrapper attributes) { super((Pointer)null); allocate(outputs, op_type, inputs, attributes); }
    private native void allocate(
            @ByVal StringVector outputs,
            @StdString String op_type,
            @ByVal StringVector inputs,
            @StdVector AttributeProtoWrapper attributes);

    public native @ByRef StringVector outputs(); public native NodeDef outputs(StringVector setter);
    public native @StdString BytePointer op_type(); public native NodeDef op_type(BytePointer setter);
    public native @ByRef StringVector inputs(); public native NodeDef inputs(StringVector setter);
    public native @StdVector AttributeProtoWrapper attributes(); public native NodeDef attributes(AttributeProtoWrapper setter);
  }

  /*
  BuildNodes() is an utility function for easily define a Function Body.

  To build a simple node:
    {{"Z"}, "Add", {"X", "Y"}} represents Z = Add(X,Y)

  To build a node with attribute:
    {{"Y"}, "Concat", {"X1", "X2", "X3"}, {{"axis", 1}}}
      represents Y = Concat(X1,X2,X3) with axis = 1
    The attribute type are infered from the attribute value's c++ type
    Supported value types are
      int64_t -> int, vector<int64_t> -> ints
      float -> float, vector<float> -> floats
      string -> string, vector<string> ->strings
    For refering an attribute from parent, use:
      {MakeRefAttribute("axes", AttributeProto::INTS)}}

  For more examples, please find the references of this function
  */
  public static native @StdVector NodeProto BuildNodes(
        @StdVector NodeDef node_defs);
}
