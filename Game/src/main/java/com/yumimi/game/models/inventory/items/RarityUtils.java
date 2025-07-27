package com.yumimi.game.models.inventory.items;

import com.yumimi.game.utils.bonuses.BonusFor1Bonus;
import com.yumimi.game.utils.bonuses.BonusFor2Bonus;
import com.yumimi.game.utils.bonuses.BonusFor3Bonus;
import com.yumimi.game.utils.bonuses.BonusFor4Bonus;
import com.yumimi.game.utils.enums.Rarity;

import java.util.Random;

public class RarityUtils {

    public static BonusFor4Bonus applyRarityBonus(
        Rarity rarity,
        double damage,
        Integer durability,
        double bonus1,
        double bonus2,
        double bonus3,
        double bonus4,
        int costItem) {
        double multiplier = switch (rarity) {
            case Common -> 1.0;
            case Rare -> 1.2;
            case Epic -> 1.5;
            case Legendary -> 2.0;
            case Divine -> 3.0;
        };
        return new BonusFor4Bonus(
            damage * multiplier,
            (int) (durability * multiplier),
            bonus1 * multiplier,
            bonus2 * multiplier,
            bonus3 * multiplier,
            bonus4 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static BonusFor3Bonus applyRarityBonus(
        Rarity rarity,
        double damage,
        Integer durability,
        double bonus1,
        double bonus2,
        double bonus3,
        int costItem) {
        double multiplier = switch (rarity) {
            case Common -> 1.0;
            case Rare -> 1.2;
            case Epic -> 1.5;
            case Legendary -> 2.0;
            case Divine -> 3.0;
        };
        return new BonusFor3Bonus(
            damage * multiplier,
            (int) (durability * multiplier),
            bonus1 * multiplier,
            bonus2 * multiplier,
            bonus3 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static BonusFor2Bonus applyRarityBonus(
        Rarity rarity,
        double damage,
        Integer durability,
        double bonus1,
        double bonus2,
        int costItem) {
        double multiplier = switch (rarity) {
            case Common -> 1.0;
            case Rare -> 1.2;
            case Epic -> 1.5;
            case Legendary -> 2.0;
            case Divine -> 3.0;
        };
        return new BonusFor2Bonus(
            damage * multiplier,
            (int) (durability * multiplier),
            bonus1 * multiplier,
            bonus2 * multiplier,
            (int) (costItem * multiplier)
        );
    }

    public static BonusFor1Bonus applyRarityBonus(
        Rarity rarity,
        double damage,
        Integer durability,
        double bonus1,
        int costItem) {
        double multiplier = switch (rarity) {
            case Common -> 1.0;
            case Rare -> 1.2;
            case Epic -> 1.5;
            case Legendary -> 2.0;
            case Divine -> 3.0;
        };
        return new BonusFor1Bonus(
            damage * multiplier,
            (int) (durability * multiplier),
            bonus1 * multiplier,
            (int) (costItem * multiplier)
        );
    }


    public static boolean ifDropItem(Rarity rarity) {
        int chance = getDropChance(rarity);
        int roll = new Random().nextInt(100) + 1;
        return roll <= chance;
    }

    private static int getDropChance(Rarity rarity) {
        return switch (rarity) {
            case Common -> 70;
            case Rare -> 20;
            case Epic -> 7;
            case Legendary -> 2;
            case Divine -> 1;
        };
    }


}
