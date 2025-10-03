package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class TwistedFiber extends CraftItems {

    public TwistedFiber() {
        setName("Twisted Fiber");
        setItem(CraftItemsType.TwistedFiber);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(60);
    }
    // Используется в: ShadowCloak, RunicBoots

    @Override
    public void inUses() {

    }


}
