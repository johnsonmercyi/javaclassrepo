package main.java.com.iyke;

import java.util.ArrayList;
import java.util.UUID;

public class App 
{

    public static void main( String[] args ){
        //App app = new App();
        CouponService cService = new CouponService();
        ArrayList<Coupon> dbCoupons = cService.getCoupons(cService.getDb().getDbCoupon());
        //dbCoupons.forEach(System.out::println);
        int count = 0;
        System.out.println("\n All Coupons Information \n");
        for(Coupon c : dbCoupons){
            System.out.println(++count);
            System.out.println(c);
            
            System.out.println("\nCoupon ID: " + cService.getCoupon(c.getId()));
            //modified Coupon by seting it's id to 1
            System.out.println("Modified Coupon: " + cService.modifyCoupon(c.getId()));
            Coupon modifiedCoupon = cService.modifyCoupon(c.getId());
            System.out.println(c + " has been modified and used status is now "+ modifiedCoupon.getCouponUsedStatus());
            //deleting and displaying deletedcoupon
            System.out.println("Deleted Coupon: " + cService.deleteCoupon(c.getId()));
            System.out.println("\n\n");
            
        }

        //Display all Coupons
       // System.out.println("\nDatabase Coupons: " + dbCoupons);
    }

}
