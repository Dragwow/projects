package com.yumimi.game.models.inventory.items.potion;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;
import lombok.Data;

@Data
public abstract class Potions implements Item {

    private String name;
    private Rarity rarity;
    private String description;
    private TypeItem typeItem;

    private int quantity = 1;

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void ifUse();

    private int price;

    @Override
    public boolean equipped() {
        return false;
    }


}
