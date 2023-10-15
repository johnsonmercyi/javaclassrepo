package com.iyke;


public class Tesla extends Car {
    private boolean isSelfDrive;


    public Tesla() {
    }


    public Tesla(String plateNumber, String brand, String model, double price, int tyres, String color, String gearType,
            int milleage, String energyCat, boolean isSuv, int noOfDoors, boolean isSelfDrive) {
        super(plateNumber, brand, model, price, tyres, color, gearType, milleage, energyCat, isSuv, noOfDoors);
        this.isSelfDrive = isSelfDrive;
    }

  
    public boolean isIsSelfDrive() {
        return this.isSelfDrive;
    }

    public boolean getIsSelfDrive() {
        return this.isSelfDrive;
    }

    public void setIsSelfDrive(boolean isSelfDrive) {
        this.isSelfDrive = isSelfDrive;
    }

    public Tesla isSelfDrive(boolean isSelfDrive) {
        setIsSelfDrive(isSelfDrive);
        return this;
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
        return "{" +
            " plateNumber='" + getPlateNumber() + "'" +
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
            ", isSelfDrive='" + isIsSelfDrive() + "'" +
            "}";
    }
    

}
