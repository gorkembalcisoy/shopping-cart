package com.ecommerce.shoppingcart.item.application;

import com.ecommerce.shoppingcart.item.domain.factory.ItemFactoryClient;
import com.ecommerce.shoppingcart.item.domain.model.Item;
import com.ecommerce.shoppingcart.item.infrastructure.fileio.AddItemRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemApplicationService {

    private final ItemFactoryClient itemFactoryClient;

    public void addItem(AddItemRequest addItemRequest) {
        Item item = itemFactoryClient
                .createItem(addItemRequest.getItemId(), addItemRequest.getCategoryId(), addItemRequest.getSellerId(), addItemRequest.getPrice(), addItemRequest.getQuantity());
//        item.isValid();
//        item.setId();
//        eventpublish to gateway
    }
}
