package com.swiggy.supply.resturants;

import com.swiggy.supply.entities.Menu;
import com.swiggy.supply.entities.Restaurant;
import com.swiggy.supply.entities.RestaurantAddress;
import com.swiggy.supply.entities.RestaurantCatagory;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Single restaurant  entity
 */
public class Empire implements Restaurant {
    private final String NAME = "Empire Restaurant";
    private Menu MENU;
    private RestaurantAddress ADDRESS;
    private RestaurantCatagory CATAGORY;

    public Empire(String name, Menu menu, RestaurantAddress address, RestaurantCatagory catagory) {
        this.MENU = menu;
        this.ADDRESS = address;
        this.CATAGORY = catagory;
    }


    public String getName() {
        return NAME;
    }

    public Menu getMenu() {
        return MENU;
    }

    public RestaurantAddress getResturantAddress() {
        return ADDRESS;
    }

    public RestaurantCatagory getCatagory(int id) {
        return CATAGORY.findByValue(id);
    }
}
