package com.epam.project.model;

import java.util.Objects;

public abstract class AbstructCandies {
    public enum Taste {
        APPLE, VANILLA, ORANGE, NUT, COFFEE
    }
    private final Taste taste;
    private final String name;
    private final float weight;
    private final float price;
    public AbstructCandies(final String name, Taste taste, float weight, float price){
        if (weight<=0) {
            throw new IllegalArgumentException("Invalid weight. Please input a positive value for the weight of the Candies"); 
        }
        if (price<=0) {
            throw new IllegalArgumentException("Invalid price. Please input a positive value for the price of the Candies");
        }
        this.name = name;
        this.taste = taste;
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public float getWeight(){
        return weight;
    }
    public float getPrice(){
        return price;
    }
    public Taste getTaste() {
        return taste;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.taste);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Float.floatToIntBits(this.weight);
        hash = 37 * hash + Float.floatToIntBits(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstructCandies other = (AbstructCandies) obj;
        if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(other.weight)) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return this.taste == other.taste;
    }
    
    
}

