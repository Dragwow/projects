package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ReinforcedLeather extends CraftItems {

    public ReinforcedLeather() {
        setName("Reinforced Leather");
        setItem(CraftItemsType.ReinforcedLeather);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(20);
    }
    // Используется для крафта: ShadowCloak, SilentTreads

    @Override
    public void inUses() {

    }


}
