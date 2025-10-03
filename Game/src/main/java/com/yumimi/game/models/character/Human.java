package com.yumimi.game.models.character;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.util.enums.PrimaryStat;
import com.yumimi.game.util.enums.TypeDamage;

public class Human extends Race{

    public Human(WeaponFactory weaponFactory){
        super(weaponFactory);
        setName("Human");
        setIntelligence(10);
        setStrength(10);
        setDexterity(10);
        setHp(70);
        setMana(50);
        setArmour(7);
        setTypeDamage(TypeDamage.Melee);
        setDamage(8);
        setPrimaryStat(PrimaryStat.Strength);
    }

    @Override
    public Item generateStarterWeapon() {
        return weaponFactory.generateMeleeWeapon();
    }
}
