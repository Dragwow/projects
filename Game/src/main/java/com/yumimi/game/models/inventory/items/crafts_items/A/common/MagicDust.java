package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class MagicDust extends CraftItems {

    public MagicDust() {
        setName("Magic Dust");
        setItem(CraftItemsType.MagicDust);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(50);
    }
    // Используется в: CrystalOrb, SpaceWand

    @Override
    public void inUses() {

    }


}
