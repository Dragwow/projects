package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class VoidEssence extends CraftItems {

    public VoidEssence() {
        setName("Void Essence");
        setItem(CraftItemsType.VoidEssence);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(170);
    }
    // Используется в: ShadowCloak, AbyssEye

    @Override
    public void inUses() {

    }


}
