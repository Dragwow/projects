package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;

public class SpaceWand extends AttackWeapon {

    public SpaceWand(){
    init(RarityUtils.generateRandomRarity());
    }

    public SpaceWand(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Space Wand");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Dark);
        applyStats(rarity);
        setDescription(DescriptionUtil.SPACE_WAND(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 24, 75, 9, 3, 50, 0.25, 220);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setLifeSteal(bonus.bonus2());
        setMana((int) bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }
}
