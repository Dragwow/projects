package com.yumimi.game.models.inventory.items.magic_items.poison;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class VenomShard extends MagicItems {

    public VenomShard(Rarity rarity) {
        setName("Venom Shard");
        setDescription("Ядовитый осколок, сочащийся токсином."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Poison);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 8, 22, 0.08, 0.07, 135);
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusDexterity(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setBonusLifeSteal(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // ☠ Пассивка: "Коррозия" — при попадании снижает броню цели на 10% на 2 хода.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}

