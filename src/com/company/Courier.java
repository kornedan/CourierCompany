package com.company;

public class Courier {
    private String nameCourier;
    private int numberRegion;

    public Courier(String nameCourier, int numberRegion) {
        this.nameCourier = nameCourier;
        this.numberRegion = numberRegion;
    }

    public int getNumberRegion() {
        return numberRegion;
    }

    public String getNameCourier() {
        return nameCourier;
    }
}
