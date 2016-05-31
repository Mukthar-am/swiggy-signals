package com.swiggy.supply.resturants;

import com.swiggy.supply.supplyentities.Restaurant;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public class DeliverOrder {

    public static Restaurant.PlaceOrderStatus readyToDeliver(Integer orderId) {
        /**
         * Logic to listen once the order is prepared
         */
        System.out.println("# Order - " + orderId + "is ready to deliver");
        return Restaurant.PlaceOrderStatus.ACCOMPLISHED;
    }
}
