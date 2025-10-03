package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class WindEssence extends CraftItems {

    public WindEssence() {
        setName("Wind Essence");
        setItem(CraftItemsType.WindEssence);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(77);
    }
    // Используется в: BreezeFeather, WindCharm

    @Override
    public void inUses() {

    }


}
