package instrument;

import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Steinway", "D-274", "Wood", InstrumentType.KEYBOARD, "Black", 300000.0,319999.0,3,88);
    }

    @Test
    public void hasBrand() {
        assertEquals("Steinway", piano.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("D-274", piano.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(300000.0, piano.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(319999.0, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(19999, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void hasPedals() {
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Dooooon", piano.play());
    }
}
