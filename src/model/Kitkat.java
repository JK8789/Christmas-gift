package model;

public class Kitkat extends Chokolate{
    private final boolean raisins;
    public Kitkat(boolean raisins, int cocoaPercentage, String name, float weight, float price) {
        super(cocoaPercentage, name, weight, price);
        this.raisins = raisins;
    }
    public boolean getRaisins() {
        return raisins;
    }
}
