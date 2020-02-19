package Discounts;

import Behaviours.IDiscountable;
import Items.Item;

import java.util.ArrayList;

public class PercentOffDiscount {

    private String name;
    private Double percentage;
    private Double minimumSpend;

    public PercentOffDiscount(String name, Double percentage, Double minimumSpend){
        this.name = name;
        this.percentage = percentage;
        this.minimumSpend = minimumSpend;
    }

    public double getDiscount() {
        return this.percentage;
    }

    public Double calculateDiscountAmount(Double subtotal, ArrayList<Item> items){
        Double discountAmount = 0.0;
        if (subtotal >= this.minimumSpend){
            discountAmount = subtotal * this.percentage;
        }
        return discountAmount;
    }
}
