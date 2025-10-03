package com.yumimi.game.models.inventory.items.robes.helmet;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class MysticHood extends Robe {

    public MysticHood(){
        init(RarityUtils.generateRandomRarity());
    }

    public MysticHood(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Mystic Hood");
        setDescription(DescriptionUtil.MYSTIC_HOOD(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Helmet);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 25, 0.09, 125);
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
