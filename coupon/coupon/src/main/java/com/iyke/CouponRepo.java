package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public interface CouponRepo {
    public ArrayList<Coupon> getCoupons(ArrayList<Coupon> coupon);
    public Coupon getCoupon(UUID couponId, String codeName);
    public Coupon deleteCoupon(UUID couponId, String codeName);
    public Coupon createCoupon(String codeName, double discount, LocalDate expDate);
    public Coupon modifyCoupon(String codeName, double discount, LocalDate expDate, String newCodeName);
  
}
