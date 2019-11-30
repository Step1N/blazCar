package com.blazcar.shopper.dto;

public class ItemDTO {
  private String name;
  private String ID;
  private String price;
  private String brand;
  private String functionality;
  private boolean isAvailable;
  private String description;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getFunctionality() {
    return functionality;
  }

  public void setFunctionality(String functionality) {
    this.functionality = functionality;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
