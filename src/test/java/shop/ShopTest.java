package shop;

import accessories.DrumSticks;
import accessories.GuitarStrings;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    Violin violin;
    Guitar guitar;
    GuitarStrings guitarStrings;
    ArrayList<ISell> stock;


    @Before
    public void setUp() throws Exception {
        stock = new ArrayList<>();
        drumSticks = new DrumSticks("Vic Firth", "Titan", 50.0, 84.99);
        violin = new Violin("Wessex", "XV", "Wood", InstrumentType.STRING, "Maple", 1999.99, 2375.00, "Full Size 4/4", 4);
        guitar = new Guitar("Fender", "Stratocaster","Rosewood", InstrumentType.GUITAR, "Candy Apple Red", 1639.0, 1999.0, 10);
        guitarStrings = new GuitarStrings("Ernie Ball", "Regular Slinky", 10.0, 20.0);
        stock.add(drumSticks);
        stock.add(violin);
        stock.add(guitar);
        shop = new Shop("McGilloway's Music Market", stock);
    }

    @Test
    public void hasName() {
        assertEquals("McGilloway's Music Market", shop.getName());
    }

    @Test
    public void canCountStock() {
        assertEquals(3, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitarStrings);
        assertEquals(4, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(drumSticks);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void cannotRemoveStock() {
        shop.removeStock(guitarStrings);
        assertEquals(3, shop.stockCount());
    }

    @Test
    public void canCalculatePotentialProfit() {
        assertEquals(770, shop.calculateTotalProfit(), 0.01);
    }
}
