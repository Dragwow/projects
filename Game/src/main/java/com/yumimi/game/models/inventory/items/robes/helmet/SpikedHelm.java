package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class SpikedHelm extends Robes {

    public SpikedHelm(Rarity rarity) {
        setName("Spiked Helm");
        setDescription("Шлем с шипами. Увеличивает силу, крит-урон и броню."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 75, 6, 0.07, 0.1, 140);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
        setBonusCritDamage(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
