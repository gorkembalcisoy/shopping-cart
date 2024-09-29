package com.ecommerce.shoppingcart.item.domain.factory;

import com.ecommerce.shoppingcart.item.domain.model.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ItemFactoryClient {

    private final DigitalItemFactory digitalItemFactory;

    public Item createItem(int itemId, int categoryId, int sellerId, double price, int quantity) {
        return Stream.of(digitalItemFactory)
                .filter(itemFactory -> itemFactory.accept(categoryId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("any item factory cannot be found"))
                .createItem(itemId,
                        categoryId,
                        sellerId,
                        price,
                        quantity);
    }
}
