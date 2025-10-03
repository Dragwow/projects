package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class BlessedPetal extends CraftItems {

    public BlessedPetal() {
        setName("Blessed Petal");
        setItem(CraftItemsType.BlessedPetal);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(80);
    }
    // Используется в: BlessedIcon, DivineTear

    @Override
    public void inUses() {

    }


}
