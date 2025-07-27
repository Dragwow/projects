package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class WoodHandle extends CraftItems {

    public WoodHandle() {
        setName("Wood Handle");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(1);
        setBonusHp(5);
        setPrice(8);
    }
    // Используется для крафта: Rapier, Spear

    @Override
    public void inUses() {

    }
}
