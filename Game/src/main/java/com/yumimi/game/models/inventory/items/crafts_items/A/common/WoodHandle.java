package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class WoodHandle extends CraftItems {

    public WoodHandle() {
        setName("Wood Handle");
        setItem(CraftItemsType.WoodHandle);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(8);
    }
    // Используется для крафта: Rapier, Spear

    @Override
    public void inUses() {

    }


}
