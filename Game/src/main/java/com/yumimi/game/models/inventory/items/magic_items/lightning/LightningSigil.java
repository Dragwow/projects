package com.yumimi.game.models.inventory.items.magic_items.lightning;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class LightningSigil extends MagicItems{

    public LightningSigil(){
        init(RarityUtils.generateRandomRarity());
    }

    public LightningSigil(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Lightning Sigil");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setDescription(DescriptionUtil.LIGHTNING_SIGIL(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 100, 8, 25, 0.05, 0.09, 140);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setLifeSteal(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // ⚡ Пассивка: "Ионизация" — увеличивает шанс крита заклинаний на 10% против оглушённых врагов.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}

