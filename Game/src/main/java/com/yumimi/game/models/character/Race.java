package com.yumimi.game.models.character;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFabric;
import com.yumimi.game.utils.enums.TypeDamage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Race {

    protected ItemFabric itemFabric;

    public Race(ItemFabric itemFabric){
        this.itemFabric = itemFabric;
    }

    private String name;
    private double intelligence;
    private double strength;
    private double dexterity;
    private int hp;
    private int mana;
    private double armour;
    private TypeDamage typeDamage;
    private double damage;

    public abstract Item generateStarterWeapon();

    @Override
    public String toString(){
        return name;
    }
}
