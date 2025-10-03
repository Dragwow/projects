package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class StoneShard extends CraftItems {

    public StoneShard() {
        setName("Stone Shard");
        setItem(CraftItemsType.StoneShard);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(7);
    }
    // Используется для крафта: SpikedHelm

    @Override
    public void inUses() {

    }


}
