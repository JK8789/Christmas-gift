package com.epam.project.model;

import java.util.LinkedList;
import java.util.List;

public class Chokolate extends AbstructCandies {
    private final int cocoaPercentage;
    private final List<Topping> toppings;

    public Chokolate(int cocoaPercentage, String name, Taste taste, float weight, float price) {
        super(name, taste, weight, price);
        this.cocoaPercentage = cocoaPercentage;
        toppings = new LinkedList<>();
    }
    public Chokolate(int cocoaPercentage, List<Topping> toppings, String name, Taste taste, float weight, float price) {
        super(name, taste, weight, price);
        this.cocoaPercentage = cocoaPercentage;
        this.toppings = toppings;
    }
    
    public int getCocoaPercentage(){
        return cocoaPercentage;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
    
}
