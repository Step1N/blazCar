package com.blazcar.shopper.entity;

public class CarEngineTorque {


  /**
   * Torque= Force x Distance
   */
  private String unit;

  private int torqueNM;
  private int torqueRPM;

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public int getTorqueNM() {
    return torqueNM;
  }

  public void setTorqueNM(int torqueNM) {
    this.torqueNM = torqueNM;
  }

  public int getTorqueRPM() {
    return torqueRPM;
  }

  public void setTorqueRPM(int torqueRPM) {
    this.torqueRPM = torqueRPM;
  }
}
