package instruments;

public class Piano extends Instrument {

    private int pedals;
    private int keys;

    public Piano(String brand, String model, String material, InstrumentType type, String colour, int pedals, int keys) {
        super(brand, model, material, type, colour);
        this.pedals = pedals;
        this.keys = keys;
    }

    public int getPedals() {
        return pedals;
    }

    public int getKeys() {
        return keys;
    }
}
