package com.yumimi.game.models.inventory.items.magic_items.fire;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class FlameTalisman extends MagicItems {

    public FlameTalisman(){
        init(RarityUtils.generateRandomRarity());
    }

    public FlameTalisman(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Flame Talisman");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Fire);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
        setDescription(DescriptionUtil.FLAME_TALISMAN(this));
    }


    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 60, 5, 0.08, 0.13, 150);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setCritDamage(bonus.bonus3());
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
