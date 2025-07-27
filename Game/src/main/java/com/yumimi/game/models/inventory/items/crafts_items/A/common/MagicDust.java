package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class MagicDust extends CraftItems {

    public MagicDust() {
        setName("Magic Dust");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(1.5);
        setBonusMana(10);
        setBonusRegenMana(0.05);
        setPrice(50);
    }
    // Используется в: CrystalOrb, SpaceWand

    @Override
    public void inUses() {

    }
}
