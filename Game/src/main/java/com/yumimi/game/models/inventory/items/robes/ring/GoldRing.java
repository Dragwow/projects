package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class GoldRing extends Robes {

    public GoldRing(Rarity rarity) {
        setName("Gold Ring");
        setDescription("Золотое кольцо. Немного всего — броня, мана, уклонение."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 2, 20, 0.015, 100);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
