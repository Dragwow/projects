package com.yumimi.game.models.inventory.items.magic_items.poison;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class ToxicTotem extends MagicItems {

    public ToxicTotem(Rarity rarity) {
        setName("Toxic Totem");
        setDescription("Тотем, источающий смертельные миазмы."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Poison);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 95, 9, 28, 0.06, 0.06, 140);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusDexterity(bonus.bonus2());
        setBonusLifeSteal(bonus.bonus3());
        setBonusRegenHp(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🧪 Пассивка: "Отравление" — шанс 20% наложить яд, наносящий 4% урона за ход на 3 хода.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}

