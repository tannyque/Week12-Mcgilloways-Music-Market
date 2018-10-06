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
        trumpet = new Trumpet("Bach", "Mariachi", "Brass", InstrumentType.BRASS, "Gold", 3);
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
    public void hasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }
}
