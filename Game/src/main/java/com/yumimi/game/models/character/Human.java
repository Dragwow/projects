package com.yumimi.game.models.character;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFabric;
import com.yumimi.game.utils.enums.TypeDamage;

public class Human extends Race{

    public Human(ItemFabric itemFabric){
        super(itemFabric);
        setName("Human");
        setIntelligence(10);
        setStrength(10);
        setDexterity(10);
        setHp(70);
        setMana(50);
        setArmour(7);
        setTypeDamage(TypeDamage.Melee);
        setDamage(8);
    }

    @Override
    public Item generateStarterWeapon() {
        return itemFabric.generateMeleeItem();
    }
}
