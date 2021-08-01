// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;

@Name("std::vector<std::unique_ptr<arrow::dataset::ScanTask> >") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanTaskVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanTaskVector(Pointer p) { super(p); }
    public ScanTaskVector(ScanTask value) { this(1); put(0, value); }
    public ScanTaskVector(ScanTask ... array) { this(array.length); put(array); }
    public ScanTaskVector()       { allocate();  }
    public ScanTaskVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ScanTaskVector put(@ByRef ScanTaskVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @UniquePtr ScanTask get(@Cast("size_t") long i);
    public native ScanTaskVector put(@Cast("size_t") long i, ScanTask value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @UniquePtr ScanTask value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @UniquePtr @Const ScanTask get();
    }

    public ScanTask[] get() {
        ScanTask[] array = new ScanTask[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public ScanTask pop_back() {
        long size = size();
        ScanTask value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ScanTaskVector push_back(ScanTask value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ScanTaskVector put(ScanTask value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ScanTaskVector put(ScanTask ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

