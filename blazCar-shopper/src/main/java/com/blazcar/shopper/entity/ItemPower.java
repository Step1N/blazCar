package com.blazcar.shopper.entity;

public class ItemPower {

  /**
   * Power=> (RPM * T) / 5252 =HP, where RPM is the engine speed, T is the torque, and 5,252 is radians per second
   */
  private String unit;

  private int powerInBHP;

  private int powerInRPM;

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public int getPowerInBHP() {
    return powerInBHP;
  }

  public void setPowerInBHP(int powerInBHP) {
    this.powerInBHP = powerInBHP;
  }

  public int getPowerInRPM() {
    return powerInRPM;
  }

  public void setPowerInRPM(int powerInRPM) {
    this.powerInRPM = powerInRPM;
  }
}
