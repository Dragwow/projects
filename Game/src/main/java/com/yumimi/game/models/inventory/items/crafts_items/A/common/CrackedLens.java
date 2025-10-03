package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class CrackedLens extends CraftItems {

    public CrackedLens() {
        setName("Cracked Lens");
        setItem(CraftItemsType.CrackedLens);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(48);
    }

    private void setBonusRegenMana(double v) {
    }
    // Используется в: AbyssEye, NecroCharm

    @Override
    public void inUses() {

    }


}
