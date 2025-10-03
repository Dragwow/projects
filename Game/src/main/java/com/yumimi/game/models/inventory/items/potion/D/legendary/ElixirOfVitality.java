package com.yumimi.game.models.inventory.items.potion.D.legendary;

import com.yumimi.game.models.inventory.items.potion.Potions;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;

public class ElixirOfVitality extends Potions {

    public ElixirOfVitality() {
        setName("Elixir of Vitality");
        setDescription("Увеличивает макс. здоровье на время.");
        setRarity(Rarity.LEGENDARY);
        setTypeItem(TypeItem.Potion);
        setPrice(120);
    }
    // Эффект: временно увеличивает HP на 100 и даёт 1.5 HP/ход

    @Override
    public void ifUse() {

    }

    @Override
    public void setEquipped(boolean b) {

    }
}
