package com.swiggy.signals.Resturants;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Enum class for resturant types
 */
public enum ResturantCatagory {
    PURE_VEG(0),
    VEG_AND_NONVEG(1),
    BAR_AND_RESTURANT(3);

    private int col;

    ResturantCatagory(int col) {
        this.col = col;
    }

    public static ResturantCatagory findByValue(int col) {
        for (ResturantCatagory mapping : ResturantCatagory.values()) {
            if (mapping.col == col) {
                return mapping;
            }
        }
        return null;
    }   //


}   /** end enum class */

