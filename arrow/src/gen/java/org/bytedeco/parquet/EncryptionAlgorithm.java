// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class EncryptionAlgorithm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EncryptionAlgorithm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EncryptionAlgorithm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncryptionAlgorithm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EncryptionAlgorithm position(long position) {
        return (EncryptionAlgorithm)super.position(position);
    }
    @Override public EncryptionAlgorithm getPointer(long i) {
        return new EncryptionAlgorithm((Pointer)this).offsetAddress(i);
    }

  public native ParquetCipher.type algorithm(); public native EncryptionAlgorithm algorithm(ParquetCipher.type setter);
  public native @ByRef AadMetadata aad(); public native EncryptionAlgorithm aad(AadMetadata setter);
}
