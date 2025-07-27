package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class SacredHerb extends CraftItems {

    public SacredHerb() {
        setName("Sacred Herb");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusRegenHp(0.4);
        setBonusHp(12);
        setBonusRegenMana(0.2);
        setPrice(29);
    }
    // Используется в: BlessedIcon, GuardianRing

    @Override
    public void inUses() {

    }
}
