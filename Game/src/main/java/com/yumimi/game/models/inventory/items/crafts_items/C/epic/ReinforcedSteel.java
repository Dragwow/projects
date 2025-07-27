package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ReinforcedSteel extends CraftItems {

    public ReinforcedSteel() {
        setName("Reinforced Steel");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(15);
        setBonusStrength(6);
        setBonusBlockChance(1);
        setPrice(90);
    }
    // Используется в: HelmFromHell, SteelBoots

    @Override
    public void inUses() {

    }
}
