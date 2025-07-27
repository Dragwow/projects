package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class LightningCore extends CraftItems {

    public LightningCore() {
        setName("Lightning Core");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setDamage(10);
        setBonusIntelligence(5);
        setBonusCritDamage(4);
        setPrice(85);
    }

    @Override
    public void inUses() {

    }
}
