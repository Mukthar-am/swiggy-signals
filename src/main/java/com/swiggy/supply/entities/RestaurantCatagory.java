package com.swiggy.supply.entities;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Enum class for resturant types
 */
public enum RestaurantCatagory {
    PURE_VEG(0),
    VEG_AND_NONVEG(1),
    BAR_AND_RESTURANT(3);

    private int col;

    RestaurantCatagory(int col) {
        this.col = col;
    }

    public RestaurantCatagory findByValue(int col) {
        for (RestaurantCatagory mapping : RestaurantCatagory.values()) {
            if (mapping.col == col) {
                return mapping;
            }
        }
        return null;
    }   //


}   /** end enum class */

