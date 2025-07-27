package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ShadowEssence extends CraftItems {

    public ShadowEssence() {
        setName("Shadow Essence");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(3);
        setBonusCritDamage(1);
        setBonusEvasion(1);
        setPrice(33);
    }
    // Используется в: ShadowCloak, ShadowCrossbow

    @Override
    public void inUses() {

    }
}
