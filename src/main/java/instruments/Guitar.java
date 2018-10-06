package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String material, InstrumentType type, String colour, int numberOfStrings) {
        super(brand, material, type, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
