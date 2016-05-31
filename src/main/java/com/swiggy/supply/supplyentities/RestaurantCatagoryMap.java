package com.swiggy.supply.supplyentities;

/**
 * Created by mukthar.ahmed on 5/31/16.
 * <p>
 * Enum class for resturant types
 */
public enum RestaurantCatagoryMap {
    VEG(1),
    NON_VEG(2),
    BAR_AND_RESTAURANT(3);


    private final int levelCode;

    RestaurantCatagoryMap(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }

}   /**
 * end enum class
 */
