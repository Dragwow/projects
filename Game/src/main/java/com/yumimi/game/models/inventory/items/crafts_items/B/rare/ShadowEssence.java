package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ShadowEssence extends CraftItems {

    public ShadowEssence() {
        setName("Shadow Essence");
        setItem(CraftItemsType.ShadowEssence);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(33);
    }
    // Используется в: ShadowCloak, ShadowCrossbow

    @Override
    public void inUses() {

    }


}
