package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Benj", "The Greatest Showman", 5.0, 11.99);
    }

    @Test
    public void hasBrand() {
        assertEquals("Benj", sheetMusic.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("The Greatest Showman", sheetMusic.getModel());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(5.0, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(11.99, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(6.99, sheetMusic.calculateMarkup(), 0.01);
    }
}