package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class RefinedMetal extends CraftItems {

    public RefinedMetal() {
        setName("Refined Metal");
        setItem(CraftItemsType.RefinedMetal);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(32);
    }
    // Используется в: HelmFromHell, CrusherGauntlets

    @Override
    public void inUses() {

    }


}
