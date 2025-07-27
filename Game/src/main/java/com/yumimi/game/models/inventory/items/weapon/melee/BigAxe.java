package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class BigAxe extends AttackWeapon {

    public BigAxe(Rarity rarity) {
        setName("BigAxe");
        setDescription("Массивный топор с огромным уроном"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 35, 100, 7, 30, 2, 160);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusCritDamage(bonus.bonus2());
        setBonusArmour(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
