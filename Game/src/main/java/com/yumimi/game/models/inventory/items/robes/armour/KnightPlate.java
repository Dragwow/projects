package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class KnightPlate extends Robe {

    public KnightPlate(){
        init(RarityUtils.generateRandomRarity());
    }

    public KnightPlate(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Knight Plate");
        setDescription(DescriptionUtil.KNIGHT_PLATE(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 95, 7, 3, 0.07, 220);
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
