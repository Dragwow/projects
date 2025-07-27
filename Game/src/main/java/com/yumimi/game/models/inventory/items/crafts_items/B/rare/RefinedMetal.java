package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class RefinedMetal extends CraftItems {

    public RefinedMetal() {
        setName("Refined Metal");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(6);
        setBonusStrength(2);
        setBonusBlockChance(0.3);
        setPrice(32);
    }
    // Используется в: HelmFromHell, CrusherGauntlets

    @Override
    public void inUses() {

    }
}
