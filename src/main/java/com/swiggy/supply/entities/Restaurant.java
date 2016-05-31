package com.swiggy.supply.entities;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Abstraction for individual resturant objects
 */
public interface Restaurant {
    public String getName();

    public Menu getMenu();

    public RestaurantAddress getResturantAddress();

    public RestaurantCatagory getCatagory(int id);
}
