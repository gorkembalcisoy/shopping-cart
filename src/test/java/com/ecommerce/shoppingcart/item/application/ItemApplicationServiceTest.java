package com.ecommerce.shoppingcart.item.application;

import com.ecommerce.shoppingcart.item.domain.factory.ItemFactoryClient;
import com.ecommerce.shoppingcart.item.domain.model.CategoryIdValues;
import com.ecommerce.shoppingcart.item.domain.model.SellerIdValues;
import com.ecommerce.shoppingcart.item.infrastructure.fileio.AddItemRequest;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ItemApplicationServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private ItemFactoryClient itemFactoryClientMock;

    @Test
    public void addItemRequestShouldPublishOrderCreatedEvent() {
        ItemApplicationService itemApplicationService = new ItemApplicationService(itemFactoryClientMock);
        AddItemRequest addItemRequest = addItemRequest();
        itemApplicationService.addItem(addItemRequest);
        verify(itemFactoryClientMock, times(1))
                .createItem(addItemRequest.getItemId(), addItemRequest.getCategoryId(), addItemRequest.getSellerId(), addItemRequest.getPrice(), addItemRequest.getQuantity());
        // TODO verify item.isvalid call -> capture
        // TODO verify item.setid call -> capture
        // TODO event published control
    }

    private static AddItemRequest addItemRequest() {
        AddItemRequest addItemRequest = new AddItemRequest();
        addItemRequest.setItemId(1);
        addItemRequest.setCategoryId(CategoryIdValues.DIGITAL.getValue());
        addItemRequest.setSellerId(SellerIdValues.VAS.getValue());
        addItemRequest.setPrice(10.0);
        addItemRequest.setQuantity(5);
        return addItemRequest;
    }
}