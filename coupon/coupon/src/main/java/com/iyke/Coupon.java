package main.java.com.iyke;

import java.time.LocalDate;
import java.util.UUID;

public class Coupon {
    
    private String codeName;
    private double discount;
    private UUID id;
    private LocalDate expDate;
    private int couponUsedStatus;

    //Constructor
    public Coupon(String codeName, double discount, LocalDate expDate) {
        this.codeName = codeName.trim().toLowerCase();
        this.discount = discount;
        this.expDate = expDate;
        this.id = UUID.randomUUID();
        this.couponUsedStatus = 0;
    }

    //Getters and Setters
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public UUID getId() {
        return id;
    }

    public int getCouponUsedStatus() {
        return couponUsedStatus;
    }

    public void setCouponUsedStatus(int couponUsedStatus) {
        this.couponUsedStatus = couponUsedStatus;
    }

    @Override
    public String toString() {
        return "Coupon [codeName=" + codeName + ", discount=" + discount + ", id=" + id + ", expDate=" + expDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeName == null) ? 0 : codeName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(discount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coupon other = (Coupon) obj;
        if (codeName == null) {
            if (other.codeName != null)
                return false;
        } else if (!codeName.equals(other.codeName))
            return false;
        if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (expDate == null) {
            if (other.expDate != null)
                return false;
        } else if (!expDate.equals(other.expDate))
            return false;
        return true;
    } 
        
}
