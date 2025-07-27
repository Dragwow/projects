package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class OldRibbon extends CraftItems {

    public OldRibbon() {
        setName("Old Ribbon");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(1.2);
        setBonusRegenMana(0.04);
        setBonusHitChance(0.02);
        setPrice(45);
    }
    // Используется в: SilverRing, GoldRing

    @Override
    public void inUses() {

    }
}
