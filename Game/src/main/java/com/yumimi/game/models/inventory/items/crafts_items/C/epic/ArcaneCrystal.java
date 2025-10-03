package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ArcaneCrystal extends CraftItems {

    public ArcaneCrystal() {
        setName("Arcane Crystal");
        setItem(CraftItemsType.ArcaneCrystal);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(40);
    }
    // Используется для крафта: CrystalOrb, SpaceWand

    @Override
    public void inUses() {

    }


}
