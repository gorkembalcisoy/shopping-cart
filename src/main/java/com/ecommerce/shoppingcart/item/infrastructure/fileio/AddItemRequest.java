package com.ecommerce.shoppingcart.item.infrastructure.fileio;

import lombok.Data;

@Data
public class AddItemRequest {

    private int itemId;
    private int categoryId;
    private int sellerId;
    private double price;
    private int quantity;
}
