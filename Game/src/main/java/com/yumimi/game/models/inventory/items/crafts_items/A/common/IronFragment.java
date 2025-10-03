package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class IronFragment extends CraftItems {

    public IronFragment(){
        setName("Iron Fragment");
        setItem(CraftItemsType.IronFragment);
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Craft_item);
        setPrice(10);
    }
    // Используется для крафта: HelmFromHell, IronHelm

    @Override
    public void inUses() {

    }


}

