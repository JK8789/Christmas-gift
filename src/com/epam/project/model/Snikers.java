package com.epam.project.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Snikers extends Chokolate {

    public Snikers(boolean extraNuts, int cocoaPercentage, String name, Taste taste, float weight, float price) {
        super(cocoaPercentage,
                extraNuts ? Arrays.asList(new ChokoTopping("extraNuts")) : new ArrayList<Topping>(),
                name,
                taste,
                weight,
                price);
    }
}
