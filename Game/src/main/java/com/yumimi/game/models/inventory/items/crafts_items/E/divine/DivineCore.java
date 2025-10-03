package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class DivineCore extends CraftItems {

    public DivineCore() {
        setName("Divine Core");
        setItem(CraftItemsType.DivineCore);
        setRarity(Rarity.DIVINE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(350);
    }
    // Используется в: CrystalOrb, EmberCore

    @Override
    public void inUses() {

    }

}
