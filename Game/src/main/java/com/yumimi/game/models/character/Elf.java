package com.yumimi.game.models.character;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.util.enums.PrimaryStat;
import com.yumimi.game.util.enums.TypeDamage;

public class Elf extends Race{

    public Elf(WeaponFactory itemFabric){
        super(itemFabric);
        setName("Elf");
        setIntelligence(8);
        setStrength(3);
        setDexterity(7);
        setHp(60);
        setMana(100);
        setArmour(2);
        setTypeDamage(TypeDamage.Magic);
        setDamage(10);
        setPrimaryStat(PrimaryStat.Intelligence);
    }

    @Override
    public Item generateStarterWeapon() {
        return weaponFactory.generateMagicWeapon();
    }
}
