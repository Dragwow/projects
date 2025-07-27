package com.yumimi.game.models.inventory.items;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.weapon.melee.*;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

import java.util.Random;


public class ItemFabric {

    public AttackWeapon generateMeleeItem(){
        Rarity rarity = generateRandomRarity();

       int choice = new Random().nextInt(6);
       return switch(choice){
           case 0 -> new BigAxe(rarity);
           case 1 -> new Rapier(rarity);
           case 2 -> new SmallAxe(rarity);
           case 3 -> new Spear(rarity);
           case 4 -> new Sword(rarity);
           case 5 -> new Wand(rarity);
           default -> new Sword(rarity);
       };
    }

    private Rarity generateRandomRarity() {
        int roll = new Random().nextInt(100) + 1;
        Rarity rarity;
        if (roll <= 1) rarity = Rarity.Divine;
        else if (roll <= 3) rarity = Rarity.Legendary;
        else if (roll <= 10) rarity = Rarity.Epic;
        else if (roll <= 30) rarity = Rarity.Rare;
        else rarity = Rarity.Common;

        if (!RarityUtils.ifDropItem(rarity)) return rarity = Rarity.Common;
        return rarity;
    }
}
