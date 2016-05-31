package com.swiggy.supply.supplyentities;

import com.swiggy.commons.Address;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Abstraction for individual resturant objects
 */
public interface Restaurant {
    public String getName();

    public Menu getMenu();

    public Address getResturantAddress();

    public RestaurantCatagoryMap getCatagory();

    public int itemAvailability(String itemName);

    public PlaceOrderStatus prepareOrder(Integer orderId, String item, int itemCount, boolean testingTagBusy);

    public enum PlaceOrderStatus {
        BUSY(1),
        ACCEPTED(2),
        OUT_OF_STOCK(3),
        ACCOMPLISHED(3);

        private final int levelCode;

        PlaceOrderStatus(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }
    }
}
