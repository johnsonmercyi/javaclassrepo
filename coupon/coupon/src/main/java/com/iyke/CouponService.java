package main.java.com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class CouponService implements CouponRepo {
    private Database db;
    private ArrayList<Coupon> dbCoupons;

    public CouponService(){
        db = new Database();
        dbCoupons = db.getDbCoupon();     
    }

    //get database
    public Database getDb() {
        return db;
    }

    @Override
    //Displaying all coupons in the db.
    public ArrayList<Coupon> getCoupons(ArrayList<Coupon> coupon) {
        if(coupon == null){
            return null;
        }
        //coupon.forEach(t -> System.out.println(t));
        for(Coupon c : coupon){
            System.out.println(c);
        }
        return coupon;  
    }

    @Override
    //create a coupon and saving to database
    public Coupon createCoupon(String codeName, double discount, LocalDate expDate) {   
        if(codeName.isBlank() || discount < 0 || expDate.toString().isBlank()){
            return null;
        }
        //call constructor to create object
        Coupon coupon = new Coupon(codeName.trim(), discount, expDate);
        //call save to db and return saved coupon
        return db.saveCoupon(coupon);
    }

    @Override
    //get a single coupon using its id or code name
    public Coupon getCoupon(UUID couponId, String codeName) {
        if(couponId != null){
            for(Coupon coupon : dbCoupons){
                if(couponId == coupon.getId()){
                    return coupon;
                }
            } 
        }
        //check if code name is Blank
        if(!codeName.isBlank()){
            for(Coupon coupon : dbCoupons){
                if(coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())){
                    return coupon;
                }
            }
        }
        return null;
    }
    
    @Override
    //modify coupon by making all fields editable. Search with codeName
    public Coupon modifyCoupon(String codeName, double newDiscount, LocalDate newExpDate, String newCodeName){
        if(codeName.isBlank() || newCodeName.isBlank() || newDiscount < 0 || newExpDate.toString().isBlank()){
            return null;
        }
        String cName = newCodeName.trim().toLowerCase();
        for(Coupon coupon : dbCoupons){
            if(coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())){
                coupon.setCodeName(cName);
                coupon.setDiscount(newDiscount);
                coupon.setExpDate(newExpDate);
                // return db.saveCoupon(coupon);
                return coupon;
            }
        }

        return null;
    }
    @Override
    //delete a coupon object from the list
    public Coupon deleteCoupon(UUID couponId, String codeName) {
        if(couponId != null){
            for(Coupon coupon : dbCoupons){
                if(couponId == coupon.getId()){
                    return deleteLogic(coupon);                   
                }
            } 
        }
        //check if code name is Blank
        if(!codeName.isBlank()){
            for(Coupon coupon : dbCoupons){
                if(coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())){
                    return deleteLogic(coupon);
                }
            }
        }
        return null;
    }

    //Delete Helper method
    public Coupon deleteLogic(Coupon coupon){
        Coupon deletedCoupon =  coupon;
        boolean isRemoved = dbCoupons.remove(coupon);
        if (isRemoved){
            return deletedCoupon;
        } 
        return null;
    }

}
