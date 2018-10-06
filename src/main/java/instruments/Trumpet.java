package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String brand, String material, InstrumentType type, String colour, int numberOfValves) {
        super(brand, material, type, colour);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
