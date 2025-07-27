package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class BronzePlating extends CraftItems {

    public BronzePlating() {
        setName("Bronze Plating");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(1.8);
        setBonusStrength(1.0);
        setBonusHp(12);
        setPrice(62);
    }
    // Используется в: SteelBoots, IronHelm

    @Override
    public void inUses() {

    }
}
