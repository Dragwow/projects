package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class MageBracelets extends Robe {

    public MageBracelets(){
        init(RarityUtils.generateRandomRarity());
    }

    public MageBracelets(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Mage Bracelets");
        setDescription(DescriptionUtil.MAGE_BRACELETS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 6, 35, 0.1, 130);
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
