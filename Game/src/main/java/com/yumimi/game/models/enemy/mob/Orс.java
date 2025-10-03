package com.yumimi.game.models.enemy.mob;

import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeDamage;
import com.yumimi.game.util.rarity.RarityUtils;

public class Orс extends Enemy {


    public Orс() {
        init(RarityUtils.generateRandomRarity());
    }

    private void init(Rarity rarity) {
        setName("Orc");
        applyStats(rarity);
        setTypeDamage(TypeDamage.Melee);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonusForEnemy(
            rarity,
            12,
            20,
            180,
            40,
            0.03,
            0.08,
            1.50,
            0.05,
            0.0,
            0.0,
            0.0,
            0.0
        );
        setRarity(rarity);
        setArmour(bonus.defence());
        setDamage(bonus.attack());
        setHp(bonus.maxHp());
        setMana(bonus.maxMana());
        setLifeSteal(bonus.lifeSteal());
        setCritChance(bonus.critChance());
        setCritDamage(bonus.critDamage());
        setEvasion(bonus.evasion());
        setHitChance(bonus.hitChance());
        setRegenHp(bonus.regenHp());
        setRegenMana(bonus.regenMana());
        setBlockChance(bonus.blockChance());
    }
}
