package com.ecommerce.shoppingcart.item.domain.model;

import java.util.List;

public class DefaultItem extends Item {

    public DefaultItem(int id, int sellerId, int categoryId, double price) {
        super(id, sellerId, categoryId, price);
    }

    private List<VasItem> vasItems;
}
