package com.yumimi.game.models.inventory.items.crafts_items.E.divine;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class DivineCore extends CraftItems {

    public DivineCore() {
        setName("Divine Core");
        setRarity(Rarity.Divine);
        setTypeItem(TypeItem.Craft_item);
        setDamage(40);
        setBonusCritDamage(15);
        setBonusIntelligence(25);
        setPrice(350);
    }
    // Используется в: CrystalOrb, EmberCore

    @Override
    public void inUses() {

    }
}
