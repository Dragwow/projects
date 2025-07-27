package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class WindEssence extends CraftItems {

    public WindEssence() {
        setName("Wind Essence");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(7);
        setBonusEvasion(3);
        setBonusRegenMana(0.5);
        setPrice(77);
    }
    // Используется в: BreezeFeather, WindCharm

    @Override
    public void inUses() {

    }
}
