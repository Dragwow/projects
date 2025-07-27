package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class SteelBoots extends Robes {

    public SteelBoots(Rarity rarity) {
        setName("Steel Boots");
        setDescription("Укрепленные стальные сапоги. Дают броню и шанс блока."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 6, 0.06, 0, 130);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusBlockChance(bonus.bonus2());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
