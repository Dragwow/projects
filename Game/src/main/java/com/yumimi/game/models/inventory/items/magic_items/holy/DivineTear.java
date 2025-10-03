package com.yumimi.game.models.inventory.items.magic_items.holy;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class DivineTear extends MagicItems {

    public DivineTear(){
        init(RarityUtils.generateRandomRarity());
    }

    public DivineTear(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Divine Tear");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Holy);
        applyStats(rarity);
        setDescription(DescriptionUtil.DIVINE_TEAR(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 100, 8, 40, 0.06, 0.07, 150);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setRegenHp(bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // ✨ Пассивка: "Святое слово" — восстанавливает 2% HP союзникам при использовании заклинания Holy.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }
}

