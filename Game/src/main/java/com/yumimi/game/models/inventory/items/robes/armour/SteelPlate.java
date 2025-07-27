package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robes;

public class SteelPlate extends Robes {

    public SteelPlate(Rarity rarity) {
        setName("Steel Plate");
        setDescription("Рыцарская броня, даёт много защиты и немного силы."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 125, 11, 12, 0.02, 250);
        setDurability(bonus.durability());
        setBonusArmour(bonus.bonus1());
        setBonusStrength(bonus.bonus2());
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
