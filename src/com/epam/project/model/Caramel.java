package com.epam.project.model;

public class Caramel extends AbstructCandies {
    private final boolean stuffing;

    public Caramel(boolean stuffing, String name, Taste taste, float weight, float price) {
        super(name,taste, weight, price);
        this.stuffing = stuffing;
    }
    public boolean getStuffing() {
        return stuffing;
    }
    
}
