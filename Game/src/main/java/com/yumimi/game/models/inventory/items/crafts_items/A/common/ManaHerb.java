package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ManaHerb extends CraftItems {

    public ManaHerb() {
        setName("Mana Herb");
        setItem(CraftItemsType.ManaHerb);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(12);
    }
    // Используется для крафта: ManaLoop

    @Override
    public void inUses() {

    }

}
