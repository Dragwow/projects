package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class HelmFromHell extends Robes {

    public HelmFromHell(Rarity rarity) {
        setName("Helm from Hell");
        setDescription("Шлем из Преисподней. Сила, блок и крит-урон."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 7, 0.08, 0.12, 180);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusBlockChance(bonus.bonus2());
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
