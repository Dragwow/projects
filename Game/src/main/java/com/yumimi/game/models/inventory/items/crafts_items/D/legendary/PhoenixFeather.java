package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class PhoenixFeather extends CraftItems {

    public PhoenixFeather() {
        setName("Phoenix Feather");
        setItem(CraftItemsType.PhoenixFeather);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(155);
    }
    // Используется в: BlessedIcon, DivineTear

    @Override
    public void inUses() {

    }

}
