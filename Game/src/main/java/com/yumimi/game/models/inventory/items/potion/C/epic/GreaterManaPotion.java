package com.yumimi.game.models.inventory.items.potion.C.epic;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class GreaterManaPotion extends Potions {

    public GreaterManaPotion(){
        setName("Greater Mana Potion");
        setDescription("Сильно восстанавливает ману.");
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Potion);
        setPrice(70);
    }
    // Эффект: восстанавливает 120 MP + 0.9 MP/ход в течение нескольких ходов

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
