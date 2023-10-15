package com.iyke;

import java.util.Objects;

public class Tesla extends Car {
  private boolean isSelfDrive;

  public Tesla() {
    super();
    this.isSelfDrive = false;
  }

  public Tesla(boolean isSelfDrive) {
    super();
    this.isSelfDrive = isSelfDrive;
  }

  public Tesla(String plateNumber, String brand, String model, double price, int tyres, String color, String gearType,
      int milleage, String energyCat, boolean isSuv, int noOfDoors, boolean isSelfDrive) {
    super(plateNumber, brand, model, price, tyres, color, gearType, milleage, energyCat, isSuv, noOfDoors);
    this.isSelfDrive = isSelfDrive;
  }

  public boolean getIsSelfDrive() {
    return this.isSelfDrive;
  }

  public void setIsSelfDrive(boolean isSelfDrive) {
    this.isSelfDrive = isSelfDrive;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Tesla)) {
      return false;
    }
    Tesla tesla = (Tesla) o;
    return isSelfDrive == tesla.isSelfDrive;
  }

  @Override
  public String toString() {
    String oldStr = super.toString().substring(1, super.toString().length() - 1);
    oldStr = oldStr.concat(", isSelfDrive=") + getIsSelfDrive();
    return "{" + oldStr + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPlateNumber(), getBrand(), getModel(), getPrice()
    , getTyres(), getColor(), getGearType(), getMilleage(), getEnergyCat(), getIsSuv(), getNoOfDoors(), isSelfDrive);
  }
}
