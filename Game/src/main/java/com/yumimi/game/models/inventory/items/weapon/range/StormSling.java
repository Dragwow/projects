package com.yumimi.game.models.inventory.items.weapon.range;


import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;

public class StormSling extends AttackWeapon  {

    public StormSling(){
        init(RarityUtils.generateRandomRarity());
    }

    public StormSling(Rarity rarity) {
       init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Storm Sling");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Range);
        setMagicType(MagicType.Lighting);
        applyStats(rarity);
        setDescription(DescriptionUtil.STORM_SLING(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 19, 80, 6, 5, 0.2, 130);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setDexterity(bonus.bonus1());
        setCritChance(bonus.bonus2());
        setRegenMana(bonus.bonus3());
        setPrice(bonus.costItem());
    }
}
