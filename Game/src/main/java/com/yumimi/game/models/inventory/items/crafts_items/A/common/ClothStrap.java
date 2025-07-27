package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ClothStrap extends CraftItems {

    public ClothStrap() {
        setName("Cloth Strap");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusEvasion(0.01);
        setBonusDexterity(1);
        setPrice(6);
    }
    // Используется для крафта: LeatherBoots, GlovesOfSpeed

    @Override
    public void inUses() {

    }
}
