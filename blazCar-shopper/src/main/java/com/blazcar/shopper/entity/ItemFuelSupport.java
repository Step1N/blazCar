package com.blazcar.shopper.entity;

public class ItemFuelSupport {

  private CarEngineFuel carEngineFuel;
  private CarEngineCharger carEngineCharger;
  private String carEngineChargerType;


  public String getCarEngineChargerType() {
    return carEngineChargerType;
  }

  public void setCarEngineChargerType(String carEngineChargerType) {
    this.carEngineChargerType = carEngineChargerType;
  }



  public CarEngineFuel getCarEngineFuel() {
    return carEngineFuel;
  }

  public void setCarEngineFuel(CarEngineFuel carEngineFuel) {
    this.carEngineFuel = carEngineFuel;
  }

  public CarEngineCharger getCarEngineCharger() {
    return carEngineCharger;
  }

  public void setCarEngineCharger(CarEngineCharger carEngineCharger) {
    this.carEngineCharger = carEngineCharger;
  }
}
