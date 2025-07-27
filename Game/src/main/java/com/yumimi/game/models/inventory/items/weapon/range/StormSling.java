package com.yumimi.game.models.inventory.items.weapon.range;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.utils.enums.MagicType;

public class StormSling extends AttackWeapon {

    public StormSling(Rarity rarity) {
        setName("Storm Sling");
        setDescription("Праща, заряженная молнией");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 19, 80, 6, 5, 0.2, 130);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusDexterity(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
        setBonusRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
