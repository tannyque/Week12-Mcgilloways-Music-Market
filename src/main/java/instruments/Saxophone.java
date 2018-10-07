package instruments;

public class Saxophone extends Instrument {

    private int toneHoles;
    private String family;

    public Saxophone(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice, int toneHoles, String family) {
        super(brand, model, material, type, colour, purchasePrice, sellingPrice);
        this.toneHoles = toneHoles;
        this.family = family;
    }

    public int getToneHoles() {
        return toneHoles;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String play() {
        return "Buhoomu-hooooom";
    }
}
