package com.yumimi.game.models.inventory.items.robes.boot;

import com.yumimi.game.models.inventory.items.BonusProvider;
import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class SilentTreads extends Robe implements BonusProvider {

    public SilentTreads(){
        init(RarityUtils.generateRandomRarity());
    }

    public SilentTreads(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Silent Treads");
        setDescription(DescriptionUtil.SILENT_BOOTS(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Boot);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 55, 4, 0.02, 0.03, 150);
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setEvasion(bonus.bonus2());
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
