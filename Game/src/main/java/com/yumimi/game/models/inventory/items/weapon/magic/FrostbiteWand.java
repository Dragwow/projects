package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.models.inventory.items.RarityUtils;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.utils.enums.MagicType;

public class FrostbiteWand extends AttackWeapon {

    public FrostbiteWand(Rarity rarity) {
        setName("Frostbite Wand");
        setDescription("Жезл холода, замедляющий врагов"); // Дописать
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Ice);
        applyStats(rarity);
        setQuantity(1);
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 20, 100, 6, 3.5, 30, 0.2, 150);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setBonusIntelligence(bonus.bonus1());
        setBonusCritChance(bonus.bonus2());
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
