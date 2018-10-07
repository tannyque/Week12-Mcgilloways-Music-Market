package instruments;

public class Piano extends Instrument {

    private int pedals;
    private int keys;

    public Piano(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice, int pedals, int keys) {
        super(brand, model, material, type, colour, purchasePrice, sellingPrice);
        this.pedals = pedals;
        this.keys = keys;
    }

    public int getPedals() {
        return pedals;
    }

    public int getKeys() {
        return keys;
    }

    @Override
    public String play() {
        return "Dooooon";
    }
}
