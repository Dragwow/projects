package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class MageBracelets extends Robes {

    public MageBracelets(Rarity rarity) {
        setName("Mage Bracelets");
        setDescription("Браслеты, усиливающие ментальную энергию мага."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 6, 35, 0.1, 130);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
