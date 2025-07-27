package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class SilverRing extends Robes {

    public SilverRing(Rarity rarity) {
        setName("Silver Ring");
        setDescription("Простое серебряное кольцо. Даёт ловкость и уклонение."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 45, 3, 0.015, 0.03, 100);
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
