package view;

import logic.GiftLogic;
import model.CandiesBag;

public class GiftPrinter {
    public void print(CandiesBag bag) {
        float totalWeight = GiftLogic.calculateTotalWeight(bag);
        float totalPrice = GiftLogic.calculateTotalPrice(bag);
        System.out.println("Weight of child's gift: " + totalWeight + " kilos");
        System.out.println("Price of child's gift: " + totalPrice + " €");
    }
}
