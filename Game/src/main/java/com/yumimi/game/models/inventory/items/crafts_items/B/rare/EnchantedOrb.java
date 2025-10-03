package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.util.enums.CraftItemsType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class EnchantedOrb extends CraftItems {

    public EnchantedOrb() {
        setName("Enchanted Orb");
        setItem(CraftItemsType.EnchantedOrb);
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Craft_item);
        setPrice(35);
    }
    // Используется в: SpaceWand, FrozenAmulet

    @Override
    public void inUses() {

    }

}
