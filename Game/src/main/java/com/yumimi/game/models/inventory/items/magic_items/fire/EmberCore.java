package com.yumimi.game.models.inventory.items.magic_items.fire;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class EmberCore extends MagicItems {

    public EmberCore(){
        init(RarityUtils.generateRandomRarity());
    }

    public EmberCore(Rarity rarity) {
     init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Ember Core");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Fire);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
        setDescription(DescriptionUtil.EMBER_CORE(this));
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 55, 6, 20, 0.06, 140);
        setDurability(bonus.durability());
        setStrength(bonus.bonus1());
        setHp((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
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
