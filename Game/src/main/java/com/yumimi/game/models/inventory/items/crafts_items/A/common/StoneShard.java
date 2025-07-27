package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class StoneShard extends CraftItems {

    public StoneShard() {
        setName("Stone Shard");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setDamage(1);
        setBonusHp(5);
        setPrice(7);
    }
    // Используется для крафта: SpikedHelm

    @Override
    public void inUses() {

    }
}
