package com.iyke;
import java.util.Objects;

public class Toyota extends Car {
    private int engineSize;


    public Toyota() {
    }


    public Toyota(int engineSize) {
        this.engineSize = engineSize;
    }


    public Toyota(String plateNumber, String brand, String model, double price, int tyres, String color,
            String gearType, int milleage, String energyCat, boolean isSuv, int noOfDoors, int engineSize) {
        super(plateNumber, brand, model, price, tyres, color, gearType, milleage, energyCat, isSuv, noOfDoors);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return this.engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public Toyota engineSize(int engineSize) {
        setEngineSize(engineSize);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Toyota)) {
            return false;
        }
        Toyota toyota = (Toyota) o;
        return engineSize == toyota.engineSize;
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
            ", engineSize='" + getEngineSize() + "'" +
            "}";
    }
  
}
