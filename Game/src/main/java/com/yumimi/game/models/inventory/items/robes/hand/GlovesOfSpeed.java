package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class GlovesOfSpeed extends Robe {

    public GlovesOfSpeed(){
        init(RarityUtils.generateRandomRarity());
    }

    public GlovesOfSpeed(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Gloves of Speed");
        setDescription(DescriptionUtil.GLOVES_OF_SPEED(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 45, 4, 0.02, 0.04, 110);
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
