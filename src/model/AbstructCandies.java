package model;
public abstract class AbstructCandies {
    private final String name;
    private final float weight;
    private final float price;
    public AbstructCandies(final String name, float weight, float price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
    
}

