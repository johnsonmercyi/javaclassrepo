package com.iyke;

import java.util.Objects;

public class Car {
    private String plateNumber;
    private String brand;
    private String model;
    private double price;
    private int tyres;
    private String color;
    private String gearType;
    private int milleage;
    private String energyCat;
    private boolean isSuv;
    private int noOfDoors;


    public Car() {
      this(null, null, null, 0, 0, null, null, 0, null, false, 0);
    }

    public Car(String plateNumber, String brand, String model, double price, int tyres, String color, String gearType, int milleage, String energyCat, boolean isSuv, int noOfDoors) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.tyres = tyres;
        this.color = color;
        this.gearType = gearType;
        this.milleage = milleage;
        this.energyCat = energyCat;
        this.isSuv = isSuv;
        this.noOfDoors = noOfDoors;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTyres() {
        return this.tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return this.gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getMilleage() {
        return this.milleage;
    }

    public void setMilleage(int milleage) {
        this.milleage = milleage;
    }

    public String getEnergyCat() {
        return this.energyCat;
    }

    public void setEnergyCat(String energyCat) {
        this.energyCat = energyCat;
    }

    public boolean isIsSuv() {
        return this.isSuv;
    }

    public boolean getIsSuv() {
        return this.isSuv;
    }

    public void setIsSuv(boolean isSuv) {
        this.isSuv = isSuv;
    }

    public int getNoOfDoors() {
        return this.noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Car plateNumber(String plateNumber) {
        setPlateNumber(plateNumber);
        return this;
    }

    public Car brand(String brand) {
        setBrand(brand);
        return this;
    }

    public Car model(String model) {
        setModel(model);
        return this;
    }

    public Car price(double price) {
        setPrice(price);
        return this;
    }

    public Car tyres(int tyres) {
        setTyres(tyres);
        return this;
    }

    public Car color(String color) {
        setColor(color);
        return this;
    }

    public Car gearType(String gearType) {
        setGearType(gearType);
        return this;
    }

    public Car milleage(int milleage) {
        setMilleage(milleage);
        return this;
    }

    public Car energyCat(String energyCat) {
        setEnergyCat(energyCat);
        return this;
    }

    public Car isSuv(boolean isSuv) {
        setIsSuv(isSuv);
        return this;
    }

    public Car noOfDoors(int noOfDoors) {
        setNoOfDoors(noOfDoors);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(plateNumber, car.plateNumber) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && price == car.price && tyres == car.tyres && Objects.equals(color, car.color) && Objects.equals(gearType, car.gearType) && milleage == car.milleage && Objects.equals(energyCat, car.energyCat) && isSuv == car.isSuv && noOfDoors == car.noOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, brand, model, price, tyres, color, gearType, milleage, energyCat, isSuv, noOfDoors);
    }

    @Override
    public String toString() {
        return "{" +
            "plateNumber='" + getPlateNumber() + "'" +
            ", brand='" + getBrand() + "'" +
            ", model='" + getModel() + "'" +
            ", price='" + getPrice() + "'" +
            ", tyres='" + getTyres() + "'" +
            ", color='" + getColor() + "'" +
            ", gearType='" + getGearType() + "'" +
            ", milleage='" + getMilleage() + "'" +
            ", energyCat='" + getEnergyCat() + "'" +
            ", isSuv='" + isIsSuv() + "'" +
            ", noOfDoors='" + getNoOfDoors() + "'" +
            "}";
    }
    

}
