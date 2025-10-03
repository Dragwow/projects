package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Sword extends AttackWeapon {

    public Sword(){
        init(RarityUtils.generateRandomRarity());
    }

    public Sword(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Sword");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setDescription(DescriptionUtil.SWORD(this));
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 24, 100, 5, 2.5, 1, 100);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setArmour((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }

}
