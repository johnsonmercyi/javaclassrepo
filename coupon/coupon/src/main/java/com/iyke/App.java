package main.java.com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ){
        CouponService cService = new CouponService();
        ArrayList<Coupon> dbCoupons = cService.getCoupons(cService.getDb().getDbCoupon());

        //dbCoupons.forEach(System.out::println);
        int count = 0;
        System.out.println("\n All Coupons Information \n");

        //loopr through DB Coupons
        for(Coupon c : dbCoupons){
            System.out.println(++count);
            System.out.println(c);
            System.out.println("\nGet Coupon with ID: " + cService.getCoupon(c.getId(), "ccode"));  
            System.out.println("\n\n");        
        }

        //Display all Coupons
        System.out.println("\nDatabase Coupons: " + dbCoupons);
        System.out.println("\n\n");

        //deleting and displaying deletedcoupon
        System.out.println("Deleted Coupon: " + cService.deleteCoupon(dbCoupons.get(1).getId(), "ccode"));
        System.out.println("\n\n");
        //System.out.println("\nDatabase Coupons: " + dbCoupons);

        System.out.println(cService.createCoupon("test-coupon", 3.44, LocalDate.of(2023, 9, 15 )));
        System.out.println("\n\n");
        // System.out.println("\nDatabase Coupons: " + dbCoupons);

        //modify coupon
       Coupon modifiedCoupon = cService.modifyCoupon("surecode", 5.0, LocalDate.of(2023, 03, 23),"Genty");
       System.out.println("\nmodified Coupon: " + modifiedCoupon);

       System.out.println("\nDatabase Coupons: " + dbCoupons);
    }

}
