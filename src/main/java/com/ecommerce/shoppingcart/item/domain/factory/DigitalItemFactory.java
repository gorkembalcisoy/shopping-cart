package com.ecommerce.shoppingcart.item.domain.factory;

import com.ecommerce.shoppingcart.item.domain.model.Item;

public class DigitalItemFactory extends ItemFactory {
    @Override
    public Item createItem(int itemId, int categoryId, int sellerId, double price, int quantity) {
        return null;
    }

    @Override
    public boolean accept(int categoryId) {
        return false;
    }
}
