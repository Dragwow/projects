package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class DemonHorn extends CraftItems {

    public DemonHorn() {
        setName("Demon Horn");
        setItem(CraftItemsType.DemonHorn);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(65);
    }
    // Используется для крафта: HelmFromHell, AbyssEye

    @Override
    public void inUses() {

    }


}
