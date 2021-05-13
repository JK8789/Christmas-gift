package com.epam.project;

import com.epam.project.model.AbstructCandies.Taste;
import static com.epam.project.model.AbstructCandies.Taste.APPLE;
import static com.epam.project.model.AbstructCandies.Taste.COFFEE;
import static com.epam.project.model.AbstructCandies.Taste.NUT;
import static com.epam.project.model.AbstructCandies.Taste.ORANGE;
import static com.epam.project.model.AbstructCandies.Taste.VANILLA;
import com.epam.project.model.CandiesBag;
import com.epam.project.model.Caramel;
import com.epam.project.model.ChokoTopping;
import com.epam.project.model.Chokolate;
import com.epam.project.model.Kitkat;
import com.epam.project.model.Snikers;
import com.epam.project.model.Topping;
import com.epam.project.model.Zephir;
import java.util.ArrayList;
import java.util.List;

public class GiftCreator {
    public CandiesBag create(){
        CandiesBag bag = new CandiesBag();
        String name = "Zephir_Sharmel";
        Taste taste = APPLE;
        float weight = 0.5f;
        float price = 0.3f;
        bag.add(new Zephir(name, taste, weight, price));
        
        boolean stuffing = true;
        name = "Roshen";
        taste = APPLE;
        weight = 0.3f;
        price = 0.5f;
        bag.add(new Caramel(stuffing, name, taste, weight, price));
        
        stuffing = false;
        name = "Barbaris";
        taste = VANILLA;
        weight = 0.3f;
        price = 0.5f;
        bag.add(new Caramel(stuffing, name, taste, weight, price));
        
        int cocoaPercentage = 55;
        name = "Milka";
        taste = ORANGE;
        weight = 0.2f;
        price = 0.4f;
        bag.add(new Chokolate(cocoaPercentage, name, taste, weight, price));
        
        cocoaPercentage = 55;
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new ChokoTopping("nuts"));
        name = "Milka";
        taste = COFFEE;
        weight = 0.2f;
        price = 0.6f;
        bag.add(new Chokolate(cocoaPercentage, toppings, name, taste, weight, price));
        
        boolean raisins = true;
        cocoaPercentage = 65;
        name = "DarkKitKat";
        taste = COFFEE;
        weight = 0.4f;
        price = 2.0f;
        bag.add(new Kitkat(raisins, cocoaPercentage, name, taste, weight, price));
        
        boolean extraNuts = true;
        cocoaPercentage = 60;
        name = "SuperSnikers";
        taste = NUT;
        weight = 0.3f;
        price = 2.0f;
        bag.add(new Snikers(extraNuts, cocoaPercentage, name, taste, weight, price));
        
        extraNuts = true;
        cocoaPercentage = 60;
        name = "SuperSnikers";
        taste = COFFEE;
        weight = 0.3f;
        price = 2.0f;
        bag.add(new Snikers(extraNuts, cocoaPercentage, name, taste, weight, price));
        return bag;
    }
}
