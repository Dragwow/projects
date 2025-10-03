package com.yumimi.game.models.inventory.items.robes.ring;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.robes.Robe;

public class ManaLoop extends Robe {

    public ManaLoop(){
        init(RarityUtils.generateRandomRarity());
    }

    public ManaLoop(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Mana Loop");
        setDescription(DescriptionUtil.MANA_LOOP(this));
        setRarity(rarity);
        setTypeItem(TypeItem.Ring);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 40, 25, 0.11, 0.02, 90);
        setDurability(bonus.durability());
        setMana(bonus.bonus1());
        setRegenMana(bonus.bonus2());
        setEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
