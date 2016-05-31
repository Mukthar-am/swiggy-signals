package com.swiggy;

import com.swiggy.commons.Address;
import com.swiggy.demand.demandentity.GenderMap;
import com.swiggy.demand.demandentity.User;
import com.swiggy.signals.SignalProcessor;
import com.swiggy.supply.resturants.Empire;
import com.swiggy.supply.supplyentities.Restaurant;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class OrderTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public OrderTest(String testName )  {
        SignalProcessor signalProcessor = new SignalProcessor();
        Address address = new Address(
            "560061", "JP Nagar", "Bangalore", "Karnakata", "India", "IN"
        );

        User user = new User("Mukthar", 30, GenderMap.M, address);
        Restaurant restaurantPicked = new Empire();
        String orderItem = "mutton biryani";
        int itemCount = 2;

        /*
        User user, Restaurant restaurantPicked, String orderItem, int itemCount
         */
        try {
            signalProcessor.getOrder(user, restaurantPicked, orderItem, itemCount);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
