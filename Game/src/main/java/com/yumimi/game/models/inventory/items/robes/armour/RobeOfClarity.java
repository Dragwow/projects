package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class RobeOfClarity extends Robes {

    public RobeOfClarity(Rarity rarity) {
        setName("Robe of Clarity");
        setDescription("Лёгкая мантия, усиливающая интеллект и восстановление маны."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 25, 0.1, 140);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
