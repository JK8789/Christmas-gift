package model;

public class Caramel extends AbstructCandies {
    private final boolean stuffing;

    public Caramel(boolean stuffing, String name, float weight, float price) {
        super(name, weight, price);
        this.stuffing = stuffing;
    }
    public boolean getStuffing() {
        return stuffing;
    }
    
}
