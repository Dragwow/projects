package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.utils.enums.MagicType;

public class CrystalOrb extends AttackWeapon {

    public CrystalOrb(Rarity rarity) {
        setName("Crystal Orb");
        setDescription("Идеальный фокус для магии льда"); // ДОписать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 18, 90, 7, 40, 4, 0.3, 140);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
        setBonusCritChance(bonus.bonus3());
        setBonusRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

    @Override
    public void use() {

    }

    @Override
    public void ifUse() {

    }
}
