package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class HelmFromHell extends Robe {

    public HelmFromHell(){
        init(RarityUtils.generateRandomRarity());
    }

    public HelmFromHell(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Helm from Hell");
        setDescription(DescriptionUtil.HELM_FROM_HELL(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 7, 0.08, 0.12, 180);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setBlockChance(bonus.bonus2());
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
