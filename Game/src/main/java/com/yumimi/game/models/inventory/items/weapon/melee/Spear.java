package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Spear extends AttackWeapon {

    public Spear(Rarity rarity) {
        setName("Spear");
        setDescription("Копье с увеличенной дальностью"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 25, 85, 5, 6, 110);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusHitChance(bonus.bonus2());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
