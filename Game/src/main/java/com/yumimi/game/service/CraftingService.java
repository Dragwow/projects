package com.yumimi.game.service;

import com.yumimi.game.models.craft.Recipe;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;

public interface CraftingService {

    boolean canCraft(Inventory inventory, Recipe recipe);
    Item craft(Inventory inventory, Recipe recipe);

}
