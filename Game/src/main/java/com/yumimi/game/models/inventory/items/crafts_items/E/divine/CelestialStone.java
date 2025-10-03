package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class CelestialStone extends CraftItems {

    public CelestialStone() {
        setName("Celestial Stone");
        setItem(CraftItemsType.CelestialStone);
        setRarity(Rarity.DIVINE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(300);
    }
    // Используется в: DivineTear, GuardianRing

    @Override
    public void inUses() {

    }


}
