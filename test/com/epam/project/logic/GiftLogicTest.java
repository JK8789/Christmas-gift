package com.epam.project.logic;

import org.junit.Assert;
import com.epam.project.model.AbstructCandies;
import static com.epam.project.model.AbstructCandies.Taste.APPLE;
import com.epam.project.model.CandiesBag;
import com.epam.project.model.Caramel;
import com.epam.project.model.Zephir;
import org.junit.Test;

public class GiftLogicTest {

    @Test
    public void testCalculateTotalWeight() {
        CandiesBag bag = new CandiesBag();
        String name = "Zephir_Sharmel";
        AbstructCandies.Taste taste = APPLE;
        float weight = 0.5f;
        float price = 0.3f;
        bag.add(new Zephir(name, taste, weight, price));

        boolean stuffing = true;
        name = "Roshen";
        taste = APPLE;
        weight = 0.3f;
        price = 0.5f;
        bag.add(new Caramel(stuffing, name, taste, weight, price));
        float actualWeight = GiftLogic.calculateTotalWeight(bag);
        float expectedWeight = 0.8f;
        Assert.assertEquals(expectedWeight, actualWeight, 0.1f);
    }

    @Test
    public void testCalculateTotalPrice() {
        CandiesBag bag = new CandiesBag();
        String name = "Zephir_Sharmel";
        AbstructCandies.Taste taste = APPLE;
        float weight = 0.5f;
        float price = 0.3f;
        bag.add(new Zephir(name, taste, weight, price));

        boolean stuffing = true;
        name = "Roshen";
        taste = APPLE;
        weight = 0.3f;
        price = 0.5f;
        bag.add(new Caramel(stuffing, name, taste, weight, price));
        float actualPrice = GiftLogic.calculateTotalPrice(bag);
        float expectedPrice = 0.8f;
        Assert.assertEquals(expectedPrice, actualPrice, 0.1f);
    }
}
