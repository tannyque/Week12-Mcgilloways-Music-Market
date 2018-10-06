package instrument;

import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        saxophone = new Saxophone("Selmer", "Series III", "Brass", InstrumentType.WOODWIND,"Gold", 23, "Tenor");
    }

    @Test
    public void hasBrand() {
        assertEquals("Selmer", saxophone.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Series III", saxophone.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Woodwind", saxophone.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void hasToneHoles() {
        assertEquals(23, saxophone.getToneHoles());
    }

    @Test
    public void hasFamily() {
        assertEquals("Tenor", saxophone.getFamily());
    }
}
