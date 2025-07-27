package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class AngelicWing extends CraftItems {

    public AngelicWing() {
        setName("Angelic Wing");
        setRarity(Rarity.Divine);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(20);
        setBonusEvasion(10);
        setBonusRegenMana(1);
        setPrice(320);
    }
    // Используется в: RunicBoots, WindCharm

    @Override
    public void inUses() {

    }
}
