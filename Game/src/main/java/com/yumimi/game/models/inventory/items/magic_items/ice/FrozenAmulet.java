package com.yumimi.game.models.inventory.items.magic_items.ice;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class FrozenAmulet extends MagicItems {

    public FrozenAmulet(Rarity rarity) {
        setName("Frozen Amulet");
        setDescription("Замерзший амулет. Даёт интеллект и броню."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Ice);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 65, 5, 25, 0.06, 130);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusArmour(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: шанс заморозить врага на 1 ход, снижая его скорость.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }
}
