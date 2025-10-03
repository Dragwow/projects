package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ClothStrap extends CraftItems {

    public ClothStrap() {
        setName("Cloth Strap");
        setItem(CraftItemsType.ClothStrap);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(6);
    }
    // Используется для крафта: LeatherBoots, GlovesOfSpeed

    @Override
    public void inUses() {

    }

}
