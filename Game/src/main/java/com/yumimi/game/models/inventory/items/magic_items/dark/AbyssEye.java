package com.yumimi.game.models.inventory.items.magic_items.dark;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class AbyssEye extends MagicItems {

    public AbyssEye(Rarity rarity) {
        setName("Abyss Eye");
        setDescription("Глаз, видящий через мрак."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Dark);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 95, 9, 35, 0.06, 0.07, 145);
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

    // 🕶 Пассивка: "Тьма внутри" — на 10% увеличивает урон, если у противника < 40% HP.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
