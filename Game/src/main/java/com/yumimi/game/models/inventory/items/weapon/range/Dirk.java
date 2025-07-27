package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Dirk extends AttackWeapon {

    public Dirk(Rarity rarity) {
        setName("Dirk");
        setDescription("Кинжал для быстрых и ловких ударов"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 14, 60, 7, 8, 1.5, 90);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
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
