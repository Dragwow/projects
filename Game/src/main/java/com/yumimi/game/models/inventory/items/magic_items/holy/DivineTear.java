package com.yumimi.game.models.inventory.items.magic_items.holy;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class DivineTear extends MagicItems {

    public DivineTear(Rarity rarity) {
        setName("Divine Tear");
        setDescription("Капля света, способная исцелять и защищать."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Holy);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 100, 8, 40, 0.06, 0.07, 150);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusRegenHp(bonus.bonus3());
        setBonusRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // ✨ Пассивка: "Святое слово" — восстанавливает 2% HP союзникам при использовании заклинания Holy.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}

