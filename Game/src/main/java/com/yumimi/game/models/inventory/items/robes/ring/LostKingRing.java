package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class LostKingRing extends Robes {

    public LostKingRing(Rarity rarity) {
        setName("Lost King's Ring");
        setDescription("Кольцо утерянного короля. Тёмная сила и вампиризм."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 5, 0.05, 0.05, 170);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusLifeSteal(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
