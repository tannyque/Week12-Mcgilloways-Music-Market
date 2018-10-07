package instruments;

public class Violin extends Instrument {

    private String size;
    private int numberOfStrings;

    public Violin(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice, String size, int numberOfStrings) {
        super(brand, model, material, type, colour, purchasePrice, sellingPrice);
        this.size = size;
        this.numberOfStrings = numberOfStrings;
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "As the bow runs over the strings, the flow of endless bliss begins";
    }
}
