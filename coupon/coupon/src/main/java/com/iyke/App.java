package main.java.com.iyke;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ){
        Database db = new Database();
        CouponService cService = new CouponService();
        ArrayList<Coupon> dbCoupons = cService.getCoupons(db.getDbCoupon());
        //dbCoupons.forEach(System.out::println);
        for(Coupon c : dbCoupons){
            System.out.println(c);
        }
    }
}
