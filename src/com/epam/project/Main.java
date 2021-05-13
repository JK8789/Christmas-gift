package com.epam.project;

import com.epam.project.model.CandiesBag;
import com.epam.project.view.GiftPrinter;

public class Main {

    public static void main(String[] args) {
        GiftCreator creator = new GiftCreator();
        CandiesBag bag = creator.create();
        GiftPrinter printer = new GiftPrinter();
        printer.print(bag);
    }
}
