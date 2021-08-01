// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::io::FileSystem") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IOFileSystem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IOFileSystem(Pointer p) { super(p); }


  public native @ByVal Status MakeDirectory(@StdString String path);
  public native @ByVal Status MakeDirectory(@StdString BytePointer path);

  public native @ByVal Status DeleteDirectory(@StdString String path);
  public native @ByVal Status DeleteDirectory(@StdString BytePointer path);

  public native @ByVal Status GetChildren(@StdString String path,
                               StringVector listing);
  public native @ByVal Status GetChildren(@StdString BytePointer path,
                               StringVector listing);

  public native @ByVal Status Rename(@StdString String src, @StdString String dst);
  public native @ByVal Status Rename(@StdString BytePointer src, @StdString BytePointer dst);

  public native @ByVal Status Stat(@StdString String path, FileStatistics stat);
  public native @ByVal Status Stat(@StdString BytePointer path, FileStatistics stat);
}
