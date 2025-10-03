package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class LeatherBoots extends Robe {

    public LeatherBoots(){
        init(RarityUtils.generateRandomRarity());
    }

    public LeatherBoots(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Leather Boots");
        setDescription(DescriptionUtil.LEATHER_BOOTS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 45, 3, 0.015, 0.01, 90);
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setEvasion(bonus.bonus2());
        setHitChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
