package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class DragonScale extends CraftItems {

    public DragonScale() {
        setName("Dragon Scale");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(25);
        setBonusHp(50);
        setBonusRegenHp(1);
        setPrice(150);
    }
    // Используется в: KnightPlate, HelmFromHell

    @Override
    public void inUses() {

    }
}
