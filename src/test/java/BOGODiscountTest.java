import Discounts.BOGODiscount;
import Discounts.LoyaltyCardDiscount;
import Discounts.PercentOffDiscount;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BOGODiscountTest {

    private BOGODiscount discount;
    private ArrayList<Item> items;
    private Item apple;
    private Item banana;

    @Before
    public void before(){
        apple = new Item("apple", 0.80);
        banana = new Item("banana", 2.00);

        items = new ArrayList<Item>();
        items.add(apple);
        items.add(banana);

        discount = new BOGODiscount(banana);
    }

    @Test
    public void canGetDiscountAmountOfTwoItemsOfValue10(){
        assertEquals(10.00, discount.calculateDiscountAmount(20.00, items), 0.01);
    }

}

