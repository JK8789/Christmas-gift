package com.epam.project.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Kitkat extends Chokolate {

    public Kitkat(boolean raisins, int cocoaPercentage, String name, Taste taste, float weight, float price) {
        super(cocoaPercentage,
                raisins ? Arrays.asList(new ChokoTopping("raisins")) : new ArrayList<Topping>(),
                name,
                taste,
                weight,
                price);
    }
}
