package com.yumimi.game.models.inventory.items.magic_items.dark;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class NecroCharm extends MagicItems {

    public NecroCharm(Rarity rarity) {
        setName("Necro Charm");
        setDescription("Темный амулет, питающийся смертью."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Dark);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 85, 7, 25, 0.08, 0.05, 125);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusLifeSteal(bonus.bonus3());
        setBonusRegenHp(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 💀 Пассивка: "Смертный союз" — восстановление HP при убийстве врага.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
