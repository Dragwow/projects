package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ReinforcedSteel extends CraftItems {

    public ReinforcedSteel() {
        setName("Reinforced Steel");
        setItem(CraftItemsType.ReinforcedSteel);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(90);
    }
    // Используется в: HelmFromHell, SteelBoots

    @Override
    public void inUses() {

    }


}
