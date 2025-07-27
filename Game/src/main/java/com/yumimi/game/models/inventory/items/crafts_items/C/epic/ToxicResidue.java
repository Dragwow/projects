package com.yumimi.game.models.inventory.items.crafts_items.C.epic;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItems;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;

public class ToxicResidue extends CraftItems {

    public ToxicResidue() {
        setName("Toxic Residue");
        setRarity(Rarity.Epic);
        setTypeItem(TypeItem.Craft_item);
        setDamage(6);
        setBonusLifeSteal(1);
        setBonusDexterity(3);
        setPrice(78);
    }
    // Используется в: VenomShard, ToxicTotem

    @Override
    public void inUses() {

    }
}
