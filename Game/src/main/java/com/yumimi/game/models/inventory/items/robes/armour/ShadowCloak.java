package com.yumimi.game.models.inventory.items.robes.armour;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class ShadowCloak extends Robe {

    public ShadowCloak(){
        init(RarityUtils.generateRandomRarity());
    }

    public ShadowCloak(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Shadow Cloak");
        setDescription(DescriptionUtil.SHADOW_CLOAK(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Armour);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 70, 4, 0.08, 0.025, 160);
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
