package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import org.springframework.stereotype.Component;

public class BigAxe extends AttackWeapon {

    public BigAxe(){
        init(RarityUtils.generateRandomRarity());
    }

    public BigAxe(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Big Axe");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setDescription(DescriptionUtil.BIG_AXE(this));
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 35, 100, 7, 30, 2, 160);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setCritDamage(bonus.bonus2());
        setArmour((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
