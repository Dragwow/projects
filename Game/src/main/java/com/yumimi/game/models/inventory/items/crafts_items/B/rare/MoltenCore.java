package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class MoltenCore extends CraftItems {

    public MoltenCore() {
        setName("Molten Core");
        setItem(CraftItemsType.MoltenCore);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(37);
    }
    // Используется в: BigAxe, FlameTalisman

    @Override
    public void inUses() {

    }

}
