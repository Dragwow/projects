package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class BronzePlating extends CraftItems {

    public BronzePlating() {
        setName("Bronze Plating");
        setItem(CraftItemsType.BronzePlating);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(62);
    }
    // Используется в: SteelBoots, IronHelm

    @Override
    public void inUses() {

    }

}
