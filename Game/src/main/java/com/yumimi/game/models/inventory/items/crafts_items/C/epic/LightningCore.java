package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class LightningCore extends CraftItems {

    public LightningCore() {
        setName("Lightning Core");
        setItem(CraftItemsType.LightningCore);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(85);
    }

    @Override
    public void inUses() {

    }


}
