import model.CandiesBag;
import view.GiftPrinter;

public class Main {

    public static void main(String[] args) {
        GiftCreator creator = new GiftCreator();
        CandiesBag bag = creator.create();
        GiftPrinter printer = new GiftPrinter();
        printer.print(bag);
    }
}
