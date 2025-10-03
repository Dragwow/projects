package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class TearOfHeaven extends CraftItems {

    public TearOfHeaven() {
        setName("Tear of Heaven");
        setItem(CraftItemsType.TearOfHeaven);
        setRarity(Rarity.DIVINE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(100);
    }
    // Используется для крафта: DivineTear, BlessedIcon

    @Override
    public void inUses() {

    }


}
