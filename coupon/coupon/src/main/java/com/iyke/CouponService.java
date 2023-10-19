package main.java.com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class CouponService implements CouponRepo {
    private Database db;
    private ArrayList<Coupon> dbCoupons;

    public CouponService(){
        db = new Database();
        dbCoupons= db.getDbCoupon();
    }

    @Override
    //Displaying all coupons in the db.
    public ArrayList<Coupon> getCoupons(ArrayList<Coupon> coupon) {
        if(coupon == null){
            return null;
        }
        //coupon.forEach(t -> System.out.println(t));
        return coupon;  
    }

    @Override
    //create a coupon and saving to database
    public Coupon createCoupon(String codeName, double discount, LocalDate expDate) {
        //call constructor to create object
        if(codeName.isBlank() || discount < 0 || expDate.toString().isBlank()){
            return null;
        }
        Coupon coupon = new Coupon(codeName, discount, expDate);
        //call save to db and return saved coupon
        return db.saveCoupon(coupon);
    }

    @Override
    //get a single coupon using its id
    public Coupon getCoupon(UUID couponId) {
        if(couponId != null){
            for(Coupon coupon : dbCoupons){
                if(couponId == coupon.getId()){
                    return coupon;
                }
            } 
        }
        return null;
    }

    @Override
    //modify coupon by setting used coupon to unused
    public Coupon modifyCoupon(UUID couponId) {
        if(couponId != null){
            for(Coupon coupon : dbCoupons){
                if(couponId == coupon.getId()){
                    coupon.setCouponUsedStatus(0);
                    return coupon;
                }
            } 
        }
        return null;
    }
    @Override
    //delete a coupon object from the list
    public Coupon deleteCoupon(UUID couponId) {
        if(couponId != null){
            for(Coupon coupon : dbCoupons){
                if(couponId == coupon.getId()){
                    dbCoupons.remove(coupon);
                    return coupon;
                }
            } 
        }
        return null;
    }

}
