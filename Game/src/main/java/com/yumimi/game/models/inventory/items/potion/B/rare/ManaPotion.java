package com.yumimi.game.models.inventory.items.potion.B.rare;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ManaPotion extends Potions {

    public ManaPotion(){
        setName("Mana Potion");
        setDescription("Умеренно восстанавливает ману.");
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Potion);
        setPrice(35);
    }
    // Эффект: восстанавливает 60 MP + 0.3 MP/ход в течение нескольких ходов

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
