package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class DemonHorn extends CraftItems {

    public DemonHorn() {
        setName("Demon Horn");
        setRarity(Rarity.Legendary);
        setTypeItem(TypeItem.Craft_item);
        setDamage(5);
        setBonusLifeSteal(0.03);
        setBonusCritDamage(0.1);
        setPrice(65);
    }
    // Используется для крафта: HelmFromHell, AbyssEye

    @Override
    public void inUses() {

    }
}
