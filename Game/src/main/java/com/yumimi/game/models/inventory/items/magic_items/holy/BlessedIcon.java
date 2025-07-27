package com.yumimi.game.models.inventory.items.magic_items.holy;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class BlessedIcon extends MagicItems {

    public BlessedIcon(Rarity rarity) {
        setName("Blessed Icon");
        setDescription("Икона, излучающая чистое благословение."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Holy);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 90, 6, 30, 0.04, 0.09, 130);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusRegenHp(bonus.bonus3());
        setBonusCritChance(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🌟 Пассивка: "Защита света" — шанс 15% наложить щит на себя при получении урона.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}

