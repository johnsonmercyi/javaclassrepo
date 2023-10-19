package main.java.com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public interface CouponRepo {

    public ArrayList<Coupon> getCoupons(ArrayList<Coupon> coupon);
    public Coupon getCoupon(UUID couponId);
    public Coupon modifyCoupon(UUID couponId);
    public Coupon deleteCoupon(UUID couponId);
    public Coupon createCoupon(String codeName, double discount, LocalDate expDate);
  
}
