package com.swiggy.supply.supplyentities;

/**
 * Created by mukthar.ahmed on 5/31/16.
 *
 *  Menu object
 *
 */
public class Menu {
    private MainCourseNonVeg mainCourseNonVeg;
    private StartersNonVeg startersNonVeg;

    private StartersVeg startersVeg;
    private MainCourseVeg mainCourseVeg;


    /** veg setters */
    public void setMainCourseVeg(MainCourseVeg vegCourse) {
        this.mainCourseVeg = vegCourse;
    }

    public void setStartersVeg(StartersVeg vegStarters) {
        this.startersVeg = vegStarters;
    }

    /** non-veg setters */
    public void setMainCourseNonVeg(MainCourseNonVeg nonVegCourse) {
        this.mainCourseNonVeg = nonVegCourse;
    }
    public void setStartersNonVeg(StartersNonVeg nonVegStarters) {
        this.startersNonVeg = nonVegStarters;
    }


    /** Veg section, so that you don't mess up
     *  Note: return Object type shall make sure that you do not mix up, veg items with non-veg
     * */
    public MainCourseVeg getMainCourseVeg() {
        return this.mainCourseVeg;
    }
    public StartersVeg StartersVeg() {
        return this.startersVeg;
    }



    /** Non-Veg, section segrated so that you don't mess up
     * Note: return Object type shall make sure that you do not mix up, veg items with non-veg
     * */
    public MainCourseNonVeg getMainCourseNonVeg() {
        return this.mainCourseNonVeg;
    }
    public StartersVeg getStartersNonVeg() {
        return this.startersVeg;
    }

}
