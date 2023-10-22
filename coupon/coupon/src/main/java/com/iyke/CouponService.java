package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class CouponService implements CouponRepo {
  private Database db;

  // ⚠️ This might be redundant.
  // Use the getCoupons() method instead to always fetch coupons
  private ArrayList<Coupon> dbCoupons;

  public CouponService() {
    db = new Database();
    dbCoupons = db.getDbCoupon();
  }

  // get database
  public Database getDb() {
    return db;
  }

  @Override
  /**
   * ⚠️ TODO: This is not a clean code. Getters usually don't
   * define with parameters, the db object is enough to fetch the
   * coupons from the database.
   * 
   * Displaying all coupons in the db.
   */
  public ArrayList<Coupon> getCoupons(ArrayList<Coupon> coupon) {
    if (coupon == null) {
      return null;
    }
    // coupon.forEach(t -> System.out.println(t));
    for (Coupon c : coupon) {
      System.out.println(c);
    }
    return coupon;
  }

  // ⚠️ TODO: codeName is a unique field in the database.
  // Thus, before adding a new coupon, ensure no coupon with the same code name exists.
  @Override
  // create a coupon and saving to database
  public Coupon createCoupon(String codeName, double discount, LocalDate expDate) {

    //⚠️ discount shouldn't be accepted if it's equals 0 too
    if (codeName.isBlank() || discount < 0 || expDate.toString().isBlank()) {
      return null;
    }

    //⚠️ How can you shorten the below 2 lines of code to 1?
    // call constructor to create object
    Coupon coupon = new Coupon(codeName.trim(), discount, expDate);
    // call save to db and return saved coupon
    return db.saveCoupon(coupon);
  }

  /**
   * ⚠️TODO: We need to separate the implementation for
   * when the user chooses to get coupon using couponId and codeName
   */
  @Override
  // get a single coupon using its id or code name
  public Coupon getCoupon(UUID couponId, String codeName) {
    if (couponId != null) {
      for (Coupon coupon : dbCoupons) {
        if (couponId == coupon.getId()) {
          return coupon;
        }
      }
    }
    // check if code name is Blank
    if (!codeName.isBlank()) {
      for (Coupon coupon : dbCoupons) {
        if (coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())) {
          return coupon;
        }
      }
    }
    return null;
  }

  //⚠️ Work with this method implementation
  public Coupon getCoupon(String codeName) {
    if (codeName.isBlank() || codeName == null)
      return null;

    for (Coupon coupon : dbCoupons) {
      if (coupon.getCodeName().equals(codeName)) {
        return coupon;
      }
    }

    return null;
  }

  // ⚠️ TODO: provide the implementation
  public Coupon getCoupon(UUID id) {
    return null;
  }

  /**
   * ⚠️ FIX: We should be modifying a coupon object not some fields
   */
  @Override
  // modify coupon by making all fields editable. Search with codeName
  public Coupon modifyCoupon(String codeName, double newDiscount, LocalDate newExpDate, String newCodeName) {
    if (codeName.isBlank() || newCodeName.isBlank() || newDiscount < 0 || newExpDate.toString().isBlank()) {
      return null;
    }
    String cName = newCodeName.trim().toLowerCase();
    for (Coupon coupon : dbCoupons) {
      if (coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())) {
        coupon.setCodeName(cName);
        coupon.setDiscount(newDiscount);
        coupon.setExpDate(newExpDate);
        // return db.saveCoupon(coupon);
        return coupon;
      }
    }

    return null;
  }

  /**
   * Before here, you would have fetched a coupon for modification.
   *  E.g: Coupon c = db.getCoupon(codeName);
   * Then you edit the fields of the coupon
   *  E.g: 
   *    c.setCodeName("FRIDAYSALE");
   *    c.setDiscount(2.5);
   * Then there you call on service class modifyCoupon method to ensure the old
   * coupon which you retrieved and edited is modified and saved.
   *  E.g: service.modifyCoupon(c);
   * @param newCoupon
   * @return
   */
  public boolean modifyCoupon(Coupon newCoupon) {
    return db.saveCoupon(newCoupon) != null;
  }

  /**
   * ⚠️TODO: We need to separate the implementation for
   * when the user chooses to delete using couponId and codeName
   */
  @Override
  // delete a coupon object from the list
  public Coupon deleteCoupon(UUID couponId, String codeName) {

    // ⚠️ work with this instead
    if (!codeName.isBlank() || codeName != null) {
      deleteLogic(getCoupon(codeName));
    }

    if (couponId != null) {
      for (Coupon coupon : dbCoupons) {
        if (couponId == coupon.getId()) {
          return deleteLogic(coupon);
        }
      }
    }
    // check if code name is Blank
    if (!codeName.isBlank()) {
      for (Coupon coupon : dbCoupons) {
        if (coupon.getCodeName().trim().toLowerCase().equals(codeName.trim().toLowerCase())) {
          return deleteLogic(coupon);
        }
      }
    }
    return null;
  }

  // Delete Helper method
  public Coupon deleteLogic(Coupon coupon) {
    Coupon deletedCoupon = coupon; // ⚠️ This is redundant
    boolean isRemoved = dbCoupons.remove(coupon);
    if (isRemoved) {
      return deletedCoupon; // ⚠️ return coupon instead
    }
    return null;
  }

}
