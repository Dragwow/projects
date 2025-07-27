package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class CelestialStone extends CraftItems {

    public CelestialStone() {
        setName("Celestial Stone");
        setRarity(Rarity.Divine);
        setTypeItem(TypeItem.Craft_item);
        setBonusHp(100);
        setBonusMana(50);
        setBonusRegenHp(2);
        setPrice(300);
    }
    // Используется в: DivineTear, GuardianRing

    @Override
    public void inUses() {

    }
}
