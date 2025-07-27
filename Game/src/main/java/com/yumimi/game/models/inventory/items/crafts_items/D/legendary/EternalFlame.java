package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class EternalFlame extends CraftItems {

    public EternalFlame() {
        setName("Eternal Flame");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setDamage(25);
        setBonusCritDamage(8);
        setBonusStrength(10);
        setPrice(165);
    }
    // Используется в: EmberCore, FlameTalisman

    @Override
    public void inUses() {

    }
}
