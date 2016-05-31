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
}
