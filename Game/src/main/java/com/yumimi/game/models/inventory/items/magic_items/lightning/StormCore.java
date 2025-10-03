package com.yumimi.game.models.inventory.items.magic_items.lightning;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class StormCore extends MagicItems{

    public StormCore(){
        init(RarityUtils.generateRandomRarity());
    }

    public StormCore(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Storm Core");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setDescription(DescriptionUtil.STORM_CORE(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 10, 30, 5, 0.1, 160);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    // 🔋 Пассивка: "Проводник" — шанс 10% оглушить врага при использовании заклинания молнии.
    @Override
    public void events() {

    }

    @Override
    public void ifUse() {

    }
}
