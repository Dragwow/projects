package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class GoblinFang extends CraftItems {

    public GoblinFang() {
        setName("Goblin Fang");
        setItem(CraftItemsType.GoblinFang);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(58);
    }
    // Используется в: OrkRing, Rapier

    @Override
    public void inUses() {

    }


}
