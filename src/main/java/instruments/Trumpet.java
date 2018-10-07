package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice, int numberOfValves) {
        super(brand, model, material, type, colour, purchasePrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    @Override
    public String play() {
        return "Pah-pa-rah";
    }
}
