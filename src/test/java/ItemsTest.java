import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsTest {

    private Item item;

    @Before
    public void before(){
        item = new Item("MacBook", 1000.00);
    }

    @Test
    public void canGetPrice(){
        assertEquals(1000.00, item.getPrice(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("MacBook", item.getName());
    }
}
