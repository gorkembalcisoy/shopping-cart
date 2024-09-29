package com.ecommerce.shoppingcart.item.domain.factory;

import com.ecommerce.shoppingcart.item.domain.model.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemFactoryClient {

    private static final List<ItemFactory> itemFactories = new ArrayList<>();

    static {
//        itemFactories.add(new DigitalItemFactory());
    }

    public Item createItem(int itemId, int categoryId, int sellerId, double price, int quantity) {
        return itemFactories
                .stream()
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
