package com.yumimi.game.models.inventory.items.magic_items.wind;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class WindCharm extends MagicItems {

    public WindCharm(Rarity rarity) {
        setName("Wind Charm");
        setDescription("Амулет с заклинанием воздушного потока."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 75, 7, 20, 0.05, 0.1, 110);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusDexterity(bonus.bonus2());
        setBonusEvasion(bonus.bonus3());
        setBonusRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

    // 🌬 Пассивка: "Порыв ветра" — +5% уклонения и шанс уклониться от любого контроля.
}

