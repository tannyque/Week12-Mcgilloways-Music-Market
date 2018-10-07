package instrument;

import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", "Stratocaster","Rosewood", InstrumentType.GUITAR, "Candy Apple Red", 1639.0, 1999.0, 10);
    }

    @Test
    public void hasBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Rosewood", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("Guitar", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Candy Apple Red", guitar.getColour());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(1639, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1999, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(360, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(10, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum", guitar.play());
    }
}
