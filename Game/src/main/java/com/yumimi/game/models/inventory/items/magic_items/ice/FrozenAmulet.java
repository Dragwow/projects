package com.yumimi.game.models.inventory.items.magic_items.ice;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class FrozenAmulet extends MagicItems{

    public FrozenAmulet(){
        init(RarityUtils.generateRandomRarity());
    }

    public FrozenAmulet(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Frozen Amulet");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Ice);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
        setDescription(DescriptionUtil.FROZEN_AMULET(this));
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 65, 5, 25, 0.06, 130);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setArmour((int) bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: шанс заморозить врага на 1 ход, снижая его скорость.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
