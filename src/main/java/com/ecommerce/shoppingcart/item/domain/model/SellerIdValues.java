package com.ecommerce.shoppingcart.item.domain.model;

import lombok.Getter;

public enum SellerIdValues {

    VAS(5003);

    @Getter
    private final int value;

    SellerIdValues(int value) {
        this.value = value;
    }
}
