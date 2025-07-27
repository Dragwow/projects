package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.utils.enums.MagicType;

public class MagicWand extends AttackWeapon {

    public MagicWand(Rarity rarity) {
        setName("Magic Wand");
        setDescription("Простой волшебный жезл"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 15, 80, 5, 20, 0.1, 80);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusMana(bonus.bonus2());
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
