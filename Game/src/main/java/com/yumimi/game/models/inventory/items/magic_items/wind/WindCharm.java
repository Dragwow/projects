package com.yumimi.game.models.inventory.items.magic_items.wind;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class WindCharm extends MagicItems{

    public WindCharm(){
        init(RarityUtils.generateRandomRarity());
    }

    public WindCharm(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Wind Charm");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setDescription(DescriptionUtil.WIND_CHARM(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 75, 7, 20, 0.05, 0.1, 110);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setDexterity((int) bonus.bonus2());
        setEvasion(bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🌬 Пассивка: "Порыв ветра" — +5% уклонения и шанс уклониться от любого контроля.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }




}

