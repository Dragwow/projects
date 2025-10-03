package com.yumimi.game.models.inventory.items.magic_items.poison;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class ToxicTotem extends MagicItems {

    public ToxicTotem(){
        init(RarityUtils.generateRandomRarity());
    }

    public ToxicTotem(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Toxic Totem");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Poison);
        applyStats(rarity);
        setDescription(DescriptionUtil.TOXIC_TOTEM(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 95, 9, 28, 0.06, 0.06, 140);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setDexterity((int) bonus.bonus2());
        setLifeSteal(bonus.bonus3());
        setRegenHp(bonus.bonus4());
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

