package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Boomerang extends AttackWeapon{

    public Boomerang(){
        init(RarityUtils.generateRandomRarity());
    }

    public Boomerang(Rarity rarity) {
        init(rarity);
    }

    public void init(Rarity rarity){
        setName("Boomerang");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        applyStats(rarity);
        setDescription(DescriptionUtil.BOOMERANG(this));
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 17, 75, 5, 2, 3, 95);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setEvasion(bonus.bonus2());
        setHitChance(bonus.bonus3());
        setPrice(bonus.costItem());

    }
}
