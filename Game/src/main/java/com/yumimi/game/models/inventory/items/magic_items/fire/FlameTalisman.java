package com.yumimi.game.models.inventory.items.magic_items.fire;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class FlameTalisman extends MagicItems {

    public FlameTalisman(Rarity rarity) {
        setName("Flame Talisman");
        setDescription("Талисман огня. Повышает силу и крит. урон."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Fire);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 0.08, 0.13, 150);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
        setBonusCritDamage(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: шанс поджечь врага, нанося 5% от макс. HP в течение 2 ходов.
    @Override
    public void events() {

    }



    @Override
    public void ifUse() {

    }
}
