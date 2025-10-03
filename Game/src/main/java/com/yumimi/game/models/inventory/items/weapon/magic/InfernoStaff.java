package com.yumimi.game.models.inventory.items.weapon.magic;

import com.yumimi.game.util.descriptions.DescriptionUtil;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;
import com.yumimi.game.util.enums.MagicType;

public class InfernoStaff extends AttackWeapon {

    public InfernoStaff(){
        init(RarityUtils.generateRandomRarity());
    }

    public InfernoStaff(Rarity rarity) {
      init(rarity);
    }

    private void init(Rarity rarity) {
        setName("Inferno Staff");
        setRarity(rarity);
        setTypeItem(TypeItem.Attack_Magic);
        setMagicType(MagicType.Fire);
        applyStats(rarity);
        setDescription(DescriptionUtil.INFERNO_STAFF(this));
        setEquipped(false);
    }

    protected void applyStats(Rarity rarity) {
        var bonus = RarityUtils.applyRarityBonus(rarity, 26, 80, 8, 25, 35, 0.15, 200);
        setDamage(bonus.damage());
        setDurability(bonus.durability());
        setIntelligence(bonus.bonus1());
        setCritDamage(bonus.bonus2());
        setMana((int) bonus.bonus3());
        setRegenMana(bonus.bonus4());
        setPrice(bonus.costItem());
    }
}
