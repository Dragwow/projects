package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;

public class CrystalOrb extends AttackWeapon{

    public CrystalOrb(){
        init(RarityUtils.generateRandomRarity());
    }

    public CrystalOrb(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Crystal Orb");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Wind);
        applyStats(rarity);
        setDescription(DescriptionUtil.CRYSTAL_ORB(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 18, 90, 7, 40, 4, 0.3, 140);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setMana((int) bonus.bonus2());
        setCritChance(bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }
}
