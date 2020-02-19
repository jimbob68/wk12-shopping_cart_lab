package ShoppingCart;

import Behaviours.IDiscountable;
import Items.Item;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> items;
    private ArrayList<IDiscountable> discounts;
    private Double total;
    private Double totalAfterDiscounts;

    public ShoppingCart(ArrayList<Item> items, ArrayList<IDiscountable> discounts, Double total, Double totalAfterDiscounts) {
        this.items = items;
        this.discounts = discounts;
        this.total = total;
        this.totalAfterDiscounts = totalAfterDiscounts;
    }


}
