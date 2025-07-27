package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ArcaneCrystal extends CraftItems {

    public ArcaneCrystal() {
        setName("Arcane Crystal");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setBonusIntelligence(3);
        setBonusMana(20);
        setBonusRegenMana(0.1);
        setPrice(40);
    }
    // Используется для крафта: CrystalOrb, SpaceWand

    @Override
    public void inUses() {

    }
}
