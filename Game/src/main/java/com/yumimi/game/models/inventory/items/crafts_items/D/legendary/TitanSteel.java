package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class TitanSteel extends CraftItems {

    public TitanSteel() {
        setName("Titan Steel");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(30);
        setBonusStrength(15);
        setBonusBlockChance(3);
        setPrice(160);
    }
    // Используется в: HelmFromHell, SteelBoots

    @Override
    public void inUses() {

    }
}
