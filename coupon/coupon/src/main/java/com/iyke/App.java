package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    CouponService cService = new CouponService();
    
    //Testing the READ in the CRUD
    ArrayList<Coupon> dbCoupons = cService.getCoupons();

    System.out.println("\n All Coupons Test \n");
 
    //Testing Reading/ getting couon using id
    System.out.println("\nGet Coupon with ID: " + cService.getCoupon(dbCoupons.get(3).getId()));

    //Testing Reading/ getting couon using code name
    System.out.println("\nGet Coupon with ID: " + cService.getCoupon("elegan"));

    // Testing the Deleting by id in the CRUD and displaying deletedcoupon
    System.out.println("\nDeleted Coupon by id: " + cService.deleteCoupon(dbCoupons.get(1).getId()));

    // Testing the Deleting by id in the CRUD and displaying deletedcoupon
    System.out.println("\nDeleted Coupon by code name: " + cService.deleteCoupon("love"));

    System.out.println("\nCreate Couupon: " + cService.createCoupon(new Coupon("test-coupon", 3.44, LocalDate.of(2023, 9, 15))));
    System.out.println("\n\n");
    // System.out.println("\nDatabase Coupons: " + dbCoupons);

    // Testing the Modify coupon in the CRUD
    System.out.println("\nmodified Coupon: " + cService.modifyCoupon(new Coupon("testcode", 5.0, LocalDate.of(2023, 03, 23))));
  
    System.out.println("\nDatabase Coupons: " + dbCoupons);
  }

}
