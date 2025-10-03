package com.yumimi.game.models.craft;

import com.yumimi.game.util.enums.Rarity;

import java.util.List;

public record Recipe(String resultItemName, List<String> ingredients, Rarity rarity) {
    @Override
    public String toString() {
        return resultItemName + "  <-  " + ingredients + " [" + rarity + "]";
    }
}

