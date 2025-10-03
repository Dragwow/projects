package com.yumimi.game.models.inventory.items.magic_items.poison;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.util.enums.MagicType;

public class VenomShard extends MagicItems {

    public VenomShard(){
        init(RarityUtils.generateRandomRarity());
    }

    public VenomShard(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Venom Shard");
        setRarity(rarity);
        setTypeItem(TypeItem.Magic_item);
        setMagicType(MagicType.Poison);
        applyStats(rarity);
        setDescription(DescriptionUtil.VENOM_SHARD(this));
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 0, 80, 8, 22, 0.08, 0.07, 135);
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setDexterity((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setLifeSteal(bonus.bonus4());
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

