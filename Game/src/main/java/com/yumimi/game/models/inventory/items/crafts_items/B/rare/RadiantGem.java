package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class RadiantGem extends CraftItems {

    public RadiantGem() {
        setName("Radiant Gem");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(2);
        setBonusCritChance(2);
        setBonusMana(6);
        setPrice(28);
    }
    // Используется в: GuardianRing, DivineTear

    @Override
    public void inUses() {

    }
}
