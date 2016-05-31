package com.swiggy.commons;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public class Address {
    private String PIN;
    private String STREET_NAME;
    private String CITY;
    private String STATE;
    private String COUNTRY;
    private String REGION;

    public Address(String pin, String streetName, String city, String state, String country, String region) {
        this.PIN = pin;
        this.STREET_NAME = streetName;
        this.CITY = city;
        this.STATE = state;
        this.COUNTRY = country;
        this.REGION = region;
    }

    public String getPin(String pin) {
        return PIN;
    }

    public String getStreetName(String streetName) {
        return STREET_NAME;
    }

    public String getCity(String city) {
        return CITY;
    }

    public String getState(String state) {
        return STATE;
    }

    public String getCountry(String country) {
       return COUNTRY;
    }

    /** Can also be hardcoded for now, as we are in India region only */
    public String getRegion(String region) {
        return REGION;
    }
}
