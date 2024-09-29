package com.ecommerce.shoppingcart.item.domain.factory;

import com.ecommerce.shoppingcart.item.domain.model.Item;

public abstract class ItemFactory {

    public abstract Item createItem(int itemId, int categoryId, int sellerId, double price, int quantity);

    public abstract boolean accept(int categoryId);
}
