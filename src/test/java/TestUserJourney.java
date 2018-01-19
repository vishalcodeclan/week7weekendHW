import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUserJourney {

    Guitar guitar;
    Keyboard keyboard;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar(Colour.BROWN, Material.STEEL, GuitarItem.YAM01);
        keyboard = new Keyboard(Colour.BLACK, Material.PLASTIC, KeyboardItem.NOV02);
        shop = new Shop();

    }

    @Test
    public void canGetBrand(){
        assertEquals(GuitarBrand.YAMAHA, guitar.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1000.0, keyboard.getItemPrice(), 0.01);

    }

    @Test
    public void canGetItem(){
        assertEquals(GuitarItem.YAM01, guitar.getItem());

    }

    @Test
    public void cangetWholesalePrice(){
        assertEquals(100.0, guitar.getWholesalePrice(), 0.01);
    }

    @Test
    public void canAddItem(){
        shop.addItem(guitar, -50.0);
        assertEquals(100.0, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        shop.addItem(guitar, 1.2);
        assertEquals(1.2, shop.calculateMarkup(), 0.01);

    }

    @Test
    public void canGetPriceKEyboard(){
        assertEquals(1000.0, keyboard.getWholesalePrice(),0.01);
    }

    @Test
    public void canRemoveItem(){
        shop.addItem(guitar, 1.2);
        shop.addItem(guitar, 1.2);
        shop.addItem(keyboard, 1.2);

        assertEquals(240, shop.profit(),0.01);
    }








}
