package com.yumimi.game.models.inventory.items.magic_items.holy;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class BlessedIcon extends MagicItems {

    public BlessedIcon(){
        init(RarityUtils.generateRandomRarity());
    }

    public BlessedIcon(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Blessed Icon");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Holy);
        applyStats(rarity);
        setDescription(DescriptionUtil.BLESSED_ICON(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 90, 6, 30, 0.04, 0.09, 130);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setRegenHp(bonus.bonus3());
        setCritChance(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🌟 Пассивка: "Защита света" — шанс 15% наложить щит на себя при получении урона.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
