package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class GlovesOfSpeed extends Robes {

    public GlovesOfSpeed(Rarity rarity) {
        setName("Gloves of Speed");
        setDescription("Лёгкие перчатки для скорости. Повышают ловкость и шанс попадания."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 45, 4, 0.02, 0.04, 110);
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
