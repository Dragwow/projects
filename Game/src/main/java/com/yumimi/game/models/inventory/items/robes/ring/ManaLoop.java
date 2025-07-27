package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class ManaLoop extends Robes {

    public ManaLoop(Rarity rarity) {
        setName("Mana Loop");
        setDescription("Кольцо с кристаллом. Восстановление маны."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 25, 0.11, 0.02, 90);
        setDurability(bonus.durability());
        setBonusMana(bonus.bonus1());
        setBonusRegenMana(bonus.bonus2());
        setBonusEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
