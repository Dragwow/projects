package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class VoidEssence extends CraftItems {

    public VoidEssence() {
        setName("Void Essence");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(12);
        setBonusCritChance(6);
        setBonusEvasion(5);
        setPrice(170);
    }
    // Используется в: ShadowCloak, AbyssEye

    @Override
    public void inUses() {

    }
}
