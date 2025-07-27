package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class PhoenixFeather extends CraftItems {

    public PhoenixFeather() {
        setName("Phoenix Feather");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setBonusRegenHp(1.2);
        setBonusMana(30);
        setBonusRegenMana(0.7);
        setPrice(155);
    }
    // Используется в: BlessedIcon, DivineTear

    @Override
    public void inUses() {

    }
}
