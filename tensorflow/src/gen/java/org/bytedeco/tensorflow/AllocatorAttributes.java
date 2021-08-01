// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A tensorflow Op may need access to different kinds of memory that
// are not simply a function of the device to which the Op has been
// assigned.  For example, an Op executing on a GPU may still need
// to allocate CPU RAM for some purpose.  Internal to the tensorflow
// runtime we may choose to allocate CPU ram from special regions
// that have been prepared for higher performance in some use
// contexts, e.g. doing DMA with particular devices.  For these
// reasons, the Device interface does not expose just one memory
// Allocator, but instead provides an accessor that takes a
// specification of the desired memory attributes in order to select
// an Allocator.
//
// Example use:
//  // Allocator for ordinary device memory:
//  Allocator* a = allocator(AllocatorAttributes());
// ...
//  // Allocator for CPU RAM, regardless of where Op is executing:
//  AllocatorAttributes attr;
//  attr.set_on_host(true);
//  Allocator* a = allocator(attr);
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AllocatorAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AllocatorAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorAttributes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AllocatorAttributes position(long position) {
        return (AllocatorAttributes)super.position(position);
    }
    @Override public AllocatorAttributes getPointer(long i) {
        return new AllocatorAttributes((Pointer)this).offsetAddress(i);
    }

  public native void set_on_host(@Cast("bool") boolean v);
  public native @Cast("bool") boolean on_host();
  public native void set_nic_compatible(@Cast("bool") boolean v);
  public native @Cast("bool") boolean nic_compatible();
  public native void set_gpu_compatible(@Cast("bool") boolean v);
  public native @Cast("bool") boolean gpu_compatible();
  public native void Merge(@ByVal AllocatorAttributes other);
  // Returns true if the fields set in *this is a subset of or equal to
  // those set in other.
  public native @Cast("bool") boolean IsEqualOrLessRestrictiveThan(@Const @ByRef AllocatorAttributes other);

  // NOTE: The upper 8 bits of the value are reserved for
  // device-specific uses.  Implementors of a device can interpret these
  // upper 8 bits in device-specific ways, and ops implemented for those
  // devices are responsible for setting those 8 bits appropriately.
  public native @Cast("tensorflow::uint32") int value(); public native AllocatorAttributes value(int setter);
  // EXPERIMENTAL: If this is greater than zero, then allocation is delegated to
  // a named special-purpose allocator on the same device.
  public native int scope_id(); public native AllocatorAttributes scope_id(int setter);

  // Returns a human readable representation of this.
  public native @StdString BytePointer DebugString();
}
