package com.yumimi.game.models.inventory.items.crafts_items.D.legendary;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class TitanSteel extends CraftItems {

    public TitanSteel() {
        setName("Titan Steel");
        setItem(CraftItemsType.TitanSteel);
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Craft_item);
        setPrice(160);
    }
    // Используется в: HelmFromHell, SteelBoots

    @Override
    public void inUses() {

    }

}
