package com.yumimi.game.models.character;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.util.enums.PrimaryStat;
import com.yumimi.game.util.enums.TypeDamage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Race {

    protected WeaponFactory weaponFactory;

    public Race(WeaponFactory weaponFactory){
        this.weaponFactory = weaponFactory;
    }

    private String name;
    private int intelligence;
    private int strength;
    private int dexterity;
    private int hp;
    private int mana;
    private int armour;
    private TypeDamage typeDamage;
    private int damage;

    private PrimaryStat primaryStat;

    public abstract Item generateStarterWeapon();

    @Override
    public String toString(){
        return name;
    }
}
