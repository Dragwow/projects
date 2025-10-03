package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class RustyGear extends CraftItems {

    public RustyGear() {
        setName("Rusty Gear");
        setItem(CraftItemsType.RustyGear);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(55);
    }
    // Используется в: CrusherGauntlets, GlovesOfScrap

    @Override
    public void inUses() {

    }


}
