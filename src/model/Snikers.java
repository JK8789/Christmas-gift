package model;

public class Snikers extends Chokolate{
    private final boolean extraNuts;

    public Snikers(boolean extraNuts, int cocoaPercentage, String name, float weight, float price) {
        super(cocoaPercentage, name, weight, price);
        this.extraNuts = extraNuts;
    }
    public boolean getExtraNuts() {
        return extraNuts;
    }
}
