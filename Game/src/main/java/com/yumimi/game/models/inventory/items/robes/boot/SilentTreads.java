package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class SilentTreads extends Robes {

    public SilentTreads(Rarity rarity) {
        setName("Silent Treads");
        setDescription("Бесшумные шаги. Увеличивают ловкость, уворот и шанс крита."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 55, 4, 0.02, 0.03, 150);
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusEvasion(bonus.bonus2());
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
