package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Rapier extends AttackWeapon {

    public Rapier(Rarity rarity) {
        setName("Rapier");
        setDescription("Легкое и точное оружие"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 22, 90, 6, 5, 2 , 120);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
        setBonusEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
