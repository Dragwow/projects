package com.yumimi.game.models.inventory.items;

import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public interface Item {

    String getName();
    String getDescription();
    Rarity getRarity();
    TypeItem getTypeItem();
    boolean equipped();

    void setEquipped(boolean b);
    int getPrice();
}
