package instrument;

import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("Bach", "Mariachi", "Brass", InstrumentType.BRASS, "Gold", 3349.0, 3799.0,3);
    }

    @Test
    public void hasBrand() {
        assertEquals("Bach", trumpet.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Mariachi", trumpet.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(3349.0, trumpet.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3799.0, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(450, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Pah-pa-rah", trumpet.play());
    }
}
