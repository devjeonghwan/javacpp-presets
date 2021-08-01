// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

            @Namespace("ngraph::runtime::cpu") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class CPU_Backend extends Backend {
                static { Loader.load(); }
                /** Default native constructor. */
                public CPU_Backend() { super((Pointer)null); allocate(); }
                /** Native array allocator. Access with {@link Pointer#position(long)}. */
                public CPU_Backend(long size) { super((Pointer)null); allocateArray(size); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public CPU_Backend(Pointer p) { super(p); }
                private native void allocate();
                private native void allocateArray(long size);
                @Override public CPU_Backend position(long position) {
                    return (CPU_Backend)super.position(position);
                }
                @Override public CPU_Backend getPointer(long i) {
                    return new CPU_Backend((Pointer)this).offsetAddress(i);
                }
            

                

                public native @SharedPtr @ByVal Tensor create_tensor(@Const @ByRef Type element_type,
                                                  @Const @ByRef Shape shape,
                                                  Pointer memory_pointer);

                public native @SharedPtr @ByVal Tensor create_tensor(@Const @ByRef Type element_type,
                                                  @Const @ByRef Shape shape);

                public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                            @Cast("bool") boolean enable_performance_counters/*=false*/);
                public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func);

                public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                            @ByRef PassConfig pass_config,
                                            @Cast("bool") boolean enable_performance_counters/*=false*/);
                public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                            @ByRef PassConfig pass_config);

                public native void remove_compiled_function(@SharedPtr Executable exec);

                public native Allocator get_host_memory_allocator();
                public native void set_host_memory_allocator(Allocator allocator);

                public native @Cast("bool") boolean is_supported(@Const @ByRef Node node);
                public native @Cast("bool") boolean is_supported_property(@Cast("const ngraph::runtime::cpu::CPU_Backend::Property") int prop);
            }
