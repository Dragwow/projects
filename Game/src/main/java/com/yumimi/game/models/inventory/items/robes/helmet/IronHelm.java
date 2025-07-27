package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class IronHelm extends Robes {

    public IronHelm(Rarity rarity) {
        setName("Iron Helm");
        setDescription("Простой железный шлем. Повышает броню и хп."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 6, 30, 0.04, 110);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusHp(bonus.bonus2());
        setBonusBlockChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
