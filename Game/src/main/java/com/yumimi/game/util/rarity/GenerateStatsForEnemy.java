package com.yumimi.game.util.rarity;

import com.yumimi.game.util.enums.Rarity;

public record GenerateStatsForEnemy(
        int defence,
        int attack,
        int maxHp,
        int maxMana,

        double lifeSteal,
        double critChance,
        double critDamage,
        double evasion,
        double hitChance,
        double regenHp,
        double regenMana,
        double blockChance) {
}
