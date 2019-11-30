package com.blazcar.shopper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CarEngineDTO {


  @JsonProperty("Naming")
  private String id;

  @JsonProperty("Make")
  private String brand;

  @JsonProperty("Model")
  private String model;

  @JsonProperty("Version")
  private String version;

  @JsonProperty("Bonus data")
  private String carSize;

  @JsonProperty("Body style")
  private String carType;

  @JsonProperty("Image URL")
  private String imageURL;

  @JsonProperty("Price & image")
  private String price;

  @JsonProperty("Engine")
  private String engine;

  @JsonProperty("Max power (bhp)")
  private String maxPowerBHP;

  @JsonProperty("Max power (rpm)")
  private String maxPowerRPM;

  @JsonProperty("Max torque (Nm)")
  private String torqueNM;

  @JsonProperty("Max torque (rpm)")
  private String torqueRPM;

  @JsonProperty("Transmission type")
  private String transmissionType;

  @JsonProperty("No of gears")
  private String numberOfGears;

  @JsonProperty("Cylinders")
  private String cylinders;

  @JsonProperty("Bore x Stroke (mm)")
  private String boreStroke;

  @JsonProperty("Valves per cylinder")
  private String valvesPerCylinder;


  @JsonProperty("Compression ratio")
  private String compressionRatio;

  @JsonProperty("Dual clutch")
  private String dualClutch;


  @JsonProperty("Drivetrain")
  private String drivetrain;

  @JsonProperty("Engine type")
  private String engineType;

  @JsonProperty("Sport mode")
  private String sportMode;

  @JsonProperty("Fuel system")
  private String fuelSystem;

  @JsonProperty("Turbocharger/supercharger")
  private String turboCharger;

  @JsonProperty("Turbocharge type")
  private String turboChargerType;

  @JsonProperty("Driving modes")
  private String drivingModes;


  @JsonProperty("Manual shifting for automatic")
  private String manualShift;

  @JsonProperty("Engine start-stop")
  private String engineStartStop;

  @JsonProperty("Price discontinued cars (last recorded price)")
  private String lastPrice;


  public String getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getMaxPowerBHP() {
    return maxPowerBHP;
  }

  public void setMaxPowerBHP(String maxPowerBHP) {
    this.maxPowerBHP = maxPowerBHP;
  }

  public String getMaxPowerRPM() {
    return maxPowerRPM;
  }

  public void setMaxPowerRPM(String maxPowerRPM) {
    this.maxPowerRPM = maxPowerRPM;
  }


  public String getTransmissionType() {
    return transmissionType;
  }

  public void setTransmissionType(String transmissionType) {
    this.transmissionType = transmissionType;
  }

  public String getNumberOfGears() {
    return numberOfGears;
  }

  public void setNumberOfGears(String numberOfGears) {
    this.numberOfGears = numberOfGears;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getDrivetrain() {
    return drivetrain;
  }

  public void setDrivetrain(String drivetrain) {
    this.drivetrain = drivetrain;
  }

  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String getCylinders() {
    return cylinders;
  }

  public void setCylinders(String cylinders) {
    this.cylinders = cylinders;
  }


  public String getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(String compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  public String getDualClutch() {
    return dualClutch;
  }

  public void setDualClutch(String dualClutch) {
    this.dualClutch = dualClutch;
  }

  public String getSportMode() {
    return sportMode;
  }

  public void setSportMode(String sportMode) {
    this.sportMode = sportMode;
  }

  public String getFuelSystem() {
    return fuelSystem;
  }

  public void setFuelSystem(String fuelSystem) {
    this.fuelSystem = fuelSystem;
  }

  public String getTurboCharger() {
    return turboCharger;
  }

  public void setTurboCharger(String turboCharger) {
    this.turboCharger = turboCharger;
  }

  public String getTurboChargerType() {
    return turboChargerType;
  }

  public void setTurboChargerType(String turboChargerType) {
    this.turboChargerType = turboChargerType;
  }

  public String getDrivingModes() {
    return drivingModes;
  }

  public void setDrivingModes(String drivingModes) {
    this.drivingModes = drivingModes;
  }

  public String getManualShift() {
    return manualShift;
  }

  public void setManualShift(String manualShift) {
    this.manualShift = manualShift;
  }

  public String getEngineStartStop() {
    return engineStartStop;
  }

  public void setEngineStartStop(String engineStartStop) {
    this.engineStartStop = engineStartStop;
  }


  public String getCarSize() {
    return carSize;
  }

  public void setCarSize(String carSize) {
    this.carSize = carSize;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getTorqueNM() {
    return torqueNM;
  }

  public void setTorqueNM(String torqueNM) {
    this.torqueNM = torqueNM;
  }

  public String getTorqueRPM() {
    return torqueRPM;
  }

  public void setTorqueRPM(String torqueRPM) {
    this.torqueRPM = torqueRPM;
  }

  public String getBoreStroke() {
    return boreStroke;
  }

  public void setBoreStroke(String boreStroke) {
    this.boreStroke = boreStroke;
  }

  public String getValvesPerCylinder() {
    return valvesPerCylinder;
  }

  public void setValvesPerCylinder(String valvesPerCylinder) {
    this.valvesPerCylinder = valvesPerCylinder;
  }

}
