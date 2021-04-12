package model;

public class Chokolate extends AbstructCandies {
    private final int cocoaPercentage;

    public Chokolate(int cocoaPercentage, String name, float weight, float price) {
        super(name, weight, price);
        this.cocoaPercentage = cocoaPercentage;
    }
    public int getCocoaPercentage(){
        return cocoaPercentage;
    }
}
