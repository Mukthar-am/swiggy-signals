package com.swiggy.demand.demandentity;

import com.swiggy.commons.Address;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public class User {
    private String NAME;
    private int AGE;
    private GenderMap GENDER;

    private Address ADDRESS;

    public User(String name, int age, GenderMap gender, Address address) {
        this.NAME = name;
        this.AGE = age;
        this.GENDER = gender;
        this.ADDRESS = address;
    }

    public String getName() { return NAME; }
    public int getAge() { return AGE; }
    public GenderMap getGender() { return GENDER; }
    public Address getAddress() { return ADDRESS; }
}
