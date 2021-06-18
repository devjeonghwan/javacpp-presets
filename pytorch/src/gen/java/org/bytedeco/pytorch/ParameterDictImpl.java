// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ParameterDictImpl extends ParameterDictImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParameterDictImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParameterDictImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParameterDictImpl position(long position) {
        return (ParameterDictImpl)super.position(position);
    }
    @Override public ParameterDictImpl getPointer(long i) {
        return new ParameterDictImpl((Pointer)this).offsetAddress(i);
    }


  public ParameterDictImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public ParameterDictImpl(
        @Const @ByRef StringTensorDict params) { super((Pointer)null); allocate(params); }
  @NoDeallocator private native void allocate(
        @Const @ByRef StringTensorDict params);

  /** {@code reset()} is empty for {@code ParameterDict}, since it does not have
   *  parameters of its own. */
  public native void reset();

  /** Pretty prints the {@code ParameterDict} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Insert the parameter along with the key into ParameterDict
   *  The parameter is set to be require grad by default */
  public native @ByRef Tensor insert(@StdString BytePointer key, @ByVal Tensor param);
  public native @ByRef Tensor insert(@StdString String key, @ByVal Tensor param);

  /** Remove key from the ParameterDict and return its value, throw exception
   *  if the key is not contained. Please check contains(key) before for a
   *  non-throwing access. */
  public native @ByVal Tensor pop(@StdString BytePointer key);
  public native @ByVal Tensor pop(@StdString String key);

  /** Return the keys in the dict */
  public native @ByVal StringVector keys();

  /** Return the Values in the dict */
  public native @StdVector Tensor values();

  /** Return an iterator to the start of ParameterDict */
  public native @ByVal @Cast("torch::nn::ParameterDictImpl::Iterator*") StringTensorDict.Iterator begin();

  /** Return a const iterator to the start of ParameterDict */

  /** Return an iterator to the end of ParameterDict */
  public native @ByVal @Cast("torch::nn::ParameterDictImpl::Iterator*") StringTensorDict.Iterator end();

  /** Return a const iterator to the end of ParameterDict */

  /** Return the number of items currently stored in the ParameterDict */
  public native @Cast("size_t") @NoException long size();

  /** Return true if the ParameterDict is empty, otherwise return false */
  public native @Cast("bool") @NoException boolean empty();

  /** Update the ParameterDict with the key-value pairs from
   *  another ParameterDict, overwriting existing key */

  /** Remove all parameters in the ParameterDict */
  public native void clear();

  /** Check if the centain parameter with the key in the ParameterDict */
  public native @Cast("bool") @NoException boolean contains(@StdString BytePointer key);
  public native @Cast("bool") @NoException boolean contains(@StdString String key);

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterDict}. Check contains(key) before
   *  for a non-throwing way of access */

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterDict}. Check contains(key) before
   *  for a non-throwing way of access */
  public native @ByRef Tensor get(@StdString BytePointer key);
  public native @ByRef Tensor get(@StdString String key);

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterDict}. Check contains(key) before
   *  for a non-throwing way of access */

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterDict}. Check contains(key) before
   *  for a non-throwing way of access */
}
