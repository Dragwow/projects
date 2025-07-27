package com.yumimi.game.models.inventory.items.magic_items.fire;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.utils.enums.MagicType;

public class EmberCore extends MagicItems {

    public EmberCore(Rarity rarity) {
        setName("Ember Core");
        setDescription("Ядро угля. Повышает урон и силу."); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Fire);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 55, 6, 20, 0.06, 140);
        setDurability(bonus.durability());
        setBonusStrength(bonus.bonus1());
        setBonusHp(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: при атаке есть шанс нанести доп. урон огнем (10 единиц).
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {


    }

}
