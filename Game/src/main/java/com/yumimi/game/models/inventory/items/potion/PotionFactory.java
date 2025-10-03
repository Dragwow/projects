package com.yumimi.game.models.inventory.items.potion;

import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.models.inventory.items.potion.A.common.*;
import com.yumimi.game.models.inventory.items.potion.B.rare.*;
import com.yumimi.game.models.inventory.items.potion.C.epic.*;
import com.yumimi.game.models.inventory.items.potion.D.legendary.*;
import com.yumimi.game.util.enums.Rarity;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PotionFactory {

    private final Rarity rarity = RarityUtils.generateRandomRarity();
    private int choice;

    public Potions generatePotion() {
        random( switch (rarity) {
            case COMMON -> 2;
            case RARE -> 3;
            case EPIC -> 3;
            case LEGENDARY -> 2;
            case DIVINE -> 0;
        });

        return switch (rarity) {
            case COMMON -> switch (choice) {
                case 0 -> new MinorHealingPotion();
                case 1 -> new MinorManaPotion();
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            case RARE -> switch (choice) {
                case 0 -> new HealingPotion();
                case 1 -> new ManaPotion();
                case 2 -> new PotionOfAgility();
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            case EPIC -> switch (choice) {
                case 0 -> new BattleBrew();
                case 1 -> new GreaterHealingPotion();
                case 2 -> new GreaterManaPotion();
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            case LEGENDARY -> switch (choice) {
                case 0 -> new ElixirOfVitality();
                case 1 -> new ElixirOfWisdom();
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            case DIVINE -> null;
        };
    }

    private void random(int amount) {
        choice = new Random().nextInt(amount);
    }
}
