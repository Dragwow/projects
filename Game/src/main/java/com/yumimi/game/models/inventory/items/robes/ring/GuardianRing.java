package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class GuardianRing extends Robe {

    public GuardianRing(){
        init(RarityUtils.generateRandomRarity());
    }

    public GuardianRing(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Guardian Ring");
        setDescription(DescriptionUtil.GUARDIAN_RING(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 4, 0.07, 35, 120);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setBlockChance(bonus.bonus2());
        setHp((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
