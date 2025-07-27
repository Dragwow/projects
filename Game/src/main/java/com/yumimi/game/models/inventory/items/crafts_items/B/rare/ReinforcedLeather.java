package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ReinforcedLeather extends CraftItems {

    public ReinforcedLeather() {
        setName("Reinforced Leather");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(2);
        setBonusEvasion(0.015);
        setBonusDexterity(2);
        setPrice(20);
    }
    // Используется для крафта: ShadowCloak, SilentTreads

    @Override
    public void inUses() {

    }
}
