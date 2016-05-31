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

    public Empire() {}

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

        /**
         * Note: We can use a BlockingQueue here instead of HashMap so that the orders tracking
         * and First Come, First Served is applied here.
         *
         * Using hashmap for simplicity
         */
        HashMap<String, Integer> itemsAvailabe = new HashMap<String, Integer>() {{
            put(muttonBiryani.toLowerCase(), 3);

        }};

        return itemsAvailabe;
    }


    /** Get the count of the items available so that orders can be served in a queue */
    public int itemAvailability(String itemName) {
        if ( itemsInStock().containsKey( itemName.toLowerCase() ) ) {
            int totalStock = itemsInStock().get(itemName.toLowerCase());
            if ( totalStock >= 1) {
                return totalStock;
            }
        }
        return -1;
    }

    public PlaceOrderStatus prepareOrder(Integer orderId, String item, int itemCount, boolean testingTagBusy) {
        int availabilityCount = itemAvailability(item);

        /** Place an order only if the item count requested is >= total available */
        if (availabilityCount >= itemCount) {

            if (testingTagBusy) {
                return PlaceOrderStatus.BUSY;
            }

            int available = itemsInStock().get(item);
            this.itemsInStock().put(item, available - itemCount);

            try {
                Thread.sleep(10000);
                DeliverOrder.readyToDeliver(orderId);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (availabilityCount < itemCount ) {
            return PlaceOrderStatus.OUT_OF_STOCK;

        }

        return PlaceOrderStatus.ACCEPTED;
    }

//    public enum PlaceOrderStatus {
//        BUSY(1),
//        ACCEPTED(2),
//        OUT_OF_STOCK(3);
//
//        private final int levelCode;
//
//        PlaceOrderStatus(int levelCode) {
//            this.levelCode = levelCode;
//        }
//
//        public int getLevelCode() {
//            return this.levelCode;
//        }
//    }
}
