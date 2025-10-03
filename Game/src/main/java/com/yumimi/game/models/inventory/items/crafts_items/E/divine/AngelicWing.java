package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class AngelicWing extends CraftItems {

    public AngelicWing() {
        setName("Angelic Wing");
        setItem(CraftItemsType.AngelicWing);
        setRarity(Rarity.DIVINE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(320);
    }
    // Используется в: RunicBoots, WindCharm

    @Override
    public void inUses() {

    }

}
