package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class SteelBoots extends Robe {

    public SteelBoots(){
        init(RarityUtils.generateRandomRarity());
    }

    public SteelBoots(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Steel Boots");
        setDescription(DescriptionUtil.STEEL_BOOTS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 6, 0.06, 0, 130);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setBlockChance(bonus.bonus2());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
