package model;

public class Zephir extends AbstructCandies {
    public enum Taste {
        APPLE, VANILLA, ORANGE
    }
    private final Taste taste;
    public Zephir(Taste taste, String name, float weight, float price) {
        super(name, weight, price);
        this.taste = taste;
    }
    public Taste getTaste() {
        return taste;
    }
    
}
