package com.yumimi.game.models.inventory.items.crafts_items.A.common;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class IronFragment extends CraftItems {

    public IronFragment(){
        setName("Iron Fragment");
        setRarity(Rarity.Common);
        setTypeItem(TypeItem.Craft_item);
        setBonusArmour(1);
        setBonusStrength(1);
        setBonusHp(10);
        setPrice(10);
    }
    // Используется для крафта: HelmFromHell, IronHelm

    @Override
    public void inUses() {

    }
}

