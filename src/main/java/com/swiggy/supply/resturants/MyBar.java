package com.swiggy.supply.resturants;

import com.swiggy.supply.supplyentities.*;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public class MyBar implements Restaurant {
    private final String NAME = "MyBar";
    private Menu MENU;
    private final Address ADDRESS  = new Address(
        "560061", "Banashankari", "Bangalore", "Karnataka", "India", "IN"
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
}
