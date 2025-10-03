package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class SacredHerb extends CraftItems {

    public SacredHerb() {
        setName("Sacred Herb");
        setItem(CraftItemsType.SacredHerb);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(29);
    }
    // Используется в: BlessedIcon, GuardianRing

    @Override
    public void inUses() {

    }


}
