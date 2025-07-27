package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class CrusherGauntlets extends Robes {

    public CrusherGauntlets(Rarity rarity) {
        setName("Crusher Gauntlets");
        setDescription("Крушительные перчатки. Усиливают силу и броню."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 6, 5, 0.05, 150);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusArmour(bonus.bonus2());
        setBonusCritDamage(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
