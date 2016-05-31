package com.swiggy.demand.demandentity;

/**
 * Created by mukthar.ahmed on 5/31/16.
 */
public enum GenderMap {
    M(1),
    F(2),
    U(3);


    private final int levelCode;

    GenderMap(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }

}
