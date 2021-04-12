import model.CandiesBag;
import model.Caramel;
import model.Chokolate;
import model.Kitkat;
import model.Snikers;
import model.Zephir;

public class GiftCreator {
    public CandiesBag create(){
        CandiesBag bag = new CandiesBag();
        bag.add(new Zephir(Zephir.Taste.APPLE, "Sharmel", (float) 0.5, (float) 0.3));
        bag.add(new Caramel(true, "Roshen", (float) 0.3, (float) 0.5));
        bag.add(new Caramel(false, "Barbaris", (float) 0.3, (float) 0.5));
        bag.add(new Chokolate(55, "Milka", (float) 0.5, (float) 1.5));
        bag.add(new Kitkat(true, 65, "DarkKitKat", (float) 0.4, 2));
        bag.add(new Snikers(true, 60, "SuperSnikers", (float) 0.3, 2));
        bag.add(new Snikers(true, 60, "SuperSnikers", (float) 0.3, 2));
        return bag;
    }
}
