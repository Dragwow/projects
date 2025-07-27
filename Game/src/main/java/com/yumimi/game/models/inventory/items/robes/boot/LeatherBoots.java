package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class LeatherBoots extends Robes {

    public LeatherBoots(Rarity rarity) {
        setName("Leather Boots");
        setDescription("Простые кожаные сапоги. Увеличивают ловкость и шанс уклонения."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 45, 3, 0.015, 0.01, 90);
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusEvasion(bonus.bonus2());
        setBonusHitChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
