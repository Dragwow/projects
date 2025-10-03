package com.yumimi.game.models.inventory.items.magic_items.ice;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class IceCrystal extends MagicItems {

    public IceCrystal(){
        init(RarityUtils.generateRandomRarity());
    }

    public IceCrystal(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Ice Crystal");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Ice);
        setQuantity(1);
        setEquipped(false);
        applyStats(rarity);
        setDescription(DescriptionUtil.ICE_CRYSTAL(this));
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 50, 4, 0.1, 0.03, 110);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setRegenMana(bonus.bonus2());
        setEvasion(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // Пассивка: увеличивает шанс уклонения против замороженных врагов.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
