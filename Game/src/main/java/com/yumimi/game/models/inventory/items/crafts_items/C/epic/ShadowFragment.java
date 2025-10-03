package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ShadowFragment extends CraftItems {

    public ShadowFragment() {
        setName("Shadow Fragment");
        setItem(CraftItemsType.ShadowFragment);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(82);
    }
    // Используется в: ShadowCloak, AbyssEye

    @Override
    public void inUses() {

    }

}
