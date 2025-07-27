package com.yumimi.game.models.inventory.items.magic_items.lightning;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class StormCore extends MagicItems {

    public StormCore(Rarity rarity) {
        setName("Storm Core");
        setDescription("Сердце молнии, наполняющее заклинания нестабильной энергией."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 10, 30, 5, 0.1, 160);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setBonusRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🔋 Пассивка: "Проводник" — шанс 10% оглушить врага при использовании заклинания молнии.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }
}
