package com.yumimi.game.models.inventory.items.robes;

import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.models.inventory.items.robes.armour.*;
import com.yumimi.game.models.inventory.items.robes.boot.*;
import com.yumimi.game.models.inventory.items.robes.hand.*;
import com.yumimi.game.models.inventory.items.robes.helmet.*;
import com.yumimi.game.models.inventory.items.robes.ring.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class RobeFactory {

    private final Rarity rarity = RarityUtils.generateRandomRarity();
    private int choice;

    public Robe generateRobe() {
        int choice = new Random().nextInt(5);
        return switch (choice) {
            case 0 -> generateArmour();
            case 1 -> generateHelmet();
            case 2 -> generateBoot();
            case 3 -> generateHand();
            case 4 -> generateRing();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }

    public Robe generateArmour() {
        List<Supplier<Robe>> robeSupplier = List.of(
            KnightPlate::new,
            RobeOfClarity::new,
            ShadowCloak::new,
            SteelPlate::new
        );
        random(robeSupplier.size());
        return robeSupplier.get(choice).get();
    }

    public Robe generateBoot() {
        List<Supplier<Robe>> robeSupplier = List.of(
            LeatherBoots::new,
            RunicBoots::new,
            SilentTreads::new,
            SteelBoots::new
        );
        random(robeSupplier.size());
        return robeSupplier.get(choice).get();
    }

    public Robe generateHand() {
        List<Supplier<Robe>> robeSupplier = List.of(
            CrusherGauntlets::new,
            GlovesOfScrap::new,
            GlovesOfSpeed::new,
            MageBracelets::new
        );
        random(robeSupplier.size());
        return robeSupplier.get(choice).get();
    }

    public Robe generateHelmet() {
        List<Supplier<Robe>> robeSupplier = List.of(
            HelmFromHell::new,
            IronHelm::new,
            MysticHood::new,
            SpikedHelm::new
        );
        random(robeSupplier.size());
        return robeSupplier.get(choice).get();
    }

    public Robe generateRing() {
        List<Supplier<Robe>> robeSupplier = List.of(
            GoldRing::new,
            GuardianRing::new,
            LostKingRing::new,
            ManaLoop::new,
            OrkRing::new,
            RingOfPower::new,
            SilverRing::new
        );
        random(robeSupplier.size());
        return robeSupplier.get(choice).get();
    }

    private void random(int amount) {
        choice = new Random().nextInt(amount);
    }


}
