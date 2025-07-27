package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class GoblinFang extends CraftItems {

    public GoblinFang() {
        setName("Goblin Fang");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setDamage(2.3);
        setBonusDexterity(1.2);
        setBonusCritChance(0.01);
        setPrice(58);
    }
    // Используется в: OrkRing, Rapier

    @Override
    public void inUses() {

    }
}
