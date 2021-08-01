// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


/** \brief Signature for a function : includes the base name, input param types and
 *  output types. */
@Namespace("gandiva") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class FunctionSignature extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionSignature(Pointer p) { super(p); }

  public FunctionSignature(@StdString String base_name, @ByVal DataTypeVector param_types,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType ret_type) { super((Pointer)null); allocate(base_name, param_types, ret_type); }
  private native void allocate(@StdString String base_name, @ByVal DataTypeVector param_types,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType ret_type);
  public FunctionSignature(@StdString BytePointer base_name, @ByVal DataTypeVector param_types,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType ret_type) { super((Pointer)null); allocate(base_name, param_types, ret_type); }
  private native void allocate(@StdString BytePointer base_name, @ByVal DataTypeVector param_types,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType ret_type);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FunctionSignature other);

  /** calculated based on name, datatype id of parameters and datatype id
   *  of return type. */
  public native @Cast("std::size_t") long Hash();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType ret_type();

  public native @StdString String base_name();

  public native @ByVal DataTypeVector param_types();

  public native @StdString String ToString();
}
