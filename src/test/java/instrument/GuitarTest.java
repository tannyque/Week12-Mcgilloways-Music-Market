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
        guitar = new Guitar("Stratocaster", "Rosewood", InstrumentType.GUITAR, "Candy Apple Red", 10);
    }

    @Test
    public void hasBrand() {
        assertEquals("Stratocaster", guitar.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Rosewood", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Candy Apple Red", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(10, guitar.getNumberOfStrings());
    }
}
