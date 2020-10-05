// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;

// #endif
@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class CacheInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CacheInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CacheInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CacheInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CacheInfo position(long position) {
        return (CacheInfo)super.position(position);
    }
    @Override public CacheInfo getPointer(long i) {
        return new CacheInfo(this).position(position + i);
    }

  public native int size(); public native CacheInfo size(int setter);
  public native @ByRef CacheLevelInfo levels(int i); public native CacheInfo levels(int i, CacheLevelInfo setter);
  @MemberGetter public native CacheLevelInfo levels();
}
