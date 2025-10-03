package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class RunicBoots extends Robe {

    public RunicBoots(){
        init(RarityUtils.generateRandomRarity());
    }

    public RunicBoots(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Runic Boots");
        setDescription(DescriptionUtil.RUNIC_BOOTS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 2, 0.15, 20, 130);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setRegenMana(bonus.bonus2());
        setMana((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
