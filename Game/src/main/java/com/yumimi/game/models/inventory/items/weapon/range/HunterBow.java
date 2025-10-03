package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class HunterBow extends AttackWeapon {

    public HunterBow(){
        init(RarityUtils.generateRandomRarity());
    }

    public HunterBow(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Hunter Bow");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setDescription(DescriptionUtil.HUNTER_BOW(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 20, 90, 5, 5, 100);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setHitChance(bonus.bonus2());
        setPrice(bonus.costItem());
    }
}
