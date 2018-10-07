package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() throws Exception {
        drumSticks = new DrumSticks("Vic Firth", "Titan", 50.0, 84.99);
    }

    @Test
    public void hasBrand() {
        assertEquals("Vic Firth", drumSticks.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Titan", drumSticks.getModel());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(50, drumSticks.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(84.99, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(34.99, drumSticks.calculateMarkup(), 0.01);
    }


}
