package com.swiggy.signals;

import com.swiggy.commons.Address;
import com.swiggy.demand.demandentity.GenderMap;
import com.swiggy.demand.demandentity.User;
import com.swiggy.supply.resturants.DeliverOrder;
import com.swiggy.supply.resturants.Empire;
import com.swiggy.supply.resturants.MyBar;
import com.swiggy.supply.supplyentities.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public class SignalProcessor {
    List<Restaurant> activeRestaurants = new ArrayList<Restaurant>();

    {
        activeRestaurants.add(new Empire());
        activeRestaurants.add(new MyBar());
    }
    public SignalProcessor() {

    }

    public boolean hasRestaurant(Restaurant restaurant) {

        for (Restaurant restaurantName : activeRestaurants) {
            if (restaurantName.getName().equalsIgnoreCase(restaurant.getName())) {
                return true;
            }
        }
        return false;
    }


    /** Due to the time constraint, Lets start with basic order processing method */
    public void getOrder(User user, Restaurant restaurantPicked, String orderItem, int itemCount)
        throws Exception {


        Random rand = new Random();
        int  orderId = rand.nextInt(50) + 1;

        /** This should ideally not be encountered as the demand app is also something that
         * we control but could error out due to wrong configurations or restaurant not working on a given day
         * and handled as a corner case */

        System.out.println(activeRestaurants.toString());
        if (!hasRestaurant(restaurantPicked)) {
            throw new Exception("# Restaurant not found exception.");
        }


        if (restaurantPicked.itemAvailability(orderItem) >= 1) {
            System.out.println("# Order will be placed shortly, pls hold up.");
            restaurantPicked.prepareOrder(orderId, orderItem, itemCount, false);
        }
        else {
            /** Handle all the signals here */
        }


        System.out.println(restaurantPicked.getCatagory());

    }

    public static void main(String[] args) {

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
