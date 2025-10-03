package com.yumimi.game.models.inventory.items.potion.C.epic;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class BattleBrew extends Potions {

    public BattleBrew (){
        setName("Battle Brew");
        setDescription("Повышает силу и крит урон на следующую атаку.");
        setRarity(Rarity.EPIC);
        setTypeItem(TypeItem.Potion);
        setPrice(80);
    }
    // Эффект: временно даёт +6 силы и +5% крит урона (на один бой или атаку)

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
