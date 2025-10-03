package com.yumimi.game.models.inventory.items.potion.A.common;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class MinorManaPotion extends Potions {

    public MinorManaPotion(){
        setName("Minor Mana Potion");
        setDescription("Восстанавливает немного маны.");
        setRarity(Rarity.COMMON);
        setTypeItem(TypeItem.Potion);
        setPrice(15);
    }
    // Эффект: мгновенно восстанавливает 25 MP

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
