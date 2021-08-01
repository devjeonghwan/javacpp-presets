// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief An executor implementation that runs all tasks on a single thread using an
 *  event loop.
 * 
 *  Note: Any sort of nested parallelism will deadlock this executor.  Blocking waits are
 *  fine but if one task needs to wait for another task it must be expressed as an
 *  asynchronous continuation. */
@Namespace("arrow::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SerialExecutor extends Executor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SerialExecutor(Pointer p) { super(p); }


  public native int GetCapacity();

  /** \brief Runs the TopLevelTask and any scheduled tasks
   * 
   *  The TopLevelTask (or one of the tasks it schedules) must either return an invalid
   *  status or call the finish signal. Failure to do this will result in a deadlock.  For
   *  this reason it is preferable (if possible) to use the helper methods (below)
   *  RunSynchronously/RunSerially which delegates the responsiblity onto a Future
   *  producer's existing responsibility to always mark a future finished (which can
   *  someday be aided by ARROW-12207). */
}
