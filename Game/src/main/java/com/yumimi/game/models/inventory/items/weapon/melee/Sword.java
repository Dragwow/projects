package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Sword extends AttackWeapon {

    public Sword(Rarity rarity) {
        setName("Sword");
        setDescription("Классический меч, сбалансированный во всем"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 24, 100, 5, 2.5, 1, 100);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
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
