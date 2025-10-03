package com.yumimi.game.models.inventory.items.weapon;

import com.yumimi.game.models.inventory.items.weapon.magic.*;
import com.yumimi.game.models.inventory.items.weapon.melee.*;
import com.yumimi.game.models.inventory.items.weapon.range.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class WeaponFactory {

    private int choice;

    public AttackWeapon generateWeapon() {
        random(3);
        return switch (choice) {
            case 0 -> generateMeleeWeapon();
            case 1 -> generateMagicWeapon();
            case 2 -> generateRangeWeapon();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }

    public AttackWeapon generateMeleeWeapon() {
        List<Supplier<AttackWeapon>> weaponSupplier = List.of(
            BigAxe::new,
            Rapier::new,
            SmallAxe::new,
            Spear::new,
            Sword::new,
            Wand::new
        );
        random(weaponSupplier.size());
        return weaponSupplier.get(choice).get();
    }

    public AttackWeapon generateMagicWeapon() {
        List<Supplier<AttackWeapon>> weaponSupplier = List.of(
            CrystalOrb::new,
            FrostbiteWand::new,
            InfernoStaff::new,
            MagicWand::new,
            SpaceWand::new
        );
        random(weaponSupplier.size());
        return weaponSupplier.get(choice).get();
    }

    public AttackWeapon generateRangeWeapon() {
        List<Supplier<AttackWeapon>> weaponSupplier = List.of(
            Boomerang::new,
            Dirk::new,
            HunterBow::new,
            ShadowCrossbow::new,
            StormSling::new
        );
        random(weaponSupplier.size());
        return weaponSupplier.get(choice).get();
    }

    private void random(int amount) {
        choice = new Random().nextInt(amount);
    }


}
