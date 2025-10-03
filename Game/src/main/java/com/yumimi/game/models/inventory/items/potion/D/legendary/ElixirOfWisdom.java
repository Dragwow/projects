package com.yumimi.game.models.inventory.items.potion.D.legendary;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ElixirOfWisdom extends Potions {

    public ElixirOfWisdom(){
        setName("Elixir of Wisdom");
        setDescription("Временно увеличивает интеллект и восстанавливает ману.");
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Potion);
        setPrice(120);
    }
    // Эффект: временно даёт +5 интеллекта, восстанавливает 100 MP и 1.2 MP/ход

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
