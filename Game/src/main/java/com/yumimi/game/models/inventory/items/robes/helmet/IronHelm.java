package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class IronHelm extends Robe {

    public IronHelm(){
        init(RarityUtils.generateRandomRarity());
    }

    public IronHelm(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Iron Helm");
        setDescription(DescriptionUtil.IRON_HELM(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);

    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 6, 30, 0.04, 110);
        setDurability(bonus.durability());
        setArmour(bonus.bonus1());
        setHp((int) bonus.bonus2());
        setBlockChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
