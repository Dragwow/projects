package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class SacredBlood extends CraftItems {

    public SacredBlood() {
        setName("Sacred Blood");
        setItem(CraftItemsType.SacredBlood);
        setRarity(Rarity.DIVINE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(360);
    }
    // Используется в: BlessedIcon, GuardianRing

    @Override
    public void inUses() {

    }


}
