import Discounts.LoyaltyCardDiscount;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LoyaltyCardDiscountTest {

    private LoyaltyCardDiscount discount;
    private ArrayList<Item> items;
    private Item computer;
    private Item keyboard;

    @Before
    public void before(){
        discount = new LoyaltyCardDiscount("Sparks Card", 0.02);
        computer = new Item("computer", 1000.00);
        keyboard = new Item("keyboard", 150.00);
        items = new ArrayList<Item>();
        items.add(computer);
        items.add(keyboard);
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(0.02, discount.getDiscountPercentage(), 0.01);
    }

    @Test
    public void canTake2PercentOff(){
        assertEquals(2.00, discount.calculateDiscountAmount(100.00, items), 0.01);
    }

}

