/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class AreaD {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AreaD(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AreaD obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_AreaD(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AreaD() {
    this(OsmAndCoreJNI.new_AreaD__SWIG_0(), true);
  }

  public AreaD(double t, double l, double b, double r) {
    this(OsmAndCoreJNI.new_AreaD__SWIG_1(t, l, b, r), true);
  }

  public AreaD(PointD tl, PointD br) {
    this(OsmAndCoreJNI.new_AreaD__SWIG_2(PointD.getCPtr(tl), tl, PointD.getCPtr(br), br), true);
  }

  public AreaD(AreaD that) {
    this(OsmAndCoreJNI.new_AreaD__SWIG_3(AreaD.getCPtr(that), that), true);
  }

  public void setTopLeft(PointD value) {
    OsmAndCoreJNI.AreaD_topLeft_set(swigCPtr, this, PointD.getCPtr(value), value);
  }

  public PointD getTopLeft() {
    long cPtr = OsmAndCoreJNI.AreaD_topLeft_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PointD(cPtr, false);
  }

  public void setBottomRight(PointD value) {
    OsmAndCoreJNI.AreaD_bottomRight_set(swigCPtr, this, PointD.getCPtr(value), value);
  }

  public PointD getBottomRight() {
    long cPtr = OsmAndCoreJNI.AreaD_bottomRight_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PointD(cPtr, false);
  }

  public boolean contains(double x, double y) {
    return OsmAndCoreJNI.AreaD_contains__SWIG_0(swigCPtr, this, x, y);
  }

  public boolean contains(PointD p) {
    return OsmAndCoreJNI.AreaD_contains__SWIG_1(swigCPtr, this, PointD.getCPtr(p), p);
  }

  public boolean contains(double t, double l, double b, double r) {
    return OsmAndCoreJNI.AreaD_contains__SWIG_2(swigCPtr, this, t, l, b, r);
  }

  public boolean contains(AreaD that) {
    return OsmAndCoreJNI.AreaD_contains__SWIG_3(swigCPtr, this, AreaD.getCPtr(that), that);
  }

  public boolean intersects(double t, double l, double b, double r) {
    return OsmAndCoreJNI.AreaD_intersects__SWIG_0(swigCPtr, this, t, l, b, r);
  }

  public boolean intersects(AreaD that) {
    return OsmAndCoreJNI.AreaD_intersects__SWIG_1(swigCPtr, this, AreaD.getCPtr(that), that);
  }

  public boolean contains(OOBBD that) {
    return OsmAndCoreJNI.AreaD_contains__SWIG_4(swigCPtr, this, OOBBD.getCPtr(that), that);
  }

  public boolean intersects(OOBBD that) {
    return OsmAndCoreJNI.AreaD_intersects__SWIG_2(swigCPtr, this, OOBBD.getCPtr(that), that);
  }

  public double width() {
    return OsmAndCoreJNI.AreaD_width(swigCPtr, this);
  }

  public double height() {
    return OsmAndCoreJNI.AreaD_height(swigCPtr, this);
  }

  public PointD center() {
    return new PointD(OsmAndCoreJNI.AreaD_center(swigCPtr, this), true);
  }

  public PointD topRight() {
    return new PointD(OsmAndCoreJNI.AreaD_topRight(swigCPtr, this), true);
  }

  public PointD bottomLeft() {
    return new PointD(OsmAndCoreJNI.AreaD_bottomLeft(swigCPtr, this), true);
  }

  public AreaD getQuadrant(Quadrant quadrant) {
    return new AreaD(OsmAndCoreJNI.AreaD_getQuadrant(swigCPtr, this, quadrant.swigValue()), true);
  }

  public AreaD getEnlargedToInclude(PointD p) {
    return new AreaD(OsmAndCoreJNI.AreaD_getEnlargedToInclude(swigCPtr, this, PointD.getCPtr(p), p), true);
  }

  public AreaD getEnlargedBy(PointD delta) {
    return new AreaD(OsmAndCoreJNI.AreaD_getEnlargedBy__SWIG_0(swigCPtr, this, PointD.getCPtr(delta), delta), true);
  }

  public AreaD getEnlargedBy(double dt, double dl, double db, double dr) {
    return new AreaD(OsmAndCoreJNI.AreaD_getEnlargedBy__SWIG_1(swigCPtr, this, dt, dl, db, dr), true);
  }

  public static AreaD largest() {
    return new AreaD(OsmAndCoreJNI.AreaD_largest(), true);
  }

  public static AreaD fromCenterAndSize(double cx, double cy, double width, double height) {
    return new AreaD(OsmAndCoreJNI.AreaD_fromCenterAndSize(cx, cy, width, height), true);
  }

}
