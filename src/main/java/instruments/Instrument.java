package instruments;

import behaviours.IPlay;
import shop.Stock;

public abstract class Instrument extends Stock implements IPlay {

    private String brand;
    private String model;
    private String material;
    private InstrumentType type;
    private String colour;

    public Instrument(String brand, String model, String material, InstrumentType type, String colour, Double purchasePrice, Double sellingPrice) {
        super(purchasePrice, sellingPrice);
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.type = type;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type.getType();
    }

    public String getColour() {
        return colour;
    }

}
