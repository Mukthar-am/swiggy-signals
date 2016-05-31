package com.swiggy.supply.resturants;

import com.swiggy.commons.Address;
import com.swiggy.supply.supplyentities.*;

import java.util.HashMap;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Single restaurant entity
 */
public class Empire implements Restaurant {
    private final String NAME = "Empire Restaurant";
    private Menu MENU;
    private final Address ADDRESS  = new Address(
        "560061", "JP Nagar", "Bangalore", "Karnataka", "India", "IN"
    );

    private RestaurantCatagoryMap CATAGORY;

    public String getName() {
        setMenu();
        this.CATAGORY = RestaurantCatagoryMap.BAR_AND_RESTAURANT;
        return NAME;
    }

    /**
     *  Description: Creating a menu item for empire restaurant
     * @return  Menu
     */
    public void setMenu() {
        MainCourseNonVeg mainCoursseNonVeg = new MainCourseNonVeg();
        StartersNonVeg startersNonVeg = new StartersNonVeg();

        MainCourseVeg mainCourseVeg = new MainCourseVeg();
        StartersVeg startersVeg = new StartersVeg();

        Menu menu = new Menu();

        /** Non-veg section */
        menu.setMainCourseNonVeg(mainCoursseNonVeg);
        menu.setStartersNonVeg(startersNonVeg);

        /** veg section */
        menu.setMainCourseVeg(mainCourseVeg);
        menu.setStartersVeg(startersVeg);
        this.MENU = menu;
    }

    public Menu getMenu() { return this.MENU; }
    public Address getResturantAddress() { return this.ADDRESS; }
    public RestaurantCatagoryMap getCatagory() { return this.CATAGORY; }



    /** Items in stock */
    public HashMap<String, Integer> itemsInStock() {
        final String muttonBiryani = "Mutton Biryani";
        HashMap<String, Integer> itemsAvailabe = new HashMap<String, Integer>() {{
            put(muttonBiryani.toLowerCase(), 3);

        }};

        return itemsAvailabe;
    }


    /** Get the count of the items available so that orders can be served in a queue */
    public int isItemAvailable(String itemName) {
        if ( itemsInStock().containsKey( itemName.toLowerCase() ) ) {
            int totalStock = itemsInStock().get(itemName.toLowerCase();
            if ( totalStock >= 1) {
                return totalStock;
            }
        }
        return -1;
    }


    public enum status {
        BUSY(1),
        ACCEPTED(2),
        OUT_OF_STOCK(3);


        private final int levelCode;

        status(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }
    }
}
