package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class TwistedFiber extends CraftItems {

    public TwistedFiber() {
        setName("Twisted Fiber");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(1.5);
        setBonusEvasion(0.01);
        setBonusArmour(1.0);
        setPrice(60);
    }
    // Используется в: ShadowCloak, RunicBoots

    @Override
    public void inUses() {

    }
}
