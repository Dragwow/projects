package com.yumimi.game.models.inventory.items.potion.C.epic;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class GreaterHealingPotion extends Potions {

    public GreaterHealingPotion(){
        setName("Greater Healing Potion");
        setDescription("Сильно восстанавливает здоровье.");
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Potion);
        setPrice(70);
    }
    // Эффект: восстанавливает 150 HP + 1.2 HP/ход в течение нескольких ходов

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
