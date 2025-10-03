package com.yumimi.game.util.rarity;

import com.yumimi.game.util.enums.Rarity;

import java.util.Random;

public class RarityUtils {

    private static double multiplier;

    public static GenerateStatsFor4Bonus applyRarityBonus(
        Rarity rarity,
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        double bonus3,
        double bonus4,
        int costItem) {

        rarityRandom(rarity);
        return new GenerateStatsFor4Bonus(
            (int) (damage * multiplier),
            (int) (durability * multiplier),
            (int) (bonus1 * multiplier),
            bonus2 * multiplier,
            bonus3 * multiplier,
            bonus4 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static GenerateStatsFor4Bonus applyRarityBonus(
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        double bonus3,
        double bonus4,
        int costItem) {

        Rarity randomRarity = generateRandomRarity();
        return applyRarityBonus(randomRarity, damage, durability, bonus1, bonus2, bonus3, bonus4, costItem);
    }


    public static GenerateStatsFor3Bonus applyRarityBonus(
        Rarity rarity,
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        double bonus3,
        int costItem) {

        rarityRandom(rarity);
        return new GenerateStatsFor3Bonus(
            (int) (damage * multiplier),
            (int) (durability * multiplier),
            (int) (bonus1 * multiplier),
            bonus2 * multiplier,
            bonus3 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static GenerateStatsFor3Bonus applyRarityBonus(
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        double bonus3,
        int costItem) {

        Rarity randomRarity = generateRandomRarity();
        return applyRarityBonus(randomRarity, damage, durability, bonus1, bonus2, bonus3, costItem);
    }


    public static GenerateStatsFor2Bonus applyRarityBonus(
        Rarity rarity,
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        int costItem) {

        rarityRandom(rarity);
        return new GenerateStatsFor2Bonus(
            (int) (damage * multiplier),
            (int) (durability * multiplier),
            (int) (bonus1 * multiplier),
            bonus2 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static GenerateStatsFor2Bonus applyRarityBonus(
        int damage,
        Integer durability,
        int bonus1,
        double bonus2,
        int costItem) {

        Rarity randomRarity = generateRandomRarity();
        return applyRarityBonus(randomRarity, damage, durability, bonus1, bonus2, costItem);
    }


    public static GenerateStatsFor1Bonus applyRarityBonus(
        Rarity rarity,
        int damage,
        Integer durability,
        int bonus1,
        int costItem) {

        rarityRandom(rarity);
        return new GenerateStatsFor1Bonus(
            (int) (damage * multiplier),
            (int) (durability * multiplier),
            (int) (bonus1 * multiplier),
            (int) (costItem * multiplier)
        );
    }

    public static GenerateStatsFor1Bonus applyRarityBonus(
        int damage,
        Integer durability,
        int bonus1,
        int costItem) {

        Rarity randomRarity = generateRandomRarity();
        return applyRarityBonus(randomRarity, damage, durability, bonus1, costItem);
    }

    private static void rarityRandom(Rarity rarity) {
        multiplier = switch (rarity) {
            case COMMON -> 1.0;
            case RARE -> 1.2;
            case EPIC -> 1.5;
            case LEGENDARY -> 2.0;
            case DIVINE -> 3.0;
        };
    }

    public static Rarity generateRandomRarity() {
        int roll = new Random().nextInt(100) + 1;
        if (roll <= 1) return Rarity.DIVINE;
        else if (roll <= 3) return Rarity.LEGENDARY;
        else if (roll <= 10) return Rarity.EPIC;
        else if (roll <= 30) return Rarity.RARE;
        else return Rarity.COMMON;
    }

    public static GenerateStatsForEnemy applyRarityBonusForEnemy(
        Rarity rarity,
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
        double blockChance
    ){
        rarityRandom(rarity);
        return new GenerateStatsForEnemy(
            (int) (defence * multiplier),
            (int) (attack * multiplier),
            (int) (maxHp * multiplier),
            (int) (maxMana * multiplier),
            lifeSteal * multiplier,
            critChance * multiplier,
            critDamage * multiplier,
            evasion * multiplier,
            hitChance * multiplier,
            regenHp * multiplier,
            regenMana * multiplier,
            blockChance * multiplier

        );
    }
}



