package com.ecommerce.shoppingcart.item.domain.model;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public abstract class Item {

    @Setter
    private int id;
    private final int itemId;
    private final int sellerId;
    private final int categoryId;
    private final double price;
}
