package com.yumimi.game.models.inventory.items.weapon.range;


import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Dirk extends AttackWeapon {

    public Dirk(){
        init(RarityUtils.generateRandomRarity());
    }

    public Dirk(Rarity rarity) {
        init(rarity);
    }

    public void init(Rarity rarity){
        setName("Dirk");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setDescription(DescriptionUtil.DIRK(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 14, 60, 7, 8, 1.5, 90);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setLifeSteal(bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
