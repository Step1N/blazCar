package com.blazcar.shopper.entity;

public enum ItemTransmission {
  Manual("manual"), Automatic("automatic");


  private String value;

  ItemTransmission(String value) {
    this.value = value;
  }
}
