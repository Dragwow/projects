package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class TearOfHeaven extends CraftItems {

    public TearOfHeaven() {
        setName("Tear of Heaven");
        setRarity(Rarity.Divine);
        setTypeItem(TypeItem.Craft_item);
        setBonusMana(50);
        setBonusRegenMana(0.3);
        setBonusIntelligence(5);
        setPrice(100);
    }
    // Используется для крафта: DivineTear, BlessedIcon

    @Override
    public void inUses() {

    }
}
