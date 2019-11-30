package com.blazcar.shopper.entity;

public enum  CarEngineCharger {
  TURBO("Turbocharger"), SUPER("supercharger");


  private String value;

  CarEngineCharger(String value) {
    this.value = value;
  }
}
