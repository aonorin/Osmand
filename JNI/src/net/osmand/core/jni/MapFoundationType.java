/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public enum MapFoundationType {
  Undefined(OsmAndCoreJNI.MapFoundationType_Undefined_get()),
  Mixed,
  FullLand,
  FullWater;

  public final int swigValue() {
    return swigValue;
  }

  public static MapFoundationType swigToEnum(int swigValue) {
    MapFoundationType[] swigValues = MapFoundationType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (MapFoundationType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + MapFoundationType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private MapFoundationType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private MapFoundationType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private MapFoundationType(MapFoundationType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

