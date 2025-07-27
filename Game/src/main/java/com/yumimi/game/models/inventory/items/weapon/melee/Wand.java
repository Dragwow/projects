package com.yumimi.game.models.inventory.items.weapon.melee;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class Wand extends AttackWeapon {

    public Wand(Rarity rarity) {
        setName("Wand");
        setDescription("Wand"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Melee);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    private void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 13, 70, 40, 50);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
