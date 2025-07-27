package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class CrackedLens extends CraftItems {

    public CrackedLens() {
        setName("Cracked Lens");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(1.6);
        setBonusCritChance(0.02);
        setBonusRegenMana(0.03);
        setPrice(48);
    }
    // Используется в: AbyssEye, NecroCharm

    @Override
    public void inUses() {

    }
}
