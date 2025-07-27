package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class SmallAxe extends AttackWeapon {

    public SmallAxe(Rarity rarity) {
        setName("Small Axe");
        setDescription("Удобный и быстрый топорик"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 18, 80, 4, 10,80);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusCritDamage(bonus.bonus2());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
