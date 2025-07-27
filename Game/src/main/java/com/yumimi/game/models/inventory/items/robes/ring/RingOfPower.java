package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class RingOfPower extends Robes {

    public RingOfPower(Rarity rarity) {
        setName("Ring of Power");
        setDescription("Кольцо силы. Сильный буст к атакующим статам."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 7, 0.06, 0.12, 160);
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
