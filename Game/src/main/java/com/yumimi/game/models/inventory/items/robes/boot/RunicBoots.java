package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class RunicBoots extends Robes {

    public RunicBoots(Rarity rarity) {
        setName("Runic Boots");
        setDescription("Сапоги, хранящие магическую руну. Увеличивают мана-реген и броню."); // ДОписать
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 2, 0.15, 20, 130);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusRegenMana(bonus.bonus2());
        setBonusMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
