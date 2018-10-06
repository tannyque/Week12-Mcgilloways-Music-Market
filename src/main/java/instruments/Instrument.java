package instruments;

public abstract class Instrument {

    private String brand;
    private String material;
    private InstrumentType type;
    private String colour;

    public Instrument(String brand, String material, InstrumentType type, String colour) {
        this.brand = brand;
        this.material = material;
        this.type = type;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
