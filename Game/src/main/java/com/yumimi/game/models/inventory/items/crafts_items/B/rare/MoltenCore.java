package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class MoltenCore extends CraftItems {

    public MoltenCore() {
        setName("Molten Core");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setDamage(5);
        setBonusStrength(2);
        setPrice(37);
    }
    // Используется в: BigAxe, FlameTalisman

    @Override
    public void inUses() {

    }
}
