package com.ecommerce.shoppingcart.item.domain.model;

import lombok.Getter;

public enum CategoryIdValues {

    DIGITAL(7889),
    FURNITURE(1001),
    ELECTRONICS(3004),
    VAS(3242);

    @Getter
    private final int value;

    CategoryIdValues(int value) {
        this.value = value;
    }
}
