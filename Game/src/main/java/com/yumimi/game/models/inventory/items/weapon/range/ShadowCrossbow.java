package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class ShadowCrossbow extends AttackWeapon {

    public ShadowCrossbow(Rarity rarity) {
        setName("Shadow Crossbow");
        setDescription("Темный арбалет с точным прицелом"); // Дописать
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 27, 85, 4, 4, 6, 160);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
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
