package com.yumimi.game.models.inventory.items.magic_items.ice;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class IceCrystal extends MagicItems {

    public IceCrystal(Rarity rarity) {
        setName("Ice Crystal");
        setDescription("Кристалл льда. Повышает интеллект и реген маны."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Ice);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 4, 0.1, 0.03, 110);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusRegenMana(bonus.bonus2());
        setBonusEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: увеличивает шанс уклонения против замороженных врагов.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }
}
