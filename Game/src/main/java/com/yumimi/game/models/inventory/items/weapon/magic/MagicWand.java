package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;

public class MagicWand extends AttackWeapon {

    public MagicWand(){
        init(RarityUtils.generateRandomRarity());
    }

    public MagicWand(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Magic Wand");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setDescription(DescriptionUtil.MAGIC_WAND(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 15, 80, 5, 20, 0.1, 80);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
