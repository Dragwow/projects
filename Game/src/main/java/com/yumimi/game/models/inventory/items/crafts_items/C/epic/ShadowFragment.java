package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ShadowFragment extends CraftItems {

    public ShadowFragment() {
        setName("Shadow Fragment");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusDexterity(5);
        setBonusCritChance(3);
        setBonusEvasion(2);
        setPrice(82);
    }
    // Используется в: ShadowCloak, AbyssEye

    @Override
    public void inUses() {

    }
}
