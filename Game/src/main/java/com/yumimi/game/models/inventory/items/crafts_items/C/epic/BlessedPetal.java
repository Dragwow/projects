package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class BlessedPetal extends CraftItems {

    public BlessedPetal() {
        setName("Blessed Petal");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusHp(30);
        setBonusRegenHp(0.6);
        setBonusCritDamage(2);
        setPrice(80);
    }
    // Используется в: BlessedIcon, DivineTear

    @Override
    public void inUses() {

    }
}
