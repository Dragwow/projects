package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ViciousClaw extends CraftItems {

    public ViciousClaw() {
        setName("Vicious Claw");
        setItem(CraftItemsType.ViciousClaw);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(31);
    }

    @Override
    public void inUses() {

    }


}
