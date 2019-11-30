package com.blazcar.shopper.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Item {

  private String name;
  private ItemBrand brand;
  private ItemVersion version;
  private ItemPrice price;
  private ItemImageURL imageURL;
  private ItemPower power;
  private ItemFuelSupport fuelSupport;
  private ItemDimension dimension;

  private String description;
  private boolean isAvailable;

  @Id
  private String ID;
  private String functionality;
  private ItemWarranty itemWarranty;



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemBrand getBrand() {
    return brand;
  }

  public void setBrand(ItemBrand brand) {
    this.brand = brand;
  }

  public ItemVersion getVersion() {
    return version;
  }

  public void setVersion(ItemVersion version) {
    this.version = version;
  }

  public ItemPrice getPrice() {
    return price;
  }

  public void setPrice(ItemPrice price) {
    this.price = price;
  }

  public ItemImageURL getImageURL() {
    return imageURL;
  }

  public void setImageURL(ItemImageURL imageURL) {
    this.imageURL = imageURL;
  }

  public ItemPower getPower() {
    return power;
  }

  public void setPower(ItemPower power) {
    this.power = power;
  }

  public ItemFuelSupport getFuelSupport() {
    return fuelSupport;
  }

  public void setFuelSupport(ItemFuelSupport fuelSupport) {
    this.fuelSupport = fuelSupport;
  }

  public ItemDimension getDimension() {
    return dimension;
  }

  public void setDimension(ItemDimension dimension) {
    this.dimension = dimension;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getFunctionality() {
    return functionality;
  }

  public void setFunctionality(String functionality) {
    this.functionality = functionality;
  }

  public ItemWarranty getItemWarranty() {
    return itemWarranty;
  }

  public void setItemWarranty(ItemWarranty itemWarranty) {
    this.itemWarranty = itemWarranty;
  }





}
