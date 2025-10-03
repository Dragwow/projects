package com.yumimi.game.models.inventory.items.magic_items.wind;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class BreezeFeather extends MagicItems {

    public BreezeFeather(){
        init(RarityUtils.generateRandomRarity());
    }

    public BreezeFeather(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Breeze Feather");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setDescription(DescriptionUtil.BREEZE_FEATHER(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 6, 18, 0.07, 0.12, 95);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setDexterity((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 💨 Пассивка: "Аэромантис" — +15% скорости действия заклинаний ветра.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }



}

