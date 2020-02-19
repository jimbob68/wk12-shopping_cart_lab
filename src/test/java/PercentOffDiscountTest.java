import Discounts.PercentOffDiscount;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PercentOffDiscountTest {

    private PercentOffDiscount discount;
    private ArrayList<Item> items;
    private Item computer;
    private Item keyboard;

    @Before
    public void before(){
        discount = new PercentOffDiscount("10% off over 20GBP",0.10, 20.00);
        computer = new Item("computer", 1000.00);
        keyboard = new Item("keyboard", 150.00);
        items = new ArrayList<Item>();
        items.add(computer);
        items.add(keyboard);
    }

    @Test
    public void discountHasPercentageOff(){
        assertEquals(0.10, discount.getDiscount(), 0.01);
    }

    @Test
    public void cannotTake10PercentOffIfUnder20GBP(){
        assertEquals(0, discount.calculateDiscountAmount(10.00, items), 0.01);
    }

    @Test
    public void canTake10PercentOffIfOver20GBP(){
        assertEquals(2, discount.calculateDiscountAmount(20.00, items), 0.01);
    }
}

