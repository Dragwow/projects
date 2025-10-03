package com.yumimi.game.models.shop;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;
import lombok.Getter;

@Getter
public class ShopItem {

    private final Item item;
    private final int price;

    public ShopItem(Item item) {
        if (item == null) throw new IllegalArgumentException("cant be null");
        this.item = item;
        this.price = item.getPrice();
    }

    public Rarity getRarity() {
       return item.getRarity();
    }

    public String getName() {
        return item.getName();
    }

    public TypeItem getTypeItem(){
        return item.getTypeItem();
    }

    public String getDescription(){
        return item.getDescription();
    }
}
