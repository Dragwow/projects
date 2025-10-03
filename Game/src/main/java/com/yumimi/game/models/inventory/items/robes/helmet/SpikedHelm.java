package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class SpikedHelm extends Robe {

    public SpikedHelm(){
        init(RarityUtils.generateRandomRarity());
    }

    public SpikedHelm(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Spiked Helm");
        setDescription(DescriptionUtil.SPIKED_HELM(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 75, 6, 0.07, 0.1, 140);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setCritChance(bonus.bonus2());
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
