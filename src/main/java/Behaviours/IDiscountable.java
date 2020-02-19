package Behaviours;

import Items.Item;

import java.util.ArrayList;

public interface IDiscountable {

    double calculateDiscountAmount(Double shoppingSubtotal, ArrayList<Item> items);

}
