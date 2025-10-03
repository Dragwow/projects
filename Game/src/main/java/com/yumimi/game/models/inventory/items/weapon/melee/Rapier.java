package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Rapier extends AttackWeapon  {

    public Rapier(){
        init(RarityUtils.generateRandomRarity());
    }

    public Rapier(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity){
        setName("Rapier");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setDescription(DescriptionUtil.RAPIER(this));

        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 22, 90, 6, 5, 2 , 120);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
