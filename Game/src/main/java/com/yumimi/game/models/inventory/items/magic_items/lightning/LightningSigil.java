package com.yumimi.game.models.inventory.items.magic_items.lightning;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class LightningSigil extends MagicItems {

    public LightningSigil(Rarity rarity) {
        setName("Lightning Sigil");
        setDescription("Древний знак, наполненный разрушительной энергией молнии."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 100, 8, 25, 0.05, 0.09, 140);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setBonusLifeSteal(bonus.bonus4());
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

