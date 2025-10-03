package com.yumimi.game.models.inventory.items.magic_items.dark;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class AbyssEye extends MagicItems{

    public AbyssEye(){
        init(RarityUtils.generateRandomRarity());
    }

    public AbyssEye(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Abyss Eye");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Dark);
        applyStats(rarity);
        setDescription(DescriptionUtil.ABYSS_AYE(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 95, 9, 35, 0.06, 0.07, 145);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setLifeSteal(bonus.bonus4());
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
