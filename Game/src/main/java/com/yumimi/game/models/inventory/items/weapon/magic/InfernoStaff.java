package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.utils.enums.MagicType;

public class InfernoStaff extends AttackWeapon {

    public InfernoStaff(Rarity rarity) {
        setName("Inferno Staff");
        setDescription("Пылающий посох, сжигающий все на пути"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Fire);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 26, 80, 8, 25, 35, 0.15, 200);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusCritDamage(bonus.bonus2());
        setBonusMana(bonus.bonus3());
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
