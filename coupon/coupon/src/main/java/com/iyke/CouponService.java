package com.iyke;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class CouponService implements CouponRepo {
  private Database db;

  // Constructor - ✅
  public CouponService() {
    db = new Database();
  }

  // get database
  public Database getDb() {
    return db;
  }

  // Get all coupons - ✅
  @Override
  public ArrayList<Coupon> getCoupons() {
    return db.getDbCoupon();
  }

  // ⚠️ Fix: Check the implemented interface for fix
  // create a coupon and saving to database
  @Override
  public Coupon createCoupon(String codeName, double discount, LocalDate expDate) {
    // check variables to make sure the contain values
    if (codeName.isBlank() || discount <= 0 || expDate.toString().isBlank()) {
      return null;
    }
    // checking if codeName exist in the DB
    if (getCoupon(codeName) == null) {
      // Save new coupon object to DB to db and return saved coupon
      return db.saveCoupon(new Coupon(codeName.trim(), discount, expDate));
    }
    return null;
  }

  // Get a coupon using code Name - ✅
  @Override
  public Coupon getCoupon(String codeName) {
    if (codeName.isBlank() || codeName == null)
      return null;

    for (Coupon coupon : getCoupons()) {
      if (coupon.getCodeName().equals(codeName.trim().toLowerCase())) {
        return coupon;
      }
    }
    return null;
  }

  // ⚠️ We should be implementing this method
  // Meaning it should be found in the interface
  // Get a coupon using id - 🟠
  public Coupon getCoupon(UUID id) {
    if (id.toString().isBlank() || id == null)
      return null;

    for (Coupon coupon : getCoupons()) {
      if (id == coupon.getId()) {
        return coupon;
      }
    }
    return null;
  }

  // modify coupon and save to db - ✅
  @Override
  public boolean modifyCoupon(Coupon newCoupon) {
    return db.saveCoupon(newCoupon) != null;
  }

  // delete a coupon object from the list using code name - ✅
  @Override
  public Coupon deleteCoupon(String codeName) {
    return deleteLogic(getCoupon(codeName));
  }

  // ⚠️ We should be implementing this method
  // Meaning it should be found in the interface
  // delete a coupon object from the list - 🟠
  public Coupon deleteCoupon(UUID couponId) {
    return deleteLogic(getCoupon(couponId));
  }

  // Delete Helper method - ✅
  public Coupon deleteLogic(Coupon coupon) {
    boolean isRemoved = getCoupons().remove(coupon);
    if (isRemoved) {
      return coupon;
    }
    return null;
  }

}
