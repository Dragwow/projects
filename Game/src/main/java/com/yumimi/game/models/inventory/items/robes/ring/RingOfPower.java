package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class RingOfPower extends Robe {

    public RingOfPower(){
        init(RarityUtils.generateRandomRarity());
    }

    public RingOfPower(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Ring of Power");
        setDescription(DescriptionUtil.RING_OF_POWER(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 7, 0.06, 0.12, 160);
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
