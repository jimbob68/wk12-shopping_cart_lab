package Discounts;

import Items.Item;

import java.util.ArrayList;

public class BOGODiscount {

    private Item itemOnOffer;

    public BOGODiscount(Item itemOnOffer) {
        this.itemOnOffer = itemOnOffer;
    }

    public double calculateDiscountAmount(Double shoppingSubtotal, ArrayList<Item> items) {
        int numberOfItems = 0;
        for (Item item : items){
            if (this.itemOnOffer.getName().equals(item.getName())){
                numberOfItems += 1;
            }
        }

        if (numberOfItems % 2){
            Double totalCostOfItems = numberOfItems * this.itemOnOffer.getPrice();
            return totalCostOfItems / 2;
        } else if (numberOfItems - 1 % 2){
            Double totalCostOfItems = (numberOfItems - 1) * this.itemOnOffer.getPrice();
            return totalCostOfItems / 2;
        } else {
            return 0.0;
        }
    }
}
