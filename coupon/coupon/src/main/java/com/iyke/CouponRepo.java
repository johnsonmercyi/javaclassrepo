package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;

public interface CouponRepo {
    public ArrayList<Coupon> getCoupons();
    public Coupon getCoupon(String codeName);
    public Coupon deleteCoupon(String codeName);
    public Coupon createCoupon(String codeName, double discount, LocalDate expDate);
    public boolean modifyCoupon(Coupon newCoupon);
  
}
