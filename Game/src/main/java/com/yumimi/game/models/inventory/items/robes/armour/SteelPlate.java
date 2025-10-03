package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class SteelPlate extends Robe {

    public SteelPlate(){
        init(RarityUtils.generateRandomRarity());
    }

    public SteelPlate(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Steel Plate");
        setDescription(DescriptionUtil.STEEL_PLATE(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 125, 11, 12, 0.02, 250);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setStrength((int) bonus.bonus2());
        setBlockChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }


    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
