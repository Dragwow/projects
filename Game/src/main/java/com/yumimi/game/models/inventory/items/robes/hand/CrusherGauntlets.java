package com.yumimi.game.models.inventory.items.robes.hand;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class CrusherGauntlets extends Robe {

    public CrusherGauntlets(){
        init(RarityUtils.generateRandomRarity());
    }

    public CrusherGauntlets(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Crusher Gauntlets");
        setDescription(DescriptionUtil.CRUSHER_GAUNTLETS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Hand);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 6, 5, 0.05, 150);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setArmour((int) bonus.bonus2());
        setCritDamage(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
