package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class SacredBlood extends CraftItems {

    public SacredBlood() {
        setName("Sacred Blood");
        setRarity(Rarity.Divine);
        setTypeItem(TypeItem.Craft_item);
        setBonusHp(150);
        setBonusRegenHp(3);
        setBonusLifeSteal(2);
        setPrice(360);
    }
    // Используется в: BlessedIcon, GuardianRing

    @Override
    public void inUses() {

    }
}
