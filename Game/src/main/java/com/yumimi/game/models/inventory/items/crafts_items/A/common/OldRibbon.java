package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class OldRibbon extends CraftItems {

    public OldRibbon() {
        setName("Old Ribbon");
        setItem(CraftItemsType.OldRibbon);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(45);
    }
    // Используется в: SilverRing, GoldRing

    @Override
    public void inUses() {

    }


}
