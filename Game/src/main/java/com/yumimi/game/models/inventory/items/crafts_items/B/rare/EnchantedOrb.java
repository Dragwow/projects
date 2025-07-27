package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class EnchantedOrb extends CraftItems {

    public EnchantedOrb() {
        setName("Enchanted Orb");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(3);
        setBonusMana(7);
        setBonusRegenMana(0.2);
        setPrice(35);
    }
    // Используется в: SpaceWand, FrozenAmulet

    @Override
    public void inUses() {

    }
}
