// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MapScalar extends BaseListScalar {
    static { Loader.load(); }

  
    
    
      public MapScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
      private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
  
    public MapScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapScalar(Pointer p) { super(p); }


  public MapScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array value) { super((Pointer)null); allocate(value); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array value);
}
