package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class OrkRing extends Robe {

    public OrkRing(){
        init(RarityUtils.generateRandomRarity());
    }

    public OrkRing(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Ork Ring");
        setDescription(DescriptionUtil.ORK_RING(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 6, 30, 0.04, 125);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setHp((int) bonus.bonus2());
        setLifeSteal(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }


}
