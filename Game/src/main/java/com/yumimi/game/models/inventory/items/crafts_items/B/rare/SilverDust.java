package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class SilverDust extends CraftItems {

    public SilverDust() {
        setName("Silver Dust");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(2);
        setBonusCritChance(0.03);
        setBonusMana(15);
        setPrice(24);
    }
    // Используется для крафта: SilverRing

    @Override
    public void inUses() {

    }
}
