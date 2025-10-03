package com.yumimi.game.models.inventory.items.magic_items.dark;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class NecroCharm extends MagicItems{

    public NecroCharm(){
        init(RarityUtils.generateRandomRarity());
    }

    public NecroCharm(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Necro Charm");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Dark);
        applyStats(rarity);
        setDescription(DescriptionUtil.NECRO_CHARM(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 85, 7, 25, 0.08, 0.05, 125);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setLifeSteal(bonus.bonus3());
        setRegenHp(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 💀 Пассивка: "Смертный союз" — восстановление HP при убийстве врага.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }

}
