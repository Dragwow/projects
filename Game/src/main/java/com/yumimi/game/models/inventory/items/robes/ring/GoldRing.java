package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class GoldRing extends Robe {

    public GoldRing(){
        init(RarityUtils.generateRandomRarity());
    }

    public GoldRing(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Gold Ring");
        setDescription(DescriptionUtil.GOLD_RING(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 2, 20, 0.015, 100);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
