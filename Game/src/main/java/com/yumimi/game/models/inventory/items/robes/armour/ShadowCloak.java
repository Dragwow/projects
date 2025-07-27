package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class ShadowCloak extends Robes {

    public ShadowCloak(Rarity rarity) {
        setName("Shadow Cloak");
        setDescription("Плащ тени. Повышает ловкость и уклонение."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 4, 0.08, 0.025, 160);
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusEvasion(bonus.bonus2());
        setBonusHitChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
