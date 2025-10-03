package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class HardenedHide extends CraftItems {

    public HardenedHide() {
        setName("Hardened Hide");
        setItem(CraftItemsType.HardenedHide);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(75);
    }
    // Используется в: KnightPlate, RunicBoots

    @Override
    public void inUses() {

    }


}
