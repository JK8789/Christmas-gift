package com.epam.project.logic;

import java.util.List;
import com.epam.project.model.AbstructCandies;
import com.epam.project.model.CandiesBag;

public class GiftLogic {
    public static float calculateTotalWeight(CandiesBag bag){
        List<AbstructCandies> candies = bag.getCandies();
        float totalWeight = 0;
        for (int i = 0; i < candies.size(); i++) {
            totalWeight += candies.get(i).getWeight();
        }
        return totalWeight;
    }
    public static float calculateTotalPrice(CandiesBag bag){
        List<AbstructCandies> candies = bag.getCandies();
        float totalPrice = 0;
        for (int i = 0; i < candies.size(); i++) {
            totalPrice += candies.get(i).getPrice();
        }
        return totalPrice;
    }
}
