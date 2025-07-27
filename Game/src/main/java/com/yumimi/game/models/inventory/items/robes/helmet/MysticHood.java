package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class MysticHood extends Robes {

    public MysticHood(Rarity rarity) {
        setName("Mystic Hood");
        setDescription("Колпак заклинателя. Усиливает интеллект и ману."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 25, 0.09, 125);
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
