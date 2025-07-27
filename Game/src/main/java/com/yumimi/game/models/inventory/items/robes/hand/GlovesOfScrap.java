package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class GlovesOfScrap extends Robes {

    public GlovesOfScrap(Rarity rarity) {
        setName("Gloves of Scrap");
        setDescription("Перчатки из обломков. Немного всего."); // Доаисать
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 2, 2, 2, 100);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusIntelligence(bonus.bonus2());
        setBonusDexterity(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
