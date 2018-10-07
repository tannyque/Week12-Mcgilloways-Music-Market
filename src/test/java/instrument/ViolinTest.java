package instrument;

import instruments.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() throws Exception {
        violin = new Violin("Wessex", "XV", "Wood", InstrumentType.STRING, "Maple", 1999.99, 2375.00, "Full Size 4/4", 4);
    }

    @Test
    public void hasBrand() {
        assertEquals("Wessex", violin.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("XV", violin.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("String", violin.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Maple", violin.getColour());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(1999.99, violin.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2375, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(375.01, violin.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSize() {
        assertEquals("Full Size 4/4", violin.getSize());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("As the bow runs over the strings, the flow of endless bliss begins", violin.play());
    }
}
