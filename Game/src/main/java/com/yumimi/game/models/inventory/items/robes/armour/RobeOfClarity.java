package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class RobeOfClarity extends Robe {

    public RobeOfClarity(){
        init(RarityUtils.generateRandomRarity());
    }

    public RobeOfClarity(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Robe of Clarity");
        setDescription(DescriptionUtil.ROBE_OF_CLARITY(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 25, 0.1, 140);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }

}
