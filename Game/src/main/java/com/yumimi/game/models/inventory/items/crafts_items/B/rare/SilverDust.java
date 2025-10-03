package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class SilverDust extends CraftItems {

    public SilverDust() {
        setName("Silver Dust");
        setItem(CraftItemsType.SilverDust);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(24);
    }
    // Используется для крафта: SilverRing

    @Override
    public void inUses() {

    }


}
