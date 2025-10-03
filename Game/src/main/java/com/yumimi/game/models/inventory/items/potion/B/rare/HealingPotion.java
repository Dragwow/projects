package com.yumimi.game.models.inventory.items.potion.B.rare;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class HealingPotion extends Potions {

    public HealingPotion(){
        setName("Healing Potion");
        setDescription("Умеренно восстанавливает здоровье.");
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Potion);
        setPrice(35);
    }
    // Эффект: восстанавливает 75 HP + 0.5 HP/ход в течение нескольких ходов

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
