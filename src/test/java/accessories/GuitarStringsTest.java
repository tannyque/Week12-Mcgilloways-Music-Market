package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings("Ernie Ball", "Regular Slinky", 10.0, 20.0);
    }

    @Test
    public void hasBrand() {
        assertEquals("Ernie Ball", guitarStrings.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Regular Slinky", guitarStrings.getModel());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(10, guitarStrings.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(20, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, guitarStrings.calculateMarkup(), 0.01);
    }
}
