package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class SmallAxe extends AttackWeapon  {

    public SmallAxe(){
        init(RarityUtils.generateRandomRarity());
    }

    public SmallAxe(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Small Axe");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setDescription(DescriptionUtil.SMALL_AXE(this));
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 18, 80, 4, 10,80);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setCritDamage(bonus.bonus2());
        setPrice(bonus.costItem());
    }

}
