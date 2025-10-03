package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class StaticCore extends CraftItems {

    public StaticCore() {
        setName("Static Core");
        setItem(CraftItemsType.StaticCore);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(34);
    }
    // Используется в: StormSling, LightningSigil

    @Override
    public void inUses() {

    }


}
