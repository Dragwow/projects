package com.yumimi.game.models.inventory.items;

import lombok.Getter;

@Getter
public class ShopItem {

    private final Item item;
    private final int price;

    public ShopItem(Item item){
        this.item = item;
        this.price = item.getPrice();
    }
}
