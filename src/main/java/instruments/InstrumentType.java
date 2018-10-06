package instruments;

public enum InstrumentType {

    WOODWIND("Woodwind"),
    BRASS("Brass"),
    STRING("String"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard"),
    GUITAR("Guitar");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
