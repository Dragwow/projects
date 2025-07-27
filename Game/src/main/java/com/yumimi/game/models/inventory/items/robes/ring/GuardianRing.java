package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class GuardianRing extends Robes {

    public GuardianRing(Rarity rarity) {
        setName("Guardian Ring");
        setDescription("Кольцо стража. Повышает броню, блок и хп."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 4, 0.07, 35, 120);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusBlockChance(bonus.bonus2());
        setBonusHp(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
