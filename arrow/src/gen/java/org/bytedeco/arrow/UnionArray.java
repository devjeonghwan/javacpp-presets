// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Union

/** Base class for SparseUnionArray and DenseUnionArray */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UnionArray extends Array {
    static { Loader.load(); }
    /** Default native constructor. */
    public UnionArray() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UnionArray(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionArray(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UnionArray position(long position) {
        return (UnionArray)super.position(position);
    }
    @Override public UnionArray getPointer(long i) {
        return new UnionArray((Pointer)this).offsetAddress(i);
    }


  /** Note that this buffer does not account for any slice offset */
  public native @SharedPtr ArrowBuffer type_codes();

  public native @Cast("const arrow::UnionArray::type_code_t*") BytePointer raw_type_codes();

  /** The physical child id containing value at index. */
  public native int child_id(@Cast("int64_t") long i);

  public native @Const UnionType union_type();

  public native UnionMode.type mode();

  // Return the given field as an individual array.
  // For sparse unions, the returned array has its offset, length and null
  // count adjusted.
  
  ///
  public native @Deprecated @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array child(int pos);

  /** \brief Return the given field as an individual array.
   * 
   *  For sparse unions, the returned array has its offset, length and null
   *  count adjusted. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array field(int pos);
}
