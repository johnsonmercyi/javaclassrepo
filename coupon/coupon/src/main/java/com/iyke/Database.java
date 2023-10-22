package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;

public class Database {

  private ArrayList<Coupon> dbCoupon = new ArrayList<>();

  public Database() {
    populateDb();
  }

  // populate Database
  public void populateDb() {
    Coupon coupon1 = new Coupon("surecode", 3.99, LocalDate.of(2023, 9, 15));
    Coupon coupon2 = new Coupon("goodhour", 1.99, LocalDate.of(2023, 12, 12));
    Coupon coupon3 = new Coupon("blackfriday", 3.49, LocalDate.of(2023, 6, 7));
    Coupon coupon4 = new Coupon("surebet", 2.99, LocalDate.of(2023, 4, 23));
    Coupon coupon5 = new Coupon("wintersales", 4.99, LocalDate.of(2023, 9, 27));
    Coupon coupon6 = new Coupon("happyhour", 0.99, LocalDate.of(2023, 3, 3));
    Coupon coupon7 = new Coupon("elegant", 1.99, LocalDate.of(2023, 3, 23));
    Coupon coupon8 = new Coupon("consistent", 2.49, LocalDate.of(2023, 6, 15));
    Coupon coupon9 = new Coupon("love", 1.99, LocalDate.of(2023, 5, 26));
    dbCoupon.add(coupon1);
    dbCoupon.add(coupon2);
    dbCoupon.add(coupon3);
    dbCoupon.add(coupon4);
    dbCoupon.add(coupon5);
    dbCoupon.add(coupon6);
    dbCoupon.add(coupon7);
    dbCoupon.add(coupon8);
    dbCoupon.add(coupon9);
  }

  // save Coupon to db - ✅
  public Coupon saveCoupon(Coupon newCoupon) {
    Coupon existingCoupon = null;
    boolean isExist = false;//track to ensure that newCoupon exists
    if (newCoupon != null) {
      for (Coupon coupon : dbCoupon) {
        // checks if new coupon is already in database
        if (coupon.getId().equals(newCoupon.getId())) {
          coupon.setCodeName(newCoupon.getCodeName());
          coupon.setDiscount(newCoupon.getDiscount());
          coupon.setExpDate(newCoupon.getExpDate());
          isExist = true;
          existingCoupon = coupon;
        }
      }

      if (!isExist) {
        dbCoupon.add(newCoupon);// adds new coupon if it doesn't exist
      } else {
        //modify old coupon if it exists
        dbCoupon.set(dbCoupon.indexOf(existingCoupon), newCoupon);
      }

      return newCoupon;
    }
    return null;
  }

  // get Coupon
  public ArrayList<Coupon> getDbCoupon() {
    return dbCoupon;
  }

}
