package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Boomerang extends AttackWeapon {

    public Boomerang(Rarity rarity) {
        setName("Boomerang");
        setDescription("Ловкое оружие с шансом повторного удара"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 17, 75, 5, 2, 3, 95);
        setDamage(bonus.damage());
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
