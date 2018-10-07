package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice, int numberOfStrings) {
        super(brand, model, material, type, colour, purchasePrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Strum";
    }
}
