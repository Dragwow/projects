package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class OrkRing extends Robes {

    public OrkRing(Rarity rarity) {
        setName("Ork Ring");
        setDescription("Грубое кольцо орков. Сила, хп и вампиризм."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 6, 30, 0.04, 125);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusHp(bonus.bonus2());
        setBonusLifeSteal(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
