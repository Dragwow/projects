package com.yumimi.game.models.inventory.items.potion.B.rare;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class PotionOfAgility extends Potions {

    public PotionOfAgility(){
        setName("Potion of Agility");
        setDescription("Повышает ловкость и уклонение на короткое время.");
        setRarity(Rarity.RARE);
        setTypeItem(TypeItem.Potion);
        setPrice(40);
    }
    // Эффект: временно даёт +4 ловкости и +2% уклонения

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
