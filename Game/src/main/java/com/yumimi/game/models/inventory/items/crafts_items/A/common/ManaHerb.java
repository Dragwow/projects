package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ManaHerb extends CraftItems {

    public ManaHerb() {
        setName("Mana Herb");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusMana(10);
        setBonusRegenMana(0.05);
        setPrice(12);
    }
    // Используется для крафта: ManaLoop

    @Override
    public void inUses() {

    }
}
