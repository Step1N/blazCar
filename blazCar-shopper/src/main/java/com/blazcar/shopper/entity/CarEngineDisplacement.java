package com.blazcar.shopper.entity;

public class CarEngineDisplacement {
  /**
   * Displacement={stroke length}* (22/7)*((1\2)*(bore))^{2} * (number of cylinders)
   */

  private int boreStroke;
  private float compressionRatio;
  private int cylinders;
  private int noOfGears;
  private int valvesPerCylinder;

  public String getDuelClutch() {
    return duelClutch;
  }

  public void setDuelClutch(String duelClutch) {
    this.duelClutch = duelClutch;
  }

  private String duelClutch;

  private String unit;


  public int getBoreStroke() {
    return boreStroke;
  }

  public void setBoreStroke(int boreStroke) {
    this.boreStroke = boreStroke;
  }

  public float getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  public int getCylinders() {
    return cylinders;
  }

  public void setCylinders(int cylinders) {
    this.cylinders = cylinders;
  }

  public int getNoOfGears() {
    return noOfGears;
  }

  public void setNoOfGears(int noOfGears) {
    this.noOfGears = noOfGears;
  }

  public int getValvesPerCylinder() {
    return valvesPerCylinder;
  }

  public void setValvesPerCylinder(int valvesPerCylinder) {
    this.valvesPerCylinder = valvesPerCylinder;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


}
