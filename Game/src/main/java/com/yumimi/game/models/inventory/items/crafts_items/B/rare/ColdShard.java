package com.yumimi.game.models.inventory.items.crafts_items.B.rare;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ColdShard extends CraftItems {

    public ColdShard() {
        setName("Cold Shard");
        setRarity(Rarity.Rare);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(2);
        setBonusRegenMana(0.3);
        setBonusBlockChance(0.2);
        setPrice(30);
    }
    // Используется в: FrostbiteWand, FrozenAmulet

    @Override
    public void inUses() {

    }
}
