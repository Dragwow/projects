package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class HardenedHide extends CraftItems {

    public HardenedHide() {
        setName("Hardened Hide");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(10);
        setBonusDexterity(3);
        setBonusRegenHp(0.4);
        setPrice(75);
    }
    // Используется в: KnightPlate, RunicBoots

    @Override
    public void inUses() {

    }
}
