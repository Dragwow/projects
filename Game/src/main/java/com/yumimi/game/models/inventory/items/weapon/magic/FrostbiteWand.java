package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;


public class FrostbiteWand extends AttackWeapon  {

    public FrostbiteWand(){
        init(RarityUtils.generateRandomRarity());
    }

    public FrostbiteWand(Rarity rarity) {
     init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Frostbite Wand");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Ice);
        applyStats(rarity);
        setDescription(DescriptionUtil.FROSTBITE_WAND(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 20, 100, 6, 3.5, 30, 0.2, 150);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setMana((int) bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }

}
