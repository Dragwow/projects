package com.yumimi.game.models.inventory.items.crafts_items;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.MagicType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.util.stats.StatBlock;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CraftItems extends StatBlock implements Item {

    private String name;                 // Имя предмета
    private String description;          // Описание
    private Rarity rarity;               // Редкость
    private TypeItem typeItem;           // Тип предмета
    private int price;

    private int quantity = 1;

    private CraftItemsType item;

    private MagicType magicType;

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

    public abstract void inUses();

    @Override
    public boolean equipped() {
        return false;
    }

    @Override
    public void setEquipped(boolean b) {}
}
