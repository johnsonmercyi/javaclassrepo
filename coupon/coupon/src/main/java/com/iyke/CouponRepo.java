package com.iyke;

import java.util.ArrayList;
import java.util.UUID;

public interface CouponRepo {
    public ArrayList<Coupon> getCoupons();
    public Coupon getCoupon(String codeName);
    public Coupon deleteCoupon(String codeName);
    public Coupon createCoupon(Coupon coupon);
    public boolean modifyCoupon(Coupon newCoupon);
    public Coupon getCoupon(UUID id);
    public Coupon deleteCoupon(UUID couponId);
  
}
