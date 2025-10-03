package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Spear extends AttackWeapon {

    public Spear(){
        init(RarityUtils.generateRandomRarity());
    }

    public Spear(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Spear");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setDescription(DescriptionUtil.SPEAR(this));
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 25, 85, 5, 6, 110);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setHitChance(bonus.bonus2());
        setPrice(bonus.costItem());
    }
}
