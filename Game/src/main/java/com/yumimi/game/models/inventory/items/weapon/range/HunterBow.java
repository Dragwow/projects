package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class HunterBow extends AttackWeapon {

    public HunterBow(Rarity rarity) {
        setName("Hunter Bow");
        setDescription("Охотничий лук"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 20, 90, 5, 5, 100);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
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
