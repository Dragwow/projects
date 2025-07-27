package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ViciousClaw extends CraftItems {

    public ViciousClaw() {
        setName("Vicious Claw");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(2);
        setBonusCritChance(1.5);
        setBonusLifeSteal(0.5);
        setPrice(31);
    }

    @Override
    public void inUses() {

    }
}
