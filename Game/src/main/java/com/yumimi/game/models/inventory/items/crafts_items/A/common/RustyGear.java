package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class RustyGear extends CraftItems {

    public RustyGear() {
        setName("Rusty Gear");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusStrength(1.8);
        setBonusHp(10);
        setBonusBlockChance(0.01);
        setPrice(55);
    }
    // Используется в: CrusherGauntlets, GlovesOfScrap

    @Override
    public void inUses() {

    }
}
