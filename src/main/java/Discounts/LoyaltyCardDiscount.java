package Discounts;

import Behaviours.IDiscountable;
import Items.Item;

import java.util.ArrayList;

public class LoyaltyCardDiscount implements IDiscountable {

    private String name;
    private Double discountPercentage;

    public LoyaltyCardDiscount(String name, Double discountPercentage) {
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public double calculateDiscountAmount(Double shoppingSubtotal, ArrayList<Item> items) {
        return shoppingSubtotal * this.discountPercentage;
    }
}
