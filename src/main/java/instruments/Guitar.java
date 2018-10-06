package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String model, String material, InstrumentType type, String colour, int numberOfStrings) {
        super(brand, model, material, type, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
