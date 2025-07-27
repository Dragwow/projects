package com.yumimi.game.models.inventory.items.magic_items.wind;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class BreezeFeather extends MagicItems {

    public BreezeFeather(Rarity rarity) {
        setName("Breeze Feather");
        setDescription("Лёгкое перо, наполненное стремительным ветром.");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 6, 18, 0.07, 0.12, 95);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusDexterity(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setBonusRegenMana(bonus.bonus4());
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

