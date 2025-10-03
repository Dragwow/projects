package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ToxicResidue extends CraftItems {

    public ToxicResidue() {
        setName("Toxic Residue");
        setItem(CraftItemsType.ToxicResidue);
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Craft_item);
        setPrice(78);
    }
    // Используется в: VenomShard, ToxicTotem

    @Override
    public void inUses() {

    }


}
