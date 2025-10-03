package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class DragonScale extends CraftItems {

    public DragonScale() {
        setName("Dragon Scale");
        setItem(CraftItemsType.DragonScale);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(150);
    }
    // Используется в: KnightPlate, HelmFromHell

    @Override
    public void inUses() {

    }

}
