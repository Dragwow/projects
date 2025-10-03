package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class GlovesOfScrap extends Robe {

    public GlovesOfScrap(){
        init(RarityUtils.generateRandomRarity());
    }

    public GlovesOfScrap(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Gloves of Scrap");
        setDescription(DescriptionUtil.GLOVES_OF_SCRAP(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 2, 2, 2, 100);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setIntelligence((int) bonus.bonus2());
        setDexterity((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
