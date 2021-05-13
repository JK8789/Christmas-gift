package com.epam.project.view;

import com.epam.project.logic.GiftLogic;
import com.epam.project.model.CandiesBag;

public class GiftPrinter {
    public void print(CandiesBag bag) {
        float totalWeight = GiftLogic.calculateTotalWeight(bag);
        float totalPrice = GiftLogic.calculateTotalPrice(bag);
        System.out.println("Weight of child's gift: " + totalWeight + " kilos");
        System.out.println("Price of child's gift: " + totalPrice + " €");
    }
}
