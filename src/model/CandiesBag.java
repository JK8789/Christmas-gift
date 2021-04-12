package model;
import java.util.List;
import java.util.LinkedList;
public class CandiesBag {
    private final List<AbstructCandies> candies;
    public CandiesBag() {
        candies = new LinkedList<AbstructCandies>();    
    }
    public void add(AbstructCandies candy){
        candies.add(candy);
    }
    public List<AbstructCandies> getCandies() {
        return candies;
    }
    
}
