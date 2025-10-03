package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class EternalFlame extends CraftItems {

    public EternalFlame() {
        setName("Eternal Flame");
        setItem(CraftItemsType.EternalFlame);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(165);
    }
    // Используется в: EmberCore, FlameTalisman

    @Override
    public void inUses() {

    }


}
