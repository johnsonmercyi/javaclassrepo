package main.java.com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;

public class Database {

    private  ArrayList<Coupon> dbCoupon = new  ArrayList<>();
    private CouponService couponService;

    public Database(){
        couponService = new CouponService();
        populateDb();
    }
    //populate Database
    public void populateDb(){
        couponService.createCoupon("Sure Code", 3.99, LocalDate.of(2023, 9, 15 ));
        couponService.createCoupon("Rush Hour", 1.99, LocalDate.of(2023, 12, 12));
        couponService.createCoupon("Black Friday", 3.49, LocalDate.of(2023, 6, 7));
        couponService.createCoupon("Sure Bet", 2.99, LocalDate.of(2023, 4, 23));
        couponService.createCoupon("Winter Sales", 4.99, LocalDate.of(2023, 9, 27));
        couponService.createCoupon("Happy Hour", 0.99, LocalDate.of(2023, 3, 3));
        couponService.createCoupon("Elegant", 1.99, LocalDate.of(2023, 3, 23));
        couponService.createCoupon("Consistent", 2.49, LocalDate.of(2023, 6, 15));
        couponService.createCoupon("Love", 1.99, LocalDate.of(2023, 5, 26));
    }

    //save Coupon to db
    public Coupon saveCoupon(Coupon c){
        if( c != null){
            dbCoupon.add(c);
            return c;
        }
        return null;
    }

    //get Coupon
    public ArrayList<Coupon> getDbCoupon() {
        return dbCoupon;
    }
    //set Coupon
    public void setDbCoupon(ArrayList<Coupon> dbCoupon) {
        this.dbCoupon = dbCoupon;
    }

    


}
