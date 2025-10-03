package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class LostKingRing extends Robe {

    public LostKingRing(){
        init(RarityUtils.generateRandomRarity());
    }

    public LostKingRing(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Lost King's Ring");
        setDescription(DescriptionUtil.LOST_KING_RING(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 5, 0.05, 0.05, 170);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setLifeSteal(bonus.bonus2());
        setCritChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
