package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public class ShadowCrossbow extends AttackWeapon  {

    public ShadowCrossbow(){
        init(RarityUtils.generateRandomRarity());
    }

    public ShadowCrossbow(Rarity rarity) {
        init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Shadow Crossbow");
        setTypeItem(TypeItem.Attack_Range);
        setRarity(rarity);
        applyStats(rarity);
        setDescription(DescriptionUtil.SHADOW_CROSSBOW(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 27, 85, 4, 4, 6, 160);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setHitChance(bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
