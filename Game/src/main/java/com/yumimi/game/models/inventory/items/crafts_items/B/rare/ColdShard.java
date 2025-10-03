package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ColdShard extends CraftItems {

    public ColdShard() {
        setName("Cold Shard");
        setItem(CraftItemsType.ColdShard);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(30);
    }
    // Используется в: FrostbiteWand, FrozenAmulet

    @Override
    public void inUses() {

    }

}
