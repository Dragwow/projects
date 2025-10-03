package com.yumimi.game.models.inventory.items.potion.A.common;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class MinorHealingPotion extends Potions {

    public MinorHealingPotion(){
        setName("Minor Healing Potion");
        setDescription("Восстанавливает немного здоровья.");
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Potion);
        setPrice(15);
    }
    // Эффект: мгновенно восстанавливает 30 HP

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
